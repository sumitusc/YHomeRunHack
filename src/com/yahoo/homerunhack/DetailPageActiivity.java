package com.yahoo.homerunhack;

import com.yahoo.homerunhack.R;
import com.yahoo.homerunhack.helpers.OnSwipeTouchListener;
import com.yahoo.homerunhack.helpers.SwipeInterface;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class DetailPageActiivity extends Activity implements SwipeInterface{

	WebView webView = null;
	private int swipeUpCount = 0;
	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail_view);
		
		String uri = (String) getIntent().getSerializableExtra("url");
		webView = (WebView) findViewById(R.id.webview);
		webView.setWebViewClient(new WebViewClient());
		webView.loadUrl(uri);
		webView.setOnTouchListener(new OnSwipeTouchListener(this, this));
	}


	@Override
	public void onSwipeRight() {
		//Log.d("DEBUG","RIGHTTTT");
		//Toast.makeText(getBaseContext(), "RIGHTTTT", Toast.LENGTH_SHORT).show();
		
	}

	@Override
	public void onSwipeLeft() {
		//Log.d("DEBUG","LEFTTTT");
		//Toast.makeText(getBaseContext(), "LEFTTTT", Toast.LENGTH_SHORT).show();
		
	}

	@Override
	public void onSwipeUp(float velocityY) {
		/*
		Log.d("DEBUG","UPPPPPP");
		//Toast.makeText(getBaseContext(), "UPPPPPP", Toast.LENGTH_SHORT).show();
		if(webView != null){
			int contentHeight = webView.getContentHeight();
			float scale = webView.getScale();
			int height = webView.getHeight();
			Log.d("DEBUG","webViewHeight="+contentHeight 
					+ "\nwebWiewScale="+scale
					+"\nheight="+height);
		}else{
			Log.d("DEBUG","webView is NULL");
		}
		
		Log.d("DEBUG","UPPPPPP");
		Log.d("DEBUG","getScaleY = "+webView.getScaleY());
		Log.d("DEBUG","getScrollY = "+webView.getScrollY());
		Log.d("DEBUG","getTop = "+webView.getTop());
		Log.d("DEBUG","getY = "+webView.getY());
		*/
		
		if(velocityY < 0 && webView.getScrollY() != 0){
			swipeUpCount++;
			if(swipeUpCount > 1){
				Intent result = new Intent();
				setResult(RESULT_OK, result);
				finish();
			}else{
				Toast.makeText(getBaseContext(), "Swipe UP again to go to HOME.", Toast.LENGTH_SHORT).show();
			}
		}
		
		webView.pageDown(true);
		
	}

	@Override
	public void onSwipeDown() {
		
		if(swipeUpCount >= 1){
			swipeUpCount--;
			//Log.d("DEBUG","DOWN: swipeUpCount="+swipeUpCount);
		}
		/*
		Log.d("DEBUG","DOWNNNN");
		//Toast.makeText(getBaseContext(), "DOWNNNN", Toast.LENGTH_SHORT).show();
		if(webView != null){
			int contentHeight = webView.getContentHeight();
			float scale = webView.getScale();
			int height = webView.getHeight();
			Log.d("DEBUG","webViewHeight="+contentHeight 
					+ "\nwebWiewScale="+scale
					+"\nheight="+height);
		}else{
			Log.d("DEBUG","webView is NULL");
		}
		
		Log.d("DEBUG","DOWNNNN");
		Log.d("DEBUG","getScaleY = "+webView.getScaleY());
		Log.d("DEBUG","getScrollY = "+webView.getScrollY());
		Log.d("DEBUG","getTop = "+webView.getTop());
		Log.d("DEBUG","getY = "+webView.getY());
		*/
		webView.pageUp(true);
		
		
	}
	
	@Override
	public void onLongPress(){
		Intent result = new Intent();
		setResult(RESULT_OK, result);
		finish();
	}
	
	@Override
	public void onDoubleTap(){
		
		Intent result = new Intent();
		setResult(RESULT_OK, result);
		finish();
	}
	
	@Override
	public void onLongSwipeUp(){
		Intent result = new Intent();
		setResult(RESULT_OK, result);
		finish();
	}

	
}
