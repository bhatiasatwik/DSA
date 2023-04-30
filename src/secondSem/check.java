package secondSem;

public class check {
	
 public static void main(String[] args) {
	 int digits[]= {1,2,3,4,9};
	 int n=digits.length-1;
     int b[]=new int[n+1];
     int f=0;
   while(f==0)
   {     if(digits[n-1]>=9)
   {
       digits[n]=0;
       digits[n-1]++;
       n--;
   } 
   else
   {
       digits[n]++;
       f++;
   }
   for(int i=0;i<digits.length;i++)
   {
	   
	   System.out.println(digits[i]);
   }
       
   }
}
}
