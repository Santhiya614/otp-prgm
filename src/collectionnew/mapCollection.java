
package collectionnew;
public class mapCollection 
{
    String name;
    int age;
    String add;
    public mapCollection(String name, int age, String add)
    {
        this.name = name;
        this.age = age;
        this.add = add;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(add);
    }
    
}
