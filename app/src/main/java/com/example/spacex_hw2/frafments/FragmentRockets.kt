package com.example.spacex_hw2.frafments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_hw2.R
import com.example.spacex_hw2.adapter.RocketAdapter2
import com.example.spacex_hw2.model.CartRocket

class FragmentRockets : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RocketAdapter2
    private lateinit var rockets: ArrayList<CartRocket>
    private val imageIdList = listOf(
        R.drawable.r1,
        R.drawable.r2,
        R.drawable.r3,
        R.drawable.r4,
        R.drawable.r5,
        R.drawable.r6,
    )
    private val imageActiveId = listOf(
        R.drawable.active,
        R.drawable.inactive
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rockets, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rockets = ArrayList()
        rockets.add(CartRocket(imageIdList[1], "rocket", "Falcon 1", null, null, imageActiveId[1], "inactive"))
        rockets.add(CartRocket(imageIdList[5], "rocket", "Falcon 9", null, null, imageActiveId[0], "active"))
        rockets.add(CartRocket(imageIdList[3], "rocket", "Falcon 9 Test", null, null,  imageActiveId[1], "inactive"))

        init(view)
    }
    companion object {

        @JvmStatic
        fun newInstance() = FragmentRockets()
    }
    private fun init(view: View) {
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rcViewLaunches)
        recyclerView.layoutManager = layoutManager
        adapter = RocketAdapter2(rockets)
        recyclerView.adapter = adapter
    }
}