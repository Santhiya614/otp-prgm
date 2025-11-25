package collectionnew;
import java.util.ArrayList;
import java.util.Scanner;

public class otp 
{
       public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);
        
        ArrayList <Acer> al=new ArrayList<>();
        
        
        while(true) 
        {
            System.out.println("1.entry 2.search 3.exit");
            System.out.println("enter your choice");
            int choice=sc.nextInt();
            sc.nextLine();
        if(choice==1)
            {
            System.out.println("enter mobile model");
            String model=sc.nextLine();
            System.out.println("enter mobile color");
            String color=sc.nextLine();
            System.out.println("type of rgbKeyboard(true/false)");
            boolean rgbKeyboard= Boolean.parseBoolean(sc.nextLine());
            System.out.println("enter processor name");
             String processor=sc.nextLine();
            System.out.println("enter mobile price");
             int price=sc.nextInt();
             sc.nextLine();
             
              al.add(new Acer(model,color,rgbKeyboard,processor,price));
              
            }
            
        else if(choice==2)
            {
                System.out.println("your otp no is : ");
                int otp=(int)(Math.random()*10000);  //ethana 0 kudukuroma antha digit la otp varum
                System.out.println(otp);
            
                System.out.println("enter  your otp");
                int otp1=sc.nextInt();
            if(otp!=otp1)
                {
                    System.out.println("otp mismatched");
                }
            else if(otp==otp1)
            {
                System.out.println("enter mobile name to search");
                String name=sc.next();
                 boolean found=false;
                for(Acer ac:al)
                {
                    if(ac.model.equalsIgnoreCase(name))
                    {
                        System.out.println("MOBILE DETAILS");
                        ac.display();
                        found=true;
                        break;
                }}
                
                    if(!found)
                {
                    System.out.println("no mobile found with that model name");
                }
            }}
        else if(choice==3)
            {
                System.out.println("THANK YOU");
                break;
            }
        else
        {
            System.out.println("invalid option enter within the 1-3");
        }
        
        }}}


          
