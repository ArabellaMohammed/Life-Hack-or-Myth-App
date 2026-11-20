package za.ac.iie.imad5112_a2

//Reference list
//OpenAI. 2026. Chat-GPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69e544cb-fcf8-83ea-884b-aaf880e9d389 [Accessed: 12 April 2026].
//The Independent Institute of Education, 2026. Introduction to Mobile Application Development [IMAD5112 Module Manual]. [online via ARC VLE] The Independent Institute of Education. Available at: <https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112/2026/Term%201/IMAD5112MM.docx?d=wca5a47eef10744adab606e296e0b3eae&csf=1&web=1&e=k4jgqA>[Accessed: 12 April 2026].


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScoreScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score_screen)

        //connect variables to ui components
        val txtScore = findViewById<TextView>(R.id.txtScore)
        val txtMessage = findViewById<TextView>(R.id.txtMessage)
        val btnRestart = findViewById<Button>(R.id.btnRestart)
        val btnReview = findViewById< Button>(R.id.btnReview)
        val txtName = findViewById<TextView>(R.id.txtName)

        //get name from intent
        //Reference (IIE,2026,p.68)
        val strName = intent.getStringExtra("name")

        //Get score from intent
        val intScore = intent.getIntExtra("score",0)
        val intTotalQuestions = 5

        //display name
        //(OpenAi,2026)
        if (strName.isNullOrEmpty()) {
            txtName.text = "Let’s see how you did"
        } else{
            txtName.text="Let’s see how you did,$strName!"
        }

        //displaying user score
        txtScore.text = "$intScore/$intTotalQuestions"

        //display message based on user score
        if (intScore >= 4){
            txtMessage.text = "Hack master in the making!"
        }else
            if (intScore >= 2) {
                txtMessage.text = "Not bad,you’ve got potential!"
            }else{
                txtMessage.text = "Myth magnet today, try again!"
            }

        //Restart button to begin again
        btnRestart.setOnClickListener {
            // Log to track when user clicks restart button
            Log.d("ScoreScreen", "User clicked Restart")
            //Reference (IIE,2026,p.68)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //Review questions and answers button
        btnReview.setOnClickListener {
            // Log to track when user clicks review button
            Log.d("ScoreScreen", "User clicked Review")
            //Reference (IIE,2026,p.68)
            val intent = Intent(this, ReviewScreen::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}