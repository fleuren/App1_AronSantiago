package com.example.fusemon

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var setClick = false
        var con1 = 0
        var con2 = 0

        val btn = findViewById<Button>(R.id.info)
        btn.setOnClickListener{
            val initializepopup = layoutInflater.inflate(R.layout.info_popup, null)

            val showpopup = Dialog(this)
            showpopup.setContentView(initializepopup)

            showpopup.setCancelable(true)
            showpopup.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            showpopup.show()
        }

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN

        )
        resetButton.setOnClickListener{
            container1.setImageResource(R.drawable.bg)
            container2.setImageResource(R.drawable.bg)
            output.setImageResource(R.drawable.bg)
        }

        blasButton.setOnClickListener {
            if (setClick == true)
            {
                container2.setImageResource(R.drawable.blas_base)
                setClick = false
                con2 = 1
            }
            else {
                container1.setImageResource(R.drawable.blas_base)
                setClick = true
                con1 = 1

            }
        }
        charButton.setOnClickListener{
            if (setClick == true)
            {
                container2.setImageResource(R.drawable.char_base)
                setClick = false
                con2 = 2
            }
            else {
                container1.setImageResource(R.drawable.char_base)
                setClick = true
                con1 = 2
            }
        }
        venuButton.setOnClickListener{
            if (setClick == true)
            {
                container2.setImageResource(R.drawable.venu_base)
                setClick = false
                con2 = 3
            }
            else{
            container1.setImageResource(R.drawable.venu_base)
            setClick = true
            con1 = 3
            }
        }
        pikaButton.setOnClickListener{
            if (setClick == true)
            {
                container2.setImageResource(R.drawable.pika_base)
                setClick = false
                con2 = 4
            }
            else {
                container1.setImageResource(R.drawable.pika_base)
                setClick = true
                con1 = 4
            }
        }
        laprButton.setOnClickListener{
            if (setClick == true)
            {
                container2.setImageResource(R.drawable.lapr_base)
                setClick = false
                con2 = 5
            }
            else {
                container1.setImageResource(R.drawable.lapr_base)
                setClick = true
                con1 = 5
            }
        }
        snorButton.setOnClickListener{
            if (setClick == true)
            {
                container2.setImageResource(R.drawable.snor_base)
                setClick = false
                con2 = 6
            }
            else {
                container1.setImageResource(R.drawable.snor_base)
                setClick = true
                con1 = 6
            }
        }
calcButton.setOnClickListener{
    // blastoise fusions
    if (con1 == 1 && con2 == 1) {
        output.setImageResource(R.drawable.blas_base)
    }
    else if (con1 == 1 && con2 == 2){
        output.setImageResource(R.drawable.blas_char)
    }
    else if (con1 == 1 && con2 == 3){
        output.setImageResource(R.drawable.blas_venu)
    }
    else if(con1 == 1  && con2 == 4){
        output.setImageResource(R.drawable.blas_pika)
    }
    else if(con1 == 1 && con2 == 5){
        output.setImageResource(R.drawable.blas_lapr)
    }
    else if (con1 == 1 && con2 == 6){
        output.setImageResource(R.drawable.blas_snor)
    }
    // charizard fusions
    else if (con1 == 2 && con2 == 1) {
        output.setImageResource(R.drawable.char_blas)
    }
    else if(con1 == 2 && con2 == 2) {
        output.setImageResource(R.drawable.char_base)
    }
    else if(con1 == 2 && con2 == 3){
        output.setImageResource(R.drawable.char_venu)
    }
    else if(con1 == 2 && con2 == 4){
        output.setImageResource(R.drawable.char_pika)
    }
    else if(con1 == 2 && con2 == 5){
        output.setImageResource(R.drawable.char_lapr)
    }
    else if(con1 == 2 && con2 == 6){
        output.setImageResource(R.drawable.char_snor)
    }
    // venusaur fusions
    else if(con1 == 3 && con2 == 1){
        output.setImageResource(R.drawable.venu_blas)
    }
    else if(con1 == 3 && con2 == 1){
        output.setImageResource(R.drawable.venu_blas)
    }
    else if(con1 == 3 && con2 == 2){
        output.setImageResource(R.drawable.venu_char)
    }
    else if(con1 == 3 && con2 == 3){
        output.setImageResource(R.drawable.venu_base)
    }
    else if(con1 == 3 && con2 == 4){
        output.setImageResource(R.drawable.venu_pika)
    }
    else if(con1 == 3 && con2 == 5){
        output.setImageResource(R.drawable.venu_lapr)
    }
    else if(con1 == 3 && con2 == 6){
        output.setImageResource(R.drawable.venu_snor)
    }
    // pikachu fusions
    else if(con1 == 4 && con2 == 1){
        output.setImageResource(R.drawable.pika_blas)
    }
    else if(con1 == 4 && con2 == 2){
        output.setImageResource(R.drawable.pika_char)
    }
    else if(con1 == 4 && con2 == 3){
        output.setImageResource(R.drawable.pika_venu)
    }
    else if(con1 == 4 && con2 == 4){
        output.setImageResource(R.drawable.pika_base)
    }
    else if(con1 == 4 && con2 == 5){
        output.setImageResource(R.drawable.pika_lapr)
    }
    else if(con1 == 4 && con2 == 6){
        output.setImageResource(R.drawable.pika_snor)
    }
    // lapras fusions
    else if(con1 == 5 && con2 == 1){
        output.setImageResource(R.drawable.lapr_blas)
    }
    else if(con1 == 5 && con2 == 2){
        output.setImageResource(R.drawable.lapr_char)
    }
    else if(con1 == 5 && con2 == 3){
        output.setImageResource(R.drawable.lapr_venu)
    }
    else if(con1 == 5 && con2 == 4){
        output.setImageResource(R.drawable.lapr_pika)
    }
    else if(con1 == 5 && con2 == 5){
        output.setImageResource(R.drawable.lapr_base)
    }
    else if(con1 == 5 && con2 == 6){
        output.setImageResource(R.drawable.lapr_snor)
    }
    // snorlax fusions
    else if(con1 == 6 && con2 == 1){
        output.setImageResource(R.drawable.snor_blas)
    }
    else if(con1 == 6 && con2 == 2){
        output.setImageResource(R.drawable.snor_char)
    }
    else if(con1 == 6 && con2 == 3){
        output.setImageResource(R.drawable.snor_venu)
    }
    else if(con1 == 6 && con2 == 4){
        output.setImageResource(R.drawable.snor_pika)
    }
    else if(con1 == 6 && con2 == 5){
        output.setImageResource(R.drawable.snor_lapr)
    }
    else if(con1 == 6 && con2 == 6){
        output.setImageResource(R.drawable.snor_base)
    }
    else {
        output.setImageResource(R.drawable.bg)
    }
}}}