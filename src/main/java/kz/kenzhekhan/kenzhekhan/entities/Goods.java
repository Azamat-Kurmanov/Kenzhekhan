package kz.kenzhekhan.kenzhekhan.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "item_number")
    private String itemNumber;

    @Column(name = "good_size")
    private int goodSize;

    @Column(name = "price")
    private Double price;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "description")
    private String description;

    @Column(name = "press_number")
    private String pressNumber;

    @Column(name = "warehouse_id")
    private Long warehouseId;

    @Column(name = "provider_id")
    private Long providerId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "cur_year")
    private int curYear;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
