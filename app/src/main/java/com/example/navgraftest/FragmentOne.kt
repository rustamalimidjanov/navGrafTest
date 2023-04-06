package com.example.navgraftest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraftest.databinding.FragmentOneBinding

class FragmentOne: Fragment(R.layout.fragment_one) {
    lateinit var binding: FragmentOneBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOneBinding.bind(view)

        binding.button1.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

    }
}