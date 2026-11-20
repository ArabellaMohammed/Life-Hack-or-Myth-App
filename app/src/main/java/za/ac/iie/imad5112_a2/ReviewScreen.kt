package za.ac.iie.imad5112_a2

//Reference list
//OpenAI. 2026. Chat-GPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69e544cb-fcf8-83ea-884b-aaf880e9d389 [Accessed: 12 April 2026].
//The Independent Institute of Education, 2026. Introduction to Mobile Application Development [IMAD5112 Module Manual]. [online via ARC VLE] The Independent Institute of Education. Available at: <https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IMAD5112/2026/Term%201/IMAD5112MM.docx?d=wca5a47eef10744adab606e296e0b3eae&csf=1&web=1&e=k4jgqA>[Accessed: 12 April 2026].

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReviewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_review_screen)

        //connecting variables to ui components
        val txtReview = findViewById<TextView>(R.id.txtReview)

        //arrays for questions and answers
        //Reference (IIE,2026,p.80)
        val arrQuestions = arrayOf (
            "Putting your phone in rice fixes water damage",
            "Using incognito mode makes you completely anonymous",
            "Drinking water helps improve concentration",
            "Charging your phone overnight ruins the battery",
            "Eating carrots improves your eyesight"
        )

        //array to store correct answers true=hack / false=myth
        //Reference (IIE,2026,p.80)
        val arrAnswers = arrayOf(
            false,
            false,
            true,
            false,
            true
        )

        //building string to display the question and answer
        var strReviewText = ""
        ////Reference (IIE,2026,p.86)
        for (i in arrQuestions.indices){
            val strAnswer = if (arrAnswers[i]) "Hack" else "Myth"
                strReviewText += "Q${i + 1}: ${arrQuestions[i]}\nAnswer: $strAnswer\n\n"
        }

        //displaying the string that contains the questions and answers
        txtReview.text= strReviewText
        Log.d("ReviewScreen", "All questions displayed successfully")


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}