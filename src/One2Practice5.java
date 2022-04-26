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

    //Question One: Which is longer? (centimeters or inches, feet or yards, etc)
    private String[] generateQuestionOne() {
        //Array will hold the different times of measurements
        String[] measurementTypes = {"centimeters", "inches", "feet", "yards"};
        //Randomly select first measurement type
        String measurement1 = measurementTypes[ThreadLocalRandom.current().nextInt(4)]; //Randomly select first measurement
        String measurement2 = measurementTypes[ThreadLocalRandom.current().nextInt(4)]; //Randomly select second measurement
        String[] questionOne = new String[6]; //Array will contain questions and possible answer
        questionOne[0] = "Which one is bigger?"; //Actual question
        String answer; //Will hold the answer
        //If measurement1 is centimeters and measurement2 is inches
        if ((measurement1 == measurementTypes[0]) && (measurement2 == measurementTypes[1])) {
            answer = measurement2; //Inches are bigger than centimeters
            questionOne[0] = answer; //The right answer is inches
            questionOne[1] = measurement1; //The wrong answer is centimeters 
        }
        //If measurement1 is centimeters and measurement2 is feet
        if ((measurement1 == measurementTypes[0]) && (measurement2 == measurementTypes[2])) {
            answer = measurement2; //Feet is bigger than centimeters
            questionOne[0] = answer; //The correct answer is feet
            questionOne[1] = measurement1; //The wrong answer is centimeters 
        }
        //If measurement1 is centimeters and measurement2 is yards
        if ((measurement1 == measurementTypes[0]) && (measurement2 == measurementTypes[2])) {
            answer = measurement2; //Yards is bigger than centimeters
            questionOne[0] = answer; //The correct answer is feet
            questionOne[1] = measurement1; //The wrong answer is centimeters 
        }
        //If measurement1 is inches and measurement2 is centimeters
        if ((measurement1 == measurementTypes[1]) && (measurement2 == measurementTypes[0])) {
            answer = measurement1; //Inches is bigger than centimeters
            questionOne[0] = answer; //The correct answer is inches
            questionOne[1] = measurement2; //The wrong answer is centimeters 
        }
        //If measurement1 is inches and measurement2 is feet
        if ((measurement1 == measurementTypes[1]) && (measurement2 == measurementTypes[2])) {
            answer = measurement2; //Feet are bigger than inches
            questionOne[0] = answer; //The correct answer is feet
            questionOne[1] = measurement1; //The wrong answer is inches
        }
         //If measurement1 is inches and measurement2 is yards
         if ((measurement1 == measurementTypes[1]) && (measurement2 == measurementTypes[3])) {
            answer = measurement2; //Yards are bigger than inches
            questionOne[0] = answer; //The correct ansswer is yards
            questionOne[1] = measurement1; //The wrong answer is inches
        }
    
          //If measurement1 is feet and measurement2 is  centimeters
          if ((measurement1 == measurementTypes[2]) && (measurement2 == measurementTypes[0])) {
            answer = measurement1; //Feet are bigger than centimeters
            questionOne[0] = answer; //The correct answer is feet
            questionOne[1] = measurement2; //The wrong answer is centimeters
        }
          //If measurement1 is feet and measurement2 is inches
          if ((measurement1 == measurementTypes[2]) && (measurement2 == measurementTypes[1])) {
            answer = measurement1; //Feet are bigger than inches
            questionOne[0] = answer; //The correct answer is feet
            questionOne[1] = measurement2; //The wrong answer is inches
        }
          //If measurement1 is feet and measurement2 is  yards
          if ((measurement1 == measurementTypes[2]) && (measurement2 == measurementTypes[3])) {
            answer = measurement2; //Yards are bigger than feet
            questionOne[0] = answer; //The correct answer is feet
            questionOne[1] = measurement1; //The wrong answer is feet
        }
          //If measurement1 is yards and measurement2 is  centimeters
          if ((measurement1 == measurementTypes[3]) && (measurement2 == measurementTypes[0])) {
            answer = measurement1; //Yards are bigger than centimeters
            questionOne[0] = answer; //The correct answer is yards
            questionOne[1] = measurement2; //The wrong answer is centimeters
        }
        //If measurement1 is yards and measurement2 is inches
        if ((measurement1 == measurementTypes[3]) && (measurement2 == measurementTypes[1])) {
            answer = measurement1; //Yards are bigger than inches
            questionOne[0] = answer; //The correct answer is yards
            questionOne[1] = measurement2; //The wrong answer is inches
        }
        //If measurement1 is yards and measurement2 is feet
        if ((measurement1 == measurementTypes[3]) && (measurement2 == measurementTypes[2])) {
            answer = measurement1; //Yards are bigger than feet
            questionOne[0] = answer; //The correct answer is yards
            questionOne[1] = measurement2; //The wrong answer is feet
        }

        return questionOne;
        
    }

    private String[] generateQuestionTwo() {
        return null;
        
    }
    
}
