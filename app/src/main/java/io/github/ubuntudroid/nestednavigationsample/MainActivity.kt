package io.github.ubuntudroid.nestednavigationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setupActionBarWithNavController(this, findNavController(R.id.main_nav_host_fragment))
    }

    override fun onSupportNavigateUp(): Boolean = findNavController(R.id.main_nav_host_fragment).navigateUp()
}
