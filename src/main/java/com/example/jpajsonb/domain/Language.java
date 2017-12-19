package com.example.jpajsonb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xiongsc on 2017/12/19.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {
    @Id
    private Long languageid;

    private String description;
    private String culture;
    private String specificculture;
    private String data;
}
