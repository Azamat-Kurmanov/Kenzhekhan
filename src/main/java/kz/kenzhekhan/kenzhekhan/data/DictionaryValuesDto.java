package kz.kenzhekhan.kenzhekhan.data;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DictionaryValuesDto {

    private Long id;
    private String title;
    private String userId;
}
