package your.scilab.icon;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class ScilabActivity extends Activity {
	
	private Button myButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		 WebView engine = (WebView) findViewById(R.id.web_engine);  
	       //engine.loadUrl("file:///sdcard/index.html"); 
		 engine.loadUrl("file:///sdcard/iitbscilab/scilab/index.html"); 		 
     
       
    }
}





