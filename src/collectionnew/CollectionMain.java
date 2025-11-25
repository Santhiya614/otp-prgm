
package collectionnew;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class CollectionMain 
{
    public static void main(String[] args) 
    {
       /* ListNew l = new ListNew("sankari",27,"vagaikulam");
        ListNew l1=new ListNew (12,"san");
        ListNew l2=new ListNew("madurai");
        ArrayList <ListNew> lin=new ArrayList //ithey marithan set ku HashSet & TreeSet uhm varum apdiye ithethan class name mattu change aguthu
        lin.add(l);
        lin.add(l1);
        lin.add(l2);
       for(ListNew li:lin)
        {
            li.display();
            System.out.println("******************");
        }
               
               
       mapCollection m = new mapCollection("san",20,"madurai");
       mapCollection m1 = new mapCollection("kan",20,"madurai");
       mapCollection m2 = new mapCollection("sandu",20,"madurai");


       HashMap<Integer,mapCollection> hm= new HashMap<>();
       hm.put(1,m);
       hm.put(2,m);
       hm.put(3,m);
               for(mapCollection a:hm.values())
       {
          a.display();
          
          System.out.println("*********************");
       }
      System.out.println(hm);
      System.out.println(hm.values());
        System.out.println(hm.keySet());
        
    }
    }*/
        
       /* Scanner sc=new Scanner(System.in);
        int i=1;
        int a;
        arrList1 ar=null;
        ArrayList <arrList1> al=new ArrayList();
        do
        {
            System.out.println("enter an element");
            a=sc.nextInt();
            ar=new arrList1(a);
            al.add(ar);
            System.out.println("enter your choice");
            System.out.println("1.continue");
            System.out.println("2.exit");
            i=sc.nextInt();
            
        }while(i==1);
           ar.display();*/
        
        
        
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
                System.out.println("enter mobile name to search");
                String name=sc.nextLine();
                 boolean found=false;
                for(Acer ac:al)
                {
                    if(ac.model.equalsIgnoreCase(name))
                    {
                        System.out.println("MOBILE DETAILS");
                        ac.display();
                        found=true;
                        break;
                }
            }
                if(!found)
                {
                    System.out.println("no mobile found with that model name");
                }
            }
            else if(choice==3)
            {
                System.out.println("thank you");
                break;
            }
            else
            {
                System.out.println("invalid option enter within the 1-3");
            }
        }
        sc.close();
    }
}
            
        

   