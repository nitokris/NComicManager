package com.nitokrisalpha.entity;

import lombok.Data;

@Data
public class BaseEntity {

    //  要允许为空，用于新增操作
    protected Long id;

}
