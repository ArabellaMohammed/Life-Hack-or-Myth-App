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

class QuestionScreen : AppCompatActivity() {

    //Global variables
    //Variable to track current question index
    var intCurrentIndex = 0
    var intScore = 0
    var intTotalQuestions = 5

    //array to store questions for hack or myth
    //Reference (IIE,2026,p.80)
    val arrQuestions = arrayOf (
        "Putting your phone in rice fixes water damage",
        "Using incognito mode makes you completely anonymous",
        "Drinking water helps improve concentration",
        "Charging your phone overnight ruins the battery",
        "Eating carrots improves your eyesight"
    )
    //Reference (IIE,2026,p.80)
    //array to store correct answers true=hack / false=myth
    val arrAnswers = arrayOf(
        false,
        false,
        true,
        false,
        true
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question_screen)

        //Connecting variables to ui components
        val txtQuestion = findViewById<TextView>(R.id.txtQuestion)
        val txtProgress = findViewById<TextView>(R.id.txtProgress)
        val txtFeedback = findViewById<TextView>(R.id.txtFeedback)
        val btnHack = findViewById<Button>(R.id.btnHack)
        val btnMyth = findViewById<Button>(R.id.btnMyth)
        val btnNext = findViewById<Button>(R.id.btnNext)

        //Recieving name from main activity / welcome screen
        //Reference (IIE,2026,p.68)
        val strName = intent.getStringExtra("name")

        //show first question when page loads
        displayQuestion(txtQuestion, txtProgress)

        //Hack button - setting click listener for when user clicks it
        btnHack.setOnClickListener {
            // Log to track when user clicks hack button
            // reference (OpenAI,2026)
            Log.d("QuestionScreen", "User clicked HACK")
            checkAnswer(true, txtFeedback, txtProgress, btnNext)
        }

        //Myth button - setting click listener for when user clicks it
        btnMyth.setOnClickListener {
            // Log to track when user clicks myth button
            // reference (OpenAI,2026)
            Log.d("QuestionScreen", "User clicked MYTH")
            checkAnswer(false, txtFeedback, txtProgress, btnNext)
        }

        //Next button - setting click listener for when user clicks it
        //Next button will go to the next question until final question then will go to score screen
        btnNext.setOnClickListener {
            //increasing count
            intCurrentIndex++
            Log.d("QuestionScreen", "Moving to question index: $intCurrentIndex")

            //Display next question if 5 not reached - if yes
            if (intCurrentIndex < intTotalQuestions) {
                displayQuestion(txtQuestion, txtProgress)

                //clear feedback for each new question
                txtFeedback.text = ""
                btnNext.isEnabled = false;
            } //if
            else {
                //Go to score screen if total questions/5 reached
                //creating intent to move to Score screen
                //Reference (IIE,2026,p.68)
                    val intent = Intent(this, ScoreScreen::class.java)

                //sending score
                intent.putExtra("score",intScore)
                //sending name
                intent.putExtra("name",strName)

                    //will start the next activity
                    startActivity(intent)
                } //else
        } //btn

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

        //function to display question
        //(IIE,2026,p96) and (OpenAi,2026)
        fun displayQuestion(txtQuestion: TextView, txtProgress: TextView){
            txtQuestion.text = arrQuestions[intCurrentIndex]
            txtProgress.text = "$intCurrentIndex/$intTotalQuestions answered"
        }

        //Function to check answer
        fun checkAnswer(blnUserAnswer: Boolean, txtFeedback: TextView, txtProgress: TextView, btnNext: Button){
            //get the correct answer from array
            //Reference (IIE,2026,p.81)
            val blnCorrectAnswer = arrAnswers[intCurrentIndex]

            //check if user answer is correct
            if (blnUserAnswer == blnCorrectAnswer){
                intScore++
                txtFeedback.text = "Nailed it!,Correct!"
            } //if
             else {
                txtFeedback.text = "That one got you! Incorrect"
            } //else
            txtProgress.text = "${intCurrentIndex + 1}/$intTotalQuestions answered"

            btnNext.isEnabled = true
        } //function

}