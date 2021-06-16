package com.dhiwise.app.modules.socialhomelight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dhiwise.app.R
import com.dhiwise.app.databinding.ActivitySocialHomeLightBinding
import com.dhiwise.app.extensions.alert
import com.dhiwise.app.extensions.neutralButton
import com.dhiwise.app.modules.socialhomelight.`data`.viewmodel.SocialHomeLightVM
import kotlin.Unit

public class SocialHomeLightActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySocialHomeLightBinding

  private val viewModel: SocialHomeLightVM by viewModels<SocialHomeLightVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding=DataBindingUtil.setContentView(this,R.layout.activity_social_home_light)
    binding.lifecycleOwner = this
    binding.socialHomeLightVM=viewModel
    binding.recyclerView.adapter=RecyclerViewAdapter(arrayListOf())

        binding.txtFollow.setOnClickListener {
        alert("follow","follow ") {
        	neutralButton {
        	}
        }
        }

  }

  public companion object {
    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SocialHomeLightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
