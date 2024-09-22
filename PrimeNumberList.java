import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {

    public static Boolean isPrime(int n) {


        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int num=50;
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <=num ; i++) {
            if(isPrime(i))
            {
             primeNumbers.add(i);
            }

        }

        System.out.println(primeNumbers);
    }
}
