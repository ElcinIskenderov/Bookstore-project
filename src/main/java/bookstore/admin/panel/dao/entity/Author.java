package bookstore.admin.panel.dao.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "author")
@Getter
@Setter
public class Author extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}