package com.example.servingwebcontent.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/courses")
    public String courses(Model model) {
        model.addAttribute("title", "Курсы");
        return "Courses";
    }
    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("title", "Студенты");
        return "Students";
    }
    @GetMapping("/teacher")
    public String teacher(Model model) {
        model.addAttribute("title", "Преподаватели");
        return "Teacher";
    }
    @GetMapping("/progress")
    public String progress(Model model) {
        model.addAttribute("title", "Оценки");
        return "Progress";
    }
}