package com.org.application.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class GetEmpDataRepositoryImpl implements GetEmpDataRepository{
	
	
	public String getEmpData() {
		return "repo";
		
	}

}
