package com.faf.twitterCloneApp.services;

import com.faf.twitterCloneApp.models.Tweet;
import com.faf.twitterCloneApp.models.util.TweetType;
import com.faf.twitterCloneApp.models.util.TweetView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TweetService {

    Iterable<Tweet> findAll();

    Tweet findById (Long id);

    Tweet save(Tweet tweet);

    void deleteById(Long id);

    Long count();

    Iterable<Tweet> findAllByTwitterUserUsername(String username);

    Iterable<Tweet> findAllByTwitterUserUsernameAndType(String username, TweetType tweetType);


    Iterable<Tweet> findAllByTwitterUserUsernameOrderByCreateDateDesc(String username);

    Optional<Tweet> findByParentTweetIdAndTypeAndTwitterUserUsername (Long parentTweetId, TweetType tweetType, String username);

    List<Tweet> findTopTweetsByNumberOfReactions(Integer pageNumber, Integer pageSize);

    List<TweetView> findAllTweetViewsByTwitterUserUsername(String username);

    List<Tweet>  findAllByOrderByCreateDateDesc (Integer pageNumber, Integer pageSize);

    List<TweetView>  findAllTweetViewsByOrderByCreateDateDesc (Integer pageNumber, Integer pageSize);

    Iterable<Tweet> findAllByParentTweetId(Long parentTweetId);




}
