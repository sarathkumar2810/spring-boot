package com.learn.spring.lean_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learn.spring.lean_spring_framework.enterprise.WebController;
//import com.learn.spring.lean_spring_framework.game.GameRunner;
//import com.learn.spring.lean_spring_framework.game.MarioGame;
//import com.learn.spring.lean_spring_framework.game.SuperContraGame;
//import com.learn.spring.lean_spring_framework.game.PacManGame;

@SpringBootApplication
public class LeanSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(LeanSpringFrameworkApplication.class, args);
		
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		
//		PacManGame game = new PacManGame(); //1
//		GameRunner runner = new GameRunner(game); //2
		
//		GameRunner runner = context.getBean(GameRunner.class);
//		runner.run();
		
		WebController controller = context.getBean(WebController.class);
		System.out.println(controller.returnValueFromBusiness());
	}

}
