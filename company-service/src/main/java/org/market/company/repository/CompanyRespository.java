package org.market.company.repository;

import org.market.company.domain.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompanyRespository extends JpaRepository<Company, Long> {
	
	Page<Company> findAllByName(@Param("name") String name, Pageable page);
}
