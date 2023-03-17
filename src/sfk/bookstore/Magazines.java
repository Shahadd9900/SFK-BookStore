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


public class Magazines extends Books{
public static int numOfMagazines;
    public Magazines() {
    }
    public Magazines(int bookID,String name,int type,double price,int quantity,boolean availability){
    super(bookID,name,type,price,quantity,availability);
    numOfMagazines++;
    }
@Override
    public String toString(){
        return "Magazines information is:"+super.toString();
    }
}
