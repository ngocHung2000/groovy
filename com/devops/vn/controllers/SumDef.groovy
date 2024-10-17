package com.devops.vn.controllers

import com.devops.vn.controllers.interfaces.ISumDef

class SumDef implements ISumDef{

	@Override
	public int sum(int num_01, int num_02) {
		// TODO Auto-generated method stub
		return num_01 + num_02;
	}
	
}
