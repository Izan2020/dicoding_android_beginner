package com.glantrox.dicoding_beginner_hamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.glantrox.dicoding_beginner_hamas.adapters.RecipesAdapter
import com.glantrox.dicoding_beginner_hamas.database.StaticData
import com.glantrox.dicoding_beginner_hamas.dataclass.RecipeModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Static Data divided in Different Folder
        val listOfRecipes = StaticData().Recipes()
        showRecyclerView(listOfRecipes)

    }
    fun showRecyclerView(listOfRecipes: List<RecipeModel>) {
        val rv = findViewById<RecyclerView>(R.id.rv_avmain)
        val recipeAdapter = RecipesAdapter(listOfRecipes)
        rv.adapter = recipeAdapter
        recipeAdapter.onItemCallBack = {
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("rizzep", it)
            startActivity(intent)
        }
    }
}