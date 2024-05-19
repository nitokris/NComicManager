package com.nitokrisalpha.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageR<T> {
    private long total;
    private long size;
    private long totalPage;
    private long page;
    private List<T> records;
}
