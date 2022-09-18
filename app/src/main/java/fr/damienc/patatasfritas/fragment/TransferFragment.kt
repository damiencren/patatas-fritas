package fr.damienc.patatasfritas.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fr.damienc.patatasfritas.MainActivity
import fr.damienc.patatasfritas.R

class TransferFragment(private val context : MainActivity) : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_transfer, container, false)

        return view
    }
}