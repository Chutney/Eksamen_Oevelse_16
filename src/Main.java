import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ExamQuestion> examQuestionList = new ArrayList<>();

        for (int i = 0; i < 14; i++) {
            examQuestionList.add(new ExamQuestion((i+1)));
        }

        File examFile = new File("questions.txt");

        try {
            examFile.createNewFile();
        } catch(IOException IOE) {
            System.out.println(IOE);
        }

        try {
            PrintStream out = new PrintStream(examFile);
            for(ExamQuestion x : examQuestionList) {
                String toPrint = x.getNumber() + ": " + x.getGrade();

                System.out.println(toPrint);
                out.println(toPrint);
            }

        } catch(FileNotFoundException FNFE) {
            System.out.println(FNFE);
        }
    }

}
