import java.util.Scanner;

public class CAR {
    Scanner input = new Scanner(System.in);

    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    public void setname() {
        System.out.println("car name :");
        name = input.next();}
public String getname() {
        return name; }


    public void setModel() {
       System.out.println("car model");
        model = input.nextInt();
        if (model >= 2000 && model <= 2024)
            System.out.println("nice model:");
        else{
        System.out.println("sorry we can t accepte this car");
        do{System.out.println("Again car model :");
        model = input.nextInt();}while(model > 2000 && model <2024);
        }}
    public int getModel() {
        return model;}


    public void setMaxSpeed() {
        do {  System.out.println("car maxSpeed :");
            maxSpeed = input.nextInt();
        } while (maxSpeed < 0);
        if (maxSpeed >= 180)
            System.out.println("Speed car!!");
        else
            System.out.println("normal car !!");  }
    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setPrice() {
        do {System.out.println("price : !!");
            price = input.nextFloat();
        } while (price <= 0); }
    public float getPrice() {
        return price;
    }
}
