package Game.Character;

import Game.Behaviours.IAttack;
import Game.Behaviours.ICollect;
import Game.Behaviours.IDefend;

public abstract class GameCharacter implements IDefend, IAttack, ICollect {
    private int health;

    public GameCharacter(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
