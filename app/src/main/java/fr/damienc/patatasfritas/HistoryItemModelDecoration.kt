package fr.damienc.patatasfritas

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class HistoryItemModelDecoration : RecyclerView.ItemDecoration(){

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.top = 10
    }
}