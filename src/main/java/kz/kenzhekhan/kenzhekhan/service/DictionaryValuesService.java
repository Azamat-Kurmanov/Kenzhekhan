package kz.kenzhekhan.kenzhekhan.service;

import kz.kenzhekhan.kenzhekhan.converter.DictionaryConverter;
import kz.kenzhekhan.kenzhekhan.data.DictionaryValuesDto;
import kz.kenzhekhan.kenzhekhan.dictionary.DictionaryTbl;
import kz.kenzhekhan.kenzhekhan.entities.DictionaryTablesEntity;
import kz.kenzhekhan.kenzhekhan.entities.DictionaryValues;
import kz.kenzhekhan.kenzhekhan.repository.DictionaryValuesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DictionaryValuesService {
    private final DictionaryValuesRepository dictionaryValuesRepository;
    private final DictionaryTablesService dictionaryTablesService;

    public List<DictionaryValuesDto> getValues(String title) {
        List<DictionaryValuesDto> tbl = null;
        if (title != ""){
            if (title.equals(DictionaryTbl.SEASONS.getTitle())) {
                DictionaryTbl dict = getTbl(DictionaryTbl.SEASONS);
                tbl = getTblValues(dict);
            } else if (title.equals(DictionaryTbl.WAREHOUSE.getTitle())) {
                DictionaryTbl dict = getTbl(DictionaryTbl.WAREHOUSE);
                tbl = getTblValues(dict);
            } else if (title.equals(DictionaryTbl.GOODKIND.getTitle())) {
                DictionaryTbl dict = getTbl(DictionaryTbl.GOODKIND);
                tbl = getTblValues(dict);
            } else if (title.equals(DictionaryTbl.TYPEOFGOODS.getTitle())) {
                DictionaryTbl dict = getTbl(DictionaryTbl.TYPEOFGOODS);
                tbl = getTblValues(dict);
            } else if (title.equals(DictionaryTbl.SUBTYPEOFGOODS.getTitle())) {
                DictionaryTbl dict = getTbl(DictionaryTbl.SUBTYPEOFGOODS);
                tbl = getTblValues(dict);
            } else if (title.equals(DictionaryTbl.GENDER.getTitle())) {
                DictionaryTbl dict = getTbl(DictionaryTbl.GENDER);
                tbl = getTblValues(dict);
            }
        }
        return tbl;
    }

    private List<DictionaryValuesDto> getTblValues(DictionaryTbl tbl) {
        List<DictionaryValuesDto> dictionaries = new ArrayList<>();
        DictionaryTablesEntity table = dictionaryTablesService.getTableByName(tbl.getTitle());
        List<DictionaryValues> dictionariesOrigin = dictionaryValuesRepository.findByDictionaries(table);
        DictionaryConverter dictionaryConverter = new DictionaryConverter();
        for (DictionaryValues values: dictionariesOrigin){
            dictionaries.add(dictionaryConverter.entityToDto(values));
        }
        return dictionaries;
    }

    public DictionaryTbl getTbl(DictionaryTbl title) {
        return switch (title) {
            case SEASONS -> DictionaryTbl.SEASONS;
            case WAREHOUSE -> DictionaryTbl.WAREHOUSE;
            case GOODKIND -> DictionaryTbl.GOODKIND;
            case TYPEOFGOODS -> DictionaryTbl.TYPEOFGOODS;
            case SUBTYPEOFGOODS -> DictionaryTbl.SUBTYPEOFGOODS;
            case GENDER -> DictionaryTbl.GENDER;
        };
    }
}
