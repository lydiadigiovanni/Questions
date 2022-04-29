import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//Purpose: Second round of practice questions for Algebra Atoll
public class TFPractice5 extends Assessment{

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
public static void main(String[] args) {
    //Test question one
    TFPractice5 test1 = new TFPractice5();
    String[] question1 = test1.generateQuestionOne();
    System.out.println(question1[0]);
    System.out.println(question1[1]); 
    System.out.println(question1[2]); 
    System.out.println(question1[3]); 
    System.out.println(question1[4]);
    
}
    
//Question One = Find the value of x if " "x + " " = " "
//Not working yet
private String[] generateQuestionOne() {
    Random random = new Random(); //Will be used to generate random numbers
    int numBeforeX = random.nextInt(30) + 1; //The number before the x, as in 3x for example
    int numAfterPlus = random.nextInt(30) + 1; //Number after plus, like + 7 for example
    int numItEquals = random.nextInt(30) + 1; //Number it equals for example, = 19 for example
    //Subtract numAfterPlus from numItEquals and divide that by numBeforeX
    int answer;
    String[] questionOne = new String[6]; //Array will hold question and answers
    //To avoid any negative numbers (they dont work with negatives yet)
    if ((numItEquals > numBeforeX) && (numItEquals > numAfterPlus)) {
        questionOne[0] = "Find the value of x if " + numBeforeX + "x + " + numAfterPlus + " = " + numItEquals;
        answer = (numItEquals - numAfterPlus) / numBeforeX;
        questionOne[1] = "x = " + Integer.toString(answer);
        questionOne[2] = "x = " + Integer.toString(answer + 2);
        questionOne[3] = "x = " + Integer.toString(answer + 2);
        questionOne[4] = "x = " + Integer.toString(answer - 1);
    }
    else { //The number it equals was less than the numbers in the equation
        //Force numItEquals to be larger than numBeforeX and numAfterPLus
        numItEquals = (numBeforeX + numAfterPlus) * 2;
        questionOne[0] = "Find the value of x if " + numBeforeX + "x + " + numAfterPlus + " = " + numItEquals;
        answer = (numItEquals - numAfterPlus) / numBeforeX;
        questionOne[1] = "x = " + Integer.toString(answer);
        questionOne[2] = "x = " + Integer.toString(answer + 2);
        questionOne[3] = "x = " + Integer.toString(answer - 2);
        questionOne[4] = "x = " + Integer.toString(answer - 1);   
    }
    return questionOne;
}

//Find the value of y, if y - " " = " "
private String[] generateQuestionTwo() {
    return null;

}
}

