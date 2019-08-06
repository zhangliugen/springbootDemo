package cn.com.yitong.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.yitong.pojo.ResponseResult;

@RestController
@RequestMapping("/root")
public class HelloController {
	@RequestMapping("/hello.do")
	public ResponseResult hello() {
		User u = new User();
		u.setName("张留根");
		u.setAge("18");
		u.setBirthdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		u.setDesc("张留根的信息");
		return ResponseResult.ok(u);
	}
}
