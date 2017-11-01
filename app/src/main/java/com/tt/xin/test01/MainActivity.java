package com.tt.xin.test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View BTN;
    EditText edt1,edt2,edt3;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();

        //本利和=本金 × ( 1 + 年利率 ÷ 12 × 期數 )
        //本金 * (1 + 利率 / 12)期數
        //d_lend*Math.pow((d_rate/12/100)+1, d_number
        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=edt1.getText().toString();
                String b=edt2.getText().toString();
                String c=edt3.getText().toString();
                double capital,rate,periods;
                capital=Double.valueOf(a);
                rate=Double.valueOf(b);
                periods=Double.valueOf(c);
                double ab=0;
                ab=(capital*Math.pow((rate/12/100)+1,periods));
                int INTA=Integer.valueOf((int) ab);
                String ac =String.valueOf(INTA);
          tv1.setText(ac);
            }
        });
    }

    private void findview() {
        BTN=findViewById(R.id.button);
        edt1= (EditText) findViewById(R.id.editText);
        edt2= (EditText) findViewById(R.id.editText2);
        edt3= (EditText) findViewById(R.id.editText3);
        tv1= (TextView) findViewById(R.id.textView7);
    }
}
