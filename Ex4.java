import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("please enter the items of array");
        for (int i = 0; i <4 ; i++) {
           array[i]=in.nextInt();

        }
        for (int i = 0; i <4 ; i++) {
            System.out.println(array[i]);

        }
    }
}
