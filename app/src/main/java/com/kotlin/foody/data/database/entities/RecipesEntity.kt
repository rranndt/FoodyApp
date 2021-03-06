package com.kotlin.foody.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kotlin.foody.models.FoodRecipe
import com.kotlin.foody.util.Constants.Companion.RECIPES_TABLE

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {

    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}