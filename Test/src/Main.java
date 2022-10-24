import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ffff");
        clearConsole();
        System.out.println("GGG");
    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }

}
