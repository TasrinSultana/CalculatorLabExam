package com.example.calculatorlabexam;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button_zero,button_one,button_two,button_three,button_four, button_five,
            button_six, button_seven,button_eight,button_nine,button_point,button_equal,
            button_plus,button_minus,button_mul,button_div,button_c,button_sqrt,button_pow,button_mod;
    private ImageButton backspace;
    TextView output, input;
    Boolean flag=false,point_flag=false,op_flag=false;
    String op="",result,v1,v2;

    private int state=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_functions();
        init_listeners();

    }

    private void init_views() {
        button_point=(Button)findViewById(R.id.btn_point);
        button_zero=(Button)findViewById(R.id.btn_0);
        button_equal=(Button)findViewById(R.id.btn_equal);
        button_mod=(Button)findViewById(R.id.btn_mod);

        button_one=(Button)findViewById(R.id.btn_1);
        button_two=(Button)findViewById(R.id.btn_2);
        button_three=(Button)findViewById(R.id.btn_3);
        button_div=(Button)findViewById(R.id.btn_div);

        button_four=(Button)findViewById(R.id.btn_4);
        button_five=(Button)findViewById(R.id.btn_5);
        button_six=(Button)findViewById(R.id.btn_6);
        button_mul=(Button)findViewById(R.id.btn_mul);

        button_seven=(Button)findViewById(R.id.btn_7);
        button_eight=(Button)findViewById(R.id.btn_8);
        button_nine=(Button)findViewById(R.id.btn_9);
        button_minus=(Button)findViewById(R.id.btn_minus);

        button_c=(Button)findViewById(R.id.btn_c);
        button_sqrt=(Button)findViewById(R.id.btn_root);
        button_pow=(Button)findViewById(R.id.btn_pow);
        button_plus=(Button)findViewById(R.id.btn_plus);

        backspace=(ImageButton)findViewById(R.id.btn_del);

        output =(TextView) findViewById(R.id.tv1);
        input =(TextView)findViewById(R.id.tv2);
    }

    private void init_variables() {
        v1="";
        v2="";
        flag=false;
        point_flag=false;
        op_flag=false;
        op="+";

    }

    private void init_functions() {
    }


    private void init_listeners() {
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op_flag) v2=v2+"0";
                if(!flag)
                    input.setText(input.getText()+"0");
                else {
                    input.setText("0");
                    flag=false;
                    init_variables();

                }
            }
        });

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"1";
                if(!flag)
                    input.setText(input.getText()+"1");
                else {
                    input.setText("1");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"2";
                if(!flag)
                    input.setText(input.getText()+"2");
                else {
                    input.setText("2");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"3";
                if(!flag)
                    input.setText(input.getText()+"3");
                else {
                    input.setText("3");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"4";
                if(!flag)
                    input.setText(input.getText()+"4");
                else {
                    input.setText("4");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"5";
                if(!flag)
                    input.setText(input.getText()+"5");
                else {
                    input.setText("5");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"6";
                if(!flag)
                    input.setText(input.getText()+"6");
                else {
                    input.setText("6");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"7";
                if(!flag)
                    input.setText(input.getText()+"7");
                else {
                    input.setText("7");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"8";
                if(!flag)
                    input.setText(input.getText()+"8");
                else {
                    input.setText("8");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state=0;
                if(op_flag) v2=v2+"9";
                if(!flag)
                    input.setText(input.getText()+"9");
                else {
                    input.setText("9");
                    flag=false;
                    init_variables();

                }
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !point_flag)
                    input.setText(input.getText()+".");
                else if(flag){
                    init_variables();
                    input.setText(".");
                    flag=false;
                }
                if(op_flag && !point_flag) v2=v2+".";
                point_flag=true;
                state=0;
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !op_flag){
                    v1=input.getText().toString().trim();
                }
                else{
                    v1=result;
                    flag=false;
                }
                Log.i("Ok","done");
                result=calculate();
                v1=result;
                Log.i("Ok",result);
                if(!op_flag)
                    input.setText(result+"+");
                else {
                    if(state==0 ) input.setText(result+"+");
                    else {
                        state=0;
                        CharSequence currentText = input.getText();
                        input.setText(currentText.subSequence(0, currentText.length()-1)+"+");
                    }

                }
                op="+";
                op_flag=true;
                point_flag=false;
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !op_flag){
                    v1=input.getText().toString().trim();
                }
                else{
                    v1=result;
                    flag=false;
                }
                Log.i("Ok","done");
                result=calculate();
                v1=result;
                Log.i("Ok",result);
                if(!op_flag)
                    input.setText(result+"-");
                else {
                    if(state==0 ) input.setText(result+"-");
                    else {
                        state=0;
                        CharSequence currentText = input.getText();
                        input.setText(currentText.subSequence(0, currentText.length()-1)+"-");
                    }

                }
                op="-";
                op_flag=true;
                point_flag=false;

            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !op_flag){
                    v1=input.getText().toString().trim();
                }
                else{
                    v1=result;
                    flag=false;
                }
                Log.i("Ok","done");
                result=calculate();
                v1=result;
                Log.i("Ok",result);
                if(!op_flag)
                    input.setText(result+"x");
                else {
                    if(state==0 ) input.setText(result+"x");
                    else {
                        state=0;
                        CharSequence currentText = input.getText();
                        input.setText(currentText.subSequence(0, currentText.length()-1)+"x");
                    }

                }
                op="x";
                op_flag=true;
                point_flag=false;


            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !op_flag){
                    v1=input.getText().toString().trim();
                }
                else{
                    v1=result;
                    flag=false;
                }
                Log.i("Ok","done");
                result=calculate();
                v1=result;
                Log.i("Ok",result);
                if(!op_flag)
                    input.setText(result+"/");
                else {
                    if(state==0 ) input.setText(result+"/");
                    else {
                        state=0;
                        CharSequence currentText = input.getText();
                        input.setText(currentText.subSequence(0, currentText.length()-1)+"/");
                    }

                }
                op="/";
                op_flag=true;
                point_flag=false;

            }
        });
        button_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !op_flag){
                    v1=input.getText().toString().trim();
                }
                else{
                    v1=result;
                    flag=false;
                }
                Log.i("Ok","done");
                result=calculate();
                v1=result;
                Log.i("Ok",result);
                if(!op_flag)
                    input.setText(result+"%");
                else {
                    if(state==0 ) input.setText(result+"%");
                    else {
                        state=0;
                        CharSequence currentText = input.getText();
                        input.setText(currentText.subSequence(0, currentText.length()-1)+"%");
                    }

                }
                op="%";
                op_flag=true;
                point_flag=false;
            }
        });
        button_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !op_flag){
                    v1=input.getText().toString().trim();
                }
                else{
                    v1=result;
                    flag=false;
                }
                Log.i("Ok","done");
                result=calculate();
                v1=result;
                Log.i("Ok",result);
                if(!op_flag)
                    input.setText(result+"√");
                else {
                    if(state==0 ) input.setText(result+"√");
                    else {
                        state=0;
                        CharSequence currentText = input.getText();
                        input.setText(currentText.subSequence(0, currentText.length()-1)+"√");
                    }

                }
                op="√";
                op_flag=true;
                point_flag=false;
            }
        });

        button_pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flag && !op_flag){
                    v1=input.getText().toString().trim();
                }
                else{
                    v1=result;
                    flag=false;
                }
                Log.i("Ok","done");
                result=calculate();
                v1=result;
                Log.i("Ok",result);
                if(!op_flag)
                    input.setText(result+"^");
                else {
                    if(state==0 ) input.setText(result+"^");
                    else {
                        state=0;
                        CharSequence currentText = input.getText();
                        input.setText(currentText.subSequence(0, currentText.length()-1)+"^");
                    }

                }
                op="^";
                op_flag=true;
                point_flag=false;
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result=calculate();
                Log.i("eq",result);
                output.setText(result);

                flag=true;
                point_flag=false;
                op_flag=false;
            }
        });
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init_variables();
                input.setText("");
                output.setText("");
                v1="";
                v2="";
                result="";
            }
        });
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().length() > 0) {
                    CharSequence currentText = input.getText();
                    input.setText(currentText.subSequence(0, currentText.length()-1));
                }
                else {
                    init_variables();
                }
            }
        });

        backspace.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                init_variables();
                input.setText("");
                output.setText("");
                v1="";
                v2="";
                result="";
                return false;
            }
        });
    }
    private String calculate() {
        String result="";
        switch (op){
            case "+" :
                result=Calculation.add(v1,v2);
                break;
            case  "-":
                result=Calculation.subtract(v1,v2);
                break;
            case  "x":
                result=Calculation.multiply(v1,v2);
                break;
            case  "/":
                result=Calculation.division(v1,v2);
                break;
            case "^":
                result=Calculation.power(v1,v2);
                break;
            case "√":
                result=Calculation.root(v1,v2);
                break;
            case "%":
                result=Calculation.modulas(v1,v2);
                break;
            default:
                break;
        }
        //op_flag=false;
        op="+";
        v2="";

        return result;
    }


}
