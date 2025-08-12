/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestocard;

/**
 *
 * @author tinot
 */
public class Cards {
    private String name;
    private double balance;

    public Cards(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    static public double tap (double balance){
        double newPrice = balance - 2.50;
        return newPrice;
    }
    
    static public double topUp(double funds, double balance){
        double newBalance = balance + funds;
        return newBalance;
    }
}
