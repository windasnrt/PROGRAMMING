/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package team07.tugaskelompok3;

/**
 * TUGAS KELOMPOK KE-3
 * TEAM 07
 * @author WINDA LORENZA SINURAT
 */

import java.util.Arrays;
import java.util.Scanner;
public class TugasKelompok3 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(""
                +"Coepoe Word Puzzle"+"\n"
                +"=================="+"\n"
                +""+"\n"+"Rules : "+"\n"
                +"1. Create a word using given characters, min 3characters & max 6 characters."+"\n"
                +"2. Each level, You have 10 chances to answer correctly."+"\n"
                +"3. To get through to next level, you have to score 70points each level."+"\n"
                +"\n"
                +"Press Enter to START!");
        scan.nextLine();
        System.out.println(""
                +"Level 1"+"\n"
                +"-------"+"\n"
                +"d     e     t     t     l     i"+"\n");
        String[] level1={"","die","led","lei","let","lid","lie","lit","tie","deli","diet","\n",
                    "edit","idle","lied","tide","tied","tile","tilt","tilde","tiled","title","\n",
                    "tilted","titled"};
        int score1= 0;
        int guesscount= 0;
        String guess="";
        boolean outofguesses = false;
        while(!outofguesses && guesscount<10) {
            guesscount++;
        System.out.print(guesscount+"> Your Answer: ");
        guess=scan.nextLine();
        if(guesscount<=10) {
            if(guess.length()>=3 && guess.length()<=6) {
                for(int i= 0; i<= level1.length - 1;i++) {
                    boolean condition=level1[i].equals(guess);
                if(condition == true) 
                {
                    score1+=10;
                    System.out.println("#Right. Score : " + score1);
                }
            }
        }else{
                guesscount--;
            }
    }else{
            outofguesses = true;
        }
    }
        System.out.println(score1);
        winlose(score1);
        System.out.println("");
        answerlist(level1);
        String[] level2 ={
        "", "ace", "can", "sac", "sea", "sec", "see", "aces", "acne", "cane", "cans", "\n",
            "case", "ease", "sane", "scan","seen","acnes","canes","cease","cense","scene", "\n",
            "encase", "seance"
        };
        int score2 = 0;
        guesscount = 0;
        guess ="";
        outofguesses = false;
        while (!outofguesses && guesscount <10){
            guesscount++;
            System.out.print(guesscount + "> Your Answer: ");
            
            guess = scan.nextLine();
            if(guesscount <=10){
                if(guess.length()>=3 && guess.length() <=6){
                    for(int i = 0; i <= level2.length - 1; i++){
                
                    boolean condition = level2[i].equals(guess);
                    if(condition == true){
                        score2+=10;
                        System.out.println("#Right. Score : "+ score2);
                    }
                }
                }else{
                    guesscount--;
                     }
            }else{
                outofguesses = true;
            }
        }
        winlose(score2);
        System.out.println("");
        answerlist(level2);
        
        System.out.println(""
            + "Level 3"+ "\n"
            + "--------"+ "\n"
            + "     h     k     r     n     e     o" + "\n");
        String[] level3 = {"", "eon", "hen", "her", "hoe", "hon", "ken", "nor", "one", "ore", "rho", "\n",
                        "roe", "hero", "hoer", "hone", "honk", "horn", "kern", "oner", "heron", "honer", "\n",
                        "honker",};
        int score3 = 0;
        guesscount = 0;
        guess = "";
        outofguesses =  false;
        
        while(!outofguesses && guesscount < 10){
            guesscount++;
            System.out.print(guesscount+ ">Your Answer: ");
            guess = scan.nextLine();
            if(guesscount <=10){
                if (guess.length() >=3 && guess.length()<=6){
                    for(int i=0; i <= level3.length-1; i++){ 
                    boolean condition = level3[i].equals(guess);
                    if(condition == true){
                        score3+=10;
                        System.out.println("#Right. Score : "+ score3);
                    }
                }
            }else{
                    guesscount--;
                }
        }else{
                outofguesses = true;
            }
            winlose(score3);
            System.out.println("");
            answerlist(level3);
            int overall = score1+score2+score3;
            System.out.println("Overall Score : " + overall + "\n You win!! \n Press Enter to Exit");
            scan.nextLine();
            }
    }
        
        public static void winlose (int score){
            if (score >= 70){
                System.out.println("|n Your had answered 10 times with " + score/10+ "right answers..");
            }else{
                System.out.println("\n You Lose!! Try Again..\n Do you want to retry [y/t]");
            }
        }
        public static void answerlist (String list[] ){
            System.out.println("Correct Answers: ");
            String answer = Arrays.toString(list);
                    .replace(", ","     " replacement)
                    .replace("[", "\n")
                    .replace("]", "");
                    
                    System.out.println(answer);
        }            
            
}
