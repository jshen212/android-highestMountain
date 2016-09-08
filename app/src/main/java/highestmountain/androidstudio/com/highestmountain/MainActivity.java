package highestmountain.androidstudio.com.highestmountain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button showMeButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMeButton = (Button) findViewById(R.id.buttonId);
        showTextView = (TextView) findViewById(R.id.textView);

        final String[] mountains = {"Everest", "Kilamanjaro", "Makulu", "Kamet", "Trivor", "K12", "Ultar", "Mana"};

        showMeButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randomNum = rand.nextInt(mountains.length);

                showTextView.setText(mountains[randomNum]);

            }
        });

    }
}
