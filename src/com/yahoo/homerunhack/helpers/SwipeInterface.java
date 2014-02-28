package com.yahoo.homerunhack.helpers;

/**
 * Created by gupsumit on 2/27/14.
 */
public interface SwipeInterface {

    public void onSwipeRight();
    public void onSwipeLeft();
    public void onSwipeUp(float velocityY);
    public void onSwipeDown() ;
    public void onLongPress();
    public void onDoubleTap();
    public void onLongSwipeUp();
    
}
