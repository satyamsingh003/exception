import java.util.Scanner;

public class size {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        System.out.println("Enter the elements in an array");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index of the array elements you want to access");
        int ele=sc.nextInt();
        try{for (int i=0;i<n;i++){
                System.out.println(arr[ele]);



        }
    }
    catch(ArrayIndexOutOfBoundsException obj){
        System.out.println(obj);
    }

}}
