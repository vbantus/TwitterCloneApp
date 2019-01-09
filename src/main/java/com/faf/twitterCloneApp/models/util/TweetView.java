package com.faf.twitterCloneApp.models.util;

import com.faf.twitterCloneApp.models.Tweet;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TweetView {

    private Tweet parentTweet;

    private Tweet tweet;
}
