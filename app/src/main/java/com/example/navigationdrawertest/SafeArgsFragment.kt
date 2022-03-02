package com.example.navigationdrawertest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.navigationdrawertest.databinding.FragmentSafeargsBinding

class SafeArgsFragment : Fragment() {

    private var _binding: FragmentSafeargsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSafeargsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)
        binding.buttonInt.setOnClickListener{navController.navigate(SafeArgsFragmentDirections.actionSafeargsToIntOrigenFragment())}
        binding.buttonString.setOnClickListener{navController.navigate(SafeArgsFragmentDirections.actionSafeargsToStringOrigenFragment())}
        binding.buttonObject.setOnClickListener{navController.navigate(SafeArgsFragmentDirections.actionSafeargsToObjectOrigenFragment())}

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}