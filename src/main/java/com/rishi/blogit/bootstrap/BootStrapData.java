package com.rishi.blogit.bootstrap;

import com.rishi.blogit.domain.Blog;
import com.rishi.blogit.domain.Post;
import com.rishi.blogit.repositories.BlogRepository;
import com.rishi.blogit.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    private BlogRepository blogRepository;
    private PostRepository postRepository;

    public BootStrapData(BlogRepository blogRepository, PostRepository postRepository) {
        this.blogRepository = blogRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Blog blog1 = new Blog();

        blog1.setOwner("Rishi");
        blog1.setTitle("Technology");
        blogRepository.save(blog1);

        Post post1 = new Post();
        post1.setAuthor("Rishi Gupta");
        post1.setTitle("Revolutionary Chromebooks!");
        post1.setContent("A new chromebook in the market.");
        post1.setPostDate(new Date());

        post1.setBlog(blog1);
        blog1.getPosts().add(post1);

        postRepository.save(post1);
        blogRepository.save(blog1);

        System.out.println("Post Count: "+postRepository.count());
        System.out.println("Blog Count: "+blogRepository.count());
        System.out.println("Blog Posts: "+blog1.getPosts());

    }
}
