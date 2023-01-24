package com.programming.quizapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.logic();


    }
}

class Quiz{

    Scanner sc = new Scanner(System.in);

    int correctAnsCount=0;
    int wrongAnsCount=0;

   public void logic(){
       Questions q1 = new Questions("Which statement is true about Java","A. Java is a sequence-dependent programming language","B. Java is a code dependent programming language","C. Java is platform-dependent programming language","D. Java is a platform-independent programming language","E. ");
       Questions q2 = new Questions("What is the extension of java code files?","A. Java is a sequence-dependent programming language","B. .js","C. .txt","D. .java","E. .css");
       Questions q3 = new Questions("Which of these cannot be used for a variable name in java?","A. identifier & keyword","B. identifier" ,"C. Keyword","D.none of the mentioned","E. ");
       Questions q4 = new Questions("Which one of the following is not a java feature","A. Object Oriented ","B. Use of Pointers","C. Portable","D. Dynamic and extensible","E. ");
       Questions q5 = new Questions("Who invented java programming","A. Guido van Rossum","B. James Gosling","C. Dennis Ritchie","D. Bjarne Stroustrup","E. ");
       Questions q6 = new Questions("Which statement is true about java","A. Java is a sequence-dependent programming language","B. Java is a code dependent programming language","C. Java is a platform-dependant programming language","D. Java is a platform-dependent programming language","E. ");

       Map<Questions,Character> hmap = new HashMap<>();
       hmap.put(q1,'D');
       hmap.put(q2,'D');
       hmap.put(q3,'B');
       hmap.put(q4,'B');
       hmap.put(q5,'C');
       hmap.put(q6,'C');

       for (Map.Entry<Questions,Character> map: hmap.entrySet()){
           System.out.println(map.getKey().getQuestion());
           System.out.println(map.getKey().getOption1());
           System.out.println(map.getKey().getOption2());
           System.out.println(map.getKey().getOption3());
           System.out.println(map.getKey().getOption4());

           System.out.println("Enter your Answer: ");
           char ans = sc.next().charAt(0);

           int cans=Character.compare(ans,map.getValue());

           if (cans==0){
               System.out.println("Correct");
               correctAnsCount++;
           }else {
               System.out.println("Wrong");
               wrongAnsCount++;
           }


       }

       System.out.println();
       System.out.println("=======Results=========");
       System.out.println("Total Questions: "+hmap.size());
       System.out.println("you got "+correctAnsCount+" correct");
       System.out.println("and "+wrongAnsCount+" answers wrong");
       System.out.println("Your score Percentage is: "+(correctAnsCount*100)/hmap.size()+"%");
   }
}
