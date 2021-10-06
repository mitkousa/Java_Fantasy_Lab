package Game.Player;

import Game.Components.DefensiveItem;
import Game.Components.Weapon;

public class Barbarian extends Fighter{
    private DefensiveItem defensiveItem;
    private Player player;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void defend(int damage) {
        int newHealth = this.getHealth() - (damage + this.defensiveItem.getDamageDecrease());
        this.setHealth(newHealth);
    }

    @Override
    public void attack(int damage) {
        int newHealth = player.getHealth() - damage;
        player.setHealth(newHealth);
    }
}

