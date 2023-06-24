package com.example.urlhitcounter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Url {

    private Long id;
    //Private String Url;
    private Integer count;
}
