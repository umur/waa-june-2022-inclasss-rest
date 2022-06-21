package edu.miu.rest.service;

import edu.miu.rest.dto.CourseDto;

import java.util.List;

public interface CourseService {
    List<CourseDto> findAll();
    void create(CourseDto dto);

}
