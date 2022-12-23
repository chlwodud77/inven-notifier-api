package com.jay.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class posts {
    private String post_id;
    private String site_name;
    private String title;
    private String post_url;
    private String collected_date;

    public String getPost_id() {
        return post_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public String getTitle() {
        return title;
    }

    public String getPost_url() {
        return post_url;
    }

    public String getCollected_date() {
        return collected_date;
    }
}
