package com.rishi.blogit.controller;

import com.rishi.blogit.repositories.BlogRepository;
import com.rishi.blogit.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {

    private BlogRepository blogRepository;
    private PostRepository postRepository;

    public BlogController(BlogRepository blogRepository, PostRepository postRepository) {
        this.blogRepository = blogRepository;
        this.postRepository = postRepository;
    }

    @RequestMapping("/list")
    public String getPostList(Model model) {

        model.addAttribute("posts",postRepository.findAll());

        return "blog/post_list.html";
    }
}
