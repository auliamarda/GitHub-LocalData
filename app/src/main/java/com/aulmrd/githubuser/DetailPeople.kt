package com.aulmrd.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailPeople : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_people)

        val people = intent.getParcelableExtra<People>(MainActivity.INTENT_PARCELABLE)

        val imageView = findViewById<ImageView>(R.id.imageview)
        val txtTitle = findViewById<TextView>(R.id.username)
        val txtSubtitle = findViewById<TextView>(R.id.name)
        val tvFollowers = findViewById<TextView>(R.id.tv_followers)
        val tvFollowing = findViewById<TextView>(R.id.tv_following)
        val tvRepository = findViewById<TextView>(R.id.tv_repository)
        val tvLocation = findViewById<TextView>(R.id.tv_location)
        val tvCompany = findViewById<TextView>(R.id.tv_company)


        imageView.setImageResource(people?.imageview!!)
        txtTitle.text = people.txtTitle
        txtSubtitle.text = people.txtSubTitle
        tvFollowers.text = people.tvFollowers
        tvFollowing.text = people. tvFollowing
        tvRepository.text = people. tvRepository
        tvLocation.text = people.tvLocation
        tvCompany.text = people.tvCompany


    }
}