package com.example.myapplicationbon

import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.os.Bundle as Bundle1
import com.example.myapplicationbon.Profile as Profile1

class MainActivity : AppCompatActivity() {

    private lateinit var inputFirstName: EditText
    private lateinit var inputLastName: EditText
    private lateinit var inputImageUrl: EditText
    private lateinit var saveButton: Button
    private lateinit var imageView: ImageView



    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputFirstName = findViewById(R.id.editFirstName)
        inputLastName = findViewById(R.id.editLastName)
        inputImageUrl = findViewById(R.id.editUrl)
        saveButton = findViewById(R.id.saveButton)
        imageView = findViewById(R.id.imageView)

        saveButton.setOnClickListener {

            val fname = inputFirstName.text.toString()
            val lname = inputLastName.text.toString()
            val url = inputImageUrl.text.toString()

            val p = com.example.myapplicationbon.Profile(
                fname,
                lname,
                url
            )

            recyclerView = findViewById(R.id.recyclerView)

        val products = ArrayList<Profile1>()
        val add = products.add(
            Profile1(
                "second",
                "profile",
                "1",
                "https://www.designer.io/wp-content/uploads/2019/10/1.png",
                true)

                val adapter = ProfileAdapter(Profile1)
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = adapter

            Glide.with(this)
                    .load(p?.url)
                    .centerCrop()
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(imageView)
        }
    }
}