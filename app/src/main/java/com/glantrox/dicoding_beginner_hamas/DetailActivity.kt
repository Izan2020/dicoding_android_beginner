package com.glantrox.dicoding_beginner_hamas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.glantrox.dicoding_beginner_hamas.adapters.FormulaAdapter
import com.glantrox.dicoding_beginner_hamas.dataclass.RecipeModel

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // IDs From Layout
        val backButton = findViewById<ImageView>(R.id.btn_back)
        val imgBackground = findViewById<ImageView>(R.id.img_food)
        val btnShare = findViewById<ImageButton>(R.id.btn_share)
        val textTitle = findViewById<TextView>(R.id.text_title)
        val textAuthor = findViewById<TextView>(R.id.text_author)
        val textDesc = findViewById<TextView>(R.id.text_description)

        // Back Button
        backButton.setOnClickListener {
            finish()
        }

        // Menggunakan Parcelable agar Passing Value tidak harus Satu2
        val recipe = intent.getParcelableExtra<RecipeModel>("rizzep")

        imgBackground.load(recipe?.imageLink)
        textTitle.text = recipe?.title
        textAuthor.text = recipe?.author
        textDesc.text = recipe?.description

        showRecyclerView(recipe?.recipes!!)

        // Share Button
        btnShare.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.putExtra(
                Intent.EXTRA_TEXT,
                        "${recipe.description} \n\n " +
                        "Berikut Adalah Resep:\n " +
                        "${joinedFormulas(recipe.recipes)} \n\n " +
                        "Author : ${recipe.author}"
            )
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.type = "text/plain"
            startActivity(Intent.createChooser(shareIntent, "Share Recipe"))

        }




    }
    fun joinedFormulas(formula: List<String>): String {
        val formattedList = formula.mapIndexed {index, string ->
            "${index + 1}. $string"
        }
        val formulaJoinned = formattedList.joinToString("\n")
        return formulaJoinned
    }
    fun showRecyclerView(listOfFormulas: List<String>) {
        val rvFormulas = findViewById<RecyclerView>(R.id.rv_avrecipe)
        val adapter = FormulaAdapter(listOfFormulas)
        rvFormulas.adapter = adapter
    }
}