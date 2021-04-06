package com.example.photoalbum.controllers;

import com.example.photoalbum.domain.User;
import com.example.photoalbum.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @GetMapping()
    public String main(){
        return "index";
    }

}
