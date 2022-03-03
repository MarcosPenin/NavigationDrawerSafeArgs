package com.example.navigationdrawertest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.navigationdrawertest.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)
        registerForContextMenu(binding.button1)
        binding.button1.setOnClickListener{navController.navigate(HomeFragmentDirections.actionNavHomeToSelector())}
        binding.button2.setOnClickListener{navController.navigate(HomeFragmentDirections.actionNavHomeToNavSafeargs())}



    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}