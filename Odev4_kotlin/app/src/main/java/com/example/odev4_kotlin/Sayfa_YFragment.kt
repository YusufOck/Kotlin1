package com.example.odev4_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4_kotlin.databinding.FragmentSayfaBBinding
import com.example.odev4_kotlin.databinding.FragmentSayfaYBinding


class Sayfa_YFragment : Fragment() {
    private lateinit var Sayfa_YFragment:FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Sayfa_YFragment = FragmentSayfaYBinding.inflate(inflater, container, false)
        Sayfa_YFragment.buttonGecisANAsayfa.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anaSayfaDon)
        }
        return Sayfa_YFragment.root
    }
}