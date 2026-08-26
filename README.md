# 🌍 Flag Quiz App – Interactive Country Flag Quiz

**Flag Quiz App** is an Android application developed to test and improve users' knowledge of country flags through an interactive multiple-choice quiz.

The application uses a **SQLite database** to store and retrieve quiz-related data, while **DB Browser for SQLite** was used extensively for database creation, inspection, querying, modification, and debugging.

> **Test Your Knowledge of the World, One Flag at a Time!**

---

## 📱 Overview

Flag Quiz App is a simple and interactive Android quiz application where users are shown country flags and asked to identify the corresponding country from multiple-choice options.

The application combines Android UI development, Java programming, SQLite database management, and quiz logic to provide an interactive learning experience.

The application uses a local SQLite database for storing and retrieving quiz-related information.

**DB Browser for SQLite** played a major role during development by allowing the database to be created, inspected, queried, modified, and tested independently.

---

## ✨ Features

### 🌍 Flag-Based Quiz

Displays country flags as questions and provides multiple-choice options for users to identify the correct country.

### 🔘 Multiple-Choice Questions

Users can select from multiple answer options provided for each displayed flag.

### ✅ Answer Validation

The application checks the selected answer and determines whether it is correct or incorrect.

### 📊 Score Tracking

The user's score is updated based on the answers provided throughout the quiz.

### 🗄️ SQLite Database

Uses a local SQLite database to store and retrieve quiz-related information.

### 🔍 DB Browser for SQLite

DB Browser for SQLite was used during development to:

- Create and manage the database
- View database tables
- Inspect stored records
- Execute SQL queries
- Insert and modify test data
- Verify database contents
- Debug database-related issues

### 📱 Simple User Interface

Provides a clean and straightforward interface designed to make the quiz easy to use.

---

## 🖥️ Application Screens

### 🚀 Quiz Interface

The application displays a country flag along with multiple-choice answers, allowing the user to identify the corresponding country.

### 🌍 Flag Question

A flag image is displayed as the main quiz question while the available country options are presented below it.

### 🏆 Score / Result

The application keeps track of the user's performance throughout the quiz and displays the resulting score.

---

# 📸 Screenshots

## Main Quiz Screens

<img width="1080" height="2400" alt="flag_quiz(1)" src="https://github.com/user-attachments/assets/249a721c-b19e-452a-ba4b-fc62c8b7f562" />

<img width="1080" height="2400" alt="flag_quiz(2)" src="https://github.com/user-attachments/assets/3c9a403e-0eb5-40a7-95f8-ffa54a7f929b" />

<img width="1080" height="2400" alt="flag_quiz" src="https://github.com/user-attachments/assets/ef32a0f9-ef5f-4577-89c3-0a414d8eccad" />


## Result Screen

<img width="1080" height="2400" alt="flag_quiz(3)" src="https://github.com/user-attachments/assets/3ca8d398-4a85-453d-b43d-c5b00adaaaf2" />


---

## 🏗️ Application Architecture

The application consists of the Android frontend, Java application logic, and local SQLite database.

    ┌──────────────────────────┐
    │       Android UI         │
    │                          │
    │      Java + XML          │
    └────────────┬─────────────┘
                 │
                 ▼
    ┌──────────────────────────┐
    │     Quiz Application     │
    │          Logic            │
    │                          │
    │ Question + Answer Logic  │
    │       + Score Logic      │
    └────────────┬─────────────┘
                 │
                 │ SQLite Queries
                 ▼
    ┌──────────────────────────┐
    │     SQLite Database      │
    │                          │
    │   Quiz / Flag Data       │
    └────────────▲─────────────┘
                 │
                 │ Database Inspection,
                 │ SQL Queries & Testing
                 │
    ┌──────────────────────────┐
    │   DB Browser for SQLite  │
    └──────────────────────────┘

---

## 🔄 Quiz Flow

The general flow of the application is:

    Start Quiz
         │
         ▼
    Retrieve Question
    from SQLite Database
         │
         ▼
    Display Country Flag
         │
         ▼
    Display Answer Options
         │
         ▼
    User Selects Answer
         │
         ▼
    Validate Answer
         │
         ├───────────────┐
         ▼               ▼
      Correct         Incorrect
         │               │
         └───────┬───────┘
                 ▼
           Update Score
                 │
                 ▼
          Load Next Question
                 │
                 ▼
             Quiz Ends
                 │
                 ▼
           Display Result

---

## 🗄️ SQLite Database

The application uses **SQLite** as its local database for storing and retrieving quiz-related information.

SQLite allows the application to maintain data locally on the Android device without requiring an external backend.

### Database Workflow

    SQLite Database
          │
          ▼
     Store Quiz Data
          │
          ▼
    Android SQLite Operations
          │
          ▼
     Retrieve Quiz Data
          │
          ▼
     Display Question
          │
          ▼
     Process User Answer

### DB Browser for SQLite

**DB Browser for SQLite** was an important part of the development and debugging process.

It was used to work directly with the application's SQLite database.

The development workflow included:

    Create / Modify Database
              │
              ▼
     DB Browser for SQLite
              │
              ├── View Tables
              ├── Inspect Records
              ├── Execute SQL Queries
              ├── Insert Data
              └── Modify Test Data
              │
              ▼
         Android Application
              │
              ▼
        Test Database Logic

This helped verify that the database contained the expected records and that the Android application was correctly retrieving the required information.

---

## 🛠️ Technologies Used

| Technology / Tool | Purpose |
|---|---|
| **Java** | Android application and quiz logic |
| **Android Studio** | Development environment |
| **XML** | User interface design |
| **SQLite** | Local database and data storage |
| **DB Browser for SQLite** | Database creation, inspection, SQL queries, and debugging |
| **Android SDK** | Android application framework |
| **Gradle** | Build and dependency management |
| **Git & GitHub** | Version control |

---

## 🔌 Database Integration

The Android application communicates with the local SQLite database to retrieve quiz-related information.

The general data flow is:

    SQLite Database
          │
          │ SQL Query
          ▼
    Android SQLite Layer
          │
          ▼
    Java Application Logic
          │
          ▼
    Quiz Question
          │
          ▼
    Android UI

The database is used to provide the data required by the quiz while Java handles the application and scoring logic.

---

## 🧩 Android Project Structure

    Flag_Quiz_App/
    │
    ├── app/
    │   └── src/
    │       └── main/
    │           ├── java/
    │           │   └── ...
    │           │
    │           ├── res/
    │           │   ├── drawable/
    │           │   ├── layout/
    │           │   ├── mipmap/
    │           │   └── values/
    │           │
    │           └── AndroidManifest.xml
    │
    ├── gradle/
    ├── build.gradle.kts
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── settings.gradle.kts
    └── README.md

### Important Components

    Android Activity
           │
           ├── Quiz UI
           ├── Flag Images
           ├── Answer Buttons
           └── Score Handling
                  │
                  ▼
           SQLite Database
                  │
                  ├── Retrieve Quiz Data
                  └── Store / Manage Data

---

## 🚀 Getting Started

### Prerequisites

Make sure you have:

- **Android Studio**
- **Android SDK**
- **JDK**
- Android Emulator or physical Android device

### Installation

Clone the repository:

    git clone https://github.com/Ruchir-55/Flag_Quiz_App.git

Open the project in **Android Studio**.

Allow Gradle to synchronize and download the required dependencies.

Connect an Android device or start an Android Emulator.

Run the application using:

    Run ▶

---

## 🗃️ Working with the Database

The application's SQLite database can be inspected and managed using **DB Browser for SQLite**.

The database development process involved:

1. Creating the SQLite database.
2. Creating the required tables.
3. Adding quiz-related records.
4. Inspecting stored records using DB Browser.
5. Running SQL queries to verify the data.
6. Testing the database integration with the Android application.
7. Debugging incorrect or missing data when required.

---

## 🧠 What I Learned

Developing the Flag Quiz App provided practical experience with:

- Android application development using Java
- XML-based UI development
- SQLite database integration
- SQL queries
- Database creation and management
- DB Browser for SQLite
- Retrieving data from a local database
- Handling user input
- Button click events
- Answer validation
- Score calculation
- Working with images and drawable resources
- Designing interactive Android applications
- Debugging database-related issues
- Git and GitHub

---

## 🔮 Future Improvements

Possible improvements include:

- [ ] Add difficulty levels
- [ ] Add more countries and flags
- [ ] Add a timer for each question
- [ ] Add persistent high scores
- [ ] Add different quiz categories
- [ ] Add country information after each answer
- [ ] Add sound effects
- [ ] Add animations
- [ ] Add leaderboard functionality
- [ ] Add dark mode
- [ ] Improve database architecture
- [ ] Add randomized question selection

---

## 👨‍💻 Author

**Ruchir**

GitHub: [@Ruchir-55](https://github.com/Ruchir-55)

---

## 📌 Project Purpose

Flag Quiz App was developed as an **Android learning and portfolio project** to gain practical experience with Android development, Java programming, XML UI design, SQLite databases, SQL queries, database management, and interactive application development.

The project also provided hands-on experience using **DB Browser for SQLite** to manage, inspect, query, and debug the application's local database.

---

## ⭐ Key Takeaway

The Flag Quiz App demonstrates the integration of **Android development + Java + XML + SQLite** into an interactive mobile quiz application.

The project showcases practical experience in building Android user interfaces, implementing quiz and scoring logic, integrating a local SQLite database, and using **DB Browser for SQLite** for database management, SQL queries, testing, and debugging.
