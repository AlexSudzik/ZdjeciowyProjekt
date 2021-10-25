package com.example.projekt124

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var CheckBox = findViewById(R.id.checkBox1) as CheckBox
        var Doge = findViewById(R.id.Doge) as ImageView

        CheckBox.setOnClickListener{
            val checkBoxState: Boolean = CheckBox.isChecked()
            if(CheckBox.isChecked()){
                //val toast = Toast.makeText(applicationContext, "jest", Toast.LENGTH_SHORT)
                //toast.show()

                Doge.setVisibility(View.VISIBLE)
            }else{
                //val toast = Toast.makeText(applicationContext, "nie ma", Toast.LENGTH_SHORT)
                //toast.show()
                Doge.setVisibility(View.INVISIBLE)
            }

        }






    }
}