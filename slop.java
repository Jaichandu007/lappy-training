public class slop {
    public double calc(Points P1, Points P2){
            try{
                return (P2.Y - P1.Y) / (P2.X - P1.X);

            }
            catch (ArithmeticException e) {
            // Exception handler
                return Double.POSITIVE_INFINITY;
            }
    }    
}
