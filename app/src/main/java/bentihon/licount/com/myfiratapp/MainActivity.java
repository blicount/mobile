package bentihon.licount.com.myfiratapp;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AddBtn = (Button) findViewById(R.id.AddBtn);
        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNum = (EditText) findViewById(R.id.FirstNumberEditText);
                EditText secondNum = (EditText) findViewById(R.id.SecondNumberEditText);
                TextView result = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int res = num1+num2;
                result.setText(res+"");
            }
        });

        Button MinusBtn = (Button) findViewById(R.id.MinusBtn);
        MinusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            EditText firstNum = (EditText) findViewById(R.id.FirstNumberEditText);
            EditText secondNum = (EditText) findViewById(R.id.SecondNumberEditText);
            TextView Result = (TextView) findViewById((R.id.ResultTextView));

            int num1 = Integer.parseInt(firstNum.getText().toString());
            int num2 = Integer.parseInt(secondNum.getText().toString());
            int res = num1 - num2;
            Result.setText(res + "");

            }
        });
        Button MultBtn = (Button) findViewById(R.id.MultiplyBtn);
        MultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNum = (EditText) findViewById(R.id.FirstNumberEditText);
                EditText secondNum = (EditText) findViewById(R.id.SecondNumberEditText);
                TextView Result = (TextView) findViewById((R.id.ResultTextView));

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int res = num1 * num2;
                Result.setText(res + "");
                }
            });
        Button DivideBtn = (Button) findViewById(R.id.DivideBtn);
        DivideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNum = (EditText) findViewById(R.id.FirstNumberEditText);
                EditText secondNum = (EditText) findViewById(R.id.SecondNumberEditText);
                TextView Result = (TextView) findViewById((R.id.ResultTextView));

                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());
                int res = num1 / num2;
                Result.setText(res + "");
            }
        });
    }
}
