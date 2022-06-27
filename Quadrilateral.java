import java.util.Scanner;
import java.util.ArrayList;

public class Quadrilateral
{
    public void vertices()
    {

        Points a = new Points();
        Points b = new Points();
        Points c = new Points();
        Points d = new Points();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter vertices of A");
        a.X = input.nextInt();
        a.Y = input.nextInt();

        System.out.println("Enter vertices of B");
        b.X = input.nextInt();
        b.Y = input.nextInt();

        System.out.println("Enter vertices of C");
        c.X = input.nextInt();
        c.Y = input.nextInt();

        System.out.println("Enter vertices of D");
        d.X = input.nextInt();
        d.Y = input.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        A.add(a.X);
        A.add(a.Y);

        B.add(b.X);
        B.add(b.Y);

        C.add(c.X);
        C.add(c.Y);

        D.add(d.X);
        D.add(d.Y);

        slop m1 = new slop();
        slop m2 = new slop();
        slop m3 = new slop();
        slop m4 = new slop();

        double ab = m1.calc(a, b);
        double bc = m2.calc(b, c);
        double cd = m3.calc(c, d);
        double da = m4.calc(d, a);

        while (A.equals(B) || A.equals(C) || A.equals(D) || B.equals(C) || B.equals(D) || C.equals(D) ||
                ab == bc ||ab == da || bc == cd || cd == da)
        {
            System.out.println(ab);
            System.out.println(bc);
            System.out.println(cd);
            System.out.println(da);3
            System.out.println("Enter valid points of a quadrilateral");
            System.out.println("Enter vertices of A");
            a.X = input.nextInt();
            a.Y = input.nextInt();

            System.out.println("Enter vertices of B");
            b.X = input.nextInt();
            b.Y = input.nextInt();

            System.out.println("Enter vertices of C");
            c.X = input.nextInt();
            c.Y = input.nextInt();

            System.out.println("Enter vertices of D");
            d.X = input.nextInt();
            d.Y = input.nextInt();

            A.set(0, a.X);
            A.set(1, a.Y);

            B.set(0, b.X);
            B.set(1, b.Y);

            C.set(0, c.X);
            C.set(1, c.Y);

            D.set(0, d.X);
            D.set(1, d.Y);

            ab = m1.calc(a, b);
            bc = m2.calc(b, c);
            cd = m3.calc(c, d);
            da = m4.calc(d, a);

        }
        Length l1 = new Length();
        Length l2 = new Length();
        Length l3 = new Length();
        Length l4 = new Length();

        double AB = l1.dist(a, b);
        double BC = l2.dist(b, c);
        double CD = l3.dist(c, d);
        double DA = l4.dist(d, a);

        System.out.printf("slopes are %f\n%f\n%f\n%f\n",ab,bc,cd,da);
        System.out.printf("Lengths are %f\n%f\n%f\n%f\n",AB,BC,CD,DA);
    }
}

class Trapezium extends Quadrilateral
{ 
    public Trapezium(Points a,Points b,Points c,Points d)
    {
    
    if(ab == cd &&  bc!=da)
    {
        System.out.println("This is a Trapezium");
    }
    else if (bc = da && ab!=cd)
    {
        System.out.println("This is a Trapezium");
    }
    }
}



class Paralellogram extends Quadrilateral
{
    public void Parllel()
    {
    Quadrilateral A = new Quadrilateral();
    A.vertices();
    if(ab = cd && bc = da)
    {
        System.out.println("This is a paralellogram");
    }
    }
}
class Rectangle extends Paralellogram
{
    public void Rec()
    {
        Quadrilateral A = new Quadrilateral();
        A.vertices();
    if(AB = CD && BC!=DA)
    {
        System.out.println("This is a Rectangle");
    }
    else if (BC = DA && AB!=CD)
    {
        System.out.println("This is a rectangle");
    }
    }
}

class Square extends Paralellogram
{
    public void Sq()
    {
        Quadrilateral A = new Quadrilateral();
        A.vertices();
    if(AB==BC==CD==DA)
    {
        System.out.println("This is a Square");
    }
}
}
