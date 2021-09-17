package com.app.focusonnavigation

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import com.app.focusonnavigation.databinding.FragmentHomeNextBinding

class HomeNextFragment : Fragment() {

    private val args : HomeNextFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeNextBinding.inflate(layoutInflater)

        binding.tvSomeMsg.text = args.someMsg

        binding.tvSomeMsg.setOnClickListener {
            val action = HomeNextFragmentDirections.actionHomeNextFragment2ToHomeFragment2()
            findNavController().navigate(action)
        }

        return binding.root
    }


}