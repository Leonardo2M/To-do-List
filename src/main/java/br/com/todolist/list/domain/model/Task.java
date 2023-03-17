package br.com.todolist.list.domain.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
public class Task {

    private Long id;
    private String description;

    private User user;

}
