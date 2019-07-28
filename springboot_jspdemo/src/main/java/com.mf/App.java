package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**\
 * springboot启动方式：
 * 1.@EnableAutoConfiguration 注解的作用：自动配置，扫包范围是当前类(本包和子包不扫描)
 * 2.@ComponentScan("com.mf.controller")，@ComponentScan缺点：如果包很多就要写很多路径
 * 3.@SpringBootApplication 等于@EnableAutoConfiguration + @ComponentScan 同级包和当前包
 * @ClassName App
 * @Description TODO
 * @Author msi
 * @Date 2019/7/28 11:14
 */
// @EnableAutoConfiguration
// @ComponentScan("com.mf.controller")
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}
}
