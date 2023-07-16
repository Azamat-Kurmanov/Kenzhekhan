package kz.kenzhekhan.kenzhekhan.controllers;

import kz.kenzhekhan.kenzhekhan.data.DictionaryTablesDto;
import kz.kenzhekhan.kenzhekhan.entities.DictionaryTablesEntity;
import kz.kenzhekhan.kenzhekhan.service.DictionaryTablesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tables")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DictionaryTablesController {

    private final DictionaryTablesService dictionaryTablesService;

    @GetMapping("/dictionary/{title}")
    public DictionaryTablesEntity getTableByName(@PathVariable String title){
        return dictionaryTablesService.getTableByName(title);
    }

    @GetMapping("/dictionary-tables/{userId}")
    public List<DictionaryTablesDto> getListOfDictionaries(@PathVariable String userId){
        return dictionaryTablesService.getListOfDictionaries(userId);
    }

    @PostMapping("/add")
    public Boolean addDictionary(@RequestBody DictionaryTablesDto tablesDto){
        return dictionaryTablesService.addDictionary(tablesDto);
    }
}
