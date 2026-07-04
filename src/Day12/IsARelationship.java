package Day12;

public class IsARelationship {

    public static void main(String[] args) {


        Vehicle v1 = new Vehicle();



        Vehicle c1= new Car();



          Vehicle v2 = new Car();

          v2.start();


    }

}

class Vehicle{


    public void start(){

        System.out.println("Car started ...");
    }

    public void drive(){


    }




}

class Car extends Vehicle{

    public void drive(){

        System.out.print("car Driving ....");
    }
}
