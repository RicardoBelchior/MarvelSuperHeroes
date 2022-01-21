package com.rbelchior.marvel.data.remote

import com.rbelchior.marvel.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Add the necessary query params for the Marvel endpoint authentication.
 * Applied on every request.
 *
 * [Link to the docs](https://developer.marvel.com/documentation/authorization)
 */
class AuthInterceptor : Interceptor {
    private val md5 = MessageDigest.getInstance("MD5")

    override fun intercept(chain: Interceptor.Chain): Response {
        val ts = System.currentTimeMillis().toString()
        val privateKey = BuildConfig.MARVEL_PRIVATE_KEY
        val pubKey = BuildConfig.MARVEL_PUBLIC_KEY
        val input = ts + privateKey + pubKey
        val hashByteArray = md5.digest(input.toByteArray())
        val hash = BigInteger(1, hashByteArray).toString(16).padStart(32, '0')

        return chain.request().let {
            val url = it.url.newBuilder()
                .addQueryParameter("ts", ts)
                .addQueryParameter("apikey", pubKey)
                .addQueryParameter("hash", hash)
                .build()

            chain.proceed(it.newBuilder().url(url).build())
        }
    }
}
