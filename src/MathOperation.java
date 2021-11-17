import java.util.Scanner;

public class MathOperation {
    void math(int n)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try{int sum=0;
        int avg;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        avg=sum/n;
        System.out.println(sum);
        System.out.println(avg);
    }
    catch(Exception obj){
        System.out.println(obj);
    }
}}
class test1{
    public static void main(String[] args) {
        MathOperation obj=new MathOperation();
        obj.math(5);
    }
}
