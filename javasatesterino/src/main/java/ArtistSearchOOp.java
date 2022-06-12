
public class ArtistSearchOOp {
    public static void main (String [] args){
        
        
        ArtistTable obj = new artistSublcass();
        var newObj = new artistSublcass();
        

            obj.salesSummary();
            int user_input = newObj.UserInput();  
            
            int index = 0;
            
                while (user_input != 0 && user_input <=5 && index < 6)
                {
                
                newObj.salesSummary(user_input);
                user_input = newObj.UserInput();
                if(user_input > 5){
                    System.out.println("Please try again");
                    continue;
                    
                }
                 index++;                          
                }                  
}
}
