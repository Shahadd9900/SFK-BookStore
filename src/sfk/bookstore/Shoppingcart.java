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
import java.util.Date;
import java.util.Scanner;
public class Shoppingcart {
    private Books[] order=new Books[numOfOrders];
    private Order finalOrder=new Order();
    private int paymentMethod;
    private boolean ifStudent;
    private boolean deliverReq;
    private int deliverPin;
    private Date date=new Date();
    private double distance=0;
    private double totalPrice;
    static int numOfOrders=0;
    
    Scanner input=new Scanner(System.in);
//constructors 
    public Shoppingcart(){

    }

    public Shoppingcart(Customer newCus,Books[] newOr,int newPayM,boolean newIfStu,boolean newDelR,int newDelPin,double newTotalPrice){

    }
//getters

public Books[] getOrder(){
    return order;}
    public Books getOrderObj(int x){
        return order[x];
    }
    public Order getFinalOrder(){
        return finalOrder;
    }
    public int getPaymentMethod(){
        return paymentMethod;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public boolean getIfStudent(){
        return ifStudent;
    }
    public boolean getDeliverReq(){
        return deliverReq;
    }
    public int getDeliveryPin(){
        return deliverPin;
    }
    public double getDistance(){
        return distance;
    }
//setters

public void setOrder(Books[] newOrder){
    order=newOrder;

}
public void setOrderObj(Books newOrderObj,int x){
    order[x]=newOrderObj;
}
public void setFinalOrder(Order newFinalOrder){
    finalOrder=newFinalOrder;
}
    public void setPaymentMethod(int newPaymentMothed){
        paymentMethod=newPaymentMothed;
    }
    public void setTotalPrice(double newTotal){
        totalPrice=newTotal;
    }
    public void setIfStudent(boolean newIfStu){
        ifStudent=newIfStu;
    }
    public void setDeliverReq(boolean newDeliverReq){
        deliverReq=newDeliverReq;
    }
    public void setDeliveryPin(int newDeliveryPin){
        deliverPin=newDeliveryPin;
    }
    public void setDistance(double distance){
        this.distance=distance;
    }
//methods 
    public void AddBook(int ch,Account cus, Books book){
        if(cus instanceof Customer){
           
        while(ch==1){
            System.out.print("Enter the book ID for the book you want to add:");
         int bookid=input.nextInt();
            Books[] newOrder=new Books[cus.getCart().order.length+1];
            if(book.getBookID()==bookid&&book.isAvailable()==true){
            for(int i=0; i<order.length;i++){
                    newOrder[i]=cus.getCart().order[i];
                }
             newOrder[order.length]=book;
             cus.getCart().setOrder(newOrder);
             
             book.setQuantity(book.getQuantity()-1);
            if(book instanceof Journals)
            Journals.numOfJournals--;
            if(book instanceof Studybooks)
            Studybooks.numOfStudybooks--;
            if(book instanceof Magazines)
            Magazines.numOfMagazines--;
            if(book.getQuantity()==0)
                book.setAvailable(false);
            System.out.println("Book Added"); 
            System.out.println("You need to place order after this if your are done .. :)");
            }
            else
            System.out.println("sorry book is out of stock");
            
        
        System.out.println("if you want to add the same book type press 1 if you want out press any number");
        ch=input.nextInt(); 
    }
}
else 
System.out.println("This feature is only for customers ");
    }
    
    public void PlaceOrder(Account cus,Books [] booksOrder, Distributor d1){
        if(cus instanceof Customer){
           
        System.out.println("Enter 1 for cash 2 for credit");
        paymentMethod=input.nextInt();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Are you a Student? if yes press 1 if no press 0");
        int answer=input.nextInt();
        if(answer==1){
            ifStudent=true;
            System.out.println("Congrats you have a discount");
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Do you want your order delivred? choose 1 for yes and 0 for no");
        int answr=input.nextInt();
        if(answr==1){
            deliverReq=true;
        }
        else
        deliverReq=false;
        if(deliverReq==true){
            deliverPin=(int)(Math.random()*50);
            distance=(int)(Math.random()*(60-10)+10);
        }
        
        double sum=0.0;
        for(int i=0; i<booksOrder.length; i++){
            sum=sum+(booksOrder[i].getPrice());
            totalPrice=sum;
        }
        if(cus.getCart().getIfStudent()==true){
               totalPrice=(totalPrice*30)/100;
        }
        if(cus.getCart().deliverReq==true){
            totalPrice=totalPrice+(d1.deliveryfee);
        }
        for(int i=0; i<booksOrder.length; i++){
        finalOrder.getBookOrder().add(booksOrder[i]);
        Order.numOfOrders++;}
        cus.setCart(paymentMethod, ifStudent, deliverReq, deliverPin, totalPrice);
        }
        else 
System.out.println("This feature is only for customers ");
    }

    public void cancelOrder(Account cus){
        if(cus instanceof Customer){
        System.out.println("Do you want to cancel your order ? ");
        System.out.println("if yes type 1 if no type 0 ");
        int answer=input.nextInt();
        if(answer==1){
            cus.getCart().order=null;
            System.out.println("Order is cancelled");
            Order.numOfOrders--;
        }
        else
        System.out.println("Order is NOT cancelled");
    }
    else 
System.out.println("This feature is only for customers ");
    }

    public void showBill(Account cus){
        if(cus instanceof Customer){
        do{
        System.out.println("Order Details:");
        if(cus.getCart().getOrder()==null){
        System.out.println("Your order is cancalled!");
        break;
        }
        if(cus.getCart().getOrder().length==0){
            System.out.println("Your cart is empty!");
            break;
        }
            if(cus.getCart().getOrder().length!=0)
            System.out.println("Date Of Order:"+date.toString());
            for(int i=0; i<cus.getCart().getOrder().length; i++){
            System.out.println("Book ID["+(i+1)+"]: "+cus.getCart().getOrderObj(i).getBookID());
            System.out.println("*****************************");
        } 
        System.out.println("Quantity Bought:"+cus.getCart().getOrder().length);
        System.out.println("*****************************");
        cus.displayCart(cus);
        System.out.println("*****************************");
        
        break;

    } while(false); 
}
else 
System.out.println("This feature is only for customers ");
}

}
