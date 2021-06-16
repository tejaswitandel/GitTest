package com.dhiwise.app.modules.socialhomelight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dhiwise.app.R
import com.dhiwise.app.databinding.RowSocialHomeLightBinding
import com.dhiwise.app.modules.socialhomelight.`data`.model.SocialHomeLightRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<SocialHomeLightRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSocialHomeLightVH>() {
  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSocialHomeLightVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_social_home_light,parent,false)
    return RowSocialHomeLightVH(view)
  }

  public override fun onBindViewHolder(holder: RowSocialHomeLightVH, position: Int): Unit {
    holder.binding.socialHomeLightRowModel = list[position]
  }

  public override fun getItemCount(): Int = list.size

  public class RowSocialHomeLightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSocialHomeLightBinding = RowSocialHomeLightBinding.bind(itemView)
  }
}
