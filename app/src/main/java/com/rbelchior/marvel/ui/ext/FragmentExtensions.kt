package com.rbelchior.marvel.ui.ext

import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

fun Fragment.showSnackBarMessage(message: String) {
    requireView().showSnackBarMessage(message)
}

fun View.showSnackBarMessage(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_INDEFINITE).apply {
        setAction("OK") { dismiss() }
        show()
    }
}
