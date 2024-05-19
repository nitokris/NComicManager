package com.nitokrisalpha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nitokrisalpha.entity.Comic;
import com.nitokrisalpha.entity.ComicDTO;
import com.nitokrisalpha.mapper.ComicMapper;
import com.nitokrisalpha.service.ComicService;
import org.springframework.stereotype.Service;

@Service
public class ComicServiceImpl extends ServiceImpl<ComicMapper, Comic> implements ComicService {


    @Override
    public void addComic(ComicDTO comicDTO) {
        Comic comic = new Comic();
        comic.setTitle(comicDTO.getTitle());
        comic.setCover(comicDTO.getCover());
        this.save(comic);
    }


}
