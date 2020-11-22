package com.rishi.blogit.repositories;

import com.rishi.blogit.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
