package Test.Rownanie;
public class RownanieKwadratowe {
    private double x1;
    private double x2;
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
        double x1 = 0;
        double x2 = 0;
        if (delta<0){
                System.out.println("Brak rozwiązań.");
            }if(delta==0){
                System.out.println("Równanie ma 1 pierwiastek, x1 = " + (-b/(2*a)) );
            }if(delta>0){
                x1 =(-b-Math.sqrt(delta))/(2*a);
                x2 =(-b+Math.sqrt(delta))/(2*a);
            }
            this.x1=x1;
            this.x2=x2;
   }
    public double getX1(){
        return x1;
    }
    public double getX2(){
        return x2;
    }
    public static void main (String args[]){
        RownanieKwadratowe rk = new RownanieKwadratowe();
        rk.Pierwiastki(rk.Delta(3, 5, 1), 3, 5);
        System.out.println(rk.getX1()+" "+rk.getX2());
    }
    
}

