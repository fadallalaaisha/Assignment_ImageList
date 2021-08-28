package com.example.testphotos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImagesRVAdapter(var context: Context, var List_images:List<Image_List>):RecyclerView.Adapter<PhotosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        var photos=LayoutInflater.from(parent.context).inflate(R.layout.support_simple_spinner_dropdown_item,parent,false)
   return PhotosViewHolder(photos)
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        var currentImages=List_images.get(position)
        holder.ivImage.text=currentImages.photos
        holder.tvCaption.text=currentImages.caption
    }

    override fun getItemCount(): Int {
        return List_images.size
    }
}
class PhotosViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var ivImage=itemView.findViewById<ImageView>(R.id.ivImage)
    var tvCaption=itemView.findViewById<TextView>(R.id.tvcaptions)
}