package com.example.mymusic

import android.location.GnssAntennaInfo.Listener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.mymusic.databinding.ItemPlayListenBinding

class MusicAdapter(private val playList: List<PlayListen>, val onClick :(play:PlayListen)->Unit) :
    RecyclerView.Adapter<MusicAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPlayListenBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount() = playList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(playList.get(position))
    }

    inner class ViewHolder(private val binding: ItemPlayListenBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(play: PlayListen) {

                binding.apply {
                    play.apply {
                        tvnum.text = num
                        tvname.text = musicName
                        tvchel.text = name
                        tvtime.text = time

                    }
                }
            itemView.setOnClickListener {
                onClick(play)
            }
        }

    }


}