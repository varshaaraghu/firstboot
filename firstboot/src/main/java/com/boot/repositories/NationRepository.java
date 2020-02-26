package com.boot.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.boot.model.Nation;

public interface NationRepository extends CrudRepository<Nation,Long> {
    @Transactional
	@Query(value="Select * from Nation where code =:code",nativeQuery=true)
	public List<Nation> getCountry(@Param("code")String code);
	
}
