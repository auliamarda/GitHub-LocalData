package com.aulmrd.githubuser

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_viewtemp, parent, false)) {

        private var imageview: ImageView? = null
        private var txtTitle: TextView? = null
        private var txtSubTitle: TextView? = null

    init {
        imageview = itemView.findViewById(R.id.imageview)
        txtTitle = itemView.findViewById(R.id.txt_title)
        txtSubTitle = itemView.findViewById(R.id.txt_subtitle)
    }

    fun bind(data: People){
        imageview?.setImageResource(data.imageview)
        txtTitle?.text = data.txtTitle
        txtSubTitle?.text = data.txtSubTitle
        itemView.setOnClickListener{listener(data)}
    }

    private fun listener(people: People) {
        val intent = Intent (itemView.context,DetailPeople::class.java)
        intent.putExtra(MainActivity.INTENT_PARCELABLE, people)
        itemView.context.startActivity(intent)

    }

}