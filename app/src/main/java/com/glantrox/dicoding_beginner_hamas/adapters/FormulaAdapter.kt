package com.glantrox.dicoding_beginner_hamas.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.glantrox.dicoding_beginner_hamas.R

class FormulaAdapter(val listOfFormula: List<String>): RecyclerView.Adapter<FormulaAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textFormula = itemView.findViewById<TextView>(R.id.text_formula)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FormulaAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_formula, parent, false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: FormulaAdapter.ViewHolder, position: Int) {
        val recipe = listOfFormula
        holder.textFormula.text = recipe[position]

    }

    override fun getItemCount(): Int {
        return listOfFormula.size
    }
}