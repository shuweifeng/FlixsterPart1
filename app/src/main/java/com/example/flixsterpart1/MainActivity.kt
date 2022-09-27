package com.example.flixsterpart1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flixsterpart1.R.id

/**
 * The MainActivity for the BestSellerList app.
 * Launches a [MoviesFragment].
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, MoviesFragment(), null).commit()
    }
}