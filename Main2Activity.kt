package prachi.raval.mymind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val relaxButton= findViewById<Button>(R.id.relaxButton)
        val focusButton= findViewById<Button>(R.id.focusButton)
        val anxietyButton= findViewById<Button>(R.id.anxietyButton)
        val gratefulButton= findViewById<Button>(R.id.gratefulButton)
        val manifestButton= findViewById<Button>(R.id.manifestButton)
        val guidedButton= findViewById<Button>(R.id.guidedButton)

        relaxButton.setOnClickListener {
            val intent = Intent(this@Main2Activity, Relax::class.java)
            startActivity(intent)
        }
        focusButton.setOnClickListener {
            val intent = Intent(this@Main2Activity, Focus::class.java)
            startActivity(intent)
        }
        anxietyButton.setOnClickListener {
            val intent = Intent(this@Main2Activity, Anxiety::class.java)
            startActivity(intent)
        }
        gratefulButton.setOnClickListener {
            val intent = Intent(this@Main2Activity, Grateful::class.java)
            startActivity(intent)
        }
        manifestButton.setOnClickListener {
            val intent = Intent(this@Main2Activity, Manifest::class.java)
            startActivity(intent)
        }
        guidedButton.setOnClickListener {
            val intent = Intent(this@Main2Activity, Guided::class.java)
            startActivity(intent)
        }


    }
}
