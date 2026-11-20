## App Description:

This application is called “Life Hack or Myth” . This app is designed to be a short quiz consisiting of 5 questions to test the user’s knowledge of common hacks or myths on the internet from the given statement provided. 

The app consists of four screens:

1.Welcome Screen 

2.Question Screen 

3.Score Screen 

4.Review Screen 

At the end of the quiz the user receives a score and feedback based on their performance with the option to review all questions and answers.




## How the App Works:

- The user opens the app and the Welcome Screen is loaded. 

- The user can read a small description of the app and then is required to enter their name and click the Start button.

- The app navigates to the Question Screen where a question is displayed along with two buttons: Hack or Myth 

- The user selects an answer 

- Feedback is shown immediately if the answer choosen is correct or incorrect.

- The user clicks Next to move to the next question until all 5 questions are answered. (Note Next button is only enabled when user chooses an answers thus no question can be skipped)

- After all 5 questions are answered the app navigates to the Score Screen.

- The user sees their name, score and feedback message.

- The user can then choose either button to Restart the quiz or View all questions and answers on the Review Screen 


<img width="377" height="790" alt="AdobeExpressPhotos_02ea28615ef54ed6978a2e94305a1f21_CopyEdited" src="https://github.com/user-attachments/assets/f80b6ca0-de99-4b13-9602-6d1c581f0c02" />

Screenshot showing welcome page

<img width="357" height="785" alt="AdobeExpressPhotos_4f55650d5adf4f28a845d74764718eaa_CopyEdited" src="https://github.com/user-attachments/assets/df2722d7-61ea-440c-92d3-9a45dcd72ac9" />

Screenshot showing no name input validation on welcome page

<img width="367" height="791" alt="AdobeExpressPhotos_138d0af4447842d3b02136e3ce8db734_CopyEdited" src="https://github.com/user-attachments/assets/2f59dde4-ac83-4686-94be-5de0b9e92d1d" />

Screenshot showing Question Screen

<img width="381" height="788" alt="AdobeExpressPhotos_bc374194b5934b6cb12ee01d4b7bf9a1_CopyEdited" src="https://github.com/user-attachments/assets/e4b82bbf-cf95-4688-b6ab-e3e10df0cc48" />

Screenshot showing Score Screen

<img width="368" height="774" alt="AdobeExpressPhotos_39eacdc26f054b6d973d0de9b968f1f9_CopyEdited" src="https://github.com/user-attachments/assets/2940da78-f83d-4c96-a886-91358911ead8" />

Screenshot showing Review Screen



## Features:

- User name input with validation to ensure required data is entered.

- Four screen application structure (Welcome, Question, Score, Review). 

- Navigation between screens using intents.

- Quiz system consisting of 5 questions. 

- Real time feedback provided after each answer. 

- Progress tracking (e.g. “2/5 answered”) .

- Automatic score calculation based on user responses .

- Review screen displaying all questions along with correct answers.

## How the Code Works:

- The app is built using Kotlin in Android Studio 

- Each screen is implemented as an Activity 

- Navigation between screens is handled using Intents 

- Data such as the user’s name and score is passed using putExtra() 

- Questions and answers are stored in arrays 

- Functions are used to: 

 Display questions (displayQuestion()) 
 
 Check answers (checkAnswer()) 

- UI components are connected using findViewById() 


## Logging(Manual Testing):

Logging was implemented using Log.d() to track key user interactions and application flow such as:

-Confirm when screens loaded

-Track button clicks (Start, Hack, Myth, Next, Review, Restart) 

Logcat was used to monitor these logs and ensure correct functionality.


## GitHub Actions:

GitHub Actions was implemented to automate the build process of the application. A workflow file (build.yml) was created.The workflow runs on every push to the repository.It checks out the code and it builds the project using Gradle. This ensures that the application compiles successfully and helps detect errors early on.


## Video link:
https://youtu.be/usMXWUEbVhw?si=jfq7nLkV53XGOrLb 

## Referencing
amirisback. 2026. Automated build Android app with GitHub Action. [online] GitHub Marketplace. Available at: https://github.com/marketplace/actions/automated-build-android-app-with-github-action [Accessed: 20 April 2026].


OpenAI. 2026. Chat-GPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69e544cb-fcf8-83ea-884b-aaf880e9d389 [Accessed: 13/14/19 April 2026].


The Independent Institute of Education, 2026. Introduction to programming logic [IPRG5111 Module Manual]. [online via ARC VLE] The Independent Institute of Education. Available at: https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IPRG5111/2026/Term%201/IPRG5111MM.docx?d=web9916d4ecd74877a6f31c4bbd7d2e6f&csf=1&web=1&e=JB54QS [Accessed: 12 April 2026].

