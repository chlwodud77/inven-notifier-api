package com.jay.demo.service.impl;

import com.jay.demo.dao.PostMapper;
import com.jay.demo.dto.Posts;
import com.jay.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    @Autowired
    public PostMapper postMapper;


    @Override
    public List<Posts> getPostListBySite(String siteName, Integer startIdx) {
        return postMapper.getPostListBySite(siteName, startIdx);
    }

    @Override
    public List<Posts> getPostList(Integer startIdx) {
        return postMapper.getPostList(startIdx);
    }

    @Override
    public Posts getPostById(Integer postId) {
        return postMapper.getPostById(postId);
    }

    @Override
    public List<Posts> searchPostListBySiteAndTitleKeyword(String siteName, String keyword, Integer startIdx) {
        return postMapper.searchPostListBySiteAndTitleKeyword(siteName, keyword, startIdx);
    }
}
