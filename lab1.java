import java.util.Scanner;
public class lab1 {
    
    public static void main(String args[])
    {
     int no,n,temp=0,rev=0;
     
     int ch=0;
    
     
     Scanner obj= new Scanner(System.in);
     
     do
     {
      
     System.out.println("Enter the Number ");
           no=obj.nextInt();
           
           
           System.out.println("Press 1 For Reverse And 2 For Sum Of Digit");
           n=obj.nextInt();
           
           temp=0;
           
           switch(n)
           {
               case 1:
                   while(no!=0)
                   {
                       rev=no%10;
                       temp=temp*10+rev;
                       no=no/10;
                       
                       
                       
                   }
                   
                   System.out.println("Reverse Of The Number -> "+temp);
                   
                   System.out.println("Do You Wanr To Continue ? Press 1");
                   ch=obj.nextInt();
                  
                   break;
               case 2:
                   
                   while(no!=0)
                   {
                       rev=no%10;
                       temp=temp+rev;
                       no=no/10;
                   }
                   
                   System.out.println("Sum Of The Number -> "+temp);
                   
                   System.out.println("Do You Wanr To Continue ? Press 1");
                   ch=obj.nextInt();
                   
                  
                   
                   break;
                   }
     }while(ch==1);
           }
           
                   
           }
     
    
    
