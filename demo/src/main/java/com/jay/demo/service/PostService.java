package com.jay.demo.service;

import com.jay.demo.dto.Posts;

import java.util.List;

public interface PostService {
    public List<Posts> getPostListBySite(String siteName, Integer startIdx);
    public List<Posts> getPostList(Integer startIndex);
    public Posts getPostById(String postId);
    public List<Posts> searchPostListByTitle(String title, Integer startIdx);
    public List<Posts> searchPostListBySiteAndTitle(String siteName, String title, Integer startIdx);
}
