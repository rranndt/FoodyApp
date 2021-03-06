package com.kotlin.foody.data

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
@ViewModelScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {

    val remote = remoteDataSource
    val local = localDataSource

}