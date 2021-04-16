/**
*  Main class that will use an imported class StudyGroup.Disemvoler.class
* and use it to drive a java program that will take a trolls post and 
* remove all the vowels and return a new string
* Requires a command line argument for the trolls post
*/
package main;

import disemvoweler.Disemvoweler;

public class Main{
   public static void main(String[] args){
      if(args.length < 1){
         System.out.println("This program requires a command line argument");
      }else{
         for(int i=0;i<args.length;i++){
            System.out.print(Disemvoweler.disemvowel(args[i]));
            if(i+1<args.length){
               System.out.print(" ");
            }else{
               System.out.println();
            }
         }		
      }
   }
}