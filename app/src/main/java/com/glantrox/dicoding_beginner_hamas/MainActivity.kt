package com.glantrox.dicoding_beginner_hamas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.glantrox.dicoding_beginner_hamas.adapters.RecipesAdapter
import com.glantrox.dicoding_beginner_hamas.database.StaticData
import com.glantrox.dicoding_beginner_hamas.dataclass.RecipeModel

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ID(s)
        val btnAbout = findViewById<ImageView>(R.id.btn_info)

        // Go to About Section
        btnAbout.setOnClickListener {
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }

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