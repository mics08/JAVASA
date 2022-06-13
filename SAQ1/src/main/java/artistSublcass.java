
import javax.xml.transform.OutputKeys;


public class artistSublcass extends ArtistTable {//subclass that extends abstract ArtistTable
    
    
    int index;
    
    public artistSublcass(int Index, int rowSum, int colSum1,int colSum2, int colSum3) {
        super(rowSum, colSum1,colSum2,colSum3);//super to access ArtistTable constructor
        this.index = Index;
    }
    
    
     public void salesSummary (int artistPosition){
         
         String[] artistNames = {"Master Kg","DJ B Coffee","Bruno Mars","F Fighters","T Swift"};//recall the artist array names
         int [][] artistSales = new int[5][3];//recall the artist sales 
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
            
         
         switch(artistPosition){//use a switch case to display in accordance to user number input
             case 0: 
                    System.exit(0);
                case 1: 
                    System.out.println("Artist name: " + artistNames[0]);
                    System.out.println("DVD Sale: " + artistSales[0][0]);
                    System.out.println("Blu ray Sale: " + artistSales[0][1]);
                    System.out.println("CD Sale: " + artistSales[0][2]);
                    rowSum = artistSales[0][0]+artistSales[0][1]+ artistSales[0][2];
                    System.out.println("Total: " + rowSum);
                    break;
                    
                    case 2: 
                        System.out.println("Artist name: " + artistNames[1]);
                        System.out.println("DVD Sale: " + artistSales[1][0]);
                        System.out.println("Blu ray Sale: " + artistSales[1][1]);
                        System.out.println("CD Sale: " + artistSales[1][2]);
                        rowSum = artistSales[1][0]+artistSales[1][1]+artistSales[1][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        
                    case 3:
                        System.out.println("Artist name: " + artistNames[2]);
                        System.out.println("DVD Sale: " + artistSales[2][0]);
                        System.out.println("Blu ray Sale: " + artistSales[2][1]);
                        System.out.println("CD Sale: " + artistSales[2][2]);
                        rowSum = artistSales[2][0]+artistSales[2][1]+artistSales[2][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        
                    case 4:
                        System.out.println("Artist name: " + artistNames[3]);
                        System.out.println("DVD Sale: " + artistSales[3][0]);
                        System.out.println("Blu ray Sale: " + artistSales[3][1]);
                        System.out.println("CD Sale: " + artistSales[3][2]);
                        rowSum = artistSales[3][0]+artistSales[3][1]+artistSales[3][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        
                    case 5:
                        System.out.println("Artist name: " + artistNames[4]);
                        System.out.println("DVD Sale: " + artistSales[4][0]);
                        System.out.println("Blu ray Sale: " + artistSales[4][1]);
                        System.out.println("CD Sale: " + artistSales[4][2]);
                        rowSum = artistSales[4][0]+artistSales[4][1]+artistSales[4][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        
                    default:
                       System.out.println("not a valid entry: should be between 1 & 5 only!\nTry again");//if a user enters a wrong value
                       if (Integer.signum(artistPosition) < 0)  {
                           System.out.println("Program is exiting now..");
                           System.exit(0);
                       }
                          
                    break; 
                        
                    }
                
            }
                
     }    
        
    

