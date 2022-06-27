public  class Trapezium extends Quadrilateral
{ 
    public void Trapez()
    {
    int     
    if(ab == cd &&  bc!=da)
    {
        System.out.println("This is a Trapezium");
    }
    else if (bc == da && ab!=cd)
    {
        System.out.println("This is a Trapezium");
    }
    }
}


public class Paralellogram extends Quadrilateral
{
    public void Parllel()
    {
    if(ab  == cd && bc == da)
    {
        System.out.println("This is a paralellogram");
    }
    }
}

public class Rectangle extends Paralellogram
{
    public void Rec()
    {
    if(AB == CD && BC!=DA)
    {
        System.out.println("This is a Rectangle");
    }
    else if (BC == DA && AB!=CD)
    {
        System.out.println("This is a rectangle");
    }
    }
}

public class Square extends Paralellogram
{
    public void Sq()
    {
    if(AB==BC==CD==DA)
    {
        System.out.println("This is a Square");
    }
}
}