package com.example.fragmentskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.fragmentskotlin.Fragments.FormFragment
import com.example.fragmentskotlin.Fragments.LlistatFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav: BottomNavigationView = findViewById(R.id.main_menu)

        bottomNav.setOnItemSelectedListener { item: MenuItem ->

            when (item.itemId) {
                R.id.nav_home -> {
                    loadFragment(FormFragment())
                    true
                }

                R.id.nav_list -> {
                    loadFragment(LlistatFragment())
                    true
                }
                else -> {false}
            }
        }
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}