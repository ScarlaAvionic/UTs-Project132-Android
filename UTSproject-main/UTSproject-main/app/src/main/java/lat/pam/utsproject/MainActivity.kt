package lat.pam.utsproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to navigate to ListFoodActivity
        findViewById<Button>(R.id.button_list_food).setOnClickListener {
            startActivity(Intent(this, ListFoodActivity::class.java))
        }

        // Button to navigate to OrderActivity
        findViewById<Button>(R.id.button_order).setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }

        // Button to navigate to ConfirmationActivity
        findViewById<Button>(R.id.button_confirmation).setOnClickListener {
            startActivity(Intent(this, ConfirmationActivity::class.java))
        }
    }
}
