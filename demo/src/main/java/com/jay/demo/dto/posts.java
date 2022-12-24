package com.jay.demo.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class posts {
    private String post_id;
    private String site_name;
    private String title;
    private String post_url;
    private String collected_date;

}
