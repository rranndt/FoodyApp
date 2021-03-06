package com.kotlin.foody.data.database.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kotlin.foody.models.FoodJoke
import com.kotlin.foody.util.Constants.Companion.FOOD_JOKE_TABLE

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
@Entity(tableName = FOOD_JOKE_TABLE)
class FoodJokeEntity(
    @Embedded
    var foodJoke: FoodJoke
) {

    // Because we need only one row
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}