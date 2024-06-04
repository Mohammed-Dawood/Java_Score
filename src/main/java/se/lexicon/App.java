package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        int score = 45;
        if(score >= 65){
            System.out.println("Hurray, You passed!");
        } else if (score <= 64 && score >= 55 ) {
            System.out.println("You are almost there.");
        } else if (score < 55 ) {
            System.out.println("Sorry, You did not pass.");
        }

    }
}
