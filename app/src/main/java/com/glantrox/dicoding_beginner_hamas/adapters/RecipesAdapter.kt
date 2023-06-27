package com.glantrox.dicoding_beginner_hamas.adapters

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.glantrox.dicoding_beginner_hamas.R
import com.glantrox.dicoding_beginner_hamas.dataclass.RecipeModel

class RecipesAdapter(val listOfRecipes: List<RecipeModel>) : RecyclerView.Adapter<RecipesAdapter.ViewHolder?>() {

    // ItemClickListener Callback
    var onItemCallBack: ((RecipeModel) -> Unit)? = null

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textTitle = itemView.findViewById<TextView>(R.id.item_title)
    val textDescription = itemView.findViewById<TextView>(R.id.item_description)
    val imageRecipe = itemView.findViewById<ImageView>(R.id.item_image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipesAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_recipes, parent, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: RecipesAdapter.ViewHolder, position: Int) {
        val recipe = listOfRecipes[position]
        holder.textTitle.text = recipe.title
        holder.textDescription.text = recipe.description
        holder.textDescription.setEllipsize(TextUtils.TruncateAt.END);
        holder.textDescription.setMaxLines(4);
        // Loading Image Menggunakan package Coil
        holder.imageRecipe.load(recipe.imageLink)
        holder.itemView.setOnClickListener {
            onItemCallBack?.invoke(recipe)
        }
    }

    override fun getItemCount(): Int {
        return listOfRecipes.size
    }
}
