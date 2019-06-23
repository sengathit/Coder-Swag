package sengathit.com.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import sengathit.com.coderswag.Adapters.CategoryAdapter
import sengathit.com.coderswag.R
import sengathit.com.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
