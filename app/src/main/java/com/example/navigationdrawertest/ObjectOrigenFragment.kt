package com.example.navigationdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawertest.databinding.FragmentObjectOrigenBinding
import com.example.navigationdrawertest.databinding.FragmentStringDestinoBinding

class ObjectOrigenFragment : Fragment() {
    private var _binding: FragmentObjectOrigenBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentObjectOrigenBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.enviarPersona.setOnClickListener {

            val persona = Persona(
                binding.editNombre.text.toString(),
                binding.editApellido.text.toString(),
                binding.editEdad.text.toString().toInt()
            )

            findNavController().navigate(
                ObjectOrigenFragmentDirections.actionObjectOrigenFragmentToObjectDestinoFragment(
                    persona
                )
            )
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

