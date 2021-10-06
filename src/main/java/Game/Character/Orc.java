package Game.Character;

import Game.Behaviours.IAttack;
import Game.Behaviours.IDefend;
import Game.Components.DefensiveItem;
import Game.Components.Weapon;
import Game.Game;

public class Orc extends GameCharacter implements IAttack, IDefend {

    GameCharacter gameCharacter;
    DefensiveItem defensiveItem;
    Weapon weapon;

    public Orc(int health, Weapon weapon) {
        super(health);
        this.weapon = weapon;
    }

    @Override
    public void attack(int damage, GameCharacter gameCharacter) {
        int newHealth = gameCharacter.getHealth() - damage;
        gameCharacter.setHealth(newHealth);
    }

    @Override
    public void defend(int damage) {
        int newHealth = this.getHealth() - (damage + this.defensiveItem.getDamageDecrease());
        this.setHealth(newHealth);
    }
}
