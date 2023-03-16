package com.example.newbottom

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newbottom.databinding.ItemNewBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    val data = List<String>(20) { "" }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemNewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = Unit

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(private val binding: ItemNewBinding): RecyclerView.ViewHolder(binding.root) {
    }
}