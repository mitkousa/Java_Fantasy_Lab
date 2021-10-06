package Game.Components;

public enum Familiar {
    DRAGON(15),
    CAT(5),
    OWL(10);
    int defence;

    Familiar(int defence) {
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }
}
