import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

//Purpose: Second round of practice questions for Time & Money Shore
public class One2Practice4 extends Assessment {

    @Override
    public String[][] generateMultipleChoiceQuestion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[][] generateTrueFalseQuestion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[][] generateUserInputQuestion() {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main (String[] args) {
                //Test question one
                One2Practice4 test1 = new One2Practice4();
                String[] question1 = test1.generateQuestionOne();
                System.out.println(question1[0]);
                System.out.println(question1[1]); 
                System.out.println(question1[2]); 
                System.out.println(question1[3]); 
                System.out.println(question1[4]); 
                //Test question two
                One2Practice4 test2 = new One2Practice4();
                String[] question2 = test2.generateQuestionTwo();
                System.out.println(question2[0]);
                System.out.println(question2[1]); 
                System.out.println(question2[2]); 
                System.out.println(question2[3]); 
                System.out.println(question2[4]);
    }

     //Question One: How many "pennys, nickels, dimes, quarters" make up a dollar?
     private String[] generateQuestionOne() {
        String[] nameOfCoin = {"pennies", "nickels", "dimes", "quarters"}; //Array of types of coins
        String randomCoin = nameOfCoin[ThreadLocalRandom.current().nextInt(5)]; //Randomly generate one of the coins from the nameOfCoin array
        String[] questionOne = new String[6]; //Array will contain question and possible answers
        int answer; //Will be used to store the number of coins
        questionOne[0] = "How many " + randomCoin + " make up a dollar?"; //Actual question
        
        //Check which coin they got
        if (randomCoin == nameOfCoin[0]) { //If it is pennies
            answer = 100; //Takes 100 pennies to make a dollar
            questionOne[1] = Integer.toString(answer); //Actual answer
            questionOne[2] = Integer.toString(answer + 2); //First wrong answer
            questionOne[3] = Integer.toString(answer + 1); //Second wrong answer
            questionOne[4] = Integer.toString(answer - 1); //3rd wrong answer
        }

        if (randomCoin == nameOfCoin[1]) { //If it is nickels
            answer = 20; //Takes 20 nickels to make a dollar
            questionOne[1] = Integer.toString(answer); //Actual answer
            questionOne[2] = Integer.toString(answer + 2); //First wrong answer
            questionOne[3] = Integer.toString(answer + 1); //Second wrong answer
            questionOne[4] = Integer.toString(answer - 1); //3rd wrong answer
        }

        if (randomCoin == nameOfCoin[2]) { //If it is dimes
            answer = 10; //Takes 10 dimes to make a dollar
            questionOne[1] = Integer.toString(answer); //Actual answer
            questionOne[2] = Integer.toString(answer + 2); //First wrong answer
            questionOne[3] = Integer.toString(answer + 1); //Second wrong answer
            questionOne[4] = Integer.toString(answer - 1); //3rd wrong answer
        }

        if (randomCoin == nameOfCoin[3]) { //If it is quarters
            answer = 4; //Takes 4 quarters to make a dollar
            questionOne[1] = Integer.toString(answer); //Actual answer
            questionOne[2] = Integer.toString(answer - 2); //First wrong answer
            questionOne[3] = Integer.toString(answer + 1); //Second wrong answer
            questionOne[4] = Integer.toString(answer - 1); //3rd wrong answer
        }

        return questionOne;  
    }
   

    //What time does the clock show? Show random clock
    private String[] generateQuestionTwo() {
                //String array holds the names of pics to be used in the questions
                String[] clocks = {"One", "Two", "Two Ten", "Two Thirty", "Three Fifty", "Four Thirty Five", "Five Twenty",
                "Six", "Seven", "Seven Thirty", "Eight", "Eight Thirty", "Nine Thirty", "Ten Thirty", "Ten Fifty Five",
                "Eleven", "Eleven Thirty", "Twelve Fiften"};
                //String array holds the times to be used in the answers
                String[] timeInNumbers = {"1:00", "2:00", "2:10", "2:30", "3:50", "4:35", "5:20", "6:00",
                "7:00", "7:30", "8:00", "8:30", "9:30", "10:30", "10:55", "11:00", "11:30", "12:15"};
                //randomtime contains a random time from the timeInNumbers array to use in the question
                String randomClock = clocks[ThreadLocalRandom.current().nextInt(19)]; 
                String[] questionTwo = new String[6]; //Array will contain questions and possible answers
                /*Add times to an array list so we can remove the correct answer later
                So we can place incorrect answers in the questionTwo array*/
                ArrayList<String> times = new ArrayList<String>(); 
                //Add all the contents of clock array to clockNames array list
                times.add(0, timeInNumbers[0]);
                times.add(1, timeInNumbers[1]);
                times.add(2, timeInNumbers[2]);
                times.add(3, timeInNumbers[3]);
                times.add(4, timeInNumbers[4]);
                times.add(5, timeInNumbers[5]);
                times.add(6, timeInNumbers[6]);
                times.add(7, timeInNumbers[7]);
                times.add(8, timeInNumbers[8]);
                times.add(9, timeInNumbers[9]);
                times.add(10, timeInNumbers[10]);
                times.add(11, timeInNumbers[11]);
                times.add(12, timeInNumbers[12]);
                times.add(13, timeInNumbers[13]);
                times.add(14, timeInNumbers[14]);
                times.add(15, timeInNumbers[15]);
                times.add(16, timeInNumbers[16]);
                times.add(17, timeInNumbers[17]);
                questionTwo[0] = "What time does the clock show " + randomClock;
                String answer; //Will contain the answer
                if (randomClock == clocks[0]) { //If the time is 1:00
                    answer = times.get(0);  //The answer is One
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(1); //Wrong answer 1
                    questionTwo[3] = times.get(2); //Wrong answer 2
                    questionTwo[4] = times.get(3); //Wrong answer 3
        
                }
                if (randomClock == clocks[1]) { //If the time is 2:00
                    answer = times.get(1);  //The answer is Two
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(4); //Wrong answer 1
                    questionTwo[3] = times.get(5); //Wrong answer 2
                    questionTwo[4] = times.get(6); //Wrong answer 3
        
        
                }
                if (randomClock == clocks[2]) { //If the time is 2:10
                    answer = times.get(2);  //The answer is Two Ten
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(7); //Wrong answer 1
                    questionTwo[3] = times.get(8); //Wrong answer 2
                    questionTwo[4] = times.get(9); //Wrong answer 3
        
                }
                if (randomClock == clocks[3]) { //If the time is 2:30
                    answer = times.get(3);  //The answer is Two Thirty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(10); //Wrong answer 1
                    questionTwo[3] = times.get(11); //Wrong answer 2
                    questionTwo[4] = times.get(12); //Wrong answer 3
        
                }
                if (randomClock == clocks[4]) { //If the time is 3:50
                    answer = times.get(4);  //The answer is Three Fifty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(13); //Wrong answer 1
                    questionTwo[3] = times.get(14); //Wrong answer 2
                    questionTwo[4] = times.get(15); //Wrong answer 3
        
                }
                if (randomClock == clocks[5]) { //If the time is 4:35
                    answer = times.get(5);  //The answer is Four Thirty Five
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(16); //Wrong answer 1
                    questionTwo[3] = times.get(17); //Wrong answer 2
                    questionTwo[4] = times.get(0); //Wrong answer 3
        
                }
                if (randomClock == clocks[6]) { //If the time is 5:20
                    answer = times.get(6);  //The answer is Five Twenty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(1); //Wrong answer 1
                    questionTwo[3] = times.get(4); //Wrong answer 2
                    questionTwo[4] = times.get(8); //Wrong answer 3
        
                }
                if (randomClock == clocks[7]) { //If the time is 6:00
                    answer = times.get(7);  //The answer is Six
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(2); //Wrong answer 1
                    questionTwo[3] = times.get(4); //Wrong answer 2
                    questionTwo[4] = times.get(6); //Wrong answer 3
        
                }
                if (randomClock == clocks[8]) { //If the time is 7:00
                    answer = times.get(8);  //The answer is Seven
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(9); //Wrong answer 1
                    questionTwo[3] = times.get(11); //Wrong answer 2
                    questionTwo[4] = times.get(13); //Wrong answer 3
        
                }
                if (randomClock == clocks[9]) { //If the time is 7:30
                    answer = times.get(9);  //The answer is Seven Thirty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(15); //Wrong answer 1
                    questionTwo[3] = times.get(17); //Wrong answer 2
                    questionTwo[4] = times.get(3); //Wrong answer 3
        
                }
                if (randomClock == clocks[10]) { //If the time is 8:00
                    answer = times.get(10);  //The answer is Eight
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(4); //Wrong answer 1
                    questionTwo[3] = times.get(6); //Wrong answer 2
                    questionTwo[4] = times.get(8); //Wrong answer 3
        
                }
                if (randomClock == clocks[11]) { //If the time is 8:30
                    answer = times.get(11);  //The answer is Eight Thirty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(3); //Wrong answer 1
                    questionTwo[3] = times.get(9); //Wrong answer 2
                    questionTwo[4] = times.get(10); //Wrong answer 3
        
                }
                if (randomClock == clocks[12]) { //If the time is 9:30
                    answer = times.get(12);  //The answer is Nine Thirty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(16); //Wrong answer 1
                    questionTwo[3] = times.get(11); //Wrong answer 2
                    questionTwo[4] = times.get(0); //Wrong answer 3
        
                }
                if (randomClock == clocks[13]) { //If the time is 10:30
                    answer = times.get(13);  //The answer is Ten Thirty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(5); //Wrong answer 1
                    questionTwo[3] = times.get(15); //Wrong answer 2
                    questionTwo[4] = times.get(14); //Wrong answer 3
        
                }
                if (randomClock == clocks[14]) { //If the time is 10:55
                    answer = times.get(14);  //The answer is Ten Fifty Five
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(0); //Wrong answer 1
                    questionTwo[3] = times.get(12); //Wrong answer 2
                    questionTwo[4] = times.get(14); //Wrong answer 3
                }
                if (randomClock == clocks[15]) { //If the time is 11:00
                    answer = times.get(15);  //The answer is Eleven
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(13); //Wrong answer 1
                    questionTwo[3] = times.get(3); //Wrong answer 2
                    questionTwo[4] = times.get(16); //Wrong answer 3
        
                }
                if (randomClock == clocks[16]) { //If the time is 11:30
                    answer = times.get(16);  //The answer is Eleven Thirty
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(3); //Wrong answer 1
                    questionTwo[3] = times.get(9); //Wrong answer 2
                    questionTwo[4] = times.get(15); //Wrong answer 3
        
                }
                if (randomClock == timeInNumbers[17]) { //If the time is 12:15
                    answer = times.get(17);  //The answer is Twelve 15
                    questionTwo[1] = answer; //The actual answer
                    times.remove(answer); //Remove the answer now
                    questionTwo[2] = times.get(5); //Wrong answer 1
                    questionTwo[3] = times.get(10); //Wrong answer 2
                    questionTwo[4] = times.get(16); //Wrong answer 3
        
                }

                return questionTwo;
        
    }

    
    
}
