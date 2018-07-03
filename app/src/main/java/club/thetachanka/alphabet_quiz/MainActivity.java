package club.thetachanka.alphabet_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static Question q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q = new Question();
    }

    public void nextQuestion(View v) {
        ((TextView)findViewById(R.id.question_text)).setText(q.nextQuestion());
    }

    public void repeatQuestion(View v) {
        ((TextView)findViewById(R.id.question_text)).setText(q.repeatQuestion());
    }
}
