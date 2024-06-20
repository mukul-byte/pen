package service.startegies;

public class GelPenWriteStrategy implements RefilWriteStrategy{

    @Override
    public void write(String message) {
        System.out.println("Gel Pen is writting: "+ message);
    }
}
