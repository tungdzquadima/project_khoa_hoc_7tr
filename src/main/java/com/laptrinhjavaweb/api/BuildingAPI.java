package com.laptrinhjavaweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.bean.BuildingBean;
import com.laptrinhjavaweb.bean.ErrorResponBean;

//@Controller 
@RestController
public class BuildingAPI {
	//@RequestMapping(value = "/api/building", method = RequestMethod.GET)
	//@ResponseBody // khi dùng @RestController thì ko cần cái này nữa
	@GetMapping("/api/building")
	public  List<BuildingBean> getBuilding(@RequestParam(value = "name", required = false) String name ,
														@RequestParam(value = "numberOfBasement", required = false) Integer numberOfBasement ,
														//@RequestParam(value = "types", required = false) String[] types 
														@RequestParam(value = "types", required = false) List<String> types 													
			){
		System.out.println(name); 
		System.out.println(numberOfBasement);
		for (String type : types) {
		    System.out.println(type);
		}
		return null;
	}
//	@GetMapping("/api/building")
//	public  BuildingBean getDetail(@PathVariable("buildingid") Long buildingId){
//		System.out.println(buildingId);
//		return null;
//	}
	
//	@PostMapping("/api/building")
//	public  BuildingBean createBuilding(@RequestBody BuildingBean newBuilding){	
//		System.out.print(newBuilding.toString());
//		return newBuilding;
//	}
	
	// sử lý trả ra exeption
	@PostMapping("/api/building")
	public  Object createBuilding(@RequestBody BuildingBean newBuilding){	
		try {
			System.out.println(10/0);
			return newBuilding;
		}catch(Exception e){
			// return error
			 ErrorResponBean errorResponBean=new ErrorResponBean();
			 errorResponBean.setError(e.getMessage());
			 List<String> details=new ArrayList<>();
			 details.add("lỗi chia cho ko");
			 errorResponBean.setDetails(details);
			 return errorResponBean;
		}
	}
	
	@PutMapping("/api/building")
	public  BuildingBean updateBuilding(@RequestBody BuildingBean updateBuilding){
		System.out.println(updateBuilding);
		return null;
	}
	
	@DeleteMapping("/api/building")
//	public void deleteBuilding(@RequestBody Long[] ids ){
	public void deleteBuilding(@RequestBody BuildingBean deleteBuilding) {
		System.out.println("ok");
	}
}
