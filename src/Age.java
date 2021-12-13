import java.util.Scanner;
public class Age
{
    public static void main(String[]args)
    {
        Scanner scan =new Scanner (System.in);
        int age;
        System.out.println("Please enter your date of birth in this format ddmmyy");
        age=scan.nextInt();
        int aged,agem,agey;
        aged= age/10000;
        agem=(age/100)%100;
        agey=age%100;

    }

}