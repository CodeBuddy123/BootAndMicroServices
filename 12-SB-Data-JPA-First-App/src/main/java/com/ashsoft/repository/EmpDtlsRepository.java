package com.ashsoft.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ashsoft.entity.EmpDtlsEntity;


//@Repository  --> Optional
public interface EmpDtlsRepository extends CrudRepository<EmpDtlsEntity, Serializable> {

}
