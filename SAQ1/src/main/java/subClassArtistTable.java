import java.util.*;
import java.lang.*;

class subClassArtistTable extends ArtistTable {
    
    int index;
    //public String[] artistNames;
    //public int[][] artistSales;
     
   private subClassArtistTable(int ind1,int rowSum,int colSum,int colSum2, int colSum3){
       super(rowSum, colSum,colSum2,colSum3);
        index = ind1;
        rowSum = rowSum;
        colSum = colSum;
        
        
    }

    //subClassArtistTable() {
     //   throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    
    
    @Override
    public void salesSummary(){
    }
    
    public void salesSummary(int artistPosition){
        index = 0;       
        while (index < 6) {
            switch(artistPosition){
                case 0: 
                    System.exit(0);
                case 1: 
                    System.out.println("Artist name: " + this.artistNames[1]);
                    System.out.println("DVD Sale: " + this.artistSales[1][0]);
                    System.out.println("Blu ray Sale: " + this.artistSales[1][1]);
                    System.out.println("CD Sale: " + this.artistSales[1][2]);
                    rowSum = this.artistSales[1][0]+this.artistSales[1][1]+this.artistSales[1][2];
                    System.out.println("Total: " + rowSum);
                    index++; 
                    continue;
                    case 2: 
                        System.out.println("Artist name: " + artistNames[2]);
                        System.out.println("DVD Sale: " + artistSales[2][0]);
                        System.out.println("Blu ray Sale: " + artistSales[2][1]);
                        System.out.println("CD Sale: " + artistSales[2][2]);
                        rowSum = artistSales[2][0]+artistSales[2][1]+artistSales[2][2];
                        System.out.println("Total: " + rowSum);
                        index++; 
                        continue;
                    case 3:
                        System.out.println("Artist name: " + artistNames[3]);
                        System.out.println("DVD Sale: " + artistSales[3][0]);
                        System.out.println("Blu ray Sale: " + artistSales[3][1]);
                        System.out.println("CD Sale: " + artistSales[3][2]);
                        rowSum = artistSales[3][0]+artistSales[3][1]+artistSales[3][2];
                        System.out.println("Total: " + rowSum);
                        index++; 
                        continue;
                    case 4:
                        System.out.println("Artist name: " + artistNames[4]);
                        System.out.println("DVD Sale: " + artistSales[4][0]);
                        System.out.println("Blu ray Sale: " + artistSales[4][1]);
                        System.out.println("CD Sale: " + artistSales[4][2]);
                        rowSum = artistSales[4][0]+artistSales[4][1]+artistSales[4][2];
                        System.out.println("Total: " + rowSum);
                        index++; 
                        continue;
                    case 5:
                        System.out.println("Artist name: " + artistNames[5]);
                        System.out.println("DVD Sale: " + artistSales[5][0]);
                        System.out.println("Blu ray Sale: " + artistSales[5][1]);
                        System.out.println("CD Sale: " + artistSales[5][2]);
                        rowSum = artistSales[5][0]+artistSales[5][1]+artistSales[5][2];
                        System.out.println("Total: " + rowSum);
                        index++; 
                        continue;
            }
                        
                if (artistPosition > 5){
                    System.out.print("Please enter a number between 1 and 5");
                    continue;
                    }
                else if (artistPosition < 0){
                    System.out.println("You have entered an invalid option");
                    System.exit(0);
                }
            }
        }
    }

                    
