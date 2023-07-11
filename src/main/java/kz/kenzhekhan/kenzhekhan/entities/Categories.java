package kz.kenzhekhan.kenzhekhan.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "goods_kind_id")
    private Long goodsKindId;

    @Column(name = "seasons_id")
    private Long seasonsId;

    @Column(name = "sub_type_of_goods_id")
    private Long subTypeOfGoodsId;

    @Column(name = "gender_id")
    private Long genderId;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
