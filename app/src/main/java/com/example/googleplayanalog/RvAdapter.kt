package com.example.googleplayanalog

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.googleplayanalog.databinding.GameItemBinding
import com.example.googleplayanalog.databinding.ReklamItemBinding
import com.example.googleplayanalog.databinding.RvReklamBinding

import com.example.googleplayanalog.databinding.TulbarOflaingamesBinding


class RvAdapter : RecyclerView.Adapter<ViewHolder>() {
    companion object{
        const val GAMES = 0
        const val TYPES = 1
        const val REKLAM =2
    }
    inner class AdapterViewHolder(private val binding: GameItemBinding) :
        ViewHolder(binding.root) {
        fun bind(gameItem: GameItem) {
       val gamesInnerAdapter =GamesInnerAdapter()

            binding.horizontalItems.adapter = gamesInnerAdapter

            gamesInnerAdapter.models=gameItem.items
        }
    }
    inner class TypesViewHolder(private val binding: TulbarOflaingamesBinding) :ViewHolder(binding.root){

        fun bind (gameTypes: GameTypes){

           binding.types.text =gameTypes.type
        }
    }
    inner class ReklamViewHolder(private val binding: RvReklamBinding) :ViewHolder(binding.root){
        fun bind(rvRek: RvRek){
            val reklamInnerAdapter =ReklamInnerAdapter()
            binding.rvReklam.adapter =reklamInnerAdapter
            reklamInnerAdapter.models =rvRek.rek

        }

    }
    var models = mutableListOf<Items>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun getItemCount(): Int {
        return models.size
    }


    override fun getItemViewType(position: Int): Int {
        return if(models[position] is GameItem){
            GAMES
        } else if (models[position] is GameTypes){
            TYPES
        } else{
            REKLAM
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if(viewType== GAMES) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.game_item, parent, false)
            val binding = GameItemBinding.bind(view)
            AdapterViewHolder(binding)
        } else if(viewType== TYPES){
            val  view =
                LayoutInflater.from(parent.context).inflate(R.layout.tulbar_oflaingames, parent, false)
            val binding = TulbarOflaingamesBinding.bind(view)
            TypesViewHolder(binding)

        }
        else{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_reklam,parent,false)
            val binding =RvReklamBinding.bind(view)
            ReklamViewHolder(binding)
        }

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            GAMES -> {
                (holder as AdapterViewHolder).bind(models[position] as GameItem )
            }
            TYPES -> {
                (holder as TypesViewHolder).bind(models[position] as GameTypes)
            }
            REKLAM -> {
                (holder as ReklamViewHolder).bind(models[position] as RvRek )
            }
        }
    }









}