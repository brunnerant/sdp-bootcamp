package ch.epfl.sdp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String GREET_USER = "ch.epfl.sdp.greetUser";

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.mainText);
    }

    public void greetUser(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        intent.putExtra(GREET_USER, editText.getText().toString());
        startActivity(intent);
    }
}
