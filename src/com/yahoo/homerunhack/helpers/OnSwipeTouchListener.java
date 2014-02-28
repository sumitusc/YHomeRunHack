package com.yahoo.homerunhack.helpers;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/**
 * Created by gupsumit on 2/27/14.
 */
public class OnSwipeTouchListener  implements View.OnTouchListener {

    private GestureDetector gestureDetector;
    private Context thisC;
    private SwipeInterface swipeInterface;

    public OnSwipeTouchListener(Context c, SwipeInterface swipe) {
        gestureDetector = new GestureDetector(c, new GestureListener());
        this.swipeInterface = swipe;
        thisC = c;
    }

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
    	
        return gestureDetector.onTouchEvent(motionEvent);
    }

    private final class GestureListener extends GestureDetector.SimpleOnGestureListener {

        private static final int SWIPE_THRESHOLD = 100;
        private static final int SWIPE_VELOCITY_THRESHOLD = 100;

        @Override
        public boolean onDown(MotionEvent e) {
            return true;
        }

        // Determines the fling velocity and then fires the appropriate swipe event accordingly
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            boolean result = false;
            try {
                float diffY = e2.getY() - e1.getY();
                float diffX = e2.getX() - e1.getX();
                //Log.d("DEBUG","velocityY="+velocityY);
                if (Math.abs(diffX) > Math.abs(diffY)) {
                    if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                        if (diffX > 0) {
                            swipeInterface.onSwipeRight();
                        } else {
                            swipeInterface.onSwipeLeft();
                        }
                    }
                } else {
                    if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
                        if (diffY > 0) {
                            swipeInterface.onSwipeDown();
                        } else {
                            swipeInterface.onSwipeUp(velocityY);
                        }
                    }
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            return result;
        }
        
        /*
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        	boolean result = true;
        	
        	try {
                float diffY = e2.getY() - e1.getY();
                float diffX = e2.getX() - e1.getX();
                //Log.d("DEBUG","onScroll:     diffY="+diffY+", diffX="+diffX);
                
                //Log.d("DEBUG","onScroll:     diffY="+diffY+", distanceY="+distanceY);
                
                
        	}catch (Exception exception) {
                exception.printStackTrace();
            }
        	
        	return result;
        }
        */
        
        @Override
        public void onLongPress(MotionEvent e){
        	//Log.d("DEBUG","LONG PRESSED...");
        	
        	//Log.d("DEBUG","getActionIndex="+e.getActionIndex());
        	//Log.d("DEBUG","getX="+e.getX());
        	//Log.d("DEBUG","getY="+e.getY());
        	//Log.d("DEBUG","getDownTime="+e.getDownTime());
        	
        	swipeInterface.onLongPress();
        }
        
        @Override
        public boolean onDoubleTap(MotionEvent e){
        	boolean result = false;
        	//Log.d("DEBUG","DOUBLE TAP...");
        	swipeInterface.onDoubleTap();
        	return result;
        }
    }

    

}
