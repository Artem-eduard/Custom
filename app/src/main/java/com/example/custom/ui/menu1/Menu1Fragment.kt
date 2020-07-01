package com.example.custom.ui.menu1


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.custom.R
import com.example.custom.ui.MyListAdapter
import com.example.custom.ui.model.MyListData


class Menu1Fragment : Fragment(), View.OnClickListener {

    private lateinit var menu1ViewModel: Menu1ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        menu1ViewModel =
                ViewModelProviders.of(this).get(Menu1ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu1, container, false)


        val string = getString(R.string.description1_1)

        val myListData = arrayOf(
            MyListData(getString(R.string.button1_text), getString(R.string.description1_1), R.drawable.aluminium_blinds),
            MyListData(getString(R.string.button2_text), getString(R.string.description1_2),R.drawable.wooden_blinds),
            MyListData(getString(R.string.button3_text), getString(R.string.description1_3),R.drawable.panel_blinds),
            MyListData(getString(R.string.button4_text), getString(R.string.description1_4), R.drawable.roller_blinds),
            MyListData(getString(R.string.button5_text), getString(R.string.description1_5), R.drawable.vertical_blinds),
            MyListData(getString(R.string.button6_text), getString(R.string.description1_6), R.drawable.honeycombe_1),
            MyListData(getString(R.string.button7_text), getString(R.string.description1_7), R.drawable.double_roller_blinds),
            MyListData(getString(R.string.button8_text), getString(R.string.description1_8), R.drawable.drop_down_blinds)

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
    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
        val fragmentTransaction = beginTransaction()
        fragmentTransaction.func()
        fragmentTransaction.commit()
    }
}
