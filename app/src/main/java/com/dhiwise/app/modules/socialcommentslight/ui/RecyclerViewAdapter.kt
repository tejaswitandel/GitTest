package com.dhiwise.app.modules.socialcommentslight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dhiwise.app.R
import com.dhiwise.app.databinding.RowSocialCommentsLightBinding
import com.dhiwise.app.modules.socialcommentslight.`data`.model.SocialCommentsLightRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<SocialCommentsLightRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSocialCommentsLightVH>() {
  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowSocialCommentsLightVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_social_comments_light,parent,false)
    return RowSocialCommentsLightVH(view)
  }

  public override fun onBindViewHolder(holder: RowSocialCommentsLightVH, position: Int): Unit {
    holder.binding.socialCommentsLightRowModel = list[position]
  }

  public override fun getItemCount(): Int = list.size

  public class RowSocialCommentsLightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSocialCommentsLightBinding = RowSocialCommentsLightBinding.bind(itemView)
  }
}
