package jp.ac.it_college.std.s22028.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ボタンを取ってくる
        val btclick = findViewById<Button>(R.id.btClick)
        // リスナクラスのインスタンスを作る
        val listener = HelloListener()
        // ボタンにリスナを設定する
        btclick.setOnClickListener(listener)
    }

    private inner class HelloListener: View.OnClickListener {
        override fun onClick(v: View?) {
            // EditText を取ってくる
            val input = findViewById<EditText>(R.id.etName)

            // メッセージを出力する　TextView をとってくる
            val output = findViewById<TextView>(R.id.tvOutput)

            // input(EditText) から入力内容をとり出して String型へ
            val inputStr = input.text.toString()

            // メッセージをだす
            output.text = "${inputStr}さん、こんにちは"
        }

    }
}