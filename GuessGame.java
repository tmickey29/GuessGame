/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

public class GuessGame extends GuessGameLauncher {
    Player p1;
    Player p2;
    Player p3;
    RealPlayer p4;
    
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        p4 = new RealPlayer();
        
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        int realnumber = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        boolean p4isRight = false;
        
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Gondolok egy számra egy és tíz között..");
        
        while(true){
//            System.out.println("A szám amire gondoltam: " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            p4.realguess();
            
            guessp1 = p1.number;
            System.out.println("Az első játékos tippje: " + guessp1);
            
            guessp2 = p2.number;
            System.out.println("A második játékos tippje: " +guessp2);
            
            guessp3 = p3.number;
            System.out.println("A harmadik játékos tippje: " +guessp3);
            
            realnumber = p4.realnumber;
            System.out.println("Az Ön tippje: " +realnumber);
            
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            
            if (realnumber == targetNumber) {
                p4isRight = true;
            }
            
            if (p1isRight || p2isRight || p3isRight || p4isRight) {
                System.out.println("Megvan a győztesünk!");
                System.out.println("Az első játékos tippelt jól? " + p1isRight);
                System.out.println("A második játékos tippelt jól? " + p2isRight);
                System.out.println("A harmadik játékos tippelt jól? " + p3isRight);
                System.out.println("Az Ön tippje volt helyes? " + p4isRight);
                System.out.println("A játék véget ért.");
                break;    
            }
            
            else{
                System.out.println("Nem volt helyes tipp, ezért a játék folytatódik.");
                System.out.println("");
            }
            
        }
        
        
    }
}
