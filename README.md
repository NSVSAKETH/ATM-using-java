📌 Project Description — Java ATM Machine Simulation
The Java ATM Machine Simulation is a console-based mini project that demonstrates essential ATM functionalities such as PIN verification, balance inquiry, cash withdrawal, and cash deposit. This project is built entirely using Core Java, focusing on Object-Oriented Programming (OOP) concepts, conditional statements, loops, and user input handling.

✨ Project Objective
To design a simple yet functional ATM interface where users can securely access their bank account and perform basic financial operations using a menu-driven Java program.

🧩 System Overview
The program consists of two main components:

1️⃣ ATM Class
This class encapsulates all main banking operations:

verifyPin() → Validates the entered PIN with the stored PIN.

checkBalance() → Displays the current account balance.

deposit() → Adds money to the account after validation.

withdraw() → Allows cash withdrawal with balance checks.

This class uses:

Encapsulation (private variables for balance & PIN)

Constructor to initialize ATM with default balance & pin

2️⃣ ATMSystem (Main Class)
Handles:

User input through Scanner

Initial PIN verification

Menu-driven operations (loop + switch)

Calling appropriate methods of ATM class

🛠️ Key Features Implemented
✅ PIN Authentication
User must enter the correct PIN (default 1234) to access the ATM.
If the PIN is wrong, the system exits immediately → ensuring security.

✅ Balance Inquiry
Displays current balance stored in the ATM object.

✅ Deposit Money
Allows depositing a positive amount.
Balance is updated, and success message is shown.

✅ Withdraw Money
Checks:

If withdrawal amount ≤ balance

If amount is positive
If valid, balance is updated and money is withdrawn.

✅ Loop-driven Menu
The system keeps running until the user chooses Exit (option 4).

🎯 Technical Highlights
Written using Core Java

Demonstrates OOP concepts (Encapsulation, Classes, Objects)

Uses Scanner for user input

Uses switch-case and do-while loop

Ensures proper validation for all operations

Clean program structure with reusable methods

📘 Sample Output (User Flow)
Enter PIN

View Menu

Choose:

Check Balance

Deposit

Withdraw

Exit

Program closes safely with a thank-you message

