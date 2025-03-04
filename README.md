# GameLoader

Client and server apps allowing users to play simple games online, made as an assignment project for OOP course 2021/22.

## Goals

- [x] working client / server connection (29.04)
- [x] first working game with GUI (01.05)
- [x] first online game played (02.05)
- [x] dots and boxes game (03.05)

#### First presentation (05.05)

- [x] in-game chat (16.05)
- [x] database integration (user accounts, elo system) (19.05)
- [x] tic-tac-toe game with multiple settings (24.05)
- [x] paper soccer game (25.05)

#### Second presentation (26.05)

- [x] loading games as plugins (28.05)
- [x] [chess](https://github.com/KacperTopolski/chessGameLoader) game wrapper (30.05)
- [x] in-game statistics display (02.06)
- [x] Glicko2 elo system (02.06)

#### Third presentation (09.06)

## Requirements

- Java 17
- Maven 3 as the build system

## Compiling

    mvn clean package                                           # Compile everything

## Basic usage

    java -jar target/GameLoader.jar client <ip> <port>          # Run client
    java -jar target/GameLoader.jar server <port>               # Run server

If not specified ``port`` defaults to ``6666``, and ``ip`` defaults to ``localhost``.

## Games
Currently, there are three hardcoded games: dots and boxes, tic-tac-toe, paper soccer. Games can also be loaded as plugins, as the ``games`` folder is scanned for ``.jar`` files containing classes that implement ``GameLoader.common.Game`` interface.

## Contribution percentage
|     Person      | Contribution |
|:---------------:|:------------:|
|   Jan Fornal    |    33 ⅓ %    |
| Kacper Topolski |    33 ⅓ %    |
|    Jakub Wąs    |    33 ⅓ %    |
