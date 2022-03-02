package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawertest.databinding.FragmentIntDestinoBinding
import com.example.navigationdrawertest.databinding.FragmentStringOrigenBinding

class StringOrigenFragment : Fragment() {
    private var _binding: FragmentStringOrigenBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentStringOrigenBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.enviarInt.setOnClickListener {
            binding.editTextString.text.toString().let{
                val action = StringOrigenFragmentDirections.actionStringOrigenFragmentToStringDestinoFragment(it)
                findNavController().navigate(action)
            }

        }}



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}