package Game.Components;

public enum Weapon {
    SWORD(20),
    CLUB(15),
    AXE(10),
    POTATO(5);

    int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
