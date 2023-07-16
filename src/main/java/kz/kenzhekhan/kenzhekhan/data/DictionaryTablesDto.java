package kz.kenzhekhan.kenzhekhan.data;

public class DictionaryTablesDto {
    public String title;
    public String nameRu;
    public String description;
    public String userId;

    public DictionaryTablesDto(String title, String nameRu, String description, String userId) {
        this.title = title;
        this.nameRu = nameRu;
        this.description = description;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public String getNameRu() {
        return nameRu;
    }

    public String getDescription() {
        return description;
    }

    public String getUserId() {
        return userId;
    }
}
