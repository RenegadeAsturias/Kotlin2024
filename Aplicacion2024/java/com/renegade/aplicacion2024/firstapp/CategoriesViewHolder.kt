package com.renegade.aplicacion2024.firstapp

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.renegade.aplicacion2024.R

class CategoriesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory) {
        when(taskCategory) {
            TaskCategory.Business -> {
                tvCategoryName.text = "Personal"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.todo_dialog_category_business))
            }
            TaskCategory.Other -> {
                tvCategoryName.text = "Negocios"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.todo_dialog_category_other))
            }
            TaskCategory.Personal -> {
                tvCategoryName.text = "Otros"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.todo_dialog_category_personal))
            }
        }
    }

}