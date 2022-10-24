package com.example.superhero.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.superhero.data.entities.SuperHero
import com.example.superhero.databinding.SuperHeroItemBinding

class SuperHeroAdapter(private val onClickListener: OnClickListener) :
    ListAdapter<SuperHero, SuperHeroAdapter.SuperHeroViewHolder>(
        SUPERHEROCOMPARATOR
    ) {
    //Verificando que no existan SuperHero repitidos
    object SUPERHEROCOMPARATOR : DiffUtil.ItemCallback<SuperHero>() {
        override fun areItemsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
            return oldItem.id == newItem.id
        }
    }

    //creando mi ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val binding =
            SuperHeroItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperHeroViewHolder(binding)
    }

    class SuperHeroViewHolder(private val binding: SuperHeroItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //Mostrando texto e imagenes obtenidos
        fun onBind(superHero: SuperHero) = with(binding) {
            tvName.text = superHero.name
            Glide.with(binding.root.context)
                .load(superHero.image.url)
                .into(image)
        }
    }


    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val superhero = getItem(position)
        //onClickListener que pasar la data de superHero
        holder.itemView.setOnClickListener {
            onClickListener.onClick(superhero)
        }
        holder.onBind(getItem(position))
    }

    class OnClickListener(val clickListener: (superHero: SuperHero) -> Unit) {
        fun onClick(superHero: SuperHero) = clickListener(superHero)
    }

}
