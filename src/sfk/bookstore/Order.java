/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfk.bookstore;

/**
 *
 * @author shahad
 */
import java.util.ArrayList;
public class Order{
    private ArrayList<Books> bookOrder=new ArrayList<Books>();
    private int quantity;
    public static int numOfOrders=0;

    public Order(){

    }

    public Order( ArrayList<Books> newBookOrder, int newQuantity){

    }

  
    public ArrayList<Books> getBookOrder(){
        return bookOrder;
    }
   
    public int getQuantity(){
        return quantity;
    }
    public void setBookOrder(ArrayList<Books> newBookOr){
        bookOrder=newBookOr;
    }
    public void setQuantity(int newQuantity){
        quantity=newQuantity;
    }

    
}