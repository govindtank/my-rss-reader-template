package com.moac.android.myrssreader.api;

import com.moac.android.myrssreader.model.RssFeedResponse;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * A Retrofit interface for making API calls.
 *
 * Host: http://feeds.bbci.co.uk/
 *
 * @see <a href="http://square.github.io/retrofit/">Retrofit</a>
 */
public interface BbcRssApi {

    @GET("/news/rss.xml")
    void getFeedItems(Callback<RssFeedResponse> feedItemsCallback);
}
