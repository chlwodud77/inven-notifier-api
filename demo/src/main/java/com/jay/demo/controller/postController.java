package com.jay.demo.controller;


import com.jay.demo.dto.posts;
import com.jay.demo.service.impl.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class postController {

    @Autowired
    public PostServiceImpl postService;

    private static final Integer POST_LIST_LIMIT = 20;

    @GetMapping(value = {"/posts", "posts/{postId}"})
    public ResponseEntity<Map<String, Object>> posts(@PathVariable(required = false) Integer postId,
                                                     @RequestParam(required = false) String site_name,
                                                     @RequestParam(required = false) String title_keyword,
                                                     @RequestParam(required = false) Integer page
                                                     ) {

        Map<String, Object> result = new HashMap<>();

        if (postId != null) {
            posts post = postService.getPostById(postId);
            result.put("data", post);
        } else {
            List<posts> posts;
            if (page != null) {
                posts = postService.getPostListByPage(POST_LIST_LIMIT * (page - 1));
            }
            else if (title_keyword != null) {
                posts = postService.searchPostListByTitleKeyword(title_keyword);
            } else if (site_name != null) {
                posts = postService.getPostListBySiteName(site_name);
            } else {
                posts = postService.getPostList();
            }
            result.put("count", posts.size());
            result.put("data", posts);
        }
        return ResponseEntity.ok().body(result);
    }

}
