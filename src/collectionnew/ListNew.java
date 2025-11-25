
package collectionnew;

public class ListNew
{
    String name;
    int age;
    String add;

    public ListNew(String name, int age, String add)
    {
        this.name = name;
        this.age = age;
        this.add = add;
    }
    
    public ListNew(int age, String add)
    {
      
        this.age = age;
        this.add = add;
    }
    
    public ListNew(String add)
    {
       
        this.add = add;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(add);
    }
}
