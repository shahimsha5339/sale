package com.sale.service;

import org.springframework.stereotype.Service;

@Service
public class SaleService {

	public int add(int x, int y) {
		return x + y;
	}

	public int multiply(int x,int y, int z) {
		return x * y;

	}

}
