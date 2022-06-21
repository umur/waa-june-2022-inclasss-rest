package edu.miu.rest.controller;

import edu.miu.rest.entity.Course;
import edu.miu.rest.repo.CourseRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CourseController {

   private final CourseRepo courseRepo;

//   @Autowired // optional
//   public CourseController(CourseRepo courseRepo){
//       this.courseRepo=courseRepo;
//   }

    @GetMapping("/courses")
    public List<Course> findAllProducts(){

        repo.findAll();
        return null;
    }
}
