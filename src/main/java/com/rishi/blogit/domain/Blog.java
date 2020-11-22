package com.rishi.blogit.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String owner;
    String title;

    @OneToMany
    @JoinColumn(name = "blog_id")
    List<Post> posts = new ArrayList<>();

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
