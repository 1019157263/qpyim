package com.qpyimjava.qpyim;

import android.app.*;
import android.os.*;
import android.graphics.drawable.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		BitmapDrawable draw = new BitmapDrawable("storage/emulated/0/qpython/qpyim.jpg");
		View textView3 = (LinearLayout) findViewById(R.id.mainLinearLayout1);	
		textView3.setBackgroundDrawable(draw);
    }
}
