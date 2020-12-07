package ru.grandstep.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.grandstep.school.model.User;
import ru.grandstep.school.service.UserService;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;
    @GetMapping("/")
    public ModelAndView mainPage(){
        User user = userService.getById(1);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/index")
    public ModelAndView indexPage(){
        User user = userService.getById(1);
        return new ModelAndView("index", "user", user);
    }

}
