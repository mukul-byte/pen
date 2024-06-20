import models.Color;
import models.Pen.Pen;
import models.RefilType;
import service.factories.PenFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Pen gelPen = PenFactory.GenerateRefillablePen(RefilType.GEL, Color.GREEN, false);
        gelPen.write("123");
        gelPen.getColor();

        Pen ballPen = PenFactory.GenerateRefillablePen(RefilType.BALL, Color.BLACK, false);
        ballPen.write("456");
        ballPen.getColor();

        Pen inkPen =PenFactory.GenerateInkPen(Color.RED);
        inkPen.write("789");
        inkPen.getColor();

    }
}