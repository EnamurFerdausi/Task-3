/*
Name:Enamur Rabbi Ferdausi
ID:2012020144
Section:C
Email:cse_2012020144@lus.ac.bd
Date:08-08-2021
 */
package ferdausi;
public class Cricket extends Sports {
    String matchType;
    int over ;
    Player player;
    Cricket (String matchType, int over, Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;
    }

    void display() {
        System.out.println("match type:" + matchType);
        System.out.println("over of the match:"+over);
        System.out.println("name of a player:" +player.playerName);
        System.out.println("jersey Number of a Player:" + player.jerseyNumber);

    }
}
