package com.example.kotlinfrag10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_container) as NavHostFragment;
        val navController = navHostFragment.navController;

        var homeButton = findViewById<ImageButton>(R.id.homeButton)
        var exploreButton = findViewById<ImageButton>(R.id.exploreButton)
        var mailButton = findViewById<ImageButton>(R.id.mailButton)
        var profileButton = findViewById<ImageButton>(R.id.profileButton)

        homeButton.setOnClickListener { view ->
           navController.navigate(R.id.homeFragment)
        }

        exploreButton.setOnClickListener{ view ->
            navController.navigate(R.id.exploreFragment)
        }

        mailButton.setOnClickListener {view ->
            navController.navigate(R.id.mailFragment)
        }

        profileButton.setOnClickListener { view ->
            navController.navigate(R.id.profileFragment)
        }
    }
}