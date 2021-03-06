package com.kotlin.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kotlin.foody.models.Result
import com.kotlin.foody.util.Constants.Companion.FAVORITE_RECIPES_TABLE

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val result: Result
)