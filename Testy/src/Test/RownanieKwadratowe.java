package Test;
public class RownanieKwadratowe {
    public double Delta(int a, int b, int c){
        double delta = 0;
        if(a==0){
            System.out.println("To nie jest funkcja kwadratowa");
        }
        else
            delta=(b*b)-4*(a*c);
        System.out.println(delta);
        return delta;
    }
    public void Pierwiastki(double delta, int a, int b){
        if (delta<0){
                System.out.println("Brak rozwiązań.");
            }if(delta==0){
                System.out.println("Równanie ma 1 pierwiastek, x1 = " + (-b/(2*a)) );
            }if(delta>0){
                System.out.println("x1 = " + (-b-Math.sqrt(delta))/(2*a) );
                System.out.println("x2 = " + (-b+Math.sqrt(delta))/(2*a) );
            }
    }
    public static void main (String args[]){
        RownanieKwadratowe rk = new RownanieKwadratowe();
        rk.Pierwiastki(rk.Delta(3, 5, 1), 3, 5);
    }
}
