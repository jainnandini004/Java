package com.example.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ResponseDTO;

@RestController
public class InternationalizationController {
	@Autowired
	MessageSource messageSource;

	@RequestMapping("/international")
	public ResponseDTO getInfo(@RequestParam("language") String lang) {
		Locale locale = LocaleContextHolder.getLocale();
		ResponseDTO res = new ResponseDTO();
		res.setMsg(messageSource.getMessage("welcome", null,locale));
		return res;
	}
}
