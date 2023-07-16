package kz.kenzhekhan.kenzhekhan.repository;

import kz.kenzhekhan.kenzhekhan.entities.DictionaryTablesEntity;
import kz.kenzhekhan.kenzhekhan.entities.DictionaryValues;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DictionaryValuesRepository extends JpaRepository<DictionaryValues, Long> {
    List<DictionaryValues> findByDictionaries(DictionaryTablesEntity tables);
}
