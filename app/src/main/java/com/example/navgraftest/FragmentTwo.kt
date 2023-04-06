package com.example.navgraftest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraftest.databinding.FragmentTwoBinding

class FragmentTwo: Fragment(R.layout.fragment_two) {
    lateinit var binding: FragmentTwoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTwoBinding.bind(view)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTwo_to_fragmentThree)

        }
    }
}