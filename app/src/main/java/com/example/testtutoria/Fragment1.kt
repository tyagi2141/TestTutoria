package com.example.testtutoria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


//navigation architecture componet -> route -> 1 to 2
//diff ways of setting the UI
//normal ways
//viewbin=ding
//copose


class Fragment1 : Fragment(), View.OnClickListener {
    var gotoFragment2: Button? = null
    var etUserName: EditText? = null
    var titleTv: TextView? = null
    var password: EditText? = null

    //public String name = "ram";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_first, container, false)
        gotoFragment2 = view.findViewById<Button>(R.id.fragment_fragment1_gotofragment2)
        etUserName = view.findViewById<EditText>(R.id.etName)
        titleTv = view.findViewById(R.id.titleId)
        gotoFragment2?.setOnClickListener(this)

        return view
    }

    override fun onClick(p0: View) {

        // Navigation.findNavController(p0).navigate(R.id.action_fragment1_to_fragment2);
        // val bundle = bundleOf("name" to etUserName?.text.toString().trim())


        val action = Fragment1Directions.actionFragment1ToFragment2(etUserName?.text.toString())
        Navigation.findNavController(p0)
            .navigate(action)

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        titleTv?.setText("Fragment 1")
    }
}