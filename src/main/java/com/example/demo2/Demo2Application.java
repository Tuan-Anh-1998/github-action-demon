package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {

	@GetMapping("/wellCome")
	public String welcome(){
		return "Xin chao";
	}
//	echo "# github-action-demon" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Tuan-Anh-1998/github-action-demon.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
