package Game.Behaviours;

import Game.Character.GameCharacter;
import Game.Game;

public interface IAttack {
    void attack(int damage, GameCharacter gameCharacter);
}
