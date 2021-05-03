package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView textview1,textview2;
   private double first;
   private double second;
   private double result;
   private String operation;
   private String answer;

    private Button button1, button2, button3, button4, button5, button6, button7, button8,button9,button0, buttonClear,buttonBackspce,buttonMultiply,buttonDivide,buttonSubtract,buttonPlus,buttonDot,buttonPercent,buttonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
try {
    getSupportActionBar().hide();
}
catch (NullPointerException ingnored){

}
       textview1 =findViewById ( R.id.textview1 );
       textview2 =findViewById ( R.id.textview2 );
       button0 =findViewById ( R.id.button0 );
       button1 =findViewById ( R.id.button1 );
       button2 =findViewById ( R.id.button2 );
       button3 =findViewById ( R.id.button3 );
       button4 =findViewById ( R.id.button4 );
       button5 =findViewById ( R.id.button5 );
       button6 =findViewById ( R.id.button6 );
       button7 =findViewById ( R.id.button7 );
       button8 =findViewById ( R.id.button8 );
       button9 =findViewById ( R.id.button9 );
       buttonBackspce =findViewById ( R.id.buttonBackspce );
       buttonClear = findViewById ( R.id.buttonClear );
       buttonMultiply= findViewById ( R.id.buttonMultiply );
       buttonEqual = findViewById ( R.id.buttonEqual );
       buttonDot = findViewById ( R.id.buttonDot );
       buttonPercent=findViewById ( R.id.buttonPercent );
       buttonPlus = findViewById ( R.id.buttonPlus );
       buttonSubtract =findViewById ( R.id.buttonSubtrack );
       buttonDivide = findViewById ( R.id.buttonDivide );


       buttonClear.setOnClickListener ( new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               textview1.setText ( null );
               try {
                   textview2.setText ( null );
               }
               catch (NullPointerException ignored){}


           }
       } );

       button0.setOnClickListener ( new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               String text;
               try {
                   text = textview2.getText().toString()+button0.getText().toString ();
                   textview2.setText ( text );
               }catch (NullPointerException ignored){}

           }
       } );

        button1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button1.getText().toString ();
                    textview2.setText ( text );

                }
                catch(NullPointerException ignored){

                }

            }
        } );

        button2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button2.getText().toString ();
                    textview2.setText ( text );

                }
                catch (NullPointerException ignored){

                }

            }
        } );

        button3.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button3.getText().toString ();
                    textview2.setText ( text );

                }
                catch (NullPointerException ignored){}

            }
        } );
        button4.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button4.getText().toString ();
                    textview2.setText ( text );
                }
                catch (NullPointerException ignored){

                }

            }
        } );
        button5.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button5.getText().toString ();
                    textview2.setText ( text );
                }
                catch (NullPointerException ignored){}

            }
        } );
        button6.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button6.getText().toString ();
                    textview2.setText ( text );
                }
                catch (NullPointerException ignored){

                }

            }
        } );
        button7.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button7.getText().toString ();
                    textview2.setText ( text );
                }
                catch (NullPointerException ignored){

                }

            }
        } );
        button8.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button8.getText().toString ();
                    textview2.setText ( text );

                }
                catch (NullPointerException ignored){

                }

            }
        } );
        button9.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+button9.getText().toString ();
                    textview2.setText ( text );
                }
                catch (NullPointerException ignored){}

            }
        } );
        buttonDot.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    text = textview2.getText().toString()+buttonDot.getText().toString ();
                    textview2.setText ( text );
                }catch (NullPointerException ignored){

                }

            }
        } );

        buttonBackspce.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String Backspace=null;
                try {
                    if(textview2.getText ().length ()>0){

                        StringBuilder stringBuilder =new StringBuilder(textview2.getText ());
                        stringBuilder.deleteCharAt ( textview2.getText ().length ()-1 );
                        Backspace= stringBuilder.toString ();
                        textview2.setText ( Backspace );
                    }
                }
                catch (NullPointerException ignored){}

            }
        } );



        ///code for operator
        buttonPercent.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String primary;
                try {
                    first = Double.parseDouble ( (String) textview2.getText ());
                    primary = String.format ( "%.2f", first );
                    textview1.setText ( primary );
                    textview2.setText ( " " );
                    operation ="%";
                }
                catch (NullPointerException ignored){}


            }
        } );


        buttonSubtract.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                try {
                    String primary;
                    first = Double.parseDouble ( (String) textview2.getText ());
                    primary = String.format ( "%.2f", first );
                    textview1.setText ( primary );
                    textview2.setText ( " " );
                    operation ="-";
                }catch(NullPointerException ignored){}

            }
        } );

        buttonPlus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                try {
                    String primary;
                    first = Double.parseDouble ( (String) textview2.getText ());
                    primary = String.format ( "%.2f", first );
                    textview1.setText ( primary );
                    textview2.setText ( " " );
                    operation ="+";
                }
                catch (NullPointerException ignored){}

            }
        } );
        buttonDivide.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                try {
                    String primary;
                    first = Double.parseDouble ( (String) textview2.getText ());
                    primary = String.format ( "%.2f", first );
                    textview1.setText ( primary );
                    textview2.setText ( " " );
                    operation ="/";
                }catch (NullPointerException ignored){}

            }
        } );
        buttonMultiply.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                try {
                    String primary;
                    first = Double.parseDouble ( (String) textview2.getText ());
                    primary = String.format ( "%.2f", first );
                    textview1.setText ( primary );
                    textview2.setText ( " " );
                    operation ="*";
                }catch (NullPointerException ignored){}

            }
        } );
        //// Equal

        buttonEqual.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                try {
                    second= Double.parseDouble ( (String) textview2.getText () );
                }
                catch (NullPointerException ignored){}

                if (operation =="+")
                {
                    result = first+second;
                    answer = String.format ( "%.2f", result );
                    textview2.setText ( answer );
                    textview1.setText ( null );
                }

                if (operation =="/")
                {
                    result = first/second;
                    answer = String.format ( "%.2f", result );
                    textview2.setText ( answer );
                    textview1.setText ( null );
                }
                if (operation =="-")
                {
                    result = first-second;
                    answer = String.format ( "%.2f", result );
                    textview2.setText ( answer );
                    textview1.setText ( null );
                }
                if (operation =="*")
                {
                    result = first*second;
                    answer = String.format ( "%.2f", result );
                    textview2.setText ( answer );
                    textview1.setText ( null );
                }
                if (operation =="%")
                {
                    result = first%second;
                    answer = String.format ( "%.2f", result );
                    textview2.setText ( answer );
                    textview1.setText ( null );
                }
            }
        } );






    }

}