package com.learn.spring.lean_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {
	
	public void up() {
		System.out.println("PacManGame up");
	}
	
	public void down() {
		System.out.println("PacManGame down");
	}
	
	public void left() {
		System.out.println("PacManGame left");
	}
	
	public void right() {
		System.out.println("PacManGame right");
	}

}
