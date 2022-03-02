package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationdrawertest.databinding.FragmentObjectDestinoBinding
import com.example.navigationdrawertest.databinding.FragmentObjectOrigenBinding

class ObjectDestinoFragment : Fragment() {
    private var _binding: FragmentObjectDestinoBinding? = null

    private val binding get() = _binding!!
    private val args:ObjectDestinoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentObjectDestinoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.texto.text = args.empleado.toString()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}






