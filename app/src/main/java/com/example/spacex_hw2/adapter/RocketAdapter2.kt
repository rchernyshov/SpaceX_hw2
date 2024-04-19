package com.example.spacex_hw2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_hw2.R
import com.example.spacex_hw2.databinding.CartRocketItem2Binding
import com.example.spacex_hw2.model.CartRocket

class RocketAdapter2(private val cartRocketList: ArrayList<CartRocket>) : RecyclerView.Adapter<RocketAdapter2.RocketHolder>() {


    class RocketHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = CartRocketItem2Binding.bind(item)
        fun bind(rocket: CartRocket) = with(binding) {
            img.setImageResource(rocket.imageId)
            tvReadness.text = rocket.typeOfReadiness
            tvName.text = rocket.name
            imgInactive.setImageResource(rocket.imageActiveId!!)
            tvActive.text = rocket.textActive
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RocketHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_rocket_item2, parent, false)
        return RocketHolder(view)
    }

    override fun getItemCount(): Int {
        return cartRocketList.size
    }

    override fun onBindViewHolder(holder: RocketHolder, position: Int) {
        holder.bind(cartRocketList[position])
    }
}