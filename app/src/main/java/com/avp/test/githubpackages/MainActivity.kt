package com.avp.test.githubpackages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avp.test.JitPackPublish.FragmentFromLibrary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.frame, FragmentFromLibrary.newInstance())
            .commit()
    }
}
