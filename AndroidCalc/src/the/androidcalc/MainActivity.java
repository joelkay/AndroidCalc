package the.androidcalc;

import android.os.Bundle;
import android.app.Activity;
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
	
	public void Calculate(){
		if(operand.equals("+")){
			num2 = Float.parseFloat(display.getText().toString());
			display.setText("");
			num1 = num1 + num2;
			answer.setText(Float.toString(num1));
		}
		else if(operand.equals("-")){
			num2 = Float.parseFloat(display.getText().toString());
			display.setText("");
			num1 = num1 - num2;
			answer.setText(Float.toString(num1));
		}
		else if(operand.equals("*")){
			num2 = Float.parseFloat(display.getText().toString());
			display.setText("");
			num1 = num1 * num2;
			answer.setText(Float.toString(num1));
		}
		else if(operand.equals("/")){
			num2 = Float.parseFloat(display.getText().toString());
			display.setText("");
			num1 = num1 / num2;
			answer.setText(Float.toString(num1));
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
					if(num2!=0){
						if(operand.equals("+")){
							//num1 = num1+num2;
							answer.setText(Float.toString(num1));
						}	
						else if(operand.equals("-")){
							//num1 = num1-num2;
							answer.setText(Float.toString(num1));
 
						}
						else if(operand.equals("*")){
							//num1 = num1*num2;
							answer.setText(Float.toString(num1));
 
						}
						else if(operand.equals("/")){
							//num1 = num1/num2;
							answer.setText(Float.toString(num1));
 
						}
					}
					else{
						Calculate();
					}
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
