package kz.kenzhekhan.kenzhekhan.converter;

import kz.kenzhekhan.kenzhekhan.data.DictionaryTablesDto;
import kz.kenzhekhan.kenzhekhan.entities.DictionaryTablesEntity;

public class DictionaryTablesConverter {
    
    public DictionaryTablesEntity dtoToEntity(DictionaryTablesDto dictDto){
        DictionaryTablesEntity tables = new DictionaryTablesEntity();
        tables.setTitle(dictDto.getTitle());
        tables.setNameRu(dictDto.getNameRu());
        tables.setDescription(dictDto.getDescription());
        tables.setUserId(dictDto.getUserId());
        return tables;
    }

    public DictionaryTablesDto entityToDto(DictionaryTablesEntity dictionaryTables){
        return new DictionaryTablesDto(dictionaryTables.getTitle(), dictionaryTables.getNameRu(), dictionaryTables.getDescription(), dictionaryTables.getUserId());
    }
}
