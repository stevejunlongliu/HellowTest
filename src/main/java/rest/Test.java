package rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.TestService;

import com.alibaba.fastjson.JSONObject;

@Controller
public class Test {
	
	@Autowired 
	TestService testService;
	@RequestMapping(value = "/testLogin")
	@ResponseBody
	public JSONObject testIndex(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue = "") String oid) {
		JSONObject result = new JSONObject();
		testService.test1();
		result.put("key", "value");
		return result;
	}
	
	@RequestMapping(value = "/t1",produces="text/html;charset=UTF-8",method=RequestMethod.GET)
	@ResponseBody
	public String testIndex1(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue = "") String oid) {
		return "redirect:"+"www.baidu.com?a=刘骏龙";
	}
	
	
}
