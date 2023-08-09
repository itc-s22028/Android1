package jp.ac.it_college.std.s22028.menusample

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import jp.ac.it_college.std.s22028.menusample.databinding.ActivityMainBinding
import jp.ac.it_college.std.s22028.menusample.databinding.ActivityMenuThanks3Binding

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import jp.ac.it_college.std.s22028.menusample.databinding.ActivityMainBinding
//import jp.ac.it_college.std.s22028.menusample.databinding.ActivityMenuThanksBinding

class MenuThanksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuThanks3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuThanks3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuName = intent.getStringExtra("menuName") ?: ""
        val menuPrice = intent.getIntExtra("menuPrice", 0)

        binding.tvMenuName.text = menuName
        binding.tvMenuPrice.text = "%,d".format(menuPrice)

        binding.btThxBack.setOnClickListener{
            finish()
        }

        //アクションバー
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val result = when(item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
        return result
    }
}
//class MenuThanksActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMenuThanksBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMenuThanksBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val menuName = intent.getStringExtra("menuName") ?: ""
//        val menuPrice = intent.getIntExtra("menuPrice", 0)
//
//        binding.tvMenuName.text = menuName
//        binding.tvMenuPrice.text = "%,d".format(menuPrice)
//
//        binding.btThxBack.setOnClickListener {
//            finish()
//    }
//    }
