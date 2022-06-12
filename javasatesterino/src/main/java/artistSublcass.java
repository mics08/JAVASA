
import java.util.Scanner;


public class artistSublcass extends ArtistTable {
    
    public static int UserInput() {
            
            Scanner myObj = new Scanner(System.in);
            
            System.out.println("Please enter a number between 0 and 5");           
            int artistPosition = myObj.nextInt();
            
            return artistPosition;
            }
    
    @Override
    public void salesSummary(){
        super.salesSummary();
    }
    
     public void salesSummary (int artistPosition){
            switch(artistPosition){
                
                
                case 0: 
                    System.exit(0);
                case 1: 
                    System.out.println("Artist name: " + artistNames[0]);
                    System.out.println("DVD Sale: " + sales[0][0]);
                    System.out.println("Blu ray Sale: " + sales[0][1]);
                    System.out.println("CD Sale: " + sales[0][2]);
                    rowSum = sales[0][0]+sales[0][1]+ sales[0][2];
                    System.out.println("Total: " + rowSum);
                    break;
                    //index++; 
                    //continue;
                    case 2: 
                        System.out.println("Artist name: " + artistNames[1]);
                        System.out.println("DVD Sale: " + sales[1][0]);
                        System.out.println("Blu ray Sale: " + sales[1][1]);
                        System.out.println("CD Sale: " + sales[1][2]);
                        rowSum = sales[1][0]+sales[1][1]+sales[1][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        //index++; 
                        //continue;
                    case 3:
                        System.out.println("Artist name: " + artistNames[2]);
                        System.out.println("DVD Sale: " + sales[2][0]);
                        System.out.println("Blu ray Sale: " + sales[2][1]);
                        System.out.println("CD Sale: " + sales[2][2]);
                        rowSum = sales[2][0]+sales[2][1]+sales[2][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        //index++; 
                        //continue;
                    case 4:
                        System.out.println("Artist name: " + artistNames[3]);
                        System.out.println("DVD Sale: " + sales[3][0]);
                        System.out.println("Blu ray Sale: " + sales[3][1]);
                        System.out.println("CD Sale: " + sales[3][2]);
                        rowSum = sales[3][0]+sales[3][1]+sales[3][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        //index++; 
                        //continue;
                    case 5:
                        System.out.println("Artist name: " + artistNames[4]);
                        System.out.println("DVD Sale: " + sales[4][0]);
                        System.out.println("Blu ray Sale: " + sales[4][1]);
                        System.out.println("CD Sale: " + sales[4][2]);
                        rowSum = sales[4][0]+sales[4][1]+sales[4][2];
                        System.out.println("Total: " + rowSum);
                        break;
                        //index++; 
                        //continue;
                    
                        
                    }
            //}
            
                        
            if (artistPosition < 0){
                    System.out.println("You have entered an invalid option");
                    System.exit(0);
                    
                    }                
            }
        }
    

