App Description:

This application is called “Life Hack or Myth” . This app is designed to be a short quiz consisiting of 5 questions to test the user’s knowledge of common hacks or myths on the internet from the given statement provided. 

The app consists of four screens:

1.Welcome Screen 

2.Question Screen 

3.Score Screen 

4.Review Screen 

At the end of the quiz the user receives a score and feedback based on their performance with the option to review all questions and answers.




How the App Works:

-The user opens the app and the Welcome Screen is loaded. 

-The user can read a small description of the app and then is required to enter their name and click the Start button.


-The app navigates to the Question Screen where a question is displayed along with two buttons: Hack or Myth 

-The user selects an answer 

-Feedback is shown immediately if the answer choosen is correct or incorrect.

-The user clicks Next to move to the next question until all 5 questions are answered. (Note Next button is only enabled when user chooses an answers thus no question can be skipped)

-After all 5 questions are answered the app navigates to the Score Screen.

-The user sees their name, score and feedback message.

-The user can then choose either button to Restart the quiz or View all questions and answers on the Review Screen 


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



Features:

-User name input with validation to ensure required data is entered.

-Four screen application structure (Welcome, Question, Score, Review). 

-Navigation between screens using intents.

-Quiz system consisting of 5 questions. 

-Real time feedback provided after each answer. 

-Progress tracking (e.g. “2/5 answered”) .

-Automatic score calculation based on user responses .

-Review screen displaying all questions along with correct answers. 


Features added by me:

-Mandatory name entry, allowing personalised feedback on the Score Screen (e.g. “Let’s see how you did, [Name]”) .

-Progress counter showing how many questions have been answered and how many remain. 

-Next button is only enabled after the user selects an answer  preventing skipped questions .

-Dedicated Review Screen for the questions with their answers instead of a simple button display improving overall design.


 How the Code Works:

-The app is built using Kotlin in Android Studio 

-Each screen is implemented as an Activity 

-Navigation between screens is handled using Intents 

-Data such as the user’s name and score is passed using putExtra() 

-Questions and answers are stored in arrays 

-Functions are used to: 

 Display questions (displayQuestion()) 
 
 Check answers (checkAnswer()) 

-UI components are connected using findViewById() 


Logging(Manual Testing):

Logging was implemented using Log.d() to track key user interactions and application flow such as:

-Confirm when screens loaded

-Track button clicks (Start, Hack, Myth, Next, Review, Restart) 

Logcat was used to monitor these logs and ensure correct functionality.


GitHub Actions:

GitHub Actions was implemented to automate the build process of the application. A workflow file (build.yml) was created.The workflow runs on every push to the repository.It checks out the code and it builds the project using Gradle. This ensures that the application compiles successfully and helps detect errors early on.


Errors Encountered:

-Functions not being recognised due to incorrect placement outside the class .

-Incorrect button click listeners (e.g. assigning two listeners to the same button) 

-UI alignment issues when designing layouts 

-Syntax errors in Kotlin code such as incorrect if statements


Video link:
https://youtu.be/usMXWUEbVhw?si=jfq7nLkV53XGOrLb 

Referencing:
amirisback. 2026. Automated build Android app with GitHub Action. [online] GitHub Marketplace. Available at: https://github.com/marketplace/actions/automated-build-android-app-with-github-action [Accessed: 20 April 2026].


OpenAI. 2026. Chat-GPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69e544cb-fcf8-83ea-884b-aaf880e9d389 [Accessed: 13/14/19 April 2026].


The Independent Institute of Education, 2026. Introduction to programming logic [IPRG5111 Module Manual]. [online via ARC VLE] The Independent Institute of Education. Available at: https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/IIE%20Student%20Materials/New%20Student%20Materials%20CAT/IPRG5111/2026/Term%201/IPRG5111MM.docx?d=web9916d4ecd74877a6f31c4bbd7d2e6f&csf=1&web=1&e=JB54QS [Accessed: 12 April 2026].


Disclosure of AI Usage in my Assignment:

Sections within the assignment in which generative AI was used: 
-Name validation Screen 1

-Logging Screen 1, 2, 3

-Functions Screen 2

Name of AI tool used: 

-ChatGPT 
 
Purpose/intention behind use: 

-Assistance with implementing logging using Log.d() in the Android application 

-Guidance on using functions to update UI elements (e.g. displaying questions and progress in a TextView)

-Assist with understanding how to pass user input data for the name between screen 1 and screen 3 

-Assistance with debugging and resolving errors during development


Date used: 
13 April 2026

14 April 2026

19 April 2026

 
Proof of use:

Link: https://chatgpt.com/share/69e544cb-fcf8-83ea-884b-aaf880e9d389

Screenshots:

Screenshots for name passing:

<img width="940" height="719" alt="image" src="https://github.com/user-attachments/assets/2832ddf1-301f-4f2e-bdde-314917fd905f" />


<img width="940" height="693" alt="image" src="https://github.com/user-attachments/assets/fe6fe015-b7ff-480f-bd84-7bfa8c01b8d6" />


<img width="940" height="143" alt="image" src="https://github.com/user-attachments/assets/ef62ace0-969d-4a01-a63a-e8a6f13d867c" />

Screenshots for functions:

<img width="1191" height="871" alt="AdobeExpressPhotos_c2ada120c16d47b59456a6205229b012_CopyEdited" src="https://github.com/user-attachments/assets/c2ad1a11-dcdf-4ab2-be40-431dccf463e9" />


<img width="1094" height="826" alt="AdobeExpressPhotos_5c37631ce0e94b79ae002fa99ddf96bf_CopyEdited" src="https://github.com/user-attachments/assets/4b6166a0-33f5-4fd4-9737-3985d27c6ec9" />


<img width="1159" height="845" alt="AdobeExpressPhotos_ca402a2254af4069b5b1e29125841e71_CopyEdited" src="https://github.com/user-attachments/assets/be49eef5-bfce-4e51-8af9-76cbe8ab2838" />




Screenshots for logging:

<img width="940" height="652" alt="image" src="https://github.com/user-attachments/assets/1157c06c-98cf-46f4-918f-a314b2183799" />


<img width="940" height="649" alt="image" src="https://github.com/user-attachments/assets/9f96a663-b901-446c-ad1d-1f3db54915e5" />


<img width="940" height="699" alt="image" src="https://github.com/user-attachments/assets/5bdbcfb2-f224-46bf-81c3-586e80a17be7" />


<img width="940" height="760" alt="image" src="https://github.com/user-attachments/assets/dc494bcf-cb25-4d4a-add2-cf72dd55df1b" />


<img width="940" height="698" alt="image" src="https://github.com/user-attachments/assets/28d5b50b-299d-404c-b831-a031f6e851f1" />


<img width="940" height="461" alt="image" src="https://github.com/user-attachments/assets/78b651ca-8e2f-4a14-b327-06256ad9a6c2" />

