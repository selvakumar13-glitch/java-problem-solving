package Day21;
public class Recursion {
    public static void main(String[] args){
        int a=0;
        fun(a);
    }
    public static void fun(int a){
        if(a==5){
            return;
        }
        a++;
        System.out.println(a);
        fun(a);
    }
}
