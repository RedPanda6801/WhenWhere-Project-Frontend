package com.example.whenandwhere
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class StartActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_start)
//    }
//}

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        // 일정 시간 지연 이후 실행하기 위한 코드
        Handler(Looper.getMainLooper()).postDelayed({

            // 일정 시간이 지나면 MainActivity로 이동

            // 이전 키를 눌렀을 때 스플래스 스크린 화면으로 이동을 방지하기 위해
            // 이동한 다음 사용안함으로 finish 처리
            finish()

        }, 500) // 시간 0.5초 이후 실행
    }
}