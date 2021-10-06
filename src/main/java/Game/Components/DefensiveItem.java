package Game.Components;

public enum DefensiveItem {
    SHIELD(5);
     private int damageDecrease;

    DefensiveItem(int damageDecrease) {
        this.damageDecrease = damageDecrease;
    }

    public int getDamageDecrease() {
        return damageDecrease;
    }
}
