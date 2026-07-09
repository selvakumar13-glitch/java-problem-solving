package Day5;
import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println("total sum :"+sum);
        sc.close();
    }
}