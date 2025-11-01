package com.sale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sale.service.SaleService;

@RestController
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping("/getmessage")
	public String getMessage(String message) {
		int x = service.multiply(143, 2);
		return "successfully sale the device with price " + x;
	}

}
