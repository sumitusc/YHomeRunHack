package com.yahoo.homerunhack;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.yahoo.homerunhack.R;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.yahoo.homerunhack.adapters.MainPageAdapter;
import com.yahoo.homerunhack.helpers.SwipeInterface;
import com.yahoo.homerunhack.model.FeedItem;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainPageActivity extends Activity{
	public ListView lvMovies;
	public MainPageAdapter adapterMovies;
	private final int REQUEST_CODE = 20;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//this.setTitle("New Title");
		//getActionBar().setIcon(R.drawable.ic_launcher_new);
		
		lvMovies = (ListView) findViewById(R.id.lvFeeds);
		ArrayList<FeedItem> aMovies = new ArrayList<FeedItem>();
		adapterMovies = new MainPageAdapter(this, aMovies);
		lvMovies.setAdapter(adapterMovies);

		fetchFeedItems();
		
		lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			
			@Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				//Toast.makeText(getBaseContext(), "Item Clicked", Toast.LENGTH_SHORT).show();
				FeedItem item = adapterMovies.getItem(position);
				//Log.d("DEBUG","TITLE = "+item.getPage_title());
				//Log.d("DEBUG","URL = "+item.getUrl());
				Intent browserIntent = new Intent(getBaseContext(),DetailPageActiivity.class);
				browserIntent.putExtra("url",item.getUrl());
				//Log.d("DEBUG","Satrting Activity");
				//startActivity(browserIntent);
				startActivityForResult(browserIntent, REQUEST_CODE);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.box_office, menu);
		return true;
	}
	
	private void fetchFeedItems() {
		//Log.d("DEBUG", "Trying to fetch articles");
		ArrayList<FeedItem> feedITems = FeedItem.getFeedItems();
		//Log.d("DEBUG", "Got artices number: "+feedITems.size());
		for(FeedItem item: feedITems){
			adapterMovies.add(item);
		}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
			Log.d("DEBUG", "RESULT OK");
		}
	}

}
