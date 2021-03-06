package com.kotlin.foody.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kotlin.foody.data.database.entities.FavoritesEntity
import com.kotlin.foody.data.database.entities.FoodJokeEntity
import com.kotlin.foody.data.database.entities.RecipesEntity

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase : RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}