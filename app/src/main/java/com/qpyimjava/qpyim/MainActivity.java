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
		
		new Thread() {
			@Override
			public void run() {
				
					
				while(true){
				final BitmapDrawable draw = new BitmapDrawable("/sdcard/qpython/qpyim.jpg");
				final ImageView textView3 = (ImageView) findViewById(R.id.mainImageView1);	
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException e)
					{}
					runOnUiThread(new Runnable(){
							@Override
							public void run() {
								textView3.setImageDrawable(draw);

							}
						});
						
				}
			}
		}.start();
		
		
	}
	}
