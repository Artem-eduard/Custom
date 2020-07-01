package com.example.custom.ui.menu2

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

class Menu2Fragment : Fragment() , View.OnClickListener{

    private lateinit var menu2ViewModel: Menu2ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        menu2ViewModel =
                ViewModelProviders.of(this).get(Menu2ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu2, container, false)


        val myListData = arrayOf(
            MyListData(getString(R.string.button2_1_text), getString(R.string.description2_1), R.drawable.wedge_awnings),
            MyListData(getString(R.string.button2_2_text), getString(R.string.description2_2),R.drawable.retractable_patio_shade_awnings_2),
            MyListData(getString(R.string.button2_3_text), getString(R.string.description2_3),R.drawable.retractable_folding_arm_awning_1),
            MyListData(getString(R.string.button2_4_text), getString(R.string.description2_4), R.drawable.aluminium_louvred)



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
        val b = v as Button
        val buttonText = b.text.toString()
        intent.putExtra("imagename", buttonText)

        startActivity(intent);
    }
}
