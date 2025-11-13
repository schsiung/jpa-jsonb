package com.example.jpajsonb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Created by xiongsc on 2017/12/19.
 */

@Entity
@Data
@Table(name = "languages")
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
