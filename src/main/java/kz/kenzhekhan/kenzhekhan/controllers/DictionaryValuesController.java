package kz.kenzhekhan.kenzhekhan.controllers;

import kz.kenzhekhan.kenzhekhan.data.DictionaryValuesDto;
import kz.kenzhekhan.kenzhekhan.service.DictionaryValuesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/values")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DictionaryValuesController {

    private final DictionaryValuesService dictionaryValuesService;

    @GetMapping("/{title}")
    public List<DictionaryValuesDto> getValues(@PathVariable String title){
        return dictionaryValuesService.getValues(title);
    }
}
