# Arkanoid Game Project

## Table of Contents:
- [Introduction](#introduction)
- [Screenshots](#screenshots)
- [Features](#features)
- [Getting Started](#getting-started)
- [Level Specification](#level-specification)
- [Level-Sets File Format](#level-sets-file-format)
- [Development Notes](#development-notes)
- [Dependencies](#dependencies)

## Introduction:
The Arkanoid Game is a multi-level, Java-based game developed as part of the semester project in the 2nd semester of the 1st year at BIU. Designed without the use of Java's GUI Built-In objects, this game uses a custom GUI implementation which is included in this repository. Unique to its design, the game runs on a single thread, offering a unique take on classic game programming. Users have the flexibility to choose from different levels or even create their own.

## Screenshots:

### Welcome to the Jungle Level
![Welcome to the Jungle Level](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/Welcome_to_the_jungel_level.jpg)

### Game Over Screen
![Game Over Screen](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/game_over_screen.jpg)

### High Scores Screen
![High Scores Screen](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/high_scores_screen.jpg)

### Level Sets Menu
![Level Sets Menu](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/level_sets_menu.jpg)

### Menu
![Menu](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/menu.jpg)

### Square Moon Level
![Square Moon Level](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/square_moon_level.jpg)

### Wide Easy Level
![Wide Easy Level](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/wide_easy_level.jpg)

### Robot Kill Level
![Robot Kill Level](https://github.com/liza-yemini/Arkanoid-Game/blob/master/screenshots/robot_kill_level.jpg)

## Features:
- Multiple levels with varying difficulty.
- An opening menu screen for game interactions: start a new game, view high scores, or quit.
- Customizable level sets for personalized gameplay.
- Level specifications separate from the core code.
- Block and level definitions that are human-readable and easy to understand.

## Getting Started:
1. Ensure you have Java SE 10 or higher installed on your machine.
2. Download and unzip the code repository.
3. Optionally, create your own Level-Set (See "Level Specification" below) or proceed with the default set.
4. In the command line, type `make jar`.
5. Run the game by either double-clicking the `ass7game.jar` file or typing `java -jar ass7game.jar` in the command line.
6. Enjoy the game!

## Level Specification:
- Level and block definitions are based on human-readable text files.
- Each block has properties like width, hit-points, appearance, and more.
- Levels define properties like paddle size, level name, and block layout.
- Different level-sets can be chosen at the start, which are simply different level specification files. Modify the `level_sets.txt` file in the resources folder to customize these sets.

## Level-Sets File Format:
> a:level 1 name <br />
> path-to-level-1-file <br />
> b:level 2 name <br />
> path-to-level-2-file<br />
> ...
- Odd-numbered lines are level names with the format `k:description`.
- Even-numbered lines provide the filenames for level specifications. Ensure these filenames are relative to the classpath.

## Development Notes:
- This project went through 5 stages, reflecting the semester-long journey of refining and enhancing the code. Parts of it were revisited to further improve OOP practices and Java language proficiency.
- This game is built without relying on Java's built-in GUI objects but instead, utilizes a GUI implementation found in this repository. This offers a different experience for both the developer and the player.
- While most games of this nature might use multi-threading, our Arkanoid game stands out by running on a single thread.

## Dependencies:
- If compiling and running the source code, ensure to also include the provided `biuoop-1.4.jar` which is crucial for the game's GUI functionality.


