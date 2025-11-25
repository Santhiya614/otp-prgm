package genericsProg;
public class generics1 <genClass> //edhunalum kdukalam <> ulla edhu kudthalun cls tha consider pannum
{
    public void display(genClass g)  //g antha cls oda obj
    {
        System.out.println(g);
    }

  public static void main(String args[])
{
    generics1 <String> j=new generics1();  //String nu kudutha string mattu vangum genClass kudutha amntha cls iruka ela datatype uhm accept agum
    j.display("papa");
    j.display("santhiya");
}}