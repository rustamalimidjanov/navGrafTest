package com.example.navgraftest

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraftest.databinding.FragmentOneBinding

class FragmentOne: Fragment(R.layout.fragment_one) {
    lateinit var binding: FragmentOneBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOneBinding.bind(view)

        binding.button1.setOnClickListener {
            val setTextToTwo = binding.editText1.text.toString()

            findNavController().navigate(
                R.id.action_fragmentOne_to_fragmentTwo,
                bundleOf(FragmentTwo.ARG_FOR_SEND_TEXT_1 to setTextToTwo)
                )
        }

        parentFragmentManager.setFragmentResultListener(FragmentThree.REQUEST_CODE, viewLifecycleOwner) { _, data ->
            val getText = data.getString(FragmentThree.ARG_FOR_SEND_TEXT_3)
            binding.textView1.text = getText
        }

    }
}