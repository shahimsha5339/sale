package com.sale.service;

import org.springframework.stereotype.Service;

@Service
public class SaleService {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public int multiply( int y,int z) {
		return y*z;
	}

}
