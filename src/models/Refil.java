package models;

public class Refil {
    RefilType refilType;
    Ink ink;

    public Refil(RefilType refilType, Ink ink) {
        this.refilType = refilType;
        this.ink = ink;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public RefilType getRefilType() {
        return refilType;
    }

    public void setRefilType(RefilType refilType) {
        this.refilType = refilType;
    }
}
