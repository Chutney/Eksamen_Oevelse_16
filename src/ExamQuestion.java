import java.util.Random;

public class ExamQuestion {
    private int number;
    private char grade;

    public ExamQuestion(int number) {
        this.number = number;
        this.grade = setRandomGrade();
    }


    public char setRandomGrade() {
        Random rn = new Random();
        char[] listOfChar = {'A','B','C','D','E','F'};
        return listOfChar[rn.nextInt(0,listOfChar.length)];
    }


    public char getGrade() {
        return grade;
    }

    public int getNumber() {
        return number;
    }



}
