package com.example.custom.ui


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.custom.R
import com.example.custom.ui.menu1.Menu1_button1_activity
import com.example.custom.ui.model.MyListData
import org.w3c.dom.Text


class MyListAdapter(listdata: Array<MyListData>) :
    RecyclerView.Adapter<MyListAdapter.ViewHolder>() {
    private val listdata: Array<MyListData>
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem: View = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val myListData: MyListData = listdata[position]
        holder.textView.setText(listdata[position].title)
        holder.textView2.setText(listdata[position].description)
        holder.imageView.setImageResource(listdata[position].getImgId())
        holder.linearLayout.setOnClickListener {
            val intent = Intent(it.context, Menu1_button1_activity::class.java);
            intent.putExtra("imagesrc",myListData.imgId)
            intent.putExtra("imagename", myListData.title)
            it.context.startActivity(intent);
        }
    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var textView: TextView
        var textView2: TextView
        var linearLayout: LinearLayout

        init {
            imageView = itemView.findViewById(R.id.imageView) as ImageView
            textView = itemView.findViewById(R.id.textView) as TextView
            textView2 = itemView.findViewById(R.id.textView2) as TextView
            linearLayout = itemView.findViewById(R.id.linearLayout) as LinearLayout
        }
    }

    // RecyclerView recyclerView;
    init {
        this.listdata = listdata
    }
}