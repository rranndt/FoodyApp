package com.kotlin.foody.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.kotlin.foody.R
import com.kotlin.foody.databinding.IngredientsRowLayoutBinding
import com.kotlin.foody.models.ExtendedIngredient
import com.kotlin.foody.util.Constants.Companion.BASE_IMAGE_URL
import com.kotlin.foody.util.RecipesDiffUtil

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
class IngredientsAdapter : RecyclerView.Adapter<IngredientsAdapter.MyViewHolder>() {

    private var ingredientsList = emptyList<ExtendedIngredient>()

    class MyViewHolder(val binding: IngredientsRowLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            IngredientsRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.ingredientsImageView.load(BASE_IMAGE_URL + ingredientsList[position].image) {
            crossfade(600)
            error(R.drawable.ic_error_placeholder)
        }
        holder.binding.ingredientsName.text = ingredientsList[position].name.capitalize()
        holder.binding.ingredientsAmount.text = ingredientsList[position].amount.toString()
        holder.binding.ingredientsUnit.text = ingredientsList[position].unit
        holder.binding.ingredientsConsistency.text = ingredientsList[position].consistency
        holder.binding.ingredientsOriginal.text = ingredientsList[position].original
    }

    override fun getItemCount(): Int {
        return ingredientsList.size
    }

    fun setData(newIngredients: List<ExtendedIngredient>) {
        val ingredientsDiffUtil =
            RecipesDiffUtil(ingredientsList, newIngredients)
        val diffUtilResult = DiffUtil.calculateDiff(ingredientsDiffUtil)
        ingredientsList = newIngredients
        diffUtilResult.dispatchUpdatesTo(this)
    }
}