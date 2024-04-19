package com.example.spacex_hw2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_hw2.R
import com.example.spacex_hw2.databinding.CartRocketItemBinding
import com.example.spacex_hw2.model.CartRocket

class RocketAdapter(private val cartRocketList: ArrayList<CartRocket>) : RecyclerView.Adapter<RocketAdapter.RocketHolder>() {


    class RocketHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = CartRocketItemBinding.bind(item)
        fun bind(rocket: CartRocket) = with(binding) {
            img.setImageResource(rocket.imageId)
            tvReadness.text = rocket.typeOfReadiness
            tvName.text = rocket.name
            tvCodeName.text = rocket.codeName
            tvDate.text = rocket.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RocketHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_rocket_item, parent, false)
        return RocketHolder(view)
    }

    override fun getItemCount(): Int {
        return cartRocketList.size
    }

    override fun onBindViewHolder(holder: RocketHolder, position: Int) {
        holder.bind(cartRocketList[position])
    }
}