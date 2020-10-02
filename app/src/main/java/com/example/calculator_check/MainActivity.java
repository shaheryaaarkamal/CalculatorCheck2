package com.example.calculator_check;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnPlus,btnMin,btnMul,btnDiv,btnEqual,btnC,btnMod;
    EditText ed1;
    Double res1,res2;
    Boolean Add,Sub,Mul,Div,Mod;

    void setfalse(){
        Add=false;
        Sub=false;
        Mul=false;
        Div=false;
        Mod=false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn4= (Button) findViewById(R.id.btn4);
        btn5= (Button) findViewById(R.id.btn5);
        btn6= (Button) findViewById(R.id.btn6);
        btn7= (Button) findViewById(R.id.btn7);
        btn8= (Button) findViewById(R.id.btn8);
        btn9= (Button) findViewById(R.id.btn9);
        btn0= (Button) findViewById(R.id.btn0);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnPlus= (Button) findViewById(R.id.btnPlus);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnMul= (Button) findViewById(R.id.btnMul);
        btnDiv= (Button) findViewById(R.id.btnDiv);
        btnC= (Button) findViewById(R.id.btnC);
        btnMod=(Button) findViewById(R.id.btnMod);
        ed1=(EditText) findViewById(R.id.editText);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                { ed1.setText(""); }
                else{

                    res1=Double.parseDouble(ed1.getText()+"");
                    setfalse();
                    Add=true;
                    ed1.setText(null);
                }
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                { ed1.setText(""); }
                else{
                    res1=Double.parseDouble(ed1.getText()+"");
                    setfalse();
                    Sub=true;
                    ed1.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                { ed1.setText(""); }
                else{
                    res1=Double.parseDouble(ed1.getText()+"");
                    setfalse();
                    Mul=true;
                    ed1.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                { ed1.setText(""); }
                else{
                    res1=Double.parseDouble(ed1.getText()+"");
                    setfalse();
                    Div=true;
                    ed1.setText(null);
                }
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null)
                { ed1.setText(""); }
                else{
                    res1=Double.parseDouble(ed1.getText()+"");
                    setfalse();
                    Mod=true;
                    ed1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2=Double.parseDouble(ed1.getText()+"");

                if(Add==true){
                    ed1.setText(res1 + res2 + "");
                    Add=false;
                }
                else if(Sub==true){
                    ed1.setText(res1 - res2 + "");
                    Sub=false;
                }
                else if(Mul==true){
                    ed1.setText(res1 * res2 + "");
                    Mul=false;
                }
                else if(Div==true){
                    ed1.setText(res1 / res2 + "");
                    Div=false;
                }
                else if(Mod == true){
                    ed1.setText(res1 % res2 + "");
                    Mod=false;
                }

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                res1=null;
            }
        });
    }
}