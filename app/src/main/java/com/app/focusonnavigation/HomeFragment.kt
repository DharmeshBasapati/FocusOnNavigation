package com.app.focusonnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.focusonnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.btnGoToNextScreen.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragment2ToHomeNextFragment2(someMsg = "This is some message from HOME screen.")
            findNavController().navigate(action)
        }

        return binding.root
    }


}