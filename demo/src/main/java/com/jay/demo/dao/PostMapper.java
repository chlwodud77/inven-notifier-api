package com.jay.demo.dao;

import com.jay.demo.dto.Posts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {

    List<Posts> getPostListBySite(@Param("site_name") String siteName,
                                  @Param("start_idx") Integer startIdx);
    List<Posts> getPostList(@Param("start_idx") Integer startIdx);

    Posts getPostById(@Param("post_id") Integer postId);

    List<Posts> searchPostListByTitle(@Param("title") String title,
                                      @Param("start_idx") Integer startIdx);
    List<Posts> searchPostListBySiteAndTitle(@Param("site_name") String siteName,
                                                    @Param("title") String title,
                                                    @Param("start_idx") Integer startIdx);
}
