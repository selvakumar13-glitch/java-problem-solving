package Day10;


public class StaticVariable {

    public static void main(String [] args){

        AiDsStudent s1 = new AiDsStudent();

        AiDsStudent s2 = new AiDsStudent();


        s1.name ="riswath";
        s2.name ="vishnu";
        s1.id =1;
        s2.id =2;

        s1.doHackathon();


//AiDsStudent.readDeptName();


    }



}

// student class is separately written
class AiDsStudent{ // only for AI ds




    String name ;
    int id;
    static  String dept =" Ai Ds" ;


    //methods

    public static void readDeptName()
    {
        System.out.print(dept);



    }
    public  void doHackathon()
    {

        System.out.print("Doing hackathon ");
        System.out.print(name);
        System.out.print(dept);
    }

}