package Day10;

public class House {


    String color ="skyblue";
    String owner ;
    int doors= 3;
    int rooms =4;
    int windows =10;
    int bhk =2;


    public void  openDoors(){


        System.out.print("door opened");
    }
    //main method written inside House class Itself
    public static void main(String [] args){

        House sHome = new House();

        House yugaHome = new House();



        sHome.owner ="satheesh";



        yugaHome.owner ="yuga";

        yugaHome.color ="pink";



        sHome.color =yugaHome.color;

        System.out.print( " The house owner " + sHome.owner
                + " and the  house color is "+ sHome.color);

    }
}
