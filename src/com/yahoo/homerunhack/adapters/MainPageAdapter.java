package com.yahoo.homerunhack.adapters;

import java.util.ArrayList;

import com.yahoo.homerunhack.R;
import com.squareup.picasso.Picasso;
import com.yahoo.homerunhack.model.FeedItem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainPageAdapter extends ArrayAdapter<FeedItem>{

	public MainPageAdapter(Context context, ArrayList<FeedItem> aMovies){
		super(context, R.layout.item_feed, aMovies);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		FeedItem feedItem = getItem(position);
		if(convertView == null){
			LayoutInflater inflater = LayoutInflater.from(getContext());
			convertView = inflater.inflate(R.layout.item_feed , null);
		}
		TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
		tvTitle.setText(feedItem.getPage_title());

		ImageView ivPosterImage = (ImageView) convertView.findViewById(R.id.ivPosterImage);
		LayoutParams params = (LayoutParams) ivPosterImage.getLayoutParams();
		params.width = 150;
		params.height = 150;
		ivPosterImage.setLayoutParams(params);
		Picasso.with(getContext()).load(feedItem.getImage_url()).into(ivPosterImage);
		
		return convertView;
	}
}
