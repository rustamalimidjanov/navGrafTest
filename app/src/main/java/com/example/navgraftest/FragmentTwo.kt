package com.example.navgraftest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.navgraftest.databinding.FragmentTwoBinding

class FragmentTwo: Fragment(R.layout.fragment_two) {
    lateinit var binding: FragmentTwoBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTwoBinding.bind(view)
    }
}