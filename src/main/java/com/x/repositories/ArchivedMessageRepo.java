package com.x.repositories;

import com.x.Model.ChatMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivedMessageRepo extends CrudRepository<ChatMessage, Long> {
}
