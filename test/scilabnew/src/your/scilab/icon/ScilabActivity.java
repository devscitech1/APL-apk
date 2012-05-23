package your.scilab.icon;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
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

       WebSettings webSettings = engine.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //MyWebChromeClient myWebChromeClient = new MyWebChromeClient();
        
		//engine.setWebChromeClient(myWebChromeClient);


	       //engine.loadUrl("file:///sdcard/testindex.html"); 
		engine.loadUrl("file:///sdcard/iitbscilab/scilab/index.html"); 		 
     
	       engine.setWebChromeClient(new WebChromeClient()

	        {
	            @Override
	            public void onConsoleMessage(String message, int lineNumber,String sourceID) {
	                Log.d("MyApplication", message + " -- From line "+ lineNumber + " of " + sourceID);
	                super.onConsoleMessage(message, lineNumber, sourceID);
	            }

	        });

    }
//added the class for popusps
    
/*public class MyWebChromeClient extends WebChromeClient {

@Override
public boolean onJsAlert(WebView view, String url, String message, JsResult result)
{
final JsResult finalRes = result;
new AlertDialog.Builder(view.getContext())
.setMessage(message)
.setPositiveButton(android.R.string.ok,
new AlertDialog.OnClickListener()
{
@Override
public void onClick(DialogInterface dialog, int which) {
finalRes.confirm();
}

@Override
public void onClick(DialogInterface dialog, int which) {
	// TODO Auto-generated method stub
	
}
})
.setCancelable(false)
.create()
.show();
return true;
}
}*/

}





