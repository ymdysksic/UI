package jp.techacademy.yusuke.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  // ← ここを追加
import android.view.View  // ← ここを追加
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.d("UI_PARTS", "ボタンをタップしました")
        }

        textView.text = "テキスト"
    }
}