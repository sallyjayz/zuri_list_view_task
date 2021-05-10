package com.sallyjayz.zurilistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sallyjayz.zurilistview.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private var binding:ActivityLoginBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.loginBtn?.setOnClickListener {
            val userEmail = binding?.email?.text.toString()
            val userPassword = binding?.password?.text.toString()
            if ( userEmail == "salamajatau@gmail.com" && userPassword == "12345678" ) {
                moveToListActivity()
            } else {
                Toast.makeText(this, "Username or Password incorrect",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun moveToListActivity() {
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }
}