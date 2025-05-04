package com.example.odev4_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4_kotlin.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
private lateinit var AnasayfaFragment:FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        AnasayfaFragment = FragmentAnasayfaBinding.inflate(inflater, container, false)

        AnasayfaFragment.buttonGecisA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Asayfagecis)
        }
        AnasayfaFragment.buttonGecisX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Xsayfagecis)
        }
        return AnasayfaFragment.root
    }
    }
