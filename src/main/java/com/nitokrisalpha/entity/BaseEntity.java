package com.nitokrisalpha.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    //  要允许为空，用于新增操作
    @TableId(value = "id")
    protected Long id;

    @TableField(value = "last_modify", update = "now()")
    protected Date lastModify;

}
