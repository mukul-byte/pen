package service.startegies;

public class BallPenWriteStrategy implements RefilWriteStrategy{

    @Override
    public void write(String message) {
        System.out.println("Ball Pen is writting: " +  message);
    }
}
