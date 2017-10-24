package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global or module level variable
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Display the UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
    }

    public void displayMessage(View view){ //if is button, so need view
        String name;
        name = editTextName.getText().toString();

        int age;
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;

        textViewMessage.setText("Hi " + name + ", you will be " + age + " years old in 2018.");
    }

    public void reset(View view){
        textViewMessage.setText("");
        editTextName.setText("");
        editTextAge.setText("");
    }
}
