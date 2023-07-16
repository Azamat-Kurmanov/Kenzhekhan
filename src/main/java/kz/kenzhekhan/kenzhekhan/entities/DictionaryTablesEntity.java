package kz.kenzhekhan.kenzhekhan.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "dictionary_tables")
public class DictionaryTablesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "dictionaries", cascade = CascadeType.PERSIST)
    private List<DictionaryValues> values;

    @Column(name = "name_ru")
    private String nameRu;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "userId")
    private String userId;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
