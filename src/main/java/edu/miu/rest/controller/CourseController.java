package edu.miu.rest.controller;

import edu.miu.rest.dto.CourseDto;
import edu.miu.rest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

   @Autowired // optional
   public CourseController(CourseService courseService){
       this.courseService=courseService;
   }

   // http://localhost:8080/courses
    @GetMapping
    public List<CourseDto> findAllProducts() {
        return courseService.findAll();
    }

    // http://localhost:8080/courses?age=20

    @GetMapping("/search")
    public List<CourseDto> getAllStudentsByAge(@RequestParam int age){

       return nulll;
    }

    @PostMapping
    public void create(@RequestBody CourseDto dto){

    }

    @PutMapping("/{id}")
    public void update(@RequestBody CourseDto dto,
                       @PathVariable int id){

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

    }
}
