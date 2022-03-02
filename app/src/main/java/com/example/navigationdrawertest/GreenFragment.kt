package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawertest.databinding.FragmentGreenBinding


class GreenFragment : Fragment() {
        private var _binding: FragmentGreenBinding? = null

        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {

            _binding = FragmentGreenBinding.inflate(inflater, container, false)
            val root: View = binding.root

            return root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
}