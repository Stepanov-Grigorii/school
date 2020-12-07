package ru.grandstep.school.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ru.grandstep.school.model.User;
import ru.grandstep.school.service.UserService;

@Controller
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/list")
    public ModelAndView listUsers(){
        return new ModelAndView("user/list", "users", userService.getAll());
    }

    @GetMapping({"/form", "/form/{id}"})
    public ModelAndView editUser(@PathVariable(required = false) Integer id){
        User user = id == null ? new User() : userService.getById(id);
        return new ModelAndView("user/form", "user", user);
    }

    @PostMapping("/save")
    public RedirectView saveUser(@ModelAttribute User user){
        userService.saveOrUpdate(user);
        return new RedirectView("list");
    }
}
