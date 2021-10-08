package com.example.thisorthat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText display;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSubmit, btnAdd, btnSub, btnDiv , btnMul , btnClear;
    float num1=0, num2=0;
    boolean addFlag , divFlag , mulFlag , subFlag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set buttons
        display = (EditText) findViewById(R.id.display_id);
        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);

        //operations
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnSub = (Button) findViewById(R.id.btn_sub);
        btnDiv = (Button) findViewById(R.id.btn_divide);
        btnMul =(Button) findViewById(R.id.btn_multi);
        btnClear = (Button) findViewById(R.id.btn_clear);

        //listener
        {
            btn0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "0");
                }
            });
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "1");
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "2");
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "3");
                }
            });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "4");
                }
            });
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "5");
                }
            });
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "6");
                }
            });
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "7");
                }
            });
            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "8");
                }
            });
            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    display.setText(display.getText() + "9");
                }
            });

        }
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2=  Float.parseFloat(String.valueOf(display.getText()));
                if(addFlag){display.setText(num1+num2 +""); addFlag=false;}
                if(divFlag){display.setText(num1/num2+""); divFlag=false;}
                if(mulFlag){display.setText(num1*num2+""); mulFlag=false;}
                if(subFlag){display.setText(num1-num2+""); subFlag=false;}

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
                num1=0;
                num2=0;

            }
        });



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1= Float.parseFloat(String.valueOf(display.getText()));
                //display.setText(display.getText() + "+");
                addFlag=true;
                display.setText(null);


            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=  Float.parseFloat(String.valueOf(display.getText()));
                //display.setText(display.getText() + "-");
                subFlag=true;
                display.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=  Float.parseFloat(String.valueOf(display.getText()));
                //display.setText(display.getText() + "/");
                divFlag=true;
                display.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=  Float.parseFloat(String.valueOf(display.getText()));
               // display.setText(display.getText() + "*");
                mulFlag=true;
                display.setText(null);
            }
        });

    }


}

