package com.example.calculator_final

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_keyboard_2.*

class FragmentKeyboardSecond : Fragment() {

    var communicator: Communicator? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        communicator = context as Communicator
        return inflater.inflate(R.layout.fragment_keyboard_2, container, false)
    }

    override fun onResume() {
        super.onResume()

        // Operator
        buttonSin.setOnClickListener { communicator?.respondData("operator", "sin(") }
        buttonCos.setOnClickListener { communicator?.respondData("operator", "cos(") }
        buttonTan.setOnClickListener { communicator?.respondData("operator", "tan(") }
        buttonCot.setOnClickListener { communicator?.respondData("operator", "cot(") }

        // Clear
        buttonAC.setOnClickListener { communicator?.respondData("clear", "clear") }

        // Change Keyboard
        buttonChangeKeyboard.setOnClickListener { communicator?.respondData("changeKeyboard", "changeKeyboard") }
    }
}
