package com.example.pets
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class loginpage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginbt=findViewById<View>(R.id.loginbtn)
        loginbt.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }


}