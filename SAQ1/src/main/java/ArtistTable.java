import java.util.ArrayList;
import java.util.List;


abstract class ArtistTable implements Interface1 {
    int rowSum ;
    int colSum;
    int colSum2;
    int colSum3;
    int artistSales[][] = new int[6][4];
    String artistNames[] = new String[6];
    
    public ArtistTable(int rowSum,int cSum, int cSum2,int cSum3){
        this.rowSum = rowSum;
        colSum = cSum;
        colSum2 = cSum2;
        colSum3 = cSum3;
    }
    
    //@Override 
    public void salesSummary(){
        
        

        this.artistSales[1][0] = 900000;
        this.artistSales[1][1] = 800000;
        this.artistSales[1][2] = 500000;

        this.artistSales[2][0] = 700000;
        this.artistSales[2][1] = 500000;
        this.artistSales[2][2] = 500000;

        this.artistSales[3][0] = 800000;
        this.artistSales[3][1] = 100000;
        this.artistSales[3][2] = 50000;

        this.artistSales[4][0] = 100000;
        this.artistSales[4][1] = 200000;
        this.artistSales[4][2] = 200000;

        this.artistSales[5][0] = 300000;
        this.artistSales[5][1] = 100000;
        this.artistSales[5][2] = 50000;

        
        this.artistNames[1] = "Master Kg ";
        this.artistNames[2] = "DJ B Coffee ";
        this.artistNames[3] = "Bruno Mars ";
        this.artistNames[4] = "F Fighters ";
        this.artistNames[5] = "T Swift ";

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %20s %20s %20s ", "Artist Name ", "DVD Sales ", "Blu Ray sales ", "CD Sales ");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");

        for (int i = 1; i < 6; i++) {
            System.out.printf(i  + ". " +"%14s", artistNames[i]);
                for (int j = 1; j < 4; j++) {

                    System.out.format("%20s", artistSales[i][j]);
                }

                System.out.println();
                //System.out.println("---------------------------------------------------------------------------------------------");
            }
            colSum = artistSales[0][0] + artistSales[1][0] + artistSales[2][0] + artistSales[3][0] + artistSales[4][0];
            colSum2 = artistSales[0][1] + artistSales[1][1] + artistSales[2][1] + artistSales[3][1] + artistSales[4][1];
            colSum3 = artistSales[0][2] + artistSales[1][2] + artistSales[2][2] + artistSales[3][2] + artistSales[4][2];
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("Total: " + "%30s %20s %18s ", colSum, colSum2, colSum3);
    }
}
        
