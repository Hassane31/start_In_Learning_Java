import java.util.Scanner;
public class mainclass {
  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
      CAR car1 = new CAR();
      car1.setname();
      car1.setModel();
      car1.setMaxSpeed();
      car1.setPrice();

      System.out.println(car1.getname());
      System.out.println(car1.getModel());
      System.out.println(car1.getMaxSpeed());
      System.out.println(car1.getPrice());
    }
}
