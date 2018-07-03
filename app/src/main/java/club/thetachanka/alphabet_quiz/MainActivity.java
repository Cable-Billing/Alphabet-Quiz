package club.thetachanka.alphabet_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            QuestionReader qr = new QuestionReader();
            final Alphabet alphabet = new Alphabet();
            final ArrayList<String> questions = qr.readFile("./questions");

            final Button next_button = findViewById(R.id.next_button);
            next_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String q = getQuestion(questions);
                    ((TextView)findViewById(R.id.question_text)).setText(q + " starting with " + alphabet.randomLetter());
                }
            });

            final Button repeat_button = findViewById(R.id.repeat_button);
            repeat_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String q = getQuestion(questions);
                    ((TextView)findViewById(R.id.question_text)).setText(q + " starting with " + alphabet.randomLetter());
                }
            });
        } catch (IOException e) {
            System.exit(0);
        }

    }
    public String getQuestion(ArrayList<String> array) {
        return array.get(new Random().nextInt(array.size()));
    }

}
