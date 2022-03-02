package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.enviarInt.setOnClickListener {
           binding.editTextNumber.text.toString().toIntOrNull()?.let{
            val action = IntOrigenFragmentDirections.actionIntOrigenFragmentToIntDestinoFragment(it)
            findNavController().navigate(action)
        }?:Toast.makeText(activity, "Debe introducir un número", Toast.LENGTH_SHORT).show()

    }

    }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
}