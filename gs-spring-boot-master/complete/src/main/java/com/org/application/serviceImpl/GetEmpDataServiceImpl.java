package com.org.application.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.application.Repository.GetEmpDataRepository;
import com.org.application.Service.GetEmpDataService;

@Service
public class GetEmpDataServiceImpl implements GetEmpDataService {

	@Autowired
	private GetEmpDataRepository getEmpDataRepository;

	public String getService() {
		if (getEmpDataRepository.getEmpData().equals("rep"))

			return "from repo";

		else
			return "not from repo";
	}

}
