package com.example.odev4_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4_kotlin.databinding.FragmentSayfaBBinding

class Sayfa_BFragment : Fragment() {
    private lateinit var Sayfa_BFragment:FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     Sayfa_BFragment = FragmentSayfaBBinding.inflate(inflater, container, false)
        Sayfa_BFragment.buttonGecisY.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.bDenYgecis)
        }

        return Sayfa_BFragment.root
    }

}