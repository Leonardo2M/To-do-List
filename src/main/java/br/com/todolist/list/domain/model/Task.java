package br.com.todolist.list.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne
    private User user;

}
