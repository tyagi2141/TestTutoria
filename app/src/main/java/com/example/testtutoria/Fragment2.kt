package com.example.testtutoria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import org.jetbrains.annotations.Nullable


class Fragment2 : Fragment() {
    var userNameTV: TextView? = null

    val arg: Fragment2Args by navArgs()

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_second, container, false)
        userNameTV = view.findViewById<Button>(R.id.userNameId)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userNameTV?.setText(arg.name)
        userNameTV?.setOnClickListener {

            val data = Bundle()

            data.putString("name", userNameTV?.text.toString())


            Navigation.findNavController(it).navigate(R.id.action_fragment2_to_fragment3, data)


            // val action = Fragment1Directions.actionFragment1ToFragment2(userNameTV?.text.toString())

            //Navigation.findNavController(view).navigate(action)
        }

    }
}