package gcit.edu.todo_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText value1,value2;
    private Button add,sub,mul,div;
    private TextView ans;
    private calc mCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1=findViewById(R.id.val1);
        value2=findViewById(R.id.val2);
        ans=findViewById(R.id.textView);
        mCalculator=new calc();

        add=findViewById(R.id.buttonadd);
        sub=findViewById(R.id.buttonsub);
        mul=findViewById(R.id.buttonmul);
        div=findViewById(R.id.buttondiv);

    }

    public void Add(View view) {
        String val1= value1.getText().toString();
        String val2=value2.getText().toString();
        double Add=mCalculator.Add(Double.valueOf(val1),Double.valueOf(val2));
        ans.setText(String.valueOf(Add));

        Log.d("Debugging", "Successful");

    }

    public void Sub(View view) {
        String val1= value1.getText().toString();
        String val2=value2.getText().toString();
        double Sub=mCalculator.Sub(Double.valueOf(val1),Double.valueOf(val2));
        ans.setText(String.valueOf(Sub));
        Log.d("Debugging", "Successful");
    }

    public void Multi(View view) {
        String val1= value1.getText().toString();
        String val2=value2.getText().toString();
        double Multi=mCalculator.Multi(Double.valueOf(val1),Double.valueOf(val2));
        ans.setText(String.valueOf(Multi));
        Log.d("Debugging", "Successful");
    }

    public void Divide(View view) {
        String val1= value1.getText().toString();
        String val2=value2.getText().toString();
        double Divide=mCalculator.Divide(Double.valueOf(val1),Double.valueOf(val2));
        ans.setText(String.valueOf(Divide));
        Log.d("Debugging", "Successful");
    }
}