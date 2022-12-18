import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int[]num=new int[5];
        in(num,5);

        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }
    }
    static void in(int [] a,int s){
        System.out.println("please enter the items of array");
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <s ; i++) {
            a[i]=input.nextInt();

        }
    }
}
