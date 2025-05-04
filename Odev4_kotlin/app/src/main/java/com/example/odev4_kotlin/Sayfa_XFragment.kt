package com.example.odev4_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4_kotlin.databinding.FragmentSayfaBBinding
import com.example.odev4_kotlin.databinding.FragmentSayfaXBinding


class Sayfa_XFragment : Fragment() {

    private lateinit var Sayfa_XFragment: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Sayfa_XFragment = FragmentSayfaXBinding.inflate(inflater, container, false)
        Sayfa_XFragment.buttonGecisYX.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.ySayfagecis)

        }
        return Sayfa_XFragment.root
    }
}