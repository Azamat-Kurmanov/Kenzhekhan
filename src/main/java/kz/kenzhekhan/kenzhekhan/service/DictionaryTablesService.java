package kz.kenzhekhan.kenzhekhan.service;

import kz.kenzhekhan.kenzhekhan.converter.DictionaryTablesConverter;
import kz.kenzhekhan.kenzhekhan.data.DictionaryTablesDto;
import kz.kenzhekhan.kenzhekhan.entities.DictionaryTablesEntity;
import kz.kenzhekhan.kenzhekhan.repository.DictionaryTablesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DictionaryTablesService {
    private final DictionaryTablesRepository dictionaryTablesRepository;

    public DictionaryTablesEntity getTableByName(String tableName) {
        return dictionaryTablesRepository.getDictionaryTablesByTitle(tableName);
    }

    public Boolean addDictionary(DictionaryTablesDto tablesDto) {
        System.out.println("title: " + tablesDto.title +" nameRu: "+ tablesDto.nameRu+" description: "+tablesDto.description+" userId: " + tablesDto.userId);
        if (tablesDto.title!="" && tablesDto.nameRu!="" && tablesDto.description!="" && tablesDto.userId!=""){
            DictionaryTablesConverter dictTabConverter = new DictionaryTablesConverter();
            DictionaryTablesEntity dictionaryTables = dictTabConverter.dtoToEntity(tablesDto);
            DictionaryTablesEntity saveData = dictionaryTablesRepository.save(dictionaryTables);
            if (saveData != null){
                return true;
            }
        }
        return false;
    }

    public List<DictionaryTablesDto> getListOfDictionaries(String userId) {
        List<DictionaryTablesDto> dictionaryTableList = new ArrayList<>();
        if (userId!=null){
            List<DictionaryTablesEntity> dictEntityList = dictionaryTablesRepository.getAllByUserId(userId);
            if (!dictEntityList.isEmpty()){
                for (DictionaryTablesEntity tables : dictEntityList){
                    DictionaryTablesConverter tablesConverter = new DictionaryTablesConverter();
                    dictionaryTableList.add(tablesConverter.entityToDto(tables));
                }
            }
        }
        return dictionaryTableList;
    }
}
