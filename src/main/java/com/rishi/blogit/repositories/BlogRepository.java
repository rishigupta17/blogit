package com.rishi.blogit.repositories;

import com.rishi.blogit.domain.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog,Long> {
}
