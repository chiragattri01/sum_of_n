import java.util.Scanner;
public class sum_of_n {


    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        System.out.println("enter the number ");
        int n=Sc.nextInt();
        int sum=0;
        for(int i=0;i<=n; i++){
            sum=sum+i;
        }
        System.out.print("your sum is:"+ sum);
    
        Sc.close();
    }
}


