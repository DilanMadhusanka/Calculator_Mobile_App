package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_dot, btn_sum, btn_sub, btn_mul, btn_div, btn_equal, btn_clear ,btn_del, btn_squre, btn_squRoot;
    TextView answer;
    double num_1, num_2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_dot = findViewById(R.id.btn_dot);

        btn_sum = findViewById(R.id.btn_sum);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        btn_squre = findViewById(R.id.btn_squre);
        btn_squRoot = findViewById(R.id.btn_squRoot);
        btn_equal = findViewById(R.id.btn_equal);
        btn_clear = findViewById(R.id.btn_clear);
        btn_del = findViewById(R.id.btn_del);

        answer = findViewById(R.id.answer);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+".");
            }
        });

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_1 = Double.parseDouble(answer.getText()+"");
                add = true;
                answer.setText(null);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_1 = Double.parseDouble(answer.getText()+"");
                sub = true;
                answer.setText(null);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_1 = Double.parseDouble(answer.getText()+"");
                mul = true;
                answer.setText(null);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_1 = Double.parseDouble(answer.getText()+"");
                div =true;
                answer.setText(null);
            }
        });

        btn_squre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_1 = Double.parseDouble(answer.getText()+"");
                answer.setText(num_1*num_1+"");
            }
        });

        btn_squRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_1 = Double.parseDouble(answer.getText()+"");
                answer.setText(Math.sqrt(num_1)+"");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_2 = Double.parseDouble(answer.getText()+"");

                if (add == true) {
                    answer.setText(num_1+num_2+"");
                    add = false;
                }

                if (sub == true) {
                    answer.setText(num_1-num_2+"");
                    sub = false;
                }

                if (mul == true) {
                    answer.setText(num_1*num_2+"");
                    mul = false;
                }

                if (div == true) {
                    answer.setText(num_1/num_2+"");
                    div = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(null);
            }
        });

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = answer.getText().toString();
                answer.setText(text.substring(0, text.length() - 1));
            }
        });
    }
}
