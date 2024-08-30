package com.microservice.course.client;

import com.microservice.course.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8090") //nombre de la app a conectar con el port y getmapping
//@FeignClient(name = "msvc-student", url = "localhost:8080/api/student") //nombre de la app a conectar con el port y getmapping
public interface StudentClient { //Llamada al microservicio student
    @GetMapping("/api/student/search-by-course/{idCourse}")
    List<StudentDTO> findAllStudentByCourse(@PathVariable Long idCourse); //no puedo retornar un entity, sino un dto
}
