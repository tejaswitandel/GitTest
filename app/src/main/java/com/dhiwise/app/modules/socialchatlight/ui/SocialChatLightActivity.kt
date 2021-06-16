package com.dhiwise.app.modules.socialchatlight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dhiwise.app.R
import com.dhiwise.app.databinding.ActivitySocialChatLightBinding
import com.dhiwise.app.modules.socialchatlight.`data`.viewmodel.SocialChatLightVM
import kotlin.Unit

public class SocialChatLightActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySocialChatLightBinding

    private val viewModel: SocialChatLightVM by viewModels<SocialChatLightVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_social_chat_light)
        binding.lifecycleOwner = this
        binding.socialChatLightVM=viewModel
    }

    public companion object {
        public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, SocialChatLightActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}
