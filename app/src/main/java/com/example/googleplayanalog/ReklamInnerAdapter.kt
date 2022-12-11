package com.example.googleplayanalog

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplayanalog.databinding.ReklamItemBinding

import com.example.googleplayanalog.databinding.RvReklamBinding

class ReklamInnerAdapter: RecyclerView.Adapter<ReklamInnerAdapter.RvRekViewholder>() {

    var models = listOf<Reklama>()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field =value
            notifyDataSetChanged()
        }

    inner class RvRekViewholder(private val binding: ReklamItemBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(rek: Reklama){
            binding.apply {
            text1Rek.text =rek.rek_text1
            imageRek.setImageResource(rek.rek_image)
            textRek.text =rek.rek_text

            }
        }

    }

    override fun getItemCount(): Int {
      return models.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvRekViewholder {
      val view =LayoutInflater.from(parent.context).inflate(R.layout.reklam_item,parent,false)
        val binding = ReklamItemBinding.bind(view)

       return RvRekViewholder(binding)
    }

    override fun onBindViewHolder(holder: RvRekViewholder, position: Int) {
       holder.bind(models[position])
    }
}