
public abstract class ArtistTable implements Interface1{
    
    int colSum1 = 0, colSum2 = 0, colSum3 = 0, rowSum = 0;
        String artistNames[] = new String[5]; {
            artistNames[0] = "Master Kg ";
            artistNames[1] = "DJ B Coffee ";
            artistNames[2] = "Bruno Mars ";
            artistNames[3] = "F Fighters ";
            artistNames[4] = "T Swift ";
}
        int sales[][] = new int[5][3];
        {
                sales[0][0] = 900000;               
                sales[0][1] = 800000;
                sales[0][2] = 500000;

                sales[1][0] = 700000;
                sales[1][1] = 500000;
                sales[1][2] = 500000;

                sales[2][0] = 800000;
                sales[2][1] = 100000;
                sales[2][2] = 50000;

                sales[3][0] = 100000;
                sales[3][1] = 200000;
                sales[3][2] = 200000;

                sales[4][0] = 300000;
                sales[4][1] = 100000;
                sales[4][2] = 50000;
        }
        
        
        public void salesSummary(){
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %20s %20s %20s ", "Artist Name ", "DVD Sales ", "Blu Ray sales ", "CD Sales ");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf(i  + 1 + ". " +"%14s", artistNames[i]);
                for (int j = 0; j < 3; j++) {

                    System.out.format("%20s", sales[i][j]);
                    rowSum = rowSum +sales[i][j] + sales[i] [j] + sales[i][j];
                }

                System.out.println();
                //System.out.println("---------------------------------------------------------------------------------------------");
            }
        
            
            colSum1 = sales[0][0] + sales[1][0] + sales[2][0] + sales[3][0] + sales[4][0];
            colSum2 = sales[0][1] + sales[1][1] + sales[2][1] + sales[3][1] + sales[4][1];
            colSum3 = sales[0][2] + sales[1][2] + sales[2][2] + sales[3][2] + sales[4][2];
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("Total: " + "%30s %20s %18s ", colSum1, colSum2, colSum3 + "\n");
        }
                    
        
}
        
        

    

