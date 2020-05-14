package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText pant;
    public double operan1 , operan2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant=(EditText)findViewById(R.id.cajitafeliz);
    }

    public void b1(View v){
        String cap= pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }

    public void b2(View v){
        String cap= pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);
    }

    public void b3(View v){
        String cap= pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);
    }

    public void b4(View v){
        String cap= pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);
    }

    public void b5(View v){
        String cap= pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);
    }

    public void b6(View v){
        String cap= pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);
    }

    public void b7(View v){
        String cap= pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);
    }

    public void b8(View v){
        String cap= pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }

    public void b9(View v){
        String cap= pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }

    public void b0(View v){
        String cap= pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);
    }

    public void bpunto(View v){
        String cap= pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }

    public void suma(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=1;
    }

    public void resta(View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=2;
    }

    public void multiplicacion (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=3;
    }

    public void division (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=4;
    }

    public void potencia (View v){
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=5;
    }

    public void porcentaje (View v) {
        try{ String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=6;
    }

    public void raiz (View v) {
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pant.setText(" v(" +operan1+")");
        ope=7;
    }

    public void igual (View v){
        try{
            String aux2= pant.getText().toString();
            operan2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
        pant.setText("");

        if (ope==1){
            res=operan1+operan2;

        }else if (ope==2){
            res=operan1-operan2;

        }else if (ope==3){
            res=operan1*operan2;

        }else if (ope==4){
            if(operan2==0){
                pant.setText("Numero no se puede dividir para 0");
            }else{
                res= operan1/operan2;
            }

        }else if (ope==5){
            res=Math.pow(operan1, 2);

        }else if (ope==6){
            res=operan2*(operan1/100.0);

        }else if (ope==7){
            res=Math.sqrt(operan1);
        }
        pant.setText(""+res);
        operan1=res;
    }

    public void clear (View v){
        pant.setText("");
        operan1=0.0;
        operan2=0.0;
        res=0.0;
    }

    public void borrar (View v){
        if (!pant.getText().toString().equals("")){
            pant.setText(pant.getText().subSequence(0,pant.getText().length()-1)+"");
        }
    }

    public void off (View v){
        finish();
    }




}
