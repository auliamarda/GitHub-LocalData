package com.aulmrd.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

    private fun init(){
        recyclerView = findViewById(R.id.recycle_view)
        

        val data = ArrayList<People>()
        data.add(People(
            R.drawable.user1,
            txtTitle = "JakeWharton",
            txtSubTitle = "Jake Wharton",
            tvFollowers = "56995 Followers",
            tvFollowing = "12 Following",
            tvRepository = "102 Repository",
            tvLocation = "Pittsburgh, PA, USA",
            tvCompany = "Google, Inc."
            ))
        data.add(People(R.drawable.user2,
            txtTitle = "amitshekhariitbhu",
            txtSubTitle = "Amit Shekar",
            tvFollowers = "5153 Followers",
            tvFollowing = "2 Following",
            tvRepository = "37 Repository",
            tvLocation = "New Delhi, India",
            tvCompany = "MindOrksOpenSource"
            ))
        data.add(People(R.drawable.user3,
            txtTitle = "romainguy",
            txtSubTitle = "Romain Guy",
            tvFollowers = "7972 Followers",
            tvFollowing = "0 Following",
            tvRepository ="9 Repository",
            tvLocation = "California",
            tvCompany = "Google"
            ))
        data.add(People(R.drawable.user4,
            txtTitle = "chrisbanes",
            txtSubTitle = "Chris Banes",
            tvFollowers = "14725 Followers",
            tvFollowing = "1 Following",
            tvRepository = "30 Repository",
            tvLocation = "Sydney, Australia",
            tvCompany = "Google working on @android"
        ))
        data.add(People(R.drawable.user5,
            txtTitle = "tipsy",
            txtSubTitle = "David",
            tvFollowers = "788 Followers",
            tvFollowing = "0 Following",
            tvRepository = "56 Repository",
            tvLocation = "Trondheim, Norway",
            tvCompany = "Working Group Two"
            ))
        data.add(People(R.drawable.user6,
            txtTitle = "ravi8x",
            txtSubTitle = "Ravi Tamada",
            tvFollowers = "18628 Followers",
            tvFollowing = "3 Following",
            tvRepository = "28 Repository",
            tvLocation = "India",
            tvCompany = "AndroidHive"
            ))
        data.add(People(R.drawable.user7,
            txtTitle = "jasoet",
            txtSubTitle = "Deny Prasetyo",
            tvFollowers = "277 Followers",
            tvFollowing = "39 Following",
            tvRepository = "44 Repository",
            tvLocation = "Kotagede, Yogyakarta, Indonesia",
            tvCompany = "gojek-engineering"
            ))
        data.add(People(R.drawable.user8,
            txtTitle = "budioktaviyan",
            txtSubTitle = "Budi Oktaviyan",
            tvFollowers = "178 Followers",
            tvFollowing = "23 Following",
            tvRepository = "110 Repository",
            tvLocation = "Jakarta, Indonesia",
            tvCompany = "KotlinID"
            ))
        data.add(People(R.drawable.user9,
            txtTitle = "hendisantika",
            txtSubTitle = "Hendi Santika",
            tvFollowers = "428 Followers",
            tvFollowing = "61 Following",
            tvRepository = "1064 Repository",
            tvLocation = "Bojongsoang - Bandung Jawa Barat",
            tvCompany = "JVMDeveloperID @KotlinID @IDDevOps",
            ))
        data.add(People(R.drawable.user10,
            txtTitle = "sidiqpermana",
            txtSubTitle = "Sidiq Permana",
            tvFollowers = "465 Followers",
            tvFollowing = "10 Following",
            tvRepository = "65 Repository",
            tvLocation = "Jakarta, Indonesia",
            tvCompany = "Nusantara Beta Studio"
            ))

        adapter = MyAdapter(data)


    }
}