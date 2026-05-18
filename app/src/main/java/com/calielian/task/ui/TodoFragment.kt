package com.calielian.task.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.calielian.task.databinding.FragmentTodoBinding

class TodoFragment : Fragment() {

    private var _biding: FragmentTodoBinding? = null
    private val binding get() = _biding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _biding = FragmentTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

}