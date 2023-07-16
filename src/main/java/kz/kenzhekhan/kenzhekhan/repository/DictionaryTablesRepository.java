package kz.kenzhekhan.kenzhekhan.repository;

import kz.kenzhekhan.kenzhekhan.entities.DictionaryTablesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DictionaryTablesRepository extends JpaRepository<DictionaryTablesEntity, Long> {
    DictionaryTablesEntity getDictionaryTablesByTitle(String title);

    List<DictionaryTablesEntity> getAllByUserId(String userId);
}
