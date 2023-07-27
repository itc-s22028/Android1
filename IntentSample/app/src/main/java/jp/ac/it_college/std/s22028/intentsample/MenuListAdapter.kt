package jp.ac.it_college.std.s22028.intentsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MenuListAdapter(private val date: List<Menu>)
    : RecyclerView.Adapter<MenuListAdapter.ViewHolder>() {

        class ViewHolder(val binding: MenuRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            MenuRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
        val menu = data[position]
    holder.binding.apply{
        tvName.text = menu.name
        tvPrice.text = menu.price.toString()
    }
}