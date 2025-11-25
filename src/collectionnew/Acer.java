
package collectionnew;
public class Acer 
{
    String model;
    String color;
    boolean rgbKeyboard;
    String processor;
    int price;
    Acer(String model, String color,boolean rgbKeyboard,String processor,int price)
    {
        this.model=model;
        this.color=color;
        this.rgbKeyboard=rgbKeyboard;
        this.processor=processor;
        this.price=price;
             
    }
    public void display()
    {
        System.out.println("mobile model: "+model);
        System.out.println("color of mobile : "+color);
        System.out.println("rgbKeyboard : "+rgbKeyboard);
        System.out.println("processor :  "+processor);
        System.out.println("mobile price :"+price);
    }
}
