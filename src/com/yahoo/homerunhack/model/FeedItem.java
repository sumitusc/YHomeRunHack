package com.yahoo.homerunhack.model;

import java.util.ArrayList;

public class FeedItem {

	private String url;
	private String page_title;
	private String image_url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPage_title() {
		return page_title;
	}
	public void setPage_title(String page_title) {
		this.page_title = page_title;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public static ArrayList<FeedItem> getFeedItems(){
		ArrayList<FeedItem> results = new ArrayList<FeedItem>();
		String url = "http://sports.yahoo.com/blogs/nfl-shutdown-corner/laces-orleans-saints-miss-early-field-goal-attempt-224052088--nfl.html";
		String page_title = "Laces out! New Orleans Saints miss early field-goal attempt because of poor hold";
		String image_url = "http://l3.yimg.com/bt/api/res/1.2/3zy6o281Hp5_9.7KL9bdnA--/YXBwaWQ9eW5ld3M7cT04NTt3PTc2/http://media.zenfs.com/en/blogs/sptusnflexperts/EdholmMug752.jpg";
		//FeedItem item = new FeedItem(url, page_title, image_url);
		FeedItem item1 = new FeedItem();
		item1.setUrl(url);
		item1.setPage_title(page_title);
		item1.setImage_url(image_url);
		results.add(item1);
		
		url = "http://news.yahoo.com/teen-dies-saving-classmates-suicide-bomber-223018543--abc-news-topstories.html";
		page_title = "Teen Dies Saving Classmates From Suicide Bomber";
		image_url = "http://l2.yimg.com/bt/api/res/1.2/agmSbnN1IjGY1MGAdbaJ2Q--/YXBwaWQ9eW5ld3M7cT04NTt3PTYwMA--/http://media.zenfs.com/en_us/gma/us.abcnews.go.com/AP_aitzaz_hasan_jef_140110_16x9_992.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item2 = new FeedItem();
		item2.setUrl(url);
		item2.setPage_title(page_title);
		item2.setImage_url(image_url);
		results.add(item2);
		
		url = "http://sports.yahoo.com/blogs/nfl-shutdown-corner/percy-harvin-suffers-possible-concussion-seattle-seahawks-third-220950410--nfl.html";
		page_title = "Percy Harvin hit hard on Seattle Seahawks' third offensive play, but returns after concussion tests";
		image_url = "http://l3.yimg.com/bt/api/res/1.2/o4Rlm9.oqYHzalLUc9dc1g--/YXBwaWQ9eW5ld3M7cT04NTt3PTc1/http://media.zenfs.com/en/blogs/sptusnflexperts/schwab75mug2.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item3 = new FeedItem();
		item3.setUrl(url);
		item3.setPage_title(page_title);
		item3.setImage_url(image_url);
		results.add(item3);
		
		url = "http://sports.yahoo.com/blogs/nfl-shutdown-corner/red-hot-chili-peppers-join-bruno-mars-during-233208792--nfl.html";
		page_title = "Red Hot Chili Peppers will join Bruno Mars during Super Bowl halftime show";
		image_url = "http://l.yimg.com/bt/api/res/1.2/_R.doE1pseJjt5R4_iHtpw--/YXBwaWQ9eW5ld3M7cT04NTt3PTYzMA--/http://media.zenfs.com/en/blogs/sptusnflexperts/rhcp111.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item4 = new FeedItem();
		item4.setUrl(url);
		item4.setPage_title(page_title);
		item4.setImage_url(image_url);
		results.add(item4);
		
		url = "http://screen.yahoo.com/buzzfeed/watch-photoshop-transform-favorite-celebrities-225244482.html";
		page_title = "Yahoo Screen";
		image_url = "http://l2.yimg.com/os/mit/td/lasso-0.0.539/images/yscreen-logo-300x300.png";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item5 = new FeedItem();
		item5.setUrl(url);
		item5.setPage_title(page_title);
		item5.setImage_url(image_url);
		results.add(item5);
		
		
		
		url = "http://gma.yahoo.com/blogs/abc-blogs/couple-marks-66th-anniversary-15-75-waldorf-astoria-181115517--abc-news-travel.html";
		page_title = "Couple Marks 66th Anniversary With $15.75 Waldorf Astoria Hotel Room";
		image_url = "http://l.yimg.com/bt/api/res/1.2/mfFn8UO0gubZ3fhnithmfQ--/YXBwaWQ9eW5ld3M7cT04NTt3PTYwMA--/http://media.zenfs.com/en_us/gma/gma/140110_gma_hotel_wg.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item6 = new FeedItem();
		item6.setUrl(url);
		item6.setPage_title(page_title);
		item6.setImage_url(image_url);
		results.add(item6);
		
		
		
		url = "http://gma.yahoo.com/hilarous-responses-dad-posing-11-month-old-212651810--abc-news-parenting.html";
		page_title = "Hilarious Responses of a Dad Posing as an 11-Month-Old";
		image_url = "http://l.yimg.com/bt/api/res/1.2/eWJd2lo5fdewG0U55RjW5g--/YXBwaWQ9eW5ld3M7cT04NTt3PTYzMA--/http://l.yimg.com/os/publish-images/gma/2014-01-10/82d442c9-f00d-4fbb-9cf8-326677aa026e_ht_emma_reddit_kb_140110_4x3_992.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item7 = new FeedItem();
		item7.setUrl(url);
		item7.setPage_title(page_title);
		item7.setImage_url(image_url);
		results.add(item7);
		
		
		url = "http://finance.yahoo.com/news/how-successful-people-make-the-most-of-their-weekends-152237741.html";
		page_title = "How Successful People Make the Most of Their Weekends";
		image_url = "http://l.yimg.com/bt/api/res/1.2/x2.QYW.XZyZHleKOp8Q6YQ--/YXBwaWQ9eW5ld3M7cT04NTt3PTYwMA--/http://l.yimg.com/os/publish-images/finance/2014-01-10/f1b6a898-dab3-4c0c-b823-225c1187b310_200322623-001.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item8 = new FeedItem();
		item8.setUrl(url);
		item8.setPage_title(page_title);
		item8.setImage_url(image_url);
		results.add(item8);
		
		
		url = "http://movies.yahoo.com/blogs/movie-news/meet-lowest-grossest-movie-2014-box-office-haul-205622727.html";
		page_title = "Meet the Lowest-Grossing Movie of 2013 (With a Box-Office Haul of Just $72)";
		image_url = "http://l1.yimg.com/bt/api/res/1.2/QFeZBcgoatZ4gD1RboD8hg--/YXBwaWQ9eW5ld3M7cT04NTt3PTMyMA--/http://media.zenfs.com/en-US/blogs/movie-news/star-trek-darkness-uk-film-20130502-121856-910.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item9 = new FeedItem();
		item9.setUrl(url);
		item9.setPage_title(page_title);
		item9.setImage_url(image_url);
		results.add(item9);
		
		
		url = "http://news.yahoo.com/young-mom-must-keep-her-wits-husband-considers-050008081.html";
		page_title = "Young Mom Must Keep Her Wits As Husband Considers Leaving";
		image_url = "http://l.yimg.com/bt/api/res/1.2/81I5U991YW6EEaB2Cjd58g--/YXBwaWQ9eW5ld3M7cT04NTt3PTYwMA--/http://l.yimg.com/os/mit/media/m/social/images/social_default_logo-1481777.png";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item10 = new FeedItem();
		item10.setUrl(url);
		item10.setPage_title(page_title);
		item10.setImage_url(image_url);
		results.add(item10);
		
		
		url = "http://sports.yahoo.com/blogs/nfl-shutdown-corner/marques-colston-loses-sense-time-then-mind-end-005727413--nfl.html";
		page_title = "Marques Colston loses sense of time, then his mind, at end of Saints' loss (Video)";
		image_url = "http://l3.yimg.com/bt/api/res/1.2/3zy6o281Hp5_9.7KL9bdnA--/YXBwaWQ9eW5ld3M7cT04NTt3PTc2/http://media.zenfs.com/en/blogs/sptusnflexperts/EdholmMug752.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item11 = new FeedItem();
		item11.setUrl(url);
		item11.setPage_title(page_title);
		item11.setImage_url(image_url);
		results.add(item11);
		
		
		url = "http://travel.yahoo.com/blogs/compass/doing-vacation-time-hotels-used-prisons-221351447.html";
		page_title = "These hotels used to be prisons";
		image_url = "http://l3.yimg.com/bt/api/res/1.2/Fk19zunJAN7SHGdg2YqIfQ--/YXBwaWQ9eW5ld3M7cT04NTt3PTYzMA--/http://media.zenfs.com/en-US/blogs/compass/1LibertyHotel_Lobby.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item12 = new FeedItem();
		item12.setUrl(url);
		item12.setPage_title(page_title);
		item12.setImage_url(image_url);
		results.add(item12);
		
		
		url = "http://shine.yahoo.com/at-home/biggest-mistakes-39-making-dishwasher-154700984.html";
		page_title = "The Biggest Mistakes You're Making with Your Dishwasher";
		image_url = "http://l.yimg.com/bt/api/res/1.2/FGLxfPBGJRXzktIr1.BFKQ--/YXBwaWQ9eW5ld3M7cT04NTt3PTMxMA--/http://media.zenfs.com/en-US/blogs/partner/470_2738945.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item13 = new FeedItem();
		item13.setUrl(url);
		item13.setPage_title(page_title);
		item13.setImage_url(image_url);
		results.add(item13);
		
		url = "http://homes.yahoo.com/connecticut/greenwich/499-indian-field-rd-fec911136b3352f95e0b5febfca885b3.html";
		page_title = "499 Indian Field Rd, Greenwich CT 06830 - Home for Sale - Yahoo Homes";
		image_url = "http://l.yimg.com/bt/api/res/1.2/81I5U991YW6EEaB2Cjd58g--/YXBwaWQ9eW5ld3M7cT04NTt3PTYwMA--/http://l.yimg.com/os/mit/media/m/social/images/social_default_logo-1481777.png";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item14 = new FeedItem();
		item14.setUrl(url);
		item14.setPage_title(page_title);
		item14.setImage_url(image_url);
		results.add(item14);
		
		url = "http://shine.yahoo.com/pets/6-things-pet-owners-drive-veterinarians-nuts-141300414.html";
		page_title = "6 Things Pet Owners Do that Drive Veterinarians Nuts";
		image_url = "http://l3.yimg.com/bt/api/res/1.2/Lys9d.d33nk5yThdQ5dL.w--/YXBwaWQ9eW5ld3M7cT04NTt3PTMxMA--/http://media.zenfs.com/en-US/blogs/partner/470_2743988.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item15 = new FeedItem();
		item15.setUrl(url);
		item15.setPage_title(page_title);
		item15.setImage_url(image_url);
		results.add(item15);
		
		url = "http://news.yahoo.com/video/whoknew-rarest-cars-060000725.html";
		page_title = "Rarest Cars";
		image_url = "http://l3.yimg.com/bt/api/res/1.2/eCUo1V7wW9PUPAYvLG7QVg--/YXBwaWQ9eW5ld3M7Zmk9ZmlsbDtoPTMxMDtxPTc1O3c9NTUw/http://media.zenfs.com/en-US/video/video.whoknew.com/WK_EP888_THUMB_Lb.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item16 = new FeedItem();
		item16.setUrl(url);
		item16.setPage_title(page_title);
		item16.setImage_url(image_url);
		results.add(item16);
		
		url = "http://news.yahoo.com/blogs/sideshow/dog-won-t-be-denied-chicken-nuggets-203736706.html";
		page_title = "Beagle won't be denied chicken nuggets";
		image_url = "http://l.yimg.com/bt/api/res/1.2/81I5U991YW6EEaB2Cjd58g--/YXBwaWQ9eW5ld3M7cT04NTt3PTYwMA--/http://l.yimg.com/os/mit/media/m/social/images/social_default_logo-1481777.png";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item17 = new FeedItem();
		item17.setUrl(url);
		item17.setPage_title(page_title);
		item17.setImage_url(image_url);
		results.add(item17);
		
		url = "http://movies.yahoo.com/blogs/movie-news/2014-golden-globes-pre-show-nominations-fey-poehler-193439179.html";
		page_title = "Watch Yahoo's 2014 Golden Globes Pre-Show!";
		image_url = "http://l1.yimg.com/bt/api/res/1.2/dcZkfn9S7lvA49RwhA1dKA--/YXBwaWQ9eW5ld3M7cT04NTt3PTYzMA--/http://media.zenfs.com/en_us/News/ap_webfeeds/c51ea70000424201480f6a706700d7d3.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item18 = new FeedItem();
		item18.setUrl(url);
		item18.setPage_title(page_title);
		item18.setImage_url(image_url);
		results.add(item18);
		
		url = "http://homes.yahoo.com/news/easy--affordable-ways-to-spruce-up-your-kitchen-202954316.html";
		page_title = "Easy, Affordable Ways to Spruce Up Your Kitchen";
		image_url = "http://l1.yimg.com/bt/api/res/1.2/H2COtFj7l.SGZE_7Xs3N8Q--/YXBwaWQ9eW5ld3M7cT04NTt3PTYwMA--/http://l.yimg.com/os/publish-images/homes/2014-01-10/acbedd6a-2042-4fd4-9bbd-594afc3b9080_kitchen-diy.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item19 = new FeedItem();
		item19.setUrl(url);
		item19.setPage_title(page_title);
		item19.setImage_url(image_url);
		results.add(item19);
		
		url = "http://movies.yahoo.com/blogs/movie-news/joaquin-phoenix-hopes-her-crazy-pants-don-t-233615929.html";
		page_title = "Joaquin Phoenix Hopes 'Her' Crazy Pants Don't Catch On";
		image_url = "http://l3.yimg.com/bt/api/res/1.2/soBoeM1iM65nf0N.WU3y6w--/YXBwaWQ9eW5ld3M7cT04NTt3PTMxMA--/http://media.zenfs.com/en-US/blogs/movie-news/d0054cea-feb9-40b6-af6b-e533cc6ae98b_HER-FP-0835.jpg";
		//item = new FeedItem(url, page_title, image_url);
		FeedItem item20 = new FeedItem();
		item20.setUrl(url);
		item20.setPage_title(page_title);
		item20.setImage_url(image_url);
		results.add(item20);
		
		return results;
	}
	
}
