package com.example.projekt124

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var CheckBox = findViewById(R.id.checkBox1) as CheckBox
        var nastepne = findViewById(R.id.nastepne) as ImageButton
        var poprzednie = findViewById(R.id.poprzednie) as ImageButton
        var Doge = findViewById(R.id.Doge) as ImageView
        var Obracanie = findViewById(R.id.Obracanie) as Button
        var ObracanieText = findViewById(R.id.ObracanieText) as TextView
        var Resize = findViewById(R.id.Resize) as Button
        var ResizeText = findViewById(R.id.ResizeText) as TextView

        lateinit var mYourBitmap: Bitmap

        var obracanieint: Int = 0
        var obraz: Int = 0
        var terazObraz: Int = 0

            CheckBox.setOnClickListener{
            //val checkBoxState: Boolean = CheckBox.isChecked()
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
        nastepne.setOnClickListener{
        terazObraz = obraz
            if(terazObraz == 0){
                Doge.setImageResource(R.drawable.dog2)
                obraz = 1
            }
            if(terazObraz == 1){
                Doge.setImageResource(R.drawable.dog3)
                obraz = 2
            }
            if(terazObraz == 2){
                Doge.setImageResource(R.drawable.dog4)
                obraz = 3
            }
            if(terazObraz == 3){
                Doge.setImageResource(R.drawable.dog1)
                obraz = 0
            }

        }
        poprzednie.setOnClickListener {
        terazObraz = obraz
            if(terazObraz == 0){
                Doge.setImageResource(R.drawable.dog4)
                obraz = 3
            }
            if(terazObraz == 3){
                Doge.setImageResource(R.drawable.dog3)
                obraz = 2
            }
            if(terazObraz == 2){
                Doge.setImageResource(R.drawable.dog2)
                obraz = 1
            }
            if(terazObraz == 1){
                Doge.setImageResource(R.drawable.dog1)
                obraz = 0
            }

        }
        Obracanie.setOnClickListener{

            var x = Integer.parseInt(ObracanieText.getText().toString());
                Doge.setRotation(x.toFloat())
        }

        Resize.setOnClickListener {
        Toast.makeText(this@MainActivity, "Nie dziala", Toast.LENGTH_SHORT).show()
        /*
            val resized = Bitmap.createScaledBitmap(mYourBitmap, 300, 300, true)
            Doge.setImageBitmap(resized)



            var y = Integer.parseInt(ResizeText.getText().toString());
            Doge.layoutParams = LinearLayout.LayoutParams(y,y)


        */
        }




    }
}