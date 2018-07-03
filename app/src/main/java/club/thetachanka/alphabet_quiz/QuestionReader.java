package club.thetachanka.alphabet_quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionReader {

    /**
     * Reads a file and returns back an ArrayList of Strings read from the file
     * @param fileName
     * @return array
     * @throws IOException
     */
    public ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        while ((s = br.readLine()) != null) {
            array.add(s);
        }
        return array;
    }
}
