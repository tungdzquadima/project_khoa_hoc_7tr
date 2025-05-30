package com.laptrinhjavaweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.laptrinhjavaweb.bean.UserBean;

@RestController
public class UserAPI {
	
		//@RequestMapping(value = "/api/building", method = RequestMethod.GET)
		//@ResponseBody // khi dùng @RestController thì ko cần cái này nữa
		@GetMapping("/api/staff")
		public  List<UserBean> getStaff(@RequestParam(value = "buildingId", required = false) Long buildingId 												
				){
			List<UserBean> results=new ArrayList<>();
			return results;
			}
		
		
		@GetMapping("/api/users")
		public  List<UserBean> getUsers(@RequestParam(value = "buildingId", required = false) Long buildingId, 		
										@RequestParam(value = "role", required = false) String roleCode
				){
			List<UserBean> results=new ArrayList<>();
			return results;
			}
		
}

