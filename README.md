# Password Application Overview
* Completed as a fun Data Structures & Algorithms Exericse! There are three types of data when generating a password. Letters, numbers, and special characters. The user must provide the amount from each category they would like to include in their password, without repititions (i.e., the user can only ask for 10 numbers maximum because a keyboard only has numbers 0-9 without integer repitions). Then, the algorithm assigns each possible character from each of the three categories a random and fair probability value between 0 and 1, exclusive. Then, based on how many characters from each category the user desires, denoted as N, the algorithm picks the characters with the highest N probabilities to include in the final password using a customized implementation of quick-sort. The characters are then appended to form an un-shuffled password which is then eventually shuffled using the Fisher-Yates Shuffling algorithm. Finally then, the password is outputted to the user.
  * _94 Factorial or 1.087366e+146 possible passwords!_

# Resources
* [Fisher-Yates Shuffle](https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/)
* [Quick-Sort](https://www.geeksforgeeks.org/quick-sort-algorithm/)

# Creating Your Own Password
Simply go to the MyPasswordGenerator.java file, locate the main at the bottom of the code, replace the parameters (numLetters, numInts, and numSpecChars) with your desired amount from each category, and hit run! This will generate a password for you in your terminal in <20ms!
<img width="786" alt="Screen Shot 2024-07-20 at 12 38 56 PM" src="https://github.com/user-attachments/assets/c59c9c4f-7e13-4407-b518-3e330c6d330e">
