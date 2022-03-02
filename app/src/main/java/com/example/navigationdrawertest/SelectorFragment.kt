package com.example.navigationdrawertest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationdrawertest.databinding.FragmentSelectorBinding
import java.nio.channels.Selector

class SelectorFragment : Fragment() {

    private var _binding: FragmentSelectorBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentSelectorBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)

        binding.blueselector.setOnClickListener{navController.navigate(SelectorFragmentDirections.actionSelectorToBlueFragment())}
        binding.redselector.setOnClickListener{navController.navigate(SelectorFragmentDirections.actionSelectorToRedFragment())}
        binding.greenselector.setOnClickListener{navController.navigate(SelectorFragmentDirections.actionSelectorToGreenFragment())}


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}