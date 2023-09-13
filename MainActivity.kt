package prachi.raval.mymind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // Get the username and password entered by the user
            val usernameEditText = findViewById<EditText>(R.id.username)
            val passwordEditText = findViewById<EditText>(R.id.password)
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Validate the username and password
            if (username == "user" && password == "pass") {
                // If the username and password are correct, move to the next screen
                val intent = Intent(this, Main2Activity::class.java)
                startActivity(intent)
            } else {
                // If the username and password are incorrect, show an error message
                Toast.makeText(this, "Incorrect username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
