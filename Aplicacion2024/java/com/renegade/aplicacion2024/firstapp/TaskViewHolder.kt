package com.renegade.aplicacion2024.firstapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.renegade.aplicacion2024.R

class TaskViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val tvTask:TextView = view.findViewById(R.id.tvTask)
    private val cbTask:CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {

        cbTask.isChecked = task.isSelected
        tvTask.text = task.name

        val color = when(task.category){
            TaskCategory.Business -> R.color.todo_dialog_category_business
            TaskCategory.Personal -> R.color.todo_dialog_category_personal
            TaskCategory.Other -> R.color.todo_dialog_category_other
        }

        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)
        )

    }

}