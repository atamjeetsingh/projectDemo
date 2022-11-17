package com.crown.Attendance.contoller;



import com.crown.Attendance.entity.User;
import com.crown.Attendance.repo.UserRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@ComponentScan
@Controller
public class StudentController {

    private UserRepository repository;

    public StudentController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/student")
    public String studentHome(Model model) {
        List<User> all = repository.findAll();
        model.addAttribute("title", "Attendance Management System" );
        model.addAttribute("Students", all);
        return "student";
    }

}
