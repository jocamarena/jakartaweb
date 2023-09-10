package com.example.jakartaweb.model;

import com.example.jakartaweb.utils.StringUtils;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Memory {
    private String name;
    private String title;
    private String body;
    @Override
    public String toString(){
        return String.format("Name: %s, Title: %s, Body: %s", name, title, StringUtils.brief(body, 30));
    }
}
