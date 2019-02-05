package com.x.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivedMessageRepo extends CrudRepository<ArchivedMessageRepo, Long> {
}
