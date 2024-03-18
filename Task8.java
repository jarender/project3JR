package Project3;

public class Task8 {

    public static void main(String[] args) {

        int [] numbers={10,29,35,42,55,69,75};
        int max=numbers[0];
        int least=numbers[0];

        for(int n:numbers){
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
