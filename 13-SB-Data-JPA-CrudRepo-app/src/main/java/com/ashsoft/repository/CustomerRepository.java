package com.ashsoft.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ashsoft.entity.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Serializable> {

}
