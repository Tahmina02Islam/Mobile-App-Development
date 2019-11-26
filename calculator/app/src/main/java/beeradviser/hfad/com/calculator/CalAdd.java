package beeradviser.hfad.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class CalAdd extends AppCompatActivity{

    private Button button1,button2;
    private TextView text;
private EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_add);

        button1=(Button)findViewById(R.id.add);
        button2=(Button)findViewById(R.id.sub);
        text=(TextView)findViewById(R.id.Text);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);

         String s1,s2,res;
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try {
                    String s1, s2;
                    s1 = e1.getText().toString();
                    s2 = e2.getText().toString();

                    double d1, d2, dres;
                    d1 = Double.parseDouble(s1);
                    d2 = Double.parseDouble(s2);

                    if (v.getId() == R.id.add) {
                        dres = d1 + d2;
                        text.setText("The Summation is  " + dres);
                    }

                }catch (Exception e)
                {
                    Toast.makeText(CalAdd.this,"Please, Enter first some value",Toast.LENGTH_LONG).show();

                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                try{
                    String s1, s2;
                    s1 = e1.getText().toString();
                    s2 = e2.getText().toString();

                    double d1,d2,res;
                    d1=Double.parseDouble(s1);
                    d2=Double.parseDouble(s2);

                    if(v.getId()==R.id.sub)
                    {
                        res=d1-d2;
                        text.setText("The Substraction is  "+res);
                    }

                }catch (Exception e)
                {
                    Toast.makeText(CalAdd.this,"Please, Enter first some value",Toast.LENGTH_LONG).show();

                }


            }
        });

    }

}
