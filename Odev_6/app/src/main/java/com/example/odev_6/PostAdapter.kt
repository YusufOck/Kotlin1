package com.example.odev_6package com.example.yourappname  // kendi package adını yaz!

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val postList: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.profileImage)
        val usernameText: TextView = itemView.findViewById(R.id.usernameText)
        val postImage: ImageView = itemView.findViewById(R.id.postImage)
        val likesText: TextView = itemView.findViewById(R.id.likesText)
        val descriptionText: TextView = itemView.findViewById(R.id.descriptionText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = postList[position]

        holder.profileImage.setImageResource(post.profileImageResId)
        holder.usernameText.text = post.username
        holder.postImage.setImageResource(post.postImageResId)
        holder.likesText.text = "${post.likesCount} likes"
        holder.descriptionText.text = post.description
    }

    override fun getItemCount(): Int = postList.size
}
