package android.scilab.choose.language;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class C extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c);
        WebView engine = (WebView) findViewById(R.id.web_engine);  
        engine.loadUrl("http://10.0.2.2/html/scilab/"); 
        
              
  

    }
    /*public void buttonclickhandler(View v) {
        // Do something when the button is clicked
        Intent startc=new Intent(this, android.scilab.choose.language.C.class);
        startActivity(startc);
       */
    }


