package com.kotlin.foody.util

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
sealed class NetworkResult<T>(
    val data: T? = null,
    val message: String? = null
) {

    class Success<T>(data: T) : NetworkResult<T>(data)
    class Error<T>(message: String?, data: T? = null) : NetworkResult<T>(data, message)
    class Loading<T>: NetworkResult<T>()

}