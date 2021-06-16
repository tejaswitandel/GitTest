package com.dhiwise.app.modules.loginlight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dhiwise.app.R
import com.dhiwise.app.databinding.ActivityLoginLightBinding
import com.dhiwise.app.modules.loginlight.`data`.viewmodel.LoginLightVM
import kotlin.Unit

public class LoginLightActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginLightBinding

    private val viewModel: LoginLightVM by viewModels<LoginLightVM>()

    public override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_login_light)
        binding.lifecycleOwner = this
        binding.loginLightVM=viewModel
    }

    public companion object {
        public fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, LoginLightActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}
