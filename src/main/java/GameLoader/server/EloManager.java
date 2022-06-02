package GameLoader.server;

import GameLoader.common.Game;
import GameLoader.common.Utility;

import static GameLoader.common.Utility.IntPair;
import static GameLoader.common.Utility.IntDoublePair;

public interface EloManager {
    IntDoublePair calculate(int eloP0, int eloP1, double rd1, double rd2, Game.state result);
}
