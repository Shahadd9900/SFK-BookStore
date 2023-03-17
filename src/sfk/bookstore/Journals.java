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

public class Journals extends Books {
    public static int numOfJournals;

    public Journals(){
        
    }

    public Journals(int bookID,String name,int type,double price,int quantity,boolean availability){
        super(bookID,name,type,price,quantity,availability);
        numOfJournals++;
        }
        @Override
    public String toString(){
        return "Journals information is:"+super.toString();
    }
}
