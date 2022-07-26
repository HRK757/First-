package subsequence;
import java.util.*;

public class Subseq {
	 static int incre_subseq(int a[], int len){
	      int res[] = new int[len];
	      int i, j, max = 0;
	      for (i = 0; i < len; i++)
	         res[i] = 1;
	      for (i = 1; i < len; i++)
	      for (j = 0; j < i; j++)
	      if (a[i] > a[j] && res[i] < res[j] + 1)
	     res[i] = res[j] + 1;
	      for (i = 0; i <len; i++)
	      if (max < res[i])
	      max = res[i];
	      return max;
	   }
	   public static void main(String args[]){
		   
	       Scanner s=new Scanner(System.in);
	       int len;
	       System.out.println("Enter the length of an array :");
	       len=s.nextInt();
	       int a[] = new int[len];
	      System.out.println("Enter elements :");
	      for(int i=0;i<len;i++)
	      {
	    	a[i]=s.nextInt();
	      }
	      System.out.println("The longest increasing subsequence is " +  incre_subseq(a,len));
	   }
}
