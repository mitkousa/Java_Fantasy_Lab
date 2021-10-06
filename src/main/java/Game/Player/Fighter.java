package Game.Player;

import Game.Components.Weapon;

public abstract class Fighter extends Player {
    public Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Fighter(int health, Weapon weapon) {
        super(health);
        this.weapon = weapon;
    }
}
