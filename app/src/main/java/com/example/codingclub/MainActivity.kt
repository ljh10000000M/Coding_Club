package com.example.codingclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lunch()
        time()

    }


    // dialog 코드 https://youtu.be/v_2SQfbzRg4?feature=shared

    //TODO lunch 버튼을 누른 후
    private fun lunch() {
        val lunchButton = findViewById<Button>(R.id.lunch)
        lunchButton.setOnClickListener {
            showLunchDialog()
        }
        // TODO 버튼이 눌리면 dialog 표시 (구글에 kotlin custom dialog 검색)
    }

    //TODO time 버튼을 누른 후
    private fun time() {
        val timeButton = findViewById<Button>(R.id.time)

        // timeButton.setOnClickListener = 버튼 눌림 감지
        timeButton.setOnClickListener {
            // dialog 코드 넣기
            showTimeDialog()
        }
        // TODO 버튼이 눌리면 dialog 표시 (구글에 kotlin custom dialog 검색)
    }

    private fun showLunchDialog() {
        CustomLunchDialog(this)
    }
    private fun showTimeDialog() {
        CustomTimeDialog(this)
    }
}