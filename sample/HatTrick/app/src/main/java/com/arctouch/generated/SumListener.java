package com.arctouch.generated;
import java.util.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.arctouch.toolkit.*;


public class SumListener extends ATKClickListener {
	public CalculatorState calculator;
	public com.arctouch.toolkit.ATKLabel output;

	public void onClick (final ATKView view) {
		calculator . doOperation ();
		calculator . op=calculator . Sum;
		output . setText (String.valueOf (calculator . acc));

	}
	
}