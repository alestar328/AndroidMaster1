package com.prometeux.androidmaster1.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prometeux.androidmaster1.R

class CategoriesAdapter(private val categories:List<TaskCategory>, private val onItemSelected:(Int) -> Unit) :
    RecyclerView.Adapter<CategoriesViewHolder>() {

        //Este metodo crea una vista visual para que onBind pueda mostrar la informacion
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
            return CategoriesViewHolder(view)
    }

    override fun getItemCount() = categories.size //Este metodo muestra la cantidad de items disponibles


    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position], onItemSelected)
    }
}