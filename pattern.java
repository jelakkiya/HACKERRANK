import java.util.*;

public class pattern {
    public static void main(String[] arg) {
	      Scanner input=new Scanner(System.in);
	      int i,j;
	      int n;
	      System.out.print("Enter the no.of row's:");
	      int n=input.nextInt();
	      for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
                               System.out.print("*");
                       }System.out.print("\n");
	     }
    }
}