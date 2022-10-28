/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package team07.tugaskelompok3;

/**
 * TUGAS KELOMPOK KE-3
 * TEAM 07
 * @author Winda Sinurat, Faud, Dhea, Deka, Resti
 */

import java.util.Arrays;
import java.util.Scanner;
public class TugasKelompok3 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        boolean next = true;
		  int score1=0;
		  int score2=0;
		  int score3=0;
		  int ovrScore=0;
		  
		  Scanner input = new java.util.Scanner(System.in);
		  
		  
		  label:
		  while(next) {
			  System.out.println(""
		                +"Coepoe Word Puzzle"+"\n"
		                +"=================="+"\n"
		                +""+"\n"+"Rules : "+"\n"
		                +"1. Create a word using given characters, min 3characters & max 6 characters."+"\n"
		                +"2. Each level, You have 10 chances to answer correctly."+"\n"
		                +"3. To get through to next level, you have to score 70points each level."+"\n"
		                +"\n"
		                +"Press Enter to START!");
			  
			  //get enter
			  input.nextLine();
			  
			  score1=0;
			  score1 = level1(score1);
			  
			  // level
			  if(score1 >= 70) {
				  score2 = 0;
				  score2 = level2(score2);
			  }
			  
			  //level 2
			  if(score2 >= 70) {
				  score3 = 0;
				  score3 = level3(score3);
			  }
			  
			  
			  if((score1 < 70) || (score2 < 70) || (score3 < 70)) {
				  System.out.println("You Lose!! Try Again..");
				  
				  System.out.print ("\n Anda mau ulang [y/t] : ");
			      String check = input.nextLine();
			      
			      if (check.equalsIgnoreCase ("Y"))
						next = true;
					else if (check.equalsIgnoreCase ("T"))
						next = false;
					else {
						System.out.print ("Input yang diberikan salah !\n");
						continue label;
					}
			  } else {
				  ovrScore=0;
				  ovrScore = score1+score2+score3;
				  System.out.print ("Overall score : " + ovrScore + "\n");
				  System.out.print ("You Win !\n");
				  System.out.print ("Press Enter to Exit!");
				  //get enter
				  input.nextLine();
				  
				  next = false;
			  }		      
		  }
	  }
	  
	  public static int level1(int score) {
		  //init KJ
		  String[] level={"","die","led","lei","let","lid","lie","lit","tie","deli","diet","\n",
                  "edit","idle","lied","tide","tied","tile","tilt","tilde","tiled","title","\n",
                  "tilted","titled"};
		  String[] checker = new String[10];
		  int x=0;
		  int answer;
		  
		  System.out.println(""
	                +"Level 1"+"\n"
	                +"-------"+"\n"
	                +"d     e     t     t     l     i"+"\n");
		  
		  Scanner scan = new java.util.Scanner(System.in);
		  
		  String guess="";
		  
		  for(int i= 1; i<=10;i++) {
			  System.out.print(i+"> Your Answer: ");
			  guess=scan.nextLine();
			  //check strLength
			  if(guess.length()>=3 && guess.length()<=6) {
				  for(int j= 0; j<= level.length - 1;j++) {
					  if(guess.equals(level[j])) {						  
						  for(int k= 0; k<= checker.length - 1;k++) {
							  if(guess.equals(checker[k])) {
								  System.out.println("You had already type this word before..");
								  k=checker.length;
							  } else if(k==checker.length-1) {
								  score+=10;
								  System.out.println("#Right. Score : " + score);
								  checker[x] = guess;
								  k=checker.length;
								  x++;
							  }
						  }
					  }
				  }
			  } else System.out.println("Answer either too short or too long");
		  }
		  answer = score / 10;
		  System.out.println("You had answer 10 times with " + answer + " right answers..");
		  
		  return score;
		  
	  }
	  
	  public static int level2(int score) {
		  //init KJ
		  String[] level={"", "ace", "can", "sac", "sea", "sec", "see", "aces", "acne", "cane", "cans", "\n",
		            "case", "ease", "sane", "scan","seen","acnes","canes","cease","cense","scene", "\n",
		            "encase", "seance"};
		  String[] checker = new String[10];
		  int x=0;
		  int answer;
		  
		  System.out.println("\n\n"
	                +"Level 2"+"\n"
	                +"-------"+"\n"
	                +"s     e     c     a     e     n"+"\n");
		  
		  Scanner scan = new java.util.Scanner(System.in);
		  
		  String guess="";
		  
		  for(int i= 1; i<=10;i++) {
			  System.out.print(i+"> Your Answer: ");
			  guess=scan.nextLine();
			  //check strLength
			  if(guess.length()>=3 && guess.length()<=6) {
				  for(int j= 0; j<= level.length - 1;j++) {
					  if(guess.equals(level[j])) {						  
						  for(int k= 0; k<= checker.length - 1;k++) {
							  if(guess.equals(checker[k])) {
								  System.out.println("You had already type this word before..");
								  k=checker.length;
							  } else if(k==checker.length-1) {
								  score+=10;
								  System.out.println("#Right. Score : " + score);
								  checker[x] = guess;
								  k=checker.length;
								  x++;
							  }
						  }
					  }
				  }
			  } else System.out.println("Answer either too short or too long");
		  }
		  answer = score / 10;
		  System.out.println("You had answer 10 times with " + answer + " right answers..");
		  
		  return score; 
	  }
	  
	  public static int level3(int score) {
		  //init KJ
		  String[] level={"", "eon", "hen", "her", "hoe", "hon", "ken", "nor", "one", "ore", "rho", "\n",
                  "roe", "hero", "hoer", "hone", "honk", "horn", "kern", "oner", "heron", "honer", "\n",
                  "honker"};
		  String[] checker = new String[10];
		  int x=0;
		  int answer;
		  
		  System.out.println("\n\n"
	                +"Level 3"+"\n"
	                +"-------"+"\n"
	                +"h     k     r     n     e     o"+"\n");
		  
		  Scanner scan = new java.util.Scanner(System.in);
		  
		  String guess="";
		  
		  for(int i= 1; i<=10;i++) {
			  System.out.print(i+"> Your Answer: ");
			  guess=scan.nextLine();
			  //check strLength
			  if(guess.length()>=3 && guess.length()<=6) {
				  for(int j= 0; j<= level.length - 1;j++) {
					  if(guess.equals(level[j])) {						  
						  for(int k= 0; k<= checker.length - 1;k++) {
							  if(guess.equals(checker[k])) {
								  System.out.println("You had already type this word before..");
								  k=checker.length;
							  } else if(k==checker.length-1) {
								  score+=10;
								  System.out.println("#Right. Score : " + score);
								  checker[x] = guess;
								  k=checker.length;
								  x++;
							  }
						  }
					  }
				  }
			  } else System.out.println("Answer either too short or too long");
		  }
		  answer = score / 10;
		  System.out.println("You had answer 10 times with " + answer + " right answers..");
		  
		  return score; 
	  }
}