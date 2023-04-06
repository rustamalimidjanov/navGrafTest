package com.example.navgraftest

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgraftest.databinding.FragmentThreeBinding

class FragmentThree: Fragment(R.layout.fragment_three) {
    lateinit var binding: FragmentThreeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThreeBinding.bind(view)

        val getText = requireArguments().getString(ARG_FOR_SEND_TEXT_3)
        binding.textView3.text = getText
        val setTextForOne = binding.editText3.text.toString()
        binding.button3.setOnClickListener {
            parentFragmentManager.setFragmentResult(REQUEST_CODE, bundleOf(ARG_FOR_SEND_TEXT_3 to setTextForOne))
            findNavController().popBackStack(R.id.fragmentOne, false)
        }
    }

    companion object {
        const val ARG_FOR_SEND_TEXT_3 = "arg_for_send_text_3"
        const val ARG_FOR_SEND_TEXT_1 = "arg_for_send_text_3"
        const val REQUEST_CODE = "request_code"
    }
}