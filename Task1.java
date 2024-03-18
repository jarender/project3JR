package Project3;

public class Task1 {

    public static void main(String[] args) {

        int [] temp={54,49,45,52,45,49,55};
        int max=temp[0];
        int least=temp[0];

        for(int n:temp){
            if(max<n){
                max=n;
            }
            if (least>n){
                least=n;
            }

        }
        System.out.println(max);
        System.out.println(least);
    }
}
