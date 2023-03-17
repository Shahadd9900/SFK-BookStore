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


public class Studybooks extends Books {
    public static int numOfStudybooks;

    public Studybooks() {
        super();
    }
    public Studybooks(int bookID,String name,int type,double price,int quantity,boolean availability){
    super(bookID,name,type,price,quantity,availability);
    numOfStudybooks++;
}
    @Override
    public String toString(){
        return "Study book information is:"+super.toString();
    }
}
