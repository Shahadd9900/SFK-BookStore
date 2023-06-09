/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfk.bookstore;

import java.util.ArrayList;
import java.util.Scanner;


public class Books {
//creating attributes
    
    private int bookID;
    private int quantity;
    private int type;
    private double price;        
    private boolean availability;
    protected String name;
    public static int numOfBooks;
     static ArrayList<Magazines> bookList1 = new ArrayList<>(); 
    static ArrayList<Journals> bookList2 = new ArrayList<>(); 
    static ArrayList<Studybooks> bookList3 = new ArrayList<>(); 
     
    //creating constructors
       Books(){
    }
       Books(int bookID, String name,int type,double price,int quantity, boolean availability){
           this.bookID=bookID;
           this.name=name;
           this.type=type;
           this.price=price;
           this.quantity=quantity;
           this.availability=availability;
           numOfBooks++;
        }
    
    //getters and setter
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //methods
    //figuere out how to let user enter book obj name to retrive the information
     

    //To add book according to book type
    public void AddBooks(int type){
        if (type == 1){
            bookList2.add(new Journals());
            System.out.println("A new Journal has been added");}
        if (type == 3){
          bookList1.add(new Magazines());
        System.out.println("A new Magazine has been added");}
        if (type==2 ) {
            bookList3.add(new Studybooks());  
            System.out.println("A new Study book has been added");
         }      
       
       
    }

   
    @Override
    public String toString(){
        return"The details of the book are:\n "+"ID:"+this.bookID+"   "+"Name:"+this.name+"   "+"Type:"+this.type+"   "+"Prise:"+this.price+"   "+"Availability:"+this.availability;
        
    }
   
   public void ViewInfo( ArrayList<Books> allBooks, int type){
       Scanner input=new Scanner(System.in);
       int ch=0;
       while(ch!=-1){
             if(type==1){
            for(int j=0;allBooks.size()>j; j++){
            if(allBooks.get(j).getType()==1){
             System.out.println(allBooks.get(j).toString());
            System.out.println("and the quantity is:"+ allBooks.get(j).getQuantity());}
        }
        }
         if(type==2){
             for(int j=0; allBooks.size()>j; j++){
             if(allBooks.get(j).getType()==2){
             System.out.println(allBooks.get(j).toString());
            System.out.println("and the quantity is:"+ allBooks.get(j).getQuantity());}
        }
         }
         if(type==3){
            for(int j=0; allBooks.size()>j; j++){
            if(allBooks.get(j).getType()==3){
            System.out.println(allBooks.get(j).toString());
            System.out.println("and the quantity is:"+ allBooks.get(j).getQuantity());}
            }
          
        }
    System.out.println("Do you want more information ? if no press -1 if yes press any other number ");
ch=input.nextInt();}
    }
        
   /** public static void main(String[] args) {
        Books b = new Books();
        b.AddBooks(1);
        b.AddBooks(2);
        b.AddBooks(2);
        System.out.println(Books.bookList1.size());
        System.out.println(Books.bookList2.size());
        System.out.println(Books.bookList3.size());
        System.out.println(bookList2);
        Books book1=new Books(1134,"programing",3,40,1,true);
        book1.displayInfo();
        
    }*/
   }

