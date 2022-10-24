package com.example.demo.app.survey;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	
	@GetMapping("/form")
	public String form(ServeyForm surveyForm, Model model, @ModelAttribute("complete") String comoplete) {
		
		model.addAttribute("title","Servey Form");
		return "survey/form";
	}
	
	@PostMapping("/form")
	public String formGoBack(ServeyForm surveyForm, Model model) {
		
		model.addAttribute("title","Servey Form");
		return "survey/form";
}
	
	@PostMapping("/confirm")
	public String confirm(
			@Validated ServeyForm surveyForm,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title","Survey Form");
			return "survey/form";
		}
		model.addAttribute("title", "Confirm Page");
		return "survey/foem";
		
	}
	
	@PostMapping("/complete")
	public String complete(
			@Valid @ModelAttribute ServeyForm surveyForm,
			BindingResult result,
			Model model,
			RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			model.addAttribute("title","Survey Form");
			return "survey/form";
		}
		
		redirectAttributes.addFlashAttribute("complete", "thanks for your confirm");
		
		return "redirect:/survey/form";
	}
}
