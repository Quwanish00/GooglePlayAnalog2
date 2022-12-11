package com.example.googleplayanalog

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.googleplayanalog.databinding.AdultsGameCard2Binding

class GamesInnerAdapter:RecyclerView.Adapter<GamesInnerAdapter.GamesViewHolder>() {


    var models = listOf<Game>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field =value
        notifyDataSetChanged()
    }

    inner class GamesViewHolder(private val binding: AdultsGameCard2Binding):ViewHolder(binding.root){
        fun bind(games: Game){
            binding.apply {
                pubgImage.setImageResource(games.image)
                pubgName.text =games.name
                pubgIcon.setImageResource(games.icon)

            }
        }

    }

    override fun getItemCount(): Int {
        return models.size
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adults_game_card2,parent,false)
        val binding = AdultsGameCard2Binding.bind(view)
        return GamesViewHolder(binding)
    }


    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        holder.bind(models[position])
    }
}