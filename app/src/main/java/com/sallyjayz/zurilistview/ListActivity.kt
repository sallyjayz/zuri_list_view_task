package com.sallyjayz.zurilistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sallyjayz.zurilistview.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    var binding: ActivityListBinding? = null
    var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact() {
        adapter = FactAdapter(this, DummyData.funFacts)
        binding?.factListView?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}