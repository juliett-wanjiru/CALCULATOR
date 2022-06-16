package dev.juliet.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ModulusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modulus)
        val intent= Intent(this,SubtractActivity::class.java)



        startActivity(intent)
        setContentView(R.layout.activity_divide)

        finish()

    }

}