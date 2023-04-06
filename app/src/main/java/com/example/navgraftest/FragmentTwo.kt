package com.example.navgraftest

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraftest.databinding.FragmentTwoBinding

class FragmentTwo: Fragment(R.layout.fragment_two) {
    lateinit var binding: FragmentTwoBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTwoBinding.bind(view)

        val getText = requireArguments().getString(ARG_FOR_SEND_TEXT_1)
        binding.textView2.text = getText
        val sendTextToThree = binding.editText2.text.toString()
        binding.button2.setOnClickListener {
            findNavController().navigate(
                R.id.action_fragmentTwo_to_fragmentThree,
                bundleOf(FragmentThree.ARG_FOR_SEND_TEXT_3 to sendTextToThree)
            )
        }
    }

    companion object {
        const val ARG_FOR_SEND_TEXT_1 = "arg_for_send_text_1"
    }
}