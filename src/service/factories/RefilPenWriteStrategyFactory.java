package service.factories;

import models.RefilType;
import service.startegies.BallPenWriteStrategy;
import service.startegies.GelPenWriteStrategy;
import service.startegies.RefilWriteStrategy;

public class RefilPenWriteStrategyFactory {
    public static RefilWriteStrategy RefilWriteStrategy(RefilType refilType){
        if(refilType.equals(RefilType.GEL)){
            return new GelPenWriteStrategy();
        }
        return new BallPenWriteStrategy();
    }
}
