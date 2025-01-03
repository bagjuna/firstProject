package hello.firstproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

}
