package com.rollingstone.spring.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.rollingstone.spring.model.Pricing;

public interface PricingDaoRepository extends PagingAndSortingRepository<Pricing, Long> {

	Page<Pricing> findAll(Pageable pageable);
}
