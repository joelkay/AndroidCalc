package the.androidcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	String calc; //this is the total of our calculation
	TextView display;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot;//inputs
	Button oadd, osub, odiv, omult;//operators
	Button clear, cleare, equals;//clear buttons
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		calc = "";
		display = (TextView) findViewById(R.id.tvDisplay);
		
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
	
		
		bdot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+=".";//adds one to the calculation
				display.setText(calc);
			}
		});
		
		b0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="0";//adds one to the calculation
				display.setText(calc);
			}
		});
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="1";//adds one to the calculation
				display.setText(calc);
			}
		});
		
		
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="2";//adds one to the calculation
				display.setText(calc);
				
			}
		});
		
		b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="3";//adds one to the calculation
				display.setText(calc);
			}
		});
		
		
		b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="4";//adds one to the calculation
				display.setText(calc);
				
			}
		});
		
		b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="5";//adds one to the calculation
				display.setText(calc);
			}
		});
		
		
		b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="6";//adds one to the calculation
				display.setText(calc);
				
			}
		});
		
		b7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="7";//adds one to the calculation
				display.setText(calc);
			}
		});
		
		
		b8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="8";//adds one to the calculation
				display.setText(calc);
				
			}
		});
		
		b9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calc+="9";//adds one to the calculation
				display.setText(calc);
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
