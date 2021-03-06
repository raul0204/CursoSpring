package com.bytecode.core.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bytecode.core.model.Post;
import com.bytecode.core.services.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Override
	public List<Post> validation(List<Post> posts) {
		System.out.println("Primer Servicio");
		for(Post post: posts) {
			if(post.getTitulo() == null) {
				throw new NullPointerException("El titulo esta nulo");
			}
		}
		return posts;
	}
	
	@Override
	public void addClass(Class clazz) {
		System.out.println(clazz.getName());
	}

}
