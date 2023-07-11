package kz.kenzhekhan.kenzhekhan.service;

import kz.kenzhekhan.kenzhekhan.entities.DictionaryTables;
import kz.kenzhekhan.kenzhekhan.repository.DictionaryTablesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class DictionaryTablesService {
    private final DictionaryTablesRepository dictionaryTablesRepository;

    public DictionaryTables getTableByName(String tableName) {
        return dictionaryTablesRepository.getDictionaryTablesByTitle(tableName);
    }
}
