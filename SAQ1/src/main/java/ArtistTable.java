
public abstract class ArtistTable implements Interface1{ //abstract class
    
    int rowSum;
    int colSum1;
    int colSum2;
    int colSum3;
    
    public ArtistTable(int rowSum, int colSum1,int colSum2, int colSum3) { //abstract class constructor
        this.rowSum = rowSum;
        this.colSum1 = colSum1;
        this.colSum2 = colSum2;
        this.colSum3 = colSum3;
    }
    

        @Override
        public void salesSummary(){//override from interface1
            
            String artistNames[] = new String[5]; { //one dimensional array of artist names
            artistNames[0] = "Master Kg ";
            artistNames[1] = "DJ B Coffee ";
            artistNames[2] = "Bruno Mars ";
            artistNames[3] = "F Fighters ";
            artistNames[4] = "T Swift ";
            }
        
            
            int artistSales[][] = new int[5][3];//multidimensional array of artist sales
        {
                artistSales[0][0] = 900000;               
                artistSales[0][1] = 800000;
                artistSales[0][2] = 500000;

                artistSales[1][0] = 700000;
                artistSales[1][1] = 500000;
                artistSales[1][2] = 500000;

                artistSales[2][0] = 800000;
                artistSales[2][1] = 100000;
                artistSales[2][2] = 50000;

                artistSales[3][0] = 100000;
                artistSales[3][1] = 200000;
                artistSales[3][2] = 200000;

                artistSales[4][0] = 300000;
                artistSales[4][1] = 100000;
                artistSales[4][2] = 50000;
        }
        
        
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %20s %20s %20s ", "Artist Name ", "DVD Sales ", "Blu Ray sales ", "CD Sales ");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {//loop through each array to display each value
            System.out.printf(i  + 1 + ". " +"%14s", artistNames[i]);
                for (int j = 0; j < 3; j++) {

                    System.out.format("%20s", artistSales[i][j]);
                    rowSum = rowSum +artistSales[i][j] + artistSales[i] [j] + artistSales[i][j];
                }

                System.out.println();
                
            }
        
            
            colSum1 = artistSales[0][0] + artistSales[1][0] + artistSales[2][0] + artistSales[3][0] + artistSales[4][0];
            colSum2 = artistSales[0][1] + artistSales[1][1] + artistSales[2][1] + artistSales[3][1] + artistSales[4][1];
            colSum3 = artistSales[0][2] + artistSales[1][2] + artistSales[2][2] + artistSales[3][2] + artistSales[4][2];
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("Total: " + "%30s %20s %18s ", colSum1, colSum2, colSum3 + "\n");
        }
                    
        
}
        
        

    

