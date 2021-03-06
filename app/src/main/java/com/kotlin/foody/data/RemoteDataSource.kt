package com.kotlin.foody.data

import com.kotlin.foody.data.network.FoodRecipesApi
import com.kotlin.foody.models.FoodJoke
import com.kotlin.foody.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }

    suspend fun getFoodJoke(apiKey: String): Response<FoodJoke> {
        return foodRecipesApi.getFoodJoke(apiKey)
    }

}