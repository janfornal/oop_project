package GameLoader.server;

import GameLoader.common.Game;
import static GameLoader.common.Utility.IntPair;

public interface EloManager {
    IntPair calculate(int eloP0, int eloP1, int gamesPlayedP0, int gamesPlayedP1, Game.state result);
}
