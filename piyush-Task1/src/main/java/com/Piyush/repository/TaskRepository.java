package com.Piyush.repository;

import com.Piyush.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {
   @Query("{name: ?0}")
    List<Task> findByName(String name);

}