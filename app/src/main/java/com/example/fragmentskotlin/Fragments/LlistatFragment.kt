package com.example.fragmentskotlin.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentskotlin.R
import com.example.fragmentskotlin.Recyclers.RecyclerViewAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LlistatFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LlistatFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v: View = inflater.inflate(R.layout.fragment_llistat, container, false)

        var llistat: MutableList<String>  = ArrayList()
        llistat.add("Dam");
        llistat.add("Daw");
        llistat.add("Asix");
        llistat.add("Smx");

        var mRecyclerView: RecyclerView = v.findViewById(R.id.recyclerLlistat);
        mRecyclerView.layoutManager = LinearLayoutManager(context)
        val mAdapter : RecyclerViewAdapter = RecyclerViewAdapter(llistat, context);

        mRecyclerView.adapter = mAdapter

        return v;
    }
}