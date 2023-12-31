package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/plain");
		response.setContentType("text/json");
		
		// request parameter
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age"));
		// 만약 request parameter가 없을 때 = age parameter가 없을 때 null로 넘어가서 error 발생
		// = Integer.valueOf(null)
		
		PrintWriter out = response.getWriter();
//		out.println("결과");
//		out.println("user_id: " + userId);
//		out.println("name: " + name);
//		out.println("age: " + age);
		
		// {"user_id":"ida741", "name":"윤현빈", "age":21} = type은 string
		out.println("{\"user_id\":\"" + userId + "\", "
				+ "\"name\":\"" + name + "\", "
				+ "\"age\":" + age + "}");
		
	}
	
}
