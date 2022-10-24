package com.example.demo.config;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;


/**
 * 
 * 全てのControllerで交通処理を定義
 *
 */
@Controller
public class WebMvcControllerAdvice {

	/**
	 * 
	 * this method changes empty charactor to null
	 * こちらのメソッドを用意しておくと送信された空文字はnullに変換されます
	 */
	@InitBinder
	public void initBinder (WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
}
