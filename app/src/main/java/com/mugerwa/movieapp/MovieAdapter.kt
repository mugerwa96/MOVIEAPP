package com.mugerwa.movieapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MovieAdapter(private val context: Context, private val movies:List<Movie>):RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view=LayoutInflater.from(context).inflate(R.layout.movie_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val movie=movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

   inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(movie: Movie) {
                itemView.findViewById<TextView>(R.id.movie_title).text= movie.title.uppercase(Locale.getDefault())
                itemView.findViewById<TextView>(R.id.movie_description).text=movie.description
                itemView.findViewById<TextView>(R.id.movie_date).text=movie.published
                itemView.findViewById<ImageView>(R.id.movie_image).setImageResource(movie.image)
        }

    }
}