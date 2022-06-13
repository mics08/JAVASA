import javax.swing.JOptionPane;

public class CustomerFinance{
    public static void main(String[] args) {       
        Customer someClass = new Customer();//main class calls customer class object
        FinancePeriod financePeriod = new FinancePeriod();//main class calls finance period class object
        
        try{//use a try for exception handling
        someClass.setCustomerName();//call the set methods declared in the customer class
        Customer.setContactNumber();
        Customer.setProductPrice();
        Customer.setNumberOfMonths();
        JOptionPane.showMessageDialog
        (null,"class one" + "\n" + 
        "Customer Name: "+Customer.getCustomerName() + "\n" +
        "Customer Contact: " + Customer.getContactNumber() + "\n" + 
        "Product Amount: R" + Customer.getProductPrice() + "\n"  +  
        "Repayment months: " + Customer.getNumberOfMonths() + "\n" +
        "Monthly repayment: R"  + someClass.calculate_Repayment() + "\n"  +
        "Total Due: R" + (Customer.getProductPrice() + someClass.calculate_Repayment()));//use the method declared in the customer class
       

        FinancePeriod.setCustomerName();//call the set methods declared in the customer class
        FinancePeriod.setContactNumber();
        FinancePeriod.setProductPrice();
        FinancePeriod.setNumberOfMonths();
        JOptionPane.showMessageDialog
        (null,"class two" + "\n" +
        "Customer Name: "+FinancePeriod.getCustomerName() + "\n" +
        "Customer Contact: " + FinancePeriod.getContactNumber() + "\n" + 
        "Product Amount: R" + FinancePeriod.getProductPrice() + "\n"  +  
        "Repayment months: " + FinancePeriod.getNumberOfMonths() + "\n" +
        "Monthly repayment: R"  + financePeriod.calculate_Repayment() + "\n"  +
        "Total Due: R" + (FinancePeriod.getNumberOfMonths() * financePeriod.calculate_Repayment()));//use the method declared in the finance period class
        }
            
        catch(java.lang.NumberFormatException e) {//in case user enters wrong input
            JOptionPane.showMessageDialog(null, "You have entered an inccorect input");   
            
        }             
    }
}