import java.util.Scanner;

public class tlat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number between 5-10");
                int num= input.nextInt();
        for (int sum=num;num>=5&num<=10&sum<num*10;sum+=num){
            System.out.println(sum);
        }
    }
}
