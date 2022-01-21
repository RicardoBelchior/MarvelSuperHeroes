package com.rbelchior.marvel.ui.ext

/** https://github.com/Zhuinden/fragmentviewbindingdelegate-kt */

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class FragmentViewBindingDelegate<T : ViewBinding>(
    private val viewBindingFactory: (View) -> T
) : ReadOnlyProperty<Fragment, T> {

    private var binding: T? = null

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T =
        binding ?: createBinding(thisRef)

    private fun createBinding(fragment: Fragment): T {
        val viewLifecycle = fragment.viewLifecycleOwner.lifecycle

        check(viewLifecycle.currentState.isAtLeast(Lifecycle.State.INITIALIZED)) {
            "Must not attempt to get bindings when Fragment views are destroyed."
        }

        val lifecycleCallback = object : FragmentManager.FragmentLifecycleCallbacks() {
            override fun onFragmentViewDestroyed(fm: FragmentManager, f: Fragment) {
                if (f === fragment) {
                    binding = null
                    fragment.parentFragmentManager.unregisterFragmentLifecycleCallbacks(this)
                }
            }
        }
        fragment.parentFragmentManager.registerFragmentLifecycleCallbacks(lifecycleCallback, false)
        return viewBindingFactory(fragment.requireView()).also { binding = it }
    }
}

@Suppress("unused")
fun <T : ViewBinding> Fragment.viewBinding(viewBindingFactory: (View) -> T):
    FragmentViewBindingDelegate<T> = FragmentViewBindingDelegate(viewBindingFactory)
