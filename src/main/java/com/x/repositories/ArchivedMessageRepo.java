package com.x.repositories;

import com.x.Model.ArchivedMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivedMessageRepo extends CrudRepository<ArchivedMessage, Long> {
}
