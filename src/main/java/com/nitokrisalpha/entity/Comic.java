package com.nitokrisalpha.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("comic")
public class Comic extends BaseEntity {
    @TableField("title")
    private String title;
    @TableField("cover")
    private String cover;
}
