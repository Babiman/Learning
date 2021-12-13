import java.util.Scanner;

public class ofchi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a num");
                int num= input.nextInt();
        int newnum=0;
        while (num>0){
            newnum*=10;
            newnum+=num%10;
            num=num/10;

        }
        System.out.println(newnum);
    }
}
