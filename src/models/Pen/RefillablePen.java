package models.Pen;

import models.Refil;
import service.factories.RefilPenWriteStrategyFactory;

public class RefillablePen implements Pen {
    private Refil refil;

    public RefillablePen(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write(String message) {
        //write according to the type of refil
        RefilPenWriteStrategyFactory
                .RefilWriteStrategy(refil.getRefilType())
                .write(message);
    }

    @Override
    public void getColor() {
        System.out.println(this.refil.getInk().getColor());
    }
}
