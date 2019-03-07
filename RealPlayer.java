package guessgame;

import java.util.Scanner;

/**
 *
 * @author miklostoth
 */

public class RealPlayer extends GuessGame {
    
    Scanner sc = new Scanner(System.in);
    int realnumber = 0;
    
    public void realguess(){
        realnumber = (int) + sc.nextInt();
//        System.out.println("Az Ön tippje: " + realnumber);
    }
}
