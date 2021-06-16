package com.dhiwise.app.modules.socialcommentslight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dhiwise.app.R
import com.dhiwise.app.databinding.ActivitySocialCommentsLightBinding
import com.dhiwise.app.modules.socialcommentslight.`data`.viewmodel.SocialCommentsLightVM
import kotlin.Unit

public class SocialCommentsLightActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySocialCommentsLightBinding

    private val viewModel: SocialCommentsLightVM by viewModels<SocialCommentsLightVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_social_comments_light)
        binding.lifecycleOwner = this
        binding.socialCommentsLightVM=viewModel
        binding.recyclerView.adapter=RecyclerViewAdapter(arrayListOf())
    }

    public companion object {
        public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, SocialCommentsLightActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}
