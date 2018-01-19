import java.util.Scanner;


public class main {


    public static void main(String[] args){

        //read from prompt:
        System.out.println("Enter first number: ");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        System.out.println("Enter second number: ");
        int second = in.nextInt();
        printSeriesVersion2(first, second);

    }



    public static void printSeriesVersion(int n1, int n2){

        for (int i = n1; i < n2; i++){
            System.out.print(i + ",");
        }
        System.out.print(n2);

    }
    public static void printSeriesVersion2(int n1, int n2){
if (n2-n1>=0) {
    System.out.print(n1 + ",");
    n1++;
    printSeriesVersion2(n1,n2);
}
    }



    //TODO: rewrite this method as a recursion:



}
