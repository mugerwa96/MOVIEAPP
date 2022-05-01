package com.mugerwa.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler=findViewById<RecyclerView>(R.id.recycler)
        val movies= mutableListOf<Movie>()

//        movie titles
        val titles= mutableListOf<String>(
            "batman",
            "clean",
            "fortnite",
            "puss boot",
            "contractor",
            "pursuit",
            "rai",
            "uncarted",
            "pandemic",
            "iceage",
            "repit"
        )
//        date
        val date= mutableListOf<String>(
            "12/o1/2022",
            "06/06/2023",
            "07/05/2020",
            "01/20/2022",
            "06/06/2023",
            "07/05/2020",
            "06/06/2023",
            "07/05/2020",
            "06/06/2023",
            "07/05/2020",
            "06/06/2023"
        )
//        images

        val images= mutableListOf<Int>(
            R.drawable.batman,
            R.drawable.clean,
            R.drawable.fortnite,
            R.drawable.puss_boots,
            R.drawable.contractor,
            R.drawable.pursuit,
            R.drawable.rai,
            R.drawable.uncarted,
            R.drawable.pandemic,
            R.drawable.iceage,
            R.drawable.repit
        )
//        description
        val description= mutableListOf<String>(
            "Bat man home coming ",
            "Clean  ,a scientific movie from marvel studios",
            "Interesting sci-fi movie from years back to years",
            "Cartoons that boost your mind",
            "Interesting sci-fi movie from years back to years",
            "Cartoons that boost your mind",
            "Clean  ,a scientific movie from marvel studios",
            "Interesting sci-fi movie from years back to years",
            "Clean  ,a scientific movie from marvel studios",
            "Interesting sci-fi movie from years back to years",
            "Interesting sci-fi movie from years back to years"

        )
        for(i in titles.indices){
            movies.add(Movie(titles[i],images[i],date[i],description[i]))
        }
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=MovieAdapter(this,movies)

    }
}