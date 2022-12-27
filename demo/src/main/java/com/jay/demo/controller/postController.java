package com.jay.demo.controller;


import com.jay.demo.dto.Posts;
import com.jay.demo.service.impl.PostServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class postController {

    @Autowired
    public PostServiceImpl postService;

    private static final Integer POST_LIST_LIMIT = 20;

    private static Integer getStartIdx(Integer page) {
        return POST_LIST_LIMIT * (page - 1);
    }

    @GetMapping("posts/{postId}")
    public ResponseEntity<Map<String, Object>> posts(@PathVariable() String postId) {
        Map<String, Object> result = new HashMap<>();
        Posts post = postService.getPostById(postId);
        result.put("data", post);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/posts")
    public ResponseEntity<Map<String, Object>> posts(@RequestParam(required = false) String site_name,
                                                     @RequestParam(required = false) String title,
                                                     @RequestParam() Integer page
                                                     ) {

        Map<String, Object> result = new HashMap<>();
        List<Posts> posts;

        if (title == null & site_name == null) {
            posts = postService.getPostList(getStartIdx(page));
        }
        else if (site_name != null) {
            if (title == null) {
                posts = postService.getPostListBySite(site_name, getStartIdx(page));
            } else {
                posts = postService.searchPostListBySiteAndTitle(site_name, title, getStartIdx(page));
            }
        }
        else {
            posts =  postService.searchPostListByTitle(title, getStartIdx(page));
        }

        result.put("count", posts.size());
        result.put("data", posts);
        return ResponseEntity.ok().body(result);
    }

}
