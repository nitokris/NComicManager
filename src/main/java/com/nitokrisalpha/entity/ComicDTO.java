package com.nitokrisalpha.entity;


import com.nitokrisalpha.validator.group.AddGroup;
import com.nitokrisalpha.validator.group.OtherGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
public class ComicDTO {

    @Null(message = "唯一标识必须为空", groups = AddGroup.class)
    @NotNull(message = "唯一标识不能为空", groups = OtherGroup.class)
    private Long id;

    @NotBlank(message = "标题不能为空", groups = {AddGroup.class, OtherGroup.class})
    private String title;

    @NotBlank(message = "封面不能为空", groups = {AddGroup.class, OtherGroup.class})
    private String cover;

}
