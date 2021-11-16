# Arkanoid Game Project

An arkanoid game with many different levels and ability to make and play different Level-Sets.
The game is written in JAVA, using gui.

## Getting Started with the default Level-Set

- Download and unzip the code repository.
- Make your own Level-Set (Section 4) or Coutinue to the next step if you want the default.
- In the command line write the command `make jar`.
- Click twice on the ass7game.jar file **or** write in the command line the command: `java -jar ass7game.jar`.

You all set and can start enjoying the game!

## Different Level-Sets

provide the player with the option to select a level-set when the game starts. After selecting the "Play Game" option in the main menu, the user will be shown another menu, in which he will be asked to select a level-set (for example "Easy" and "Hard"). After this selection, he will then proceed to play a game based on the levels defined for the set.

Behind the scenes, level-sets are implemented as different level specification files. Each level-set corresponds to one level-specification file. The level-sets will be specified in a levelset file with the following simple format:

**Level-Sets file format** <br />
a:level 1 name <br />
path-to-level-1-file <br />
b:level 2 name <br />
path-to-level-2-file<br />
c:level 3 name <br />
path-to-level-3-file <br />
...

Odd-numbered lines are level names. The level name lines have the format `k:description` where `k` is a single character (the key for this item) and `description` is a string containing the level-set's description.

Even-numbered lines are the corresponding filenames, containing the level specifications. As before, all filenames should be relative to the classpath.

**Make your own Levels Set** 

- Go to the resources/definitions directory.
- 

