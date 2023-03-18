package br.com.todolist.list.domain.repository;

import br.com.todolist.list.domain.model.Task;
import br.com.todolist.list.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
