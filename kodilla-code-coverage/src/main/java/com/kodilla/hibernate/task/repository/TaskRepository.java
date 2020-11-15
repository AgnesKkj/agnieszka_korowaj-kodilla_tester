package com.kodilla.hibernate.task.repository;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
//przy transakcjach do baz danych - @Transactional zajmuje się commit i rollback
@Transactional
public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}