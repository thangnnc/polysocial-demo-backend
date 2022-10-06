package com.polysocial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Demo implements Serializable {

    private String demo1;

    private String demo2;

    private String demo3;

    private String demo4;
}
