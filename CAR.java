public class CAR {
   private String name;
   private int maxSpeed;
   private float price;
   private int model ;

    public void setname(String n){
        name = n;
    }
    public String getname (){
        return name ;
    }
    public void setModel(int n) {
        if (n>=1994)
        model = n;
        else System.out.println("sorry we can t accepte this car");
    }
     int getModel (){
        return model ;
    }
    
}
