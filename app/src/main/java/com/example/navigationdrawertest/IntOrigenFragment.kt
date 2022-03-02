package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawertest.databinding.FragmentIntOrigenBinding
import com.example.navigationdrawertest.databinding.FragmentRedBinding


class IntOrigenFragment : Fragment() {

        private var _binding: FragmentIntOrigenBinding? = null

        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {

            _binding = FragmentIntOrigenBinding.inflate(inflater, container, false)
            val root: View = binding.root

            return root
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
}