package service.factories;

import models.Color;
import models.Ink;
import models.Pen.InkPen;
import models.Pen.RefillablePen;
import models.Refil;
import models.RefilType;

public class PenFactory {
    public static RefillablePen GenerateRefillablePen(RefilType refilType, Color color, Boolean isErasable){
//        if(refilType.equals(RefilType.GEL)){
//            Refil refil = new Refil(refilType);
//            return new RefillablePen(refil);
//        }

        Ink ink = new Ink(color, isErasable);
        Refil refil = new Refil(refilType, ink);
        return new RefillablePen(refil);
    }

    public static InkPen GenerateInkPen(Color color){
        Ink ink = new Ink(color, false);
        return new InkPen(ink);
    }
}
