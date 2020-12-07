package ru.grandstep.school.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String login;
    private String password;
}
//TODO 1. Добавить новую сущность книга
//        id, Дата выпуска, название, автор(ссылка на user(а)).
//     2. Страничку со списком всех книг и страницу с редактированием (сохранением)
//        выбор автора должен быть в выпадающего списка (для создания книги).