/**
 while (1==1){
 System.out.println("geben sie eine Zahl ein und ich bestimme, ob sie eine Primzahl ist");
 Scanner sc = new Scanner(System.in);
 double name = sc.nextDouble();
 boolean salim=true;
 for (double i = 2; i < name; i++) {
 if (name % i == 0) {
 System.out.println("Nein");
 salim=false;
 break;
 }}
 if(salim==true){
 System.out.println("Ja");
 }}
 */
/**  while (1 == 1) {
 try {
 System.out.println("Bitte Buchstabe eingeben");
 Scanner sc = new Scanner(System.in);
 String filename = "C:\\Schule\\List.txt";
 String inputline;
 String input;
 input=sc.next();
 FileReader Fr = new FileReader(filename);
 BufferedReader br = new BufferedReader(Fr);
 while ((inputline = br.readLine()) != null) {
 String[] line = inputline.split(";");
 if (line[0].substring(0, 1).equals(input)) {
 System.out.println(line[0]+" "+line[1]+" "+line[2]);
 }

 }
 } catch(Exception e){
 e.printStackTrace();
 }
 }
 int [] b = new int[9];
 Scanner sc = new Scanner(System.in);
 int In;
 for(int i=1;i<=9;i++) {
 System.out.println("Bitte Buchstabe eingeben");
 In=sc.nextInt();
 for(int o=0;0>=i+1;o++) {
 b[o+i+2] =b[o+i+1];
 b[o+i]=In;
 }
 }
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class prime {
    public static void main(String Args[]) {
      int[] a={54,34,67,34,87,232,89,32,6,63,93};
      int big;
      int small;
      big=a[0];
      small=a[0];
      for(int i=1;i<=9;i++){
          if (big<=a[i]){
              big=a[i];
          }
          if (small>=a[i]){
              small=a[i];
          }
      }
        System.out.println("max "+big);
        System.out.println("min " +small);

        String output="";
        String input;
        Scanner sc = new Scanner(System.in);
        input=sc.nextLine();
        String[] u=input.split("");
        for(int p =1;p<=input.length();p++){
            output=output+u[u.length-p];
        }
System.out.println(output);
        int waiter;
        int[] P={54,34,67,34,87,232,89,32,6,63};
        for (int q=0;q<P.length;q++){
            for (int t=1;t<=q;q++){
if(P[q]<P[q-1]){
    waiter=P[q];
    P[q-1]=P[q];
    P[q]=waiter;
}
            }
        }
        }
    }
