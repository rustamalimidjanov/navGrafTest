package com.example.navgraftest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraftest.databinding.FragmentThreeBinding

class FragmentThree: Fragment(R.layout.fragment_three) {
    lateinit var binding: FragmentThreeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThreeBinding.bind(view)

        binding.button3.setOnClickListener {
            findNavController().popBackStack()

        }
    }
}