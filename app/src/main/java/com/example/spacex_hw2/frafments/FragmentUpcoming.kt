package com.example.spacex_hw2.frafments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_hw2.R
import com.example.spacex_hw2.adapter.RocketAdapter
import com.example.spacex_hw2.model.CartRocket

class FragmentUpcoming : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RocketAdapter
    private lateinit var rockets: ArrayList<CartRocket>
    private val imageIdList = listOf(
        R.drawable.r1,
        R.drawable.r2,
        R.drawable.r3,
        R.drawable.r4,
        R.drawable.r5,
        R.drawable.r6,
        )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_upcoming, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rockets = ArrayList()
        rockets.add(CartRocket(imageIdList[0], "launch", "Starlink 2", "CCAES SLC 40", "16-10-2016", null, null))
        init(view)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentUpcoming()
    }

    private fun init(view: View) {
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rcView)
        recyclerView.layoutManager = layoutManager
        adapter = RocketAdapter(rockets)
        recyclerView.adapter = adapter
    }
}