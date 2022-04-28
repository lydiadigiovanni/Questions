import java.util.Random;

//Purpose: First round of practice questions for Operation Cove (MULTIPLICATION AND DIVISION RELATED)
public class TFPractice1 extends Assessment {

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
         TFPractice1 test1 = new TFPractice1();
         String[] question1 = test1.generateQuestionOne();
         System.out.println(question1[0]);
         System.out.println(question1[1]); 
         System.out.println(question1[2]); 
         System.out.println(question1[3]); 
         System.out.println(question1[4]); 
         //Test question three
         TFPractice1 test3 = new TFPractice1();
         String[] question3 = test3.generateQuestionThree();
         System.out.println(question3[0]);
         System.out.println(question3[1]); 
         System.out.println(question3[2]);
         System.out.println(question3[3]);
         System.out.println(question3[4]);

    }

    //Question one: What is " " * " "?
    private String[] generateQuestionOne() {
        Random random = new Random(); //Will be used to generate the random numbers
        int firstNumber = random.nextInt(100) + 1; //First number is a number between 1 and 100
        int secondNumber = random.nextInt(100) + 1; //Second number is between 1 and 100
        int answer = firstNumber * secondNumber; //Answer is the two multiplied
        String[] questionOne = new String[6]; //Array will hold question and possible answers
        questionOne[0] = "What is " + firstNumber + " * " + secondNumber + "?"; //Actual question
        questionOne[1] = Integer.toString(answer); //The answer
        questionOne[2] = Integer.toString(answer + 1); //Wrong answer
        questionOne[3] = Integer.toString(answer - 1); //Wrong answer
        questionOne[4] = Integer.toString(answer + 3); //Wrong answer

        return questionOne;
    }

    //Question two: " " * __ = some number between 1 and 100
    private String[] generateQuestionYwo() {
        return null;

    }

    //Question three: What is " " / " "?
    private String[] generateQuestionThree() {
        Random random = new Random(); //Will be used to generate the random numbers
        int secondNumber = (random.nextInt(50) + 1); //Second number is a number between 1 and 50
        int temp = random.nextInt(50) + 1; //Temporary random to make sure the secondNumber will be divisible by the first
        int firstNumber = temp * secondNumber; //Multiply secondNumber by temp to make firstNumber a multiple of secondNumber
        int answer = firstNumber / secondNumber; //Answer is the first numbe divided by the second
        String[] questionTwo = new String[6]; //Array will hold question and possible answers
        questionTwo[0] = "What is " + firstNumber + " / " + secondNumber + "?"; //Actual question
        questionTwo[1] = Integer.toString(answer); //The answer
        questionTwo[2] = Integer.toString(answer + 1); //Wrong answer
        questionTwo[3] = Integer.toString(answer - 1); //Wrong answer
        questionTwo[4] = Integer.toString(answer + 2); //Wrong answer
    
       
        return questionTwo;
    }

    //Question four: " " / __ = some number between 1 and 100
    private String[] generateQuestionFour() {
        
        return null;
        
    }
    
}
