package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnFragemnt2: Button
    lateinit var btnFragment1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnFragment1 = findViewById(R.id.btnFragment1)
        btnFragemnt2 = findViewById(R.id.btnFragment2)

        val firstFragmemnt =  FirstFragmemnt()
        val seconedFragment = SeconedFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragmnet,firstFragmemnt)
            commit()
        }

        btnFragment1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragmnet,firstFragmemnt)
                addToBackStack(null)
                commit()
            }
        }
        btnFragemnt2.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flfragmnet,seconedFragment)
                    addToBackStack(null)
                    commit()
                }
        }
    }
}