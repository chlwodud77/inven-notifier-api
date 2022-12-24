package com.jay.demo.service;

import com.jay.demo.dto.posts;

import java.util.List;

public interface PostService {
    public List<posts> getPostListBySiteName(String siteName);
    public List<posts> getPostList();
    posts getPostById(Integer postId);
    public List<posts> searchPostListByTitleKeyword(String keyword);
    public List<posts> getPostListByPage(Integer startIndex);
}
