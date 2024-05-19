package com.nitokrisalpha.controller;

import com.nitokrisalpha.api.R;
import com.nitokrisalpha.entity.ComicDTO;
import com.nitokrisalpha.service.ComicService;
import com.nitokrisalpha.validator.group.AddGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@Validated
@RestController
@RequestMapping("comic")
public class ComicController {

    @Autowired
    private ComicService comicService;

    @Validated(AddGroup.class)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public R<Void> addComic(@Valid @RequestBody ComicDTO comicDTO) {
        log.info("comic:{}", comicDTO.toString());
        comicService.addComic(comicDTO);
        return R.success();
    }

}
