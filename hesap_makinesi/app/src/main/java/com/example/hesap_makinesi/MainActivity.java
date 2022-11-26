package com.example.hesap_makinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button sifir,virgul,esittir;
    Button button1,button2,button3;
    Button button4, button5, button6;
    Button button7, button8, button9;
    Button toplama, cikarma, carpma, bolme, sil;


    EditText sonuc;

    Float deger1, deger2;

    Boolean carp=false, bol=false, topla=false, cikar=false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sifir= (Button) findViewById(R.id.sifir);
        virgul= (Button) findViewById(R.id.virgul);
        esittir= (Button) findViewById(R.id.esittir);
        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button3);
        button4= (Button) findViewById(R.id.button4);
        button5= (Button) findViewById(R.id.button5);
        button6= (Button) findViewById(R.id.button6);
        button7= (Button) findViewById(R.id.button7);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        toplama= (Button) findViewById(R.id.toplama);
        cikarma= (Button) findViewById(R.id.cikarma);
        carpma= (Button) findViewById(R.id.carpma);
        bolme= (Button) findViewById(R.id.bolme);
        sonuc= (EditText) findViewById(R.id.sonuc);
        sil= (Button) findViewById(R.id.sil);



        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"1");


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"2");


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"3");


            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"4");


            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"5");


            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"6");


            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"7");


            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"8");


            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"9");


            }
        });

        virgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+",");


            }
        });

        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText("");
            }
        });

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sonuc==null){
                    sonuc.setText("");
                }
                else{
                    deger1=Float.parseFloat(sonuc.getText()+"");
                    topla=true;
                    sonuc.setText(null);
                }
            }
        });

        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(sonuc.getText()+"");
                cikar=true;
                sonuc.setText(null);
            }
        });

        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(sonuc.getText()+"");
                bol=true;
                sonuc.setText(null);
            }
        });

        carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(sonuc.getText()+"");
                carp=true;
                sonuc.setText(null);
            }
        });

        esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger2=Float.parseFloat(sonuc.getText()+"");
                if (topla==true){
                    sonuc.setText(deger1+deger2+"");
                    topla=false;
                }
                if (cikar==true){
                    sonuc.setText(deger1-deger2+"");
                    cikar=false;
                }
                if (carp==true){
                    sonuc.setText(deger1*deger2+"");
                    carp=false;
                }
                if (bol==true){
                    sonuc.setText(deger1/deger2+"");
                    bol=false;
                }
            }
        });


    }
}