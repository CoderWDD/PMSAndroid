package com.example.login

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.login.custom.drawable.LoginHeadBGDrawable
import com.example.login.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewBinding = FragmentLoginBinding.inflate(layoutInflater, container, false)

        viewBinding.headerTitle.background = LoginHeadBGDrawable(ContextCompat.getColor(requireContext(), R.color.header))
        return viewBinding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = LoginFragment()
    }
}