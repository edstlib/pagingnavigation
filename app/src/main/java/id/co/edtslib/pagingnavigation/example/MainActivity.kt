package id.co.edtslib.pagingnavigation.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import id.co.edtslib.pagingnavigation.PagingNavigation
import id.co.edtslib.pagingnavigation.PagingNavigationDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.myLooper()!!).post {
            val navigation = findViewById<PagingNavigation>(R.id.navigation)
            navigation.delegate = object : PagingNavigationDelegate {
                override fun onSelected(position: Int) {
                    Toast.makeText(this@MainActivity, "Selected Index $position",
                        Toast.LENGTH_SHORT).show()
                }
            }
            navigation.selectedIndex = 2
        }
    }
}