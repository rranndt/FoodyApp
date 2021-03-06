package com.kotlin.foody.data.database

import androidx.room.*
import com.kotlin.foody.data.database.entities.FavoritesEntity
import com.kotlin.foody.data.database.entities.FoodJokeEntity
import com.kotlin.foody.data.database.entities.RecipesEntity
import kotlinx.coroutines.flow.Flow

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
@Dao
interface RecipesDao {

    /** Insert Query */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipes(recipesEntity: RecipesEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteRecipe(favoriteEntity: FavoritesEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFoodJoke(foodJokeEntity: FoodJokeEntity)

    /** Get/Show All Query */
    @Query("SELECT * FROM recipes_table ORDER BY id ASC")
    fun readRecipes(): Flow<List<RecipesEntity>>

    @Query("SELECT * FROM favorite_recipes_table ORDER BY id ASC")
    fun readFavoriteRecipes(): Flow<List<FavoritesEntity>>

    @Query("SELECT * FROM food_joke_table ORDER BY id ASC")
    fun readFoodJoke(): Flow<List<FoodJokeEntity>>

    /** Delete Query */
    @Delete
    suspend fun deleteFavoriteRecipe(favoriteEntity: FavoritesEntity)

    @Query("DELETE FROM favorite_recipes_table")
    suspend fun deleteAllFavoriteRecipe()

}