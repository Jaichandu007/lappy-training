import java.lang.Math;
public class Length {
    public double dist(Points P1, Points P2)
    {
        return (Math.sqrt(Math.pow((P2.X-P1.X),2)+Math.pow((P2.Y-P1.Y),2)));
    }
    
}
