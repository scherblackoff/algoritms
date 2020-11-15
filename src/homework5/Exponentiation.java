package homework5;

public class Exponentiation {


    public double exponentiation(int number, int exponent){
        double result;
        if (exponent < 0){
            return negativeRaising(number, exponent);
        }else{
            return positiveRaising(number, exponent);
        }
    }

    private double negativeRaising(int a, int n){
        return 1 / (double)(positiveRaising(a , n * (-1)));
    }

    private int positiveRaising(int a , int n){
        if (n == 0 || a == 1){
            return 1;
        }else if (a == 0){
            return 0;
        }else{
            return a * positiveRaising(a, n - 1);
        }
    }
}
