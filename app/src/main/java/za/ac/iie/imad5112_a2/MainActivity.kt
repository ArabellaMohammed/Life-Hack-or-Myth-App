package za.ac.iie.imad5112_a2
//Reference list
//OpenAI. 2026. Chat-GPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69e544cb-fcf8-83ea-884b-aaf880e9d389 [Accessed: 12 April 2026].
//The Independent Institute of Education, 2026. Introduction to Mobile Application Development [IMAD5112 Module Manual]. [online via ARC VLE] The Independent Institute of Education. Available at: <https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112/2026/Term%201/IMAD5112MM.docx?d=wca5a47eef10744adab606e296e0b3eae&csf=1&web=1&e=k4jgqA>[Accessed: 12 April 2026].

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //connecting variables to ui components
        val edtName = findViewById<EditText>(R.id.edtName)
        val btnStart = findViewById<Button>(R.id.btnStart)

        // setting click listener for the start button when user clicks it
        btnStart.setOnClickListener {
            // Log to track when start button clicked
            // reference (OpenAI,2026)
            Log.d("MainActivity", "Start button clicked")

            //get name from input
            val strName = edtName.text.toString().trim()
            if (strName.isEmpty()) {
                edtName.error = "Please enter your name"
                // Logs to check if user entered name
                // reference (OpenAI,2026)
                Log.d("MainActivity", "Name input is empty")
            } else {
                Log.d("MainActivity", "User entered name: $strName")

                //creating intent to move to Question screen
                //Reference (IIE,2026,p.68)
                val intent = Intent(this, QuestionScreen::class.java)

                //send name to next screen
                intent.putExtra("name", strName)

                //log to track when user goes to QuestionScreen
                Log.d("MainActivity", "Navigating to QuestionScreen")

                //will start the next activity
                startActivity(intent)
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}