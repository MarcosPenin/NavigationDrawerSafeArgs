package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawertest.databinding.FragmentIntDestinoBinding
import com.example.navigationdrawertest.databinding.FragmentIntOrigenBinding

class IntDestinoFragment : Fragment() {
    private var _binding: FragmentIntDestinoBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentIntDestinoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val argumentoRecibido = IntDestinoFragmentArgs.fromBundle(requireArguments()).argumentoInt
        binding.texto.setText(argumentoRecibido.toString())


    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}