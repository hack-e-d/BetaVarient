package vijay.projects.betavarient.Controllers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import vijay.projects.betavarient.Entities.Student;
import vijay.projects.betavarient.Repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class StudentsController {

    @Autowired
    StudentRepository studentRepository;

    public static Logger logger  = LogManager.getLogger(StudentsController.class);

    @GetMapping("/students")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public List<Student> getStudents() {
        List<Student> students = studentRepository.findAll();
        logger.log(Level.INFO,students.toString());
        return students;
    }

    @GetMapping("/student")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public Student getStudent(@RequestParam String id) {
        Student student = studentRepository.findById(Integer.parseInt(id)).orElse(null);
        return student;
    }
}
