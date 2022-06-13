import java.util.Scanner;
import javax.swing.JOptionPane;

public class Customer {
    public static String customerName;
    public static int contactNumber;
    public static double productPrice;
    public static int numberOfMonths;
    public static double monthlyRepayment;

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName() {
        
        String cust1 = JOptionPane.showInputDialog(null, "Enter the customer Name");
        customerName = cust1;      
    }
    

    public static int getContactNumber() {
        return contactNumber;
    }

    public static void setContactNumber() {
        
        String contact1 = JOptionPane.showInputDialog(null, "Enter the contact number");
        contactNumber = Integer.parseInt(contact1);
    }

    public static double getProductPrice() {
        return productPrice;
    }

    public static void setProductPrice() {
        
        String price1 = JOptionPane.showInputDialog(null,"Enter the price of the product");
        productPrice = Double.parseDouble(price1);
    }

    public static int getNumberOfMonths() {
        return numberOfMonths;
    }

    public static void setNumberOfMonths() {
        
        String month1 = JOptionPane.showInputDialog(null,"Enter the number of repayment months");
        numberOfMonths = Integer.parseInt(month1);
    }

    public double calculate_Repayment() {
        monthlyRepayment = productPrice / numberOfMonths;//first method
        return monthlyRepayment;
    }
}

