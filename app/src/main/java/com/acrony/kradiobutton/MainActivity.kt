package com.acrony.kradiobutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbGender=findViewById<RadioGroup>(R.id.rbGender)

        rbGender?.setOnCheckedChangeListener { group, checkedId ->

            var GenderSelected="Your Selected Gender is:"

            if(R.id.rbMale==checkedId)
            {
                Toast.makeText(applicationContext,GenderSelected+"Male",Toast.LENGTH_SHORT).show()
                intent= Intent(this,Activity2::class.java)
                startActivity(intent)
            }
           else if(R.id.rbFemale==checkedId)
            {
                Toast.makeText(applicationContext,GenderSelected+"FeMale",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext,GenderSelected+"Transgender",Toast.LENGTH_SHORT)
                        .show()
            }

        }

        checkBox?.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked)
            {
                Toast.makeText(applicationContext,"You have agreed to terms",Toast.LENGTH_SHORT)
                        .show()
                intent= Intent(this,Activity2::class.java)
                startActivity(intent)
            }

        }
    }
}
