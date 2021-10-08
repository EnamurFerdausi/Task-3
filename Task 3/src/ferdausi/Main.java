/*
Name:Enamur Rabbi Ferdausi
ID:2012020144
Section:C
Email:cse_2012020144@lus.ac.bd
Date:08-08-2021
 */
package ferdausi;

public class Main {

    public static void main(String[] args) {
        Player player=new Player("Shakib",75);
        Cricket cricket= new Cricket("international match",20,player);
        Football foootball=new Football();
        cricket.display();


    }
}
