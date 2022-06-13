import java.util.Scanner;


public class artistSearchOop{
    public static void main (String[] args){
        
        artistSublcass singleArtist = new artistSublcass(0,0,2,2,2);
        
        ArtistTable artistTable = singleArtist;
        artistTable.salesSummary();
        
        Scanner sc = new Scanner(System.in);
        
        int artistPosition = 1;
        int index =0;
        while(artistPosition > 0 && artistPosition <= 5 && index <6){
            System.out.println("Please enter a number between 1 - 5 ");
            
            try{
                artistPosition = sc.nextInt();
                singleArtist.salesSummary(artistPosition);
                System.out.println();
                index++;
            }
            catch(java.util.InputMismatchException e){
                System.out.println("Please enter a number, not a string");
                break;
            }
        }
    }
}