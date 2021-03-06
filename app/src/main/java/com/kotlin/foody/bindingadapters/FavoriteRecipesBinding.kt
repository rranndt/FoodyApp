package com.kotlin.foody.bindingadapters

import android.view.View
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.foody.adapter.FavoriteRecipesAdapter
import com.kotlin.foody.data.database.entities.FavoritesEntity

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
class FavoriteRecipesBinding {

    companion object {

        @BindingAdapter("setVisibility", "setData", requireAll = false)
        @JvmStatic
        fun setVisibility(
            view: View,
            favoritesEntity: List<FavoritesEntity>?,
            mAdapter: FavoriteRecipesAdapter?
        ) {
            when (view) {
                is RecyclerView -> {
                    val dataCheck = favoritesEntity.isNullOrEmpty()
                    view.isInvisible = dataCheck
                    if (!dataCheck) {
                        favoritesEntity?.let {
                            mAdapter?.setData(it)
                        }
                    }
                }
                else ->
                    view.isVisible = favoritesEntity.isNullOrEmpty()
            }
        }
    }

}