package com.jay.demo.service.impl;

import com.jay.demo.dao.PostMapper;
import com.jay.demo.dto.posts;
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
    public List<posts> getPostListBySiteName(String siteName) {
        return postMapper.getPostListBySiteName(siteName);
    }

    @Override
    public List<posts> getPostList() {
        return postMapper.getPostList();
    }

    @Override
    public posts getPostById(Integer postId) {
        return postMapper.getPostById(postId);
    }

    @Override
    public List<posts> searchPostListByTitleKeyword(String keyword) {
        return postMapper.searchPostListByTitleKeyword(keyword);
    }

    @Override
    public List<posts> getPostListByPage(Integer startIndex) {
        return postMapper.getPostListByPage(startIndex);
    }
}
