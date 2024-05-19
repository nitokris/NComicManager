package com.nitokrisalpha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nitokrisalpha.entity.Comic;
import com.nitokrisalpha.entity.ComicDTO;

public interface ComicService extends IService<Comic> {

    void addComic(ComicDTO comicDTO);

}
