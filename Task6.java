package Project3;

public class Task6 {

    public static void main(String[] args) {

        int num = 100;
        boolean result = false;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                result = true;
                break;
            }
        }

        if (!result)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}


