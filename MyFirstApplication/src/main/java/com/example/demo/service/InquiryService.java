package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Inquiry;

public interface InquiryService {

	
	List<Inquiry> getAll();

	void save(Inquiry inquiry);
}
