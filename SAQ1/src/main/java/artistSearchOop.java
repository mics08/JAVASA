import java.util.Scanner;


public class artistSearchOop{
    public static void main (String[] args){
        
        artistSublcass singleArtist = new artistSublcass(0,0,2,2,2);
        
        ArtistTable artistTable = singleArtist;
        artistTable.salesSummary();
        
        Scanner sc = new Scanner(System.in);
        
        int artistPosition = 1;
        int numInvalidAttempts =0;
        
        while( numInvalidAttempts < 6) {

            System.out.println("Please enter a number between 1 - 5 ");

            try{
                artistPosition = sc.nextInt();
                singleArtist.salesSummary(artistPosition);
                System.out.println();

            }
            catch(java.util.InputMismatchException e){
                System.out.println("Please enter a number, not a string");
                break;
            }

            if (artistPosition > 5) {
                numInvalidAttempts++;
            }
        }

        if (numInvalidAttempts > 5)
        {
            System.out.println("6 invalid entries were made\nplease start the program again to retry");
        }
    }

}