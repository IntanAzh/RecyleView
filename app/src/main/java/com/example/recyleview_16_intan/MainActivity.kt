@file:Suppress("unused")

package com.example.recyleview_16_intan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity(val it: String) : AppCompatActivity() {


    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.blackpanther,
                "black_panther",
                "Superhero blackpanter, superhero kuat"
            ),
            Superhero(
                R.drawable.captainamerika,
                "captain_amerika",
                "Superhero dari Amerika,yaa captain amerika"
            ),
            Superhero(
                R.drawable.hulk,
                "hulk",
                "Superhero berwarna hijau dan besar"
            ),
            Superhero(
                R.drawable.ironman,
                "iron_man",
                "Superhero yang pernah viral karna odading"
            ),
            Superhero(
                R.drawable.marvel,
                "marvel",
                "Superhero perempuan yang kuat"
            ),
        )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList,) {
        val intent = Intent(this, DetailsuperheroActivity::class.java)
        intent.putExtra(INTENT_PARCELABLE, it)
        startActivity(intent)
    }
    }

}









