package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawertest.databinding.FragmentStringDestinoBinding
import com.example.navigationdrawertest.databinding.FragmentStringOrigenBinding


class StringDestinoFragment : Fragment() {
    private var _binding: FragmentStringDestinoBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentStringDestinoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val argumentoRecibido =
            StringDestinoFragmentArgs.fromBundle(requireArguments()).argumentoString
        binding.texto.setText(argumentoRecibido.toString())


    }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}