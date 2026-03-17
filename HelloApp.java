import java.util.*;
class HelloApp
{
    public static void main (String[] args)

    {
        Scanner in=new Scanner (System.in);
        System.out.println("What is your name");
        String s = in.nextLine();
        System.out.println("Hello "+ s);
        System.out.println("Welcome to the Hello App created by our developer");
    }
}