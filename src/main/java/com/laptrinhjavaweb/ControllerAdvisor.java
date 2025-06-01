package com.laptrinhjavaweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.laptrinhjavaweb.bean.ErrorResponBean;
import com.laptrinhjavaweb.customxception.FieldRequiredException;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler{
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<ErrorResponBean> handleArithmeticException(ArithmeticException ex,WebRequest request){
		ErrorResponBean errorResponBean=new ErrorResponBean();
		 errorResponBean.setError(ex.getMessage());
		 List<String> details=new ArrayList<>();
		 details.add("lỗi chia cho ko");
		 errorResponBean.setDetails(details);
		return new ResponseEntity<>(errorResponBean,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(FieldRequiredException.class)
	public ResponseEntity<ErrorResponBean> handleFieldRequiredException(FieldRequiredException ex,WebRequest request){
		ErrorResponBean errorResponBean=new ErrorResponBean();
		 errorResponBean.setError(ex.getMessage());
		 List<String> details=new ArrayList<>();
		 //details.add("lỗi chia cho ko");
		 
		 errorResponBean.setDetails(details);
		return new ResponseEntity<>(errorResponBean,HttpStatus.BAD_REQUEST);
	}
}
