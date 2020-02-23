package ch.epfl.sdp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        textView = findViewById(R.id.greetingMessage);
        Intent intent = getIntent();
        textView.setText("Hello " + intent.getStringExtra(MainActivity.GREET_USER) + "!");
    }
}
