package fr.damienc.patatasfritas.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.damienc.patatasfritas.HistoryItemModel
import fr.damienc.patatasfritas.MainActivity
import fr.damienc.patatasfritas.R

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

class HistoryAdapter (private val context: MainActivity) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val itemName = view.findViewById<TextView>(R.id.item_vertical_rv_item_name)
        val itemReason = view.findViewById<TextView>(R.id.item_vertical_rv_item_reason)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical_home_rv, parent, false)
        return ViewHolder(view)
    }

    //mettre a jour
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = historyList[position]
        holder.itemName.text = currentItem.name
        holder.itemReason.text = currentItem.reason
    }

    override fun getItemCount(): Int = historyList.size
}