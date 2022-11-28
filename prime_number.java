import java.util.Scanner;

class Prime
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 500; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 500 are :");
       System.out.println(primeNumbers);

       
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number to check if it is truly prime number or not: ");
       int number= sc.nextInt();
       if(isPrime(number)) {
           System.out.println(number + " is prime number");
       }
       else{
           System.out.println(number + " is a non-prime number");
       }
   }
   static  boolean isPrime(int num)
   {
       if(num<=1)
       {
           return false;
       }
      for(int i=2;i<=num/2;i++)
      {
          if((num%i)==0)
              return  false;
      }
      return true;

























   }
}
