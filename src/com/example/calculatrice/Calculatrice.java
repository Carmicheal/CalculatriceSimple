package com.example.calculatrice;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculatrice extends Activity { //! la classe Calculatrice est une calculatrice simple sur Android ==> Description breve.
	static int operation; //! sert a contenir le type d'operations a effectuer ==> Description breve.
    @Override
    //! onCreate sert a creer l'application android ==> Description breve.
    public void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    //! La fonction addition permet de faire une addition lors du clique sur "+" ==> Description breve.
    /*! \param v La vue Android */
    public void addition(View v){ 
    	operation = 0;
    }
    //! La fonction soustraction permet de faire une soustraction lors du clique sur "-" ==> Description breve.
    /*! \param v La vue Android */
    public void soustraction(View v){ 
    	operation = 1;
    }
    //! La fonction multiplication permet de faire une multiplication lors du clique sur "*" ==> Description breve.
    /*! \param v La vue Android */
    public void multiplication(View v){ 
    	operation = 2;
    }
    //! La fonction division permet de faire une division lors du clique sur "/" ==> Description breve.
    /*! \param v La vue Android */
    public void division(View v){ 
    	operation = 3;
    }
    //! La fonction resultats permet de faire le calcul lors du clique sur "=", la fonction effectue le calcul puis l'affiche dans un TextView ==> Description breve.
    /*! On recupere les informations contenues dans les champs textes, puis on les converties en String afin de les convertir en integer par la suite. ==> Description complete.
    \param v La vue Android */
    public void resultat(View v){ 
    	EditText t = (EditText)findViewById(R.id.editText1);
    	String aString = t.getText().toString(); 
    	int a = Integer.parseInt(aString);
    	
    	EditText t2 = (EditText)findViewById(R.id.editText2);
    	String bString = t2.getText().toString();
    	int b = Integer.parseInt(bString);
    	
    	
    	int reponse; //! sert a  contenir le resultat de l'operation ==> Description breve.
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
