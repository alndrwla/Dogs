package dev.innovasoftware.dogs

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.innovasoftware.dogs.databinding.ItemDogBinding

class DogsViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding= ItemDogBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(binding.ivDog)
    }
}