package com.example.progetto2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_ps4_list.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Setup Navigation controller cono bottoNavigation
        bottomNavigation.setupWithNavController(Navigation.findNavController(this, R.id.navHost))
    }
    /**
     * Invocata quando occorre creare un menu
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        // Imposta il menu dal file di risorse
        menuInflater.inflate(R.menu.button_impostazioni, menu)

        return true
    }

    /**
     * Processa le voci del venu
     */
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId) {
            R.id.fragment_impostazioni -> Navigation.findNavController(this, R.id.navHost).navigate(R.id.action_home_to_fragment_impostazioni)
            else -> return false    // Voce non processata
        }

        return true
    }

}
