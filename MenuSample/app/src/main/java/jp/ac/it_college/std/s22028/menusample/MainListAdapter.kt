package jp.ac.it_college.std.s22028.menusample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RemoteCallbackList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import jp.ac.it_college.std.s22028.menusample.databinding.MenuRowBinding
import java.util.Date

class MenuListAdapter(
    private val data: List<Menu>,
    private val callback: (String, Int) -> Unit
) :
    RecyclerView.Adapter<MenuListAdapter.ViewHolder>(){

    class ViewHolder(val binding: MenuRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            MenuRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )


    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = data[position]
        holder.binding.apply {
            tvName.text = menu.name
            tvPrice.text = menu.price.toString()
            root.setOnClickListener {
                // この Adapter を使う側に、選択された定食名と価格をパラメータとしてコールバック
                callback(menu.name, menu.price)
            }
        }
    }


}