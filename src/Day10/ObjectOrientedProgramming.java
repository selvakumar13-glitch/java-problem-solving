package Day10;

public class ObjectOrientedProgramming {


    public  static void main(String[] args){


        // className objvariable = new className();

        Laptop l1 = new Laptop();


        System.out.print(l1);



    }

    public static void record(){


        System.out.print("recording ");
    }

}





class Laptop{

    // fields
    String brand ;

    String model;

    // methods

    public void browse(){

        System.out.print("browsing..");
    }



}