# Rock-Paper-Scissors-ByRosko
A simple project game within the programming fundamental course at #SoftUni

In this project for the training course at #SoftUni, we had to implement the well-known game Rock-Paper-Scissors.

I used constants for the game choices (rock, paper, scissors) and ANSI color codes for text colorization in the console.
Then i used a do-while loop to repeatedly play the game until the user decides to quit.
Within the loop, the player is prompted to choose either rock, paper, or scissors.
To simulate the computer's choice, I've used a Random object.
It generates a random number between 0 and 2. This number is then used to determine the computer's choice (rock, paper, or scissors) through a switch-case statement.
Then i used another switch-case statement to handle the different combinations of choices. 
It compares the player's choice with the computer's choice and determines the outcome of the round based on the rules of the game. 
Depending on the comparison, it increments the respective counters for player wins, computer wins, or draws.
After each round, the game statistics are updated, and the user is presented with the outcome and the current statistics. 
The user is then asked if they want to play another game. If the answer is "yes," the loop continues; otherwise, the program terminates.

Source code link: https://github.com/roskonenov/RockPaperScissorsByRosko/blob/main/src/RockPaperScissors.java
