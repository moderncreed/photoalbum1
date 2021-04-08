package com.example.photoalbum.controllers;

import com.example.photoalbum.domain.Image;
import com.example.photoalbum.repos.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private ImageRepo imageRepo;

    @GetMapping()
    public String main(Map<String, Object> model)
    {
        Iterable<Image> images = imageRepo.findAll();
        model.put("images", images);
        return "index";
    }
    @PostMapping
    public String add(@RequestParam String tag, Map<String, Object> model) {
        Image image = new Image(tag);
        imageRepo.save(image);
        Iterable<Image> images = imageRepo.findAll();
        model.put("images", images);
        return "index";
    }
    @PostMapping("filter")
    public String filter(@RequestParam String filter,Map<String, Object> model) {
        Iterable<Image> images;

        if (filter != null && !filter.isEmpty()) {
            images = imageRepo.findByTag(filter);
            model.put("images", images);
            return "index";
        } else {
            return  "tagIsEmpty";
        }


    }

}
