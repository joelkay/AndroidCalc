package the.androidcalc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	float num1;
	float num2;
	String operand,buffer;
	EditText display;
	TextView answer;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot;//inputs
	Button oadd, osub, odiv, omult;//operators
	Button clear, cleare, equals;//clear buttons
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		StrictMode.ThreadPolicy policy = new StrictMode.
		ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		display = (EditText) findViewById(R.id.tvDisplay);
		answer = (TextView) findViewById(R.id.tvAnswer);
		
		b1 = (Button) findViewById(R.id.btnOne);
		b2 = (Button) findViewById(R.id.btnTwo);
		b3 = (Button) findViewById(R.id.btnThree);
		b4 = (Button) findViewById(R.id.btnFour);
		b5 = (Button) findViewById(R.id.btnFive);
		b6 = (Button) findViewById(R.id.btnSix);
		b7 = (Button) findViewById(R.id.btnSeven);
		b8 = (Button) findViewById(R.id.btnEight);
		b9 = (Button) findViewById(R.id.btnNine);
		
		b0 = (Button) findViewById(R.id.btnZero);
		bdot = (Button) findViewById(R.id.btnDot);
		equals = (Button) findViewById(R.id.btnEqual);
		
		oadd = (Button) findViewById(R.id.btnPlus);
		osub = (Button) findViewById(R.id.btnMinus);
		odiv = (Button) findViewById(R.id.btnDivide);
		omult = (Button) findViewById(R.id.btnMultiply);
		
		clear = (Button) findViewById(R.id.btnClear);
		cleare = (Button) findViewById(R.id.btnClearEntry);
		
		try{
			b1.setOnClickListener((OnClickListener) this);
			b2.setOnClickListener((OnClickListener) this);
			b3.setOnClickListener((OnClickListener) this);
			b4.setOnClickListener((OnClickListener) this);
			b5.setOnClickListener((OnClickListener) this);
			b6.setOnClickListener((OnClickListener) this);
			b7.setOnClickListener((OnClickListener) this);
			b8.setOnClickListener((OnClickListener) this);
			b9.setOnClickListener((OnClickListener) this);
			b0.setOnClickListener((OnClickListener) this);
			bdot.setOnClickListener((OnClickListener) this);
			oadd.setOnClickListener((OnClickListener) this);
			osub.setOnClickListener((OnClickListener) this);
			odiv.setOnClickListener((OnClickListener) this);
			omult.setOnClickListener((OnClickListener) this);
			clear.setOnClickListener((OnClickListener) this);
			cleare.setOnClickListener((OnClickListener) this);
			equals.setOnClickListener((OnClickListener) this);
		}
		catch(Exception e){
            
        }
	
	}
	
	public boolean isNetworkAvailable() {
	    ConnectivityManager cm = (ConnectivityManager) 
	      getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo networkInfo = cm.getActiveNetworkInfo();
	    // if no network is available networkInfo will be null
	    // otherwise check if we are connected
	    if (networkInfo != null && networkInfo.isConnected()) {
	        return true;
	    }
	    return false;
	} 
	
	
	public void Calculate(){
		BufferedReader in = null;

		if(isNetworkAvailable()){
			try {
				num2 = Float.parseFloat(display.getText().toString());
				display.setText("");
				
				HttpClient httpclient = new DefaultHttpClient();
				
				String server = "http://cs.kent.ac.uk/~iau/calc.php";
				String calculation="";
				
				if(operand.equals("+")){
					calculation= "?f=A&v1="+num1+"&v2="+num2;
				}
				else if(operand.equals("-")){
					calculation= "?f=S&v1="+num1+"&v2="+num2;
				}
				else if(operand.equals("*")){
					calculation= "?f=M&v1="+num1+"&v2="+num2;
				}
				else if(operand.equals("/")){
					calculation= "?f=D&v1="+num1+"&v2="+num2;
				}
				
				URI uri = new URI(server+calculation);
				HttpGet request =  new HttpGet();
				request.setURI(uri);
				
				HttpResponse response = httpclient.execute(request);
				in = new BufferedReader(new InputStreamReader(
		                   response.getEntity().getContent()));
				
				String line = in.readLine();
				
				answer.setText(line);
				
			}
			catch (Exception e) {
				  e.printStackTrace();
			}
		}
		else{
			answer.setText("Connection Failed");
		}
	}
	
	@Override
	public void onClick(View id){
		Editable str =  display.getText();
		switch(id.getId()){
			case R.id.btnOne:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b1.getText());
				display.setText(str);
			break;
			case R.id.btnTwo:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b2.getText());
				display.setText(str);
			break;
			case R.id.btnThree:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b3.getText());
				display.setText(str);
			break;
			case R.id.btnFour:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b4.getText());
				display.setText(str);
			break;
			case R.id.btnFive:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b5.getText());
				display.setText(str);
			break;
			case R.id.btnSix:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b6.getText());
				display.setText(str);
			break;
			case R.id.btnSeven:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b7.getText());
				display.setText(str);
			break;
			case R.id.btnEight:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b8.getText());
				display.setText(str);
			break;
			case R.id.btnNine:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b9.getText());
				display.setText(str);
			break;
			case R.id.btnZero:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(b0.getText());
				display.setText(str);
			break;
			
			case R.id.btnDot:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
				}
				str = str.append(bdot.getText());
				display.setText(str);
			break;
			
			case R.id.btnClear:
				num1=0;
				num2=0;
				display.setText("");
				display.setHint("Enter a new calculation");
				answer.setText("");
			break;
				
			case R.id.btnClearEntry:
				if(num2 != 0){
					num2 = 0;
					display.setText("");
					answer.setText(Float.toString(num1));
				}
				operand=null;
				str.clear();
				display.setText(str);
			break;
			
			case R.id.btnPlus:
				operand="+";
				if(num1 == 0){
					num1=Float.parseFloat(display.getText().toString());
					display.setText("");
					buffer=num1+"+";
					answer.setText(buffer);
				}
				else if(num2 !=0 ){
					num2 = 0;
					display.setText("");
				}
				else{
					num2 = Float.parseFloat(display.getText().toString());
					display.setText("");
					num1 = num1+num2;
					answer.setText(Float.toString(num1));
				}
			break;
			
			case R.id.btnMinus:
				operand="-";
				if(num1 == 0){
					num1=Float.parseFloat(display.getText().toString());
					display.setText("");
					buffer=num1+"-";
					answer.setText(buffer);
				}
				else if(num2 !=0 ){
					num2 = 0;
					display.setText("");
				}
				else{
					num2 = Float.parseFloat(display.getText().toString());
					display.setText("");
					num1 = num1-num2;
					answer.setText(Float.toString(num1));
				}
			break;
			
			case R.id.btnMultiply:
				operand="*";
				if(num1 == 0){
					num1=Float.parseFloat(display.getText().toString());
					display.setText("");
					buffer=num1+"*";
					answer.setText(buffer);
				}
				else if(num2 !=0 ){
					num2 = 0;
					display.setText("");
				}
				else{
					num2 = Float.parseFloat(display.getText().toString());
					display.setText("");
					num1 = num1*num2;
					answer.setText(Float.toString(num1));
				}
			break;
			
			case R.id.btnDivide:
				operand="/";
				if(num1 == 0){
					num1=Float.parseFloat(display.getText().toString());
					display.setText("");
					buffer=num1+"/";
					answer.setText(buffer);
				}
				else if(num2 !=0 ){
					num2 = 0;
					display.setText("");
				}
				else{
					num2 = Float.parseFloat(display.getText().toString());
					display.setText("");
					num1 = num1/num2;
					answer.setText(Float.toString(num1));
				}
			break;
			
			case R.id.btnEqual:
				if(!operand.equals(null)){	
					Calculate();
				}
						
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
