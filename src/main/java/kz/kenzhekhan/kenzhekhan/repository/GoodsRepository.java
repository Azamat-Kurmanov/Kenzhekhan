package kz.kenzhekhan.kenzhekhan.repository;

import kz.kenzhekhan.kenzhekhan.entities.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
