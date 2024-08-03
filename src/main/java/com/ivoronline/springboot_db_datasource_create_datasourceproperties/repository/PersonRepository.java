package com.ivoronline.springboot_db_datasource_create_datasourceproperties.repository;

import com.ivoronline.springboot_db_datasource_create_datasourceproperties.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
