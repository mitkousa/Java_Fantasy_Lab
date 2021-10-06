package Game.Character;

import Game.Components.DefensiveItem;
import Game.Components.Weapon;
import Game.Game;

public class Barbarian extends Fighter{
    private DefensiveItem defensiveItem;
    private GameCharacter gameCharacter;
    public Barbarian(int health, Weapon weapon, DefensiveItem defensiveItem) {
        super(health, weapon);
        this.defensiveItem = defensiveItem;
    }

    public DefensiveItem getDefensiveItem() {
        return defensiveItem;
    }

    public void setDefensiveItem(DefensiveItem defensiveItem) {
        this.defensiveItem = defensiveItem;
    }

    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }

    public void setGameCharacter(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void defend(int damage) {
        int newHealth = this.getHealth() - (damage + this.defensiveItem.getDamageDecrease());
        this.setHealth(newHealth);
    }

    @Override
    public void attack(int damage, GameCharacter gameCharacter) {
        int newHealth = gameCharacter.getHealth() - damage;
        gameCharacter.setHealth(newHealth);
    }
}

