package com.example.custom.ui.menu3

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

class Menu3Fragment : Fragment(), View.OnClickListener {

    private lateinit var menu3ViewModel: Menu3ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        menu3ViewModel =
                ViewModelProviders.of(this).get(Menu3ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu3, container, false)



        val myListData = arrayOf(
            MyListData(getString(R.string.button3_1_text), getString(R.string.description3_1), R.drawable.craftwood_shutters_2),
            MyListData(getString(R.string.button3_2_text), getString(R.string.description3_2),R.drawable.basswood_shutters_2),
            MyListData(getString(R.string.button3_3_text), getString(R.string.description3_3),R.drawable.phoenixwood_shutters_2),
            MyListData(getString(R.string.button3_4_text), getString(R.string.description3_4), R.drawable.aluminium_shutters_3),
            MyListData(getString(R.string.button3_5_text), getString(R.string.description3_5), R.drawable.artwood_shutters_2)


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
