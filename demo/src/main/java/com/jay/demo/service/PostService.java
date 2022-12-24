package com.jay.demo.service;

import com.jay.demo.dto.Posts;

import java.util.List;

public interface PostService {
    public List<Posts> getPostListBySite(String siteName, Integer startIdx);
    public List<Posts> getPostList(Integer startIndex);
    Posts getPostById(Integer postId);
    public List<Posts> searchPostListBySiteAndTitleKeyword(String siteName, String keyword, Integer startIdx);
}
