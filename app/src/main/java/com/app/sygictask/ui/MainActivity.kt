package com.app.sygictask.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.app.sygictask.HOME_FRAGMENT_ARGS_KEY
import com.app.sygictask.R
import com.app.sygictask.URL
import com.app.sygictask.ui.home.HomeFragmentArgs
import com.app.sygictask.ui.home.HomeFragmentArguments
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        val bundle = Bundle()

//        bundle.putParcelable(
//            HOME_FRAGMENT_ARGS_KEY,
//            HomeFragmentArguments(resources.getString(R.string.hi_masky), URL)
//        )
        navController.setGraph(navController.graph, HomeFragmentArgs(HomeFragmentArguments(resources.getString(R.string.hi_masky), URL)).toBundle())

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}