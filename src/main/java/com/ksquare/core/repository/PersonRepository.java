package com.ksquare.core.repository;

import org.springframework.stereotype.Repository;

import com.ksquare.core.model.MPerson;

@Repository("PersonRepository")
public interface PersonRepository {
	public abstract MPerson findByPersonId(long personId);
}
