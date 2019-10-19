package com.test.smile.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.smile.api.domain.DatosSmile;

@Repository
public interface SmileRepository extends JpaRepository<DatosSmile, Long>{

}
