package com.example.calculatrice;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculatrice extends Activity {
	static int operation;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
 
    public void addition(View v){
    	operation = 0;
    }
    
    public void soustraction(View v){
    	operation = 1;
    }
    
    public void multiplication(View v){
    	operation = 2;
    }
    
    public void division(View v){
    	operation = 3;
    }
    
    public void resultat(View v){
    	EditText t = (EditText)findViewById(R.id.editText1);
    	String aString = t.getText().toString();
    	int a = Integer.parseInt(aString);
    	
    	EditText t2 = (EditText)findViewById(R.id.editText2);
    	String bString = t2.getText().toString();
    	int b = Integer.parseInt(bString);
    	
    	
    	int reponse;
    	switch(operation){
    						case 0 : reponse = (a+b);
    									break;
    						case 1 : reponse = (a-b);
    									break;
    						case 2 : reponse = (a*b);
    									break;
    						case 3 : reponse = (a/b);
    									break;
    						default : reponse = 0;
    									break;
    	}
    	TextView tResultat = (TextView) findViewById(R.id.textView1);
    	tResultat.setText(Integer.toString(reponse));
    }
}
