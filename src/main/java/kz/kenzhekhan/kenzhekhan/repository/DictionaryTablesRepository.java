package kz.kenzhekhan.kenzhekhan.repository;

import kz.kenzhekhan.kenzhekhan.entities.DictionaryTables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryTablesRepository extends JpaRepository<DictionaryTables, Long> {
    DictionaryTables getDictionaryTablesByTitle(String title);
}
