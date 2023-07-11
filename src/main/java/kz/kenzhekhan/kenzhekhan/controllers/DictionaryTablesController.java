package kz.kenzhekhan.kenzhekhan.controllers;

import kz.kenzhekhan.kenzhekhan.entities.DictionaryTables;
import kz.kenzhekhan.kenzhekhan.service.DictionaryTablesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tables")
@RequiredArgsConstructor
public class DictionaryTablesController {

    private final DictionaryTablesService dictionaryTablesService;

    public DictionaryTables getTableByName(String title){
        return dictionaryTablesService.getTableByName(title);
    }
}
