package com.rest.webservices.restful_web_services.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.restful_web_services.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

	List<Post> findAllById(int ids);

}
