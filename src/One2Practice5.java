import java.util.concurrent.ThreadLocalRandom;

//Purpose: First round of practice questions for Measurement Reef
public class One2Practice5 extends Assessment {

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
        One2Practice5 test1 = new One2Practice5();
        String[] question1 = test1.generateQuestionOne();
        System.out.println(question1[0]);
        System.out.println(question1[1]); 
        System.out.println(question1[2]); 
        //Test question two
        One2Practice5 test2 = new One2Practice5();
        String[] question2 = test2.generateQuestionTwo();
        System.out.println(question2[0]);
        System.out.println(question2[1]); 
        System.out.println(question2[2]);
        System.out.println(question2[3]);
        System.out.println(question2[4]);
    }

    //Question One: Which is longer? (centimeters or inches, feet or yards, etc)
    private String[] generateQuestionOne() {
        //Array will hold the different times of measurements
        String[] measurementTypes = {"centimeters", "inches", "feet", "yards"};
        //Randomly select first measurement type
        String measurement1 = measurementTypes[ThreadLocalRandom.current().nextInt(4)]; //Randomly select first measurement
        String measurement2 = measurementTypes[ThreadLocalRandom.current().nextInt(4)]; //Randomly select second measurement
        String[] questionOne = new String[3]; //Array will contain questions and possible answer
        //Measurement1 and measurement2 are only included in the question below for testing purposes, MUST be deleted
        questionOne[0] = "Which one is bigger? " + measurement1 + " or " + measurement2; //Actual question
        String answer; //Will hold the answer
        //If measurement1 is centimeters and measurement2 is inches
        if ((measurement1 == measurementTypes[0]) && (measurement2 == measurementTypes[1])) {
            answer = measurement2; //Inches are bigger than centimeters
            questionOne[1] = answer; //The right answer is inches
            questionOne[2] = measurement1; //The wrong answer is centimeters 
        }
        //If measurement1 is centimeters and measurement2 is feet
        if ((measurement1 == measurementTypes[0]) && (measurement2 == measurementTypes[2])) {
            answer = measurement2; //Feet are bigger than centimeters
            questionOne[1] = answer; //The correct answer is feet
            questionOne[2] = measurement1; //The wrong answer is centimeters 
        }
        //If measurement1 is centimeters and measurement2 is yards
        if ((measurement1 == measurementTypes[0]) && (measurement2 == measurementTypes[3])) {
            answer = measurement2; //Yards are bigger than centimeters
            questionOne[1] = answer; //The correct answer is yards
            questionOne[2] = measurement1; //The wrong answer is centimeters 
        }
        //If measurement1 is inches and measurement2 is centimeters
        if ((measurement1 == measurementTypes[1]) && (measurement2 == measurementTypes[0])) {
            answer = measurement1; //Inches is bigger than centimeters
            questionOne[1] = answer; //The correct answer is inches
            questionOne[2] = measurement2; //The wrong answer is centimeters 
        }
        //If measurement1 is inches and measurement2 is feet
        if ((measurement1 == measurementTypes[1]) && (measurement2 == measurementTypes[2])) {
            answer = measurement2; //Feet are bigger than inches
            questionOne[1] = answer; //The correct answer is feet
            questionOne[2] = measurement1; //The wrong answer is inches
        }
         //If measurement1 is inches and measurement2 is yards
         if ((measurement1 == measurementTypes[1]) && (measurement2 == measurementTypes[3])) {
            answer = measurement2; //Yards are bigger than inches
            questionOne[1] = answer; //The correct ansswer is yards
            questionOne[2] = measurement1; //The wrong answer is inches
        }
    
          //If measurement1 is feet and measurement2 is centimeters
          if ((measurement1 == measurementTypes[2]) && (measurement2 == measurementTypes[0])) {
            answer = measurement1; //Feet are bigger than centimeters
            questionOne[1] = answer; //The correct answer is feet
            questionOne[2] = measurement2; //The wrong answer is centimeters
        }
          //If measurement1 is feet and measurement2 is inches
          if ((measurement1 == measurementTypes[2]) && (measurement2 == measurementTypes[1])) {
            answer = measurement1; //Feet are bigger than inches
            questionOne[1] = answer; //The correct answer is feet
            questionOne[2] = measurement2; //The wrong answer is inches
        }
          //If measurement1 is feet and measurement2 is  yards
          if ((measurement1 == measurementTypes[2]) && (measurement2 == measurementTypes[3])) {
            answer = measurement2; //Yards are bigger than feet
            questionOne[1] = answer; //The correct answer is yards
            questionOne[2] = measurement1; //The wrong answer is feet
        }
          //If measurement1 is yards and measurement2 is centimeters
          if ((measurement1 == measurementTypes[3]) && (measurement2 == measurementTypes[0])) {
            answer = measurement1; //Yards are bigger than centimeters
            questionOne[1] = answer; //The correct answer is yards
            questionOne[2] = measurement2; //The wrong answer is centimeters
        }
        //If measurement1 is yards and measurement2 is inches
        if ((measurement1 == measurementTypes[3]) && (measurement2 == measurementTypes[1])) {
            answer = measurement1; //Yards are bigger than inches
            questionOne[1] = answer; //The correct answer is yards
            questionOne[2] = measurement2; //The wrong answer is inches
        }
        //If measurement1 is yards and measurement2 is feet
        if ((measurement1 == measurementTypes[3]) && (measurement2 == measurementTypes[2])) {
            answer = measurement1; //Yards are bigger than feet
            questionOne[1] = answer; //The correct answer is yards
            questionOne[2] = measurement2; //The wrong answer is feet
        }
        //If measurement1 and measurement2 are both centimeters
        if ((measurement1 == measurementTypes[0]) && (measurement2 == measurementTypes[0])) {
            //Change one of the measurements
            measurement1 = measurementTypes[1]; //Measurement1 is now inches!
            answer = measurement1; //Inches are bigger than centimeters
            questionOne[1] = answer; //The correct answer is inches
            questionOne[2] = measurement2; //The wrong answer is centimeters
        }
        //If measurement1 and measurement2 are the same: 
        //If measurement1 and measurement2 are both inches
        if ((measurement1 == measurementTypes[1]) && (measurement2 == measurementTypes[1])) {
            //Change one of the measurements
            measurement2 = measurementTypes[2]; //Measurement2 is now feet
            answer = measurement2; //Feet are bigger than inches
            questionOne[1] = answer; //The correct answer is feet
            questionOne[2] = measurement1; //The wrong answer is inches
        }
        //If measurement1 and measurement2 are both feet
        if ((measurement1 == measurementTypes[2]) && (measurement2 == measurementTypes[2])) {
            //Change one of the measurements
            measurement1 = measurementTypes[0]; //Measurement1 is now centimeters
            answer = measurement2; //Feet are bigger than centimeters
            questionOne[1] = answer; //The correct answer is feet
            questionOne[2] = measurement1; //The wrong answer is centimeters
        }
        //If measurement1 and measurement2 are both yards
        if ((measurement1 == measurementTypes[3]) && (measurement2 == measurementTypes[3])) {
            //Change one of the measurements
            measurement2 = measurementTypes[2]; //Measurement2 is now feet
            answer = measurement1; //Yards are bigger than feet
            questionOne[1] = answer; //The correct answer is yards
            questionOne[2] = measurement2; //The wrong answer is feet
        }

        return questionOne;
        
    }
    //Question Two: Estimate the height of a (parrot, lamp, table, person, tree, giraffe, building)
    private String[] generateQuestionTwo() {
        //String array of the objects used in the question
        String[] objectToGuess = {"parrot", "lamp", "table", "person", "tree", "giraffe", "building"};
        //Get a random item from objectToGuess and assign it to randomObject
        String randomObject = objectToGuess[ThreadLocalRandom.current().nextInt(7)];
        String[] questionTwo = new String[6]; //Array will be used to hold the question and possible answers
        questionTwo[0] = "Estimate the height of a " + randomObject; //The actual question
        
        if (randomObject == objectToGuess[0]) { //If the object is a parrot
            questionTwo[1] = "8 in."; //Correct: Average medium sized bird is 8 inches
            questionTwo[2] = "2 ft."; //Wrong: too large
            questionTwo[3] = "1 yd."; //Wrong: too large
            questionTwo[4] = "9 cm."; //Wrong: too small

        }

        if (randomObject == objectToGuess[1]) { //If the object is a lamp
            questionTwo[1] = "32 in."; //Correct: average table lamp 30-36 inches
            questionTwo[2] = "3 yd."; //Wrong for obvious reasons
            questionTwo[3] = "15 cm."; //Wrong: Not even half a foot
            questionTwo[4] = "6 ft."; //Wrong: Too big


        }

        if (randomObject == objectToGuess[2]) { //If the object is a table
            questionTwo[1] = "36 in."; //Correct answer
            questionTwo[2] = "7 ft."; //Wrong answer
            questionTwo[3] = "50 cm."; //Wrong answer
            questionTwo[4] = "1 yd."; //Wrong: 50.8 cm is 20 inches

        }

        if (randomObject == objectToGuess[3]) { //If the object is a person
            questionTwo[1] = "5 ft. 5 in."; //Correct: Avg male is 5 ft 7 and avg female is 5 ft 2
            questionTwo[2] = "4 yd."; //Wrong answer
            questionTwo[3] = "91 cm."; //Wrong answer
            questionTwo[4] = "48 in."; //wrong answer
        }

        if (randomObject == objectToGuess[4]) { //If the object is a tree
            questionTwo[1] = "50 ft."; //Correct answer
            questionTwo[2] = "108 in."; //Wrong answer
            questionTwo[3] = "311 cm."; //Wrong answer
            questionTwo[4] = "5 yd."; //Wrong answer


        }

        if (randomObject == objectToGuess[5]) { //If the object is a giraffe
            questionTwo[1] = "18 ft."; //Correct answer
            questionTwo[2] = "152 cm."; //Wrong answer
            questionTwo[3] = "9 yd."; //Wrong answer
            questionTwo[4] = "127 in."; //Wrong answer

        }

        if (randomObject == objectToGuess[6]) { //If the object is a building
            questionTwo[1] = "105 ft."; //Correct answer
            questionTwo[2] = "1000 cm."; //Wrong answer
            questionTwo[3] = "600 in."; //Wrong answer
            questionTwo[4] = "11 yd."; //Wrong answer

        }
        
        return questionTwo;
        
    }
    
}
