package android.scilab.choose.language;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class ChooselanguageActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		switch (v.getId()) {
        		case R.id.r_c:

        	        Intent chosen = new Intent(v.getContext(), C.class);
        	        startActivityForResult(chosen, 0);
        	    
        		//tv2.setText("C is selected");
        		break;
        		case R.id.r_cplus:
        		//tv2.setText("C++ is selected");
        		break;
        		case R.id.r_java:
        		//tv2.setText("Java is selected");
        		break;
        		case R.id.r_scilab:
        		//tv2.setText("Scilab is selected");
        		
        		break;
        		case R.id.r_python:
        		//tv2.setText("Python is selected");
        		


        		break;
        		default:
        		break;
  
    }
}
}    
