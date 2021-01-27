package com.example.myapplicationbon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ProfileAdapter(private val profile: List<Profile>): RecyclerView.Adapter<ProfileAdapter.ProductViewHolder>(){
    class ProductViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textUrl: TextView = itemView.findViewById(R.id.textUrl)
        val firstName: TextView = itemView.findViewById(R.id.textFirstName)
        val lastName: TextView = itemView.findViewById(R.id.textLastName)
        val imageViw2: ImageView = itemView.findViewById(R.id.imageView2)
    }


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val p = profile[position]
        holder.imageView.setImageResource(p.image)
        holder.textUrl.text = p.url
        holder.firstName.text = p.firstName
        holder.lastName.text = p.lastName

        if (!p.isImportant)
            holder.imageViw2.visibility = View.GONE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.peofile_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int = profile.size

}

