import java.util.Scanner;	

public class fibonacci {
  int a;
  int b;
  int serie;
  int number;
  
  a=0;
  b=1;
  serie=0;
  
  Scanner keyboard=new Scanner(System.in);
  System.out.print("Number: ");
  number=keyboard.nextInt();
  
  System.out.print("Serie: "+a+" "+b+" ");
  for (int i=3; i<=number; i++) {
    serie=a+b;
    a=b;
    b=serie;
    System.out.print(serie+" ");
    }
}
