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
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//去除标题栏
        setContentView(R.layout.main);
		
		BitmapDrawable draw = new BitmapDrawable("storage/emulated/0/qpython/qpyim.jpg");
		ImageView textView3 = (ImageView) findViewById(R.id.mainImageView1);	
		textView3.setImageDrawable(draw);
		
		
		
	}
	}
