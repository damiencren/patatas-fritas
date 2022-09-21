package fr.damienc.patatasfritas.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import fr.damienc.patatasfritas.HistoryItemModel
import fr.damienc.patatasfritas.HistoryItemModelDecoration
import fr.damienc.patatasfritas.MainActivity
import fr.damienc.patatasfritas.R
import fr.damienc.patatasfritas.adapter.HistoryAdapter
import kotlin.system.exitProcess

val historyList: List<HistoryItemModel> = listOf(
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("nath",2000,"raison"),
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("arthur",25,"raison")
)

    val globalList: List<HistoryItemModel> = listOf(
    HistoryItemModel("arthur",25,"raison"),
    HistoryItemModel("nath",2000,"raison"),
    HistoryItemModel("arthur",25,"raison"),
)

class HomeFragment (private val context : MainActivity) : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.fragment_home_rv)
        verticalRecyclerView.addItemDecoration(HistoryItemModelDecoration())
        verticalRecyclerView.adapter = HistoryAdapter(context,historyList)


        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                // Handle tab select
                when(tab?.position) {
                    0 -> {
                        verticalRecyclerView.adapter = HistoryAdapter(context,historyList)
                    }

                    1 -> {
                        verticalRecyclerView.adapter = HistoryAdapter(context, globalList)
                    }
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselect
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselect
            }
        })

        return view
    }
}