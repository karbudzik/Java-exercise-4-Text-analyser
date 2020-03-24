# Java exercise 4 - Text Analyser

2-weeks pair assignment aiming at creating Battleships game with focus on Java classes and their inharitance. During 2-days extra workshops the basic version of playing with computer was added.

## General info
The game has 3 basic modes: human vs. human, human vs. computer and computer vs computer.

In human mode the game preparation mode is enabled. Program asks each player for name and for placing ships on their map.

!["Placing ships on the ocean"](img/1.png)

The process of adding ships is fully validated, both in terms of proper input as well as placing ships on allowed squares.

!["Input validation"](img/2.png)

When ships are placed, the actual games starts. Players take turns on shooting to each other's ships. Players are informed if they hit or missed the ship.

!["Playing game"](img/3.png)

Game also have modes to play with computer. They are available to play. However, only the easiest computer mode is enabled, which means that computer shoots ships fully randomly. Other modes might be added in the future.

## UML class diagram
This assignment aimed at planning project in terms of using proper (logical and scalable) classes and methods. Therefore, the UML class diagram has been created and modified while working on the project

!["Project UML Diagram"](img/Battleship.png)

## Technologies
* Java SE 13

## Lessons learned from the assignment
* Using abstract classes, method inheritance and protected variable scope
* Carefully planning class usage and work division in group

## Status
Project is finished, with potential to be developed further in the future.

## Credits
Project assigned and supervised by Codecool mentors.

## Technical specification:

### __[main](specifications/main.md)__

### __[square](specifications/square.md)__

### __[ship](specifications/ship.md)__

### __[ocean](specifications/ocean.md)__

### __[game](specifications/game.md)__

### __[player](specifications/player.md)__

### __[view](specifications/view.md)__


# uml narzucony (implement all classes exactly how they're presented in the class diagram.)
# default access modifiers, packages
# implementing iterator interface
# sample output
# first approach to unit testing

## Sample output
<!-- `---text1.tx--- `    name of the analyzed file -->

<!-- `Char count: 761674`  number of characters in the file (without white-spaces) -->

<!-- `Word count: 188912`  number of words in the file -->

<!-- `Dict size: 10762`  dictionary size: number of different words used -->

`Most used words (>1%): [a,and,had..<more>]` all words that make up for more than 1% of the text

<!-- `'love' count: 60` number of times that the word ‘love’ occurred

`'hate' count: 4` number of times that the word ‘hate’ occurred**

`'music' count: 4` number of times that the word ‘music’ occurred -->

`vowels %: 38` what part of all characters are vowels (a,o,i,e,u)

`a:e count ratio: 1.54 ` the ratio of ‘a’ to ‘e’ occurrences

`[ G -> 2.16] [ R -> 5.36] ....<and the rest>` % of in whole text of all the letters


## CharIterator
 successively iterates over alphabetic characters (single letters) of the text. It skips all other characters (like white-spaces). Implements next() and hasNext() from **Iterator ** interface. NOTE: Chars are represented as Strings for the sake of simplicity. Remember that characters’ case (UPPER or lower) should be consistent in our analysis.

## WordIterator
successively iterates over words of the text. Words in the text are separated with white-spaces. Implements next() and hasNext() from **Iterator ** interface.

## StatisticalAnalysis
It's the dataset. It is initialized with Iterator<String> and provides functions for statistical analysis of the text elements (Strings). NOTE: You may choose any data structure to store the processed data. The choice will affect the amount of code you will have to write.

### countOf(String… elems)
Returns sum of all occurrences (in the dataset) of the elements given as arguments ( _elems)_. Note: One string may be given as well. The three-dots operator will help you pass variable number of arguments to the function and access them with ease.

[ https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html#varargs](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html#varargs)

### dictionarySize()
Returns the number of unique elements of the dataset. It’s the size so-called Author’s Dictionary - the set of different words the author of the text uses.

### size()
Returns the total number of all elements in the dataset. This will be total number of words or total number of characters.

### occurMoreThan(Integer _n_ )
 Returns all the elements that occur more than _n __times _ in the dataset

## View
This class should be responsible for presenting the data to the user. You are free to implement any functions you find sensible. NOTE: In case of this class you don’t have to follow the UML diagram.

## Application
The main class of the program. It should allow the user to pass to text files for analysis as CLI arguments. Also, measure  the time of the program's execution. For example:

>  _java Application text1.txt text2.txt_
