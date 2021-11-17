# Arkanoid Game Project

An arkanoid game with many different levels and ability to make and play different Level-Sets.


## Description

The game is written in JAVA, using gui.
The game support on opening Menu-screen, which allows to start a new game, see the current high scores, or quit the game.
When starting a new game, there is a choise between easy, medium or hard game (Default - can be changed), each game type will have different levels. 
**The level definitions is seperated from the code** and placed in the `resources directory ` in human readable files with an easy format. [level sets file format](#level-sets-file-format)

## Getting Started

- Download and unzip the code repository.
- Make your own Level-Set (Section 4) or Coutinue to the next step if you want the default.
- In the command line write the command `make jar`.
- Click twice on the ass7game.jar file **or** write in the command line the command: `java -jar ass7game.jar`.

You all set and can start enjoying the game!

## Level Specification

The level specification file format is based on human readable text files.
The level specification format consists of two different file types `levels definitions` and `block definitions`.

* The block definitions format specifies a list of block types (each block has properties such as width, hit-points, appearance, and so on) and associates each type with a name.

* The levels definitions format specifies a list of levels. Each level contains information such as paddle size, level name, and blocks layout. The specification of the block layout refers to the block types defined in a block definitions file.

### Levels Specification Files Format

## Different Level-Sets

provide the player with the option to select a level-set when the game starts. After selecting the "Play Game" option in the main menu, the user will be shown another menu, in which he will be asked to select a level-set (for example "Easy" and "Hard"). After this selection, he will then proceed to play a game based on the levels defined for the set.

Behind the scenes, level-sets are implemented as different level specification files. Each level-set corresponds to one level-specification file. The level-sets will be specified in a levelset file with simple format.
In order to change the level-sets go to `resources` and change the `level_sets.txt` file according the Level-Sets file format.

### Level-Sets File Format
> a:level 1 name <br />
> path-to-level-1-file <br />
> b:level 2 name <br />
> path-to-level-2-file<br />
> ...

Odd-numbered lines are level names. The level name lines have the format `k:description` where `k` is a single character (the key for this item) and `description` is a string containing the level-set's description.

Even-numbered lines are the corresponding filenames, containing the level specifications. As before, all filenames should be relative to the classpath.
