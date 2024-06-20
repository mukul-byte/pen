package models.Pen;

import models.Ink;
import service.startegies.InkPenStrategy;

public class InkPen implements Pen {
    private Ink ink;

    @Override
    public void write(String message) {
        new InkPenStrategy().write(message);
    }

    @Override
    public void getColor() {
        System.out.println(this.ink.getColor());
    }

    public InkPen(Ink ink) {
        this.ink = ink;
    }
}
