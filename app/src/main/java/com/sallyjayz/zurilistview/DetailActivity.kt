package com.sallyjayz.zurilistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sallyjayz.zurilistview.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    private var binding:ActivityDetailBinding? = null
    private var logo = 0
    private var name:String? = null
    private var detail:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_detail)
        setContentView(binding?.root)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAS, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)
        setUpFactDetail()
    }

    private fun setUpFactDetail() {
        binding?.detailTv?.text = detail
        binding?.logoIv?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}