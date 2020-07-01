package com.example.custom.ui.menu4

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.custom.R
import com.example.custom.ui.MyListAdapter
import com.example.custom.ui.menu1.Menu1_button1_activity
import com.example.custom.ui.model.MyListData

class Menu4Fragment : Fragment(), View.OnClickListener {

    private lateinit var menu4ViewModel: Menu4ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        menu4ViewModel =
                ViewModelProviders.of(this).get(Menu4ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu4, container, false)



        val myListData = arrayOf(
            MyListData(getString(R.string.button4_1_text), getString(R.string.description4_1), R.drawable.shade_port_1),
            MyListData(getString(R.string.button4_2_text), getString(R.string.description4_2),R.drawable.shade_port_2),
            MyListData(getString(R.string.button4_3_text), getString(R.string.description4_3),R.drawable.shade_port_3)

        )

        val recyclerView = root.findViewById(R.id.recyclerView) as RecyclerView
        val adapter = MyListAdapter(myListData)






        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this.context)
        recyclerView.adapter = adapter
        recyclerView.setItemAnimator(DefaultItemAnimator())
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                DividerItemDecoration.VERTICAL
            )
        )

        return root
    }

    override fun onClick(v: View?) {
        val intent = Intent(context, Menu1_button1_activity::class.java);

        startActivity(intent);
    }
}
