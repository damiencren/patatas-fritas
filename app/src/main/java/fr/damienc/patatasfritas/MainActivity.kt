package fr.damienc.patatasfritas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import fr.damienc.patatasfritas.fragment.HomeFragment
import fr.damienc.patatasfritas.fragment.PresetsFragment
import fr.damienc.patatasfritas.fragment.StatisticsFragment
import fr.damienc.patatasfritas.fragment.TransferFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationView = findViewById<BottomNavigationView>(R.id.navigation_view)
        navigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home_page -> {
                    loadFragment(HomeFragment(this))
                    true
                }
                R.id.transfer_page -> {
                    loadFragment(TransferFragment(this))
                    true
                }

                R.id.presets_page -> {
                    loadFragment(PresetsFragment(this))
                    true
                }

                R.id.statistics_page -> {
                    loadFragment(StatisticsFragment(this))
                    true
                }

                else -> false
            }
        }

        loadFragment(HomeFragment(this))
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.activity_main_fl, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}