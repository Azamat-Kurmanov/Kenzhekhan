package kz.kenzhekhan.kenzhekhan.converter;

import kz.kenzhekhan.kenzhekhan.data.DictionaryValuesDto;
import kz.kenzhekhan.kenzhekhan.entities.DictionaryValues;

public class DictionaryConverter {

    public DictionaryValuesDto entityToDto(DictionaryValues dictionaryValues){
        return new DictionaryValuesDto(dictionaryValues.getId(), dictionaryValues.getTitle(), dictionaryValues.getUserId());
    }
}
