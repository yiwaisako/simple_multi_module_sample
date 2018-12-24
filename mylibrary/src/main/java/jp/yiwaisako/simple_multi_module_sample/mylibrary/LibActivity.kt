package jp.yiwaisako.simple_multi_module_sample.mylibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LibActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib)
    }
}
