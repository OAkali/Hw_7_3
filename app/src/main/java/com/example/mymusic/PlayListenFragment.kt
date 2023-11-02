package com.example.mymusic

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mymusic.databinding.FragmentPlayListenBinding


class PlayListenFragment : Fragment() {
    private lateinit var binding: FragmentPlayListenBinding
    private var playList = arrayListOf(
        PlayListen("1", "2003", "Liaze x Equal", "02:46"),
        PlayListen("2", "На Грани", "Janaga feat. SEVAK", "02:50"),
        PlayListen("3", "Вдвоём", "Миша Марвин", "03:08"),
        PlayListen("4", "Cocaine", "Bebe", "04:18"),
        PlayListen("5", "Хлопья Летят Наверх", "Feduk", "04:23"),
        PlayListen("6", "Big City Life", "V $ X V PRINCE", "05:01"),
        PlayListen("7", "Mockingbird", "Eminem", "04:18"),
        PlayListen("8", "Бабочка", "MARKO-Topic", "03:58"),
        PlayListen("9", "Эне-тил", "Баястан & Бегиш", "03:16"),
        PlayListen("10", "Нету интереса ", "10AGE", "03:46"),
    )
  private lateinit var nameMusic:String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayListenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(playList, this::onClick)
        binding.rvPlayList.adapter = adapter
    }

    private fun onClick(play: PlayListen) {
        nameMusic =play.musicName
            val intent = Intent(context, MusicNameActivity::class.java)
            intent.putExtra("key",nameMusic)
        startActivity(intent)

    }

}