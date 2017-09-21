package Model;

/**
 * Created by cts1 on 20/9/17.
 */
public class Factorial {
    int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }

        return result;
    }
}
