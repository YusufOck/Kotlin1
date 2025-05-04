package com.example.odev4_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4_kotlin.databinding.FragmentSayfaABinding
import com.example.odev4_kotlin.databinding.FragmentSayfaBBinding


class Sayfa_AFragment : Fragment() {

    private lateinit var Sayfa_AFragment:FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Sayfa_AFragment = FragmentSayfaABinding.inflate(inflater, container, false)
        Sayfa_AFragment.buttonGecisB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bSayfagecis)
        }
        return Sayfa_AFragment.root
    }

}