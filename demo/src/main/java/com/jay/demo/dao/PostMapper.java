package com.jay.demo.dao;

import com.jay.demo.dto.posts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface PostMapper {

    List<posts> getPostListBySiteName(@Param("site_name") String siteName);
    List<posts> getPostList();

    posts getPostById(@Param("post_id") Integer postId);

    List<posts> searchPostListByTitleKeyword(@Param("keyword") String keyword);

    List<posts> getPostListByPage(@Param("start_idx") Integer startIndex);
}
