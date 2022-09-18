package fr.damienc.patatasfritas.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.damienc.patatasfritas.HistoryItemModelDecoration
import fr.damienc.patatasfritas.MainActivity
import fr.damienc.patatasfritas.R
import fr.damienc.patatasfritas.adapter.HistoryAdapter

class HomeFragment (private val context : MainActivity) : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.fragment_home_rv)
        verticalRecyclerView.adapter = HistoryAdapter(context)
        verticalRecyclerView.addItemDecoration(HistoryItemModelDecoration())

        return view
    }
}