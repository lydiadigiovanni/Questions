//Purpose: First round of practice questions for Time & Money Shore
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class One2Practice3 {
    public static void main(String[] args) {
        //Test question one
        One2Practice3 test1 = new One2Practice3();
        String[] question1 = test1.generateQuestionOne();
        System.out.println(question1[0]);
        System.out.println(question1[1]); 
        System.out.println(question1[2]); 
        System.out.println(question1[3]); 
        System.out.println(question1[4]); 
        //Test question two
        One2Practice3 test2 = new One2Practice3();
        String[] question2 = test2.generateQuestionTwo();
        System.out.println(question2[0]);
        System.out.println(question2[1]); 
        System.out.println(question2[2]); 
        System.out.println(question2[3]); 
        System.out.println(question2[4]); 
        
    }

     //Question One: How many cents is a "penny, nickel, dime, quarter"?
     private String[] generateQuestionOne() {
        String[] nameOfCoin = {"penny", "nickel", "dime", "quarter"}; //Array holds name of coins for the question;
        String randomCoin = nameOfCoin[ThreadLocalRandom.current().nextInt(4)]; //Randomly generate one of the coins from the nameOfCoin array
        String[] questionOne = new String[6]; //Array will contain question and possible answers
        int answer; //Will be used to store the number of coins
        questionOne[0] = "How many cents is a " + randomCoin + "?";
        if (randomCoin == nameOfCoin[0]) { //If the coin at question is a penny
            answer = 1;
            questionOne[1] = Integer.toString(answer); //The actual answer
            questionOne[2] = Integer.toString(answer + 1); //Wrong answer 1
            questionOne[3] = Integer.toString(answer + 2); //Wrong answer 2
            questionOne[4] = Integer.toString(answer + 3); //Wrong answer 3
        }
        if (randomCoin == nameOfCoin[1]) { //If the coin at question is a nickel
            answer = 5;
            questionOne[1] = Integer.toString(answer); //The actual answer
            questionOne[2] = Integer.toString(answer - 1); //Wrong answer 1
            questionOne[3] = Integer.toString(answer + 2); //Wrong answer 2
            questionOne[4] = Integer.toString(answer + 1); //Wrong answer 3
        }
        if (randomCoin == nameOfCoin[2]) { //If the coin at question is a dime
            answer = 10;
            questionOne[1] = Integer.toString(answer); //The actual answer
            questionOne[2] = Integer.toString(answer - 1); //Wrong answer 1
            questionOne[3] = Integer.toString(answer - 2); //Wrong answer 2
            questionOne[4] = Integer.toString(answer + 1); //Wrong answer 3
        }
        if (randomCoin == nameOfCoin[3]) { //If the coin at question is a quarter
            answer = 25;
            questionOne[1] = Integer.toString(answer); //The actual answer
            questionOne[2] = Integer.toString(answer - 1); //Wrong answer 1
            questionOne[3] = Integer.toString(answer - 3); //Wrong answer 2
            questionOne[4] = Integer.toString(answer - 2); //Wrong answer 3
        }
        return questionOne;
        
    }
    
  

    //Which clock shows "random time"?
    private String[] generateQuestionTwo() {
        //String array holds the times to be used in the question
        String[] timeInNumbers = {"1:00", "2:00", "2:10", "2:30", "3:50", "4:35", "5:20", "6:00",
        "7:00", "7:30", "8:00", "8:30", "9:30", "10:30", "10:55", "11:00", "11:30", "12:15"}; 
        //String array holds the names of pics to be used in the answers
        String[] clocks = {"One", "Two", "Two Ten", "Two Thirty", "Three Fifty", "Four Thirty Five", "Five Twenty",
        "Six", "Seven", "Seven Thirty", "Eight", "Eight Thirty", "Nine Thirty", "Ten Thirty", "Ten Fifty Five",
        "Eleven", "Eleven Thirty", "Twelve Fiften"};
        /*Add clocks to an array list so we can remove the correct answer later
        So we can place incorrect answers in the questionTwo array*/
        ArrayList<String> clockNames = new ArrayList<String>(); 
        //Add all the contents of clock array to clockNames array list
        clockNames.add(0, clocks[0]);
        clockNames.add(1, clocks[1]);
        clockNames.add(2, clocks[2]);
        clockNames.add(3, clocks[3]);
        clockNames.add(4, clocks[4]);
        clockNames.add(5, clocks[5]);
        clockNames.add(6, clocks[6]);
        clockNames.add(7, clocks[7]);
        clockNames.add(8, clocks[8]);
        clockNames.add(9, clocks[9]);
        clockNames.add(10, clocks[10]);
        clockNames.add(11, clocks[11]);
        clockNames.add(12, clocks[12]);
        clockNames.add(13, clocks[13]);
        clockNames.add(14, clocks[14]);
        clockNames.add(15, clocks[15]);
        clockNames.add(16, clocks[16]);
        clockNames.add(17, clocks[17]);
        //randomtime contains a random time from the timeInNumbers array
        String randomTime = timeInNumbers[ThreadLocalRandom.current().nextInt(19)];
        String answer; //Will be used to hold the correct answer
        String[] questionTwo = new String[6]; //Array will hold question and possible answers
        questionTwo[0] = "Which clock shows " + randomTime + "?";
        if (randomTime == timeInNumbers[0]) { //If the time is 1:00
            answer = clockNames.get(0);  //The answer is One
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(1); //Wrong answer 1
            questionTwo[3] = clockNames.get(2); //Wrong answer 2
            questionTwo[4] = clockNames.get(3); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[1]) { //If the time is 2:00
            answer = clockNames.get(1);  //The answer is Two
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(4); //Wrong answer 1
            questionTwo[3] = clockNames.get(5); //Wrong answer 2
            questionTwo[4] = clockNames.get(6); //Wrong answer 3


        }
        if (randomTime == timeInNumbers[2]) { //If the time is 2:10
            answer = clockNames.get(2);  //The answer is Two Ten
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(7); //Wrong answer 1
            questionTwo[3] = clockNames.get(8); //Wrong answer 2
            questionTwo[4] = clockNames.get(9); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[3]) { //If the time is 2:30
            answer = clockNames.get(3);  //The answer is Two Thirty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(10); //Wrong answer 1
            questionTwo[3] = clockNames.get(11); //Wrong answer 2
            questionTwo[4] = clockNames.get(12); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[4]) { //If the time is 3:50
            answer = clockNames.get(4);  //The answer is Three Fifty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(13); //Wrong answer 1
            questionTwo[3] = clockNames.get(14); //Wrong answer 2
            questionTwo[4] = clockNames.get(15); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[5]) { //If the time is 4:35
            answer = clockNames.get(5);  //The answer is Four Thirty Five
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(16); //Wrong answer 1
            questionTwo[3] = clockNames.get(17); //Wrong answer 2
            questionTwo[4] = clockNames.get(0); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[6]) { //If the time is 5:20
            answer = clockNames.get(6);  //The answer is Five Twenty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(1); //Wrong answer 1
            questionTwo[3] = clockNames.get(4); //Wrong answer 2
            questionTwo[4] = clockNames.get(8); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[7]) { //If the time is 6:00
            answer = clockNames.get(7);  //The answer is Six
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(2); //Wrong answer 1
            questionTwo[3] = clockNames.get(4); //Wrong answer 2
            questionTwo[4] = clockNames.get(6); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[8]) { //If the time is 7:00
            answer = clockNames.get(8);  //The answer is Seven
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(9); //Wrong answer 1
            questionTwo[3] = clockNames.get(11); //Wrong answer 2
            questionTwo[4] = clockNames.get(13); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[9]) { //If the time is 7:30
            answer = clockNames.get(9);  //The answer is Seven Thirty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(15); //Wrong answer 1
            questionTwo[3] = clockNames.get(17); //Wrong answer 2
            questionTwo[4] = clockNames.get(3); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[10]) { //If the time is 8:00
            answer = clockNames.get(10);  //The answer is Eight
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(4); //Wrong answer 1
            questionTwo[3] = clockNames.get(6); //Wrong answer 2
            questionTwo[4] = clockNames.get(8); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[11]) { //If the time is 8:30
            answer = clockNames.get(11);  //The answer is Eight Thirty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(3); //Wrong answer 1
            questionTwo[3] = clockNames.get(9); //Wrong answer 2
            questionTwo[4] = clockNames.get(10); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[12]) { //If the time is 9:30
            answer = clockNames.get(12);  //The answer is Nine Thirty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(16); //Wrong answer 1
            questionTwo[3] = clockNames.get(11); //Wrong answer 2
            questionTwo[4] = clockNames.get(0); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[13]) { //If the time is 10:30
            answer = clockNames.get(13);  //The answer is Ten Thirty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(5); //Wrong answer 1
            questionTwo[3] = clockNames.get(15); //Wrong answer 2
            questionTwo[4] = clockNames.get(14); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[14]) { //If the time is 10:55
            answer = clockNames.get(14);  //The answer is Ten Fifty Five
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(0); //Wrong answer 1
            questionTwo[3] = clockNames.get(12); //Wrong answer 2
            questionTwo[4] = clockNames.get(14); //Wrong answer 3
        }
        if (randomTime == timeInNumbers[15]) { //If the time is 11:00
            answer = clockNames.get(15);  //The answer is Eleven
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(13); //Wrong answer 1
            questionTwo[3] = clockNames.get(3); //Wrong answer 2
            questionTwo[4] = clockNames.get(16); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[16]) { //If the time is 11:30
            answer = clockNames.get(16);  //The answer is Eleven Thirty
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(3); //Wrong answer 1
            questionTwo[3] = clockNames.get(9); //Wrong answer 2
            questionTwo[4] = clockNames.get(15); //Wrong answer 3

        }
        if (randomTime == timeInNumbers[17]) { //If the time is 12:15
            answer = clockNames.get(17);  //The answer is Twelve 15
            questionTwo[1] = answer; //The actual answer
            clockNames.remove(answer); //Remove the answer now
            questionTwo[2] = clockNames.get(5); //Wrong answer 1
            questionTwo[3] = clockNames.get(10); //Wrong answer 2
            questionTwo[4] = clockNames.get(16); //Wrong answer 3

        }

        return questionTwo;
    }
}
