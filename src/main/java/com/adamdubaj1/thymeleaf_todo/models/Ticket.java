package com.adamdubaj1.thymeleaf_todo.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket {
    private String name;
    private String type;

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
