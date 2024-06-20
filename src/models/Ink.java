package models;

public class Ink {
    Color color;
    Boolean isErasable;

    public Ink(Color color, Boolean isErasable) {
        this.color = color;
        this.isErasable = isErasable;
    }

    public Boolean getErasable() {
        return isErasable;
    }

    public void setErasable(Boolean erasable) {
        isErasable = erasable;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
