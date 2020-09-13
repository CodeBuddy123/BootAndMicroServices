package com.ashsoft.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashsoft.entity.EmpDtlsEntity;
import com.ashsoft.repository.EmpDtlsRepository;

@Service
public class EmpDtlsService {
	
	@Autowired
	private EmpDtlsRepository empRepo;
	
	public void saveEmp() {
		EmpDtlsEntity entity = new EmpDtlsEntity();
		
		entity.setEmpId(103);
		entity.setEmpName("Faza");
		entity.setEmpSalary(6000);
		
		empRepo.save(entity);
		
	}
	
	public void getEmpById() {
		Optional<EmpDtlsEntity> findById = empRepo.findById(103);
		
		if(findById.isPresent()) {
			EmpDtlsEntity entity = findById.get();
			System.out.println(entity);
		}
		else
		{
			System.out.println("Record Not found..");
		}
	}
	
	public void getAllEmps() {
		Iterable<EmpDtlsEntity> findAll = empRepo.findAll();
		
		findAll.forEach(entity->{
			System.out.println(entity);
		});
	}
	
	public void deleteEmp() {
		empRepo.deleteById(102);
	}
	
	public void updateEmp()
	{
		EmpDtlsEntity entity = new EmpDtlsEntity();
		
		entity.setEmpId(101);
		entity.setEmpSalary(8000);
		
		empRepo.save(entity);
	}
}
