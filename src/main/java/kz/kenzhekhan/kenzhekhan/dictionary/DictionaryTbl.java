package kz.kenzhekhan.kenzhekhan.dictionary;

public enum DictionaryTbl {
    SEASONS ("seasons"),
    WAREHOUSE ("warehouse"),
    GOODKIND ("goodsKind"),
    TYPEOFGOODS ("typeOfGoods"),
    SUBTYPEOFGOODS ("subTypeOfGoods"),
    GENDER ("gender");

    private String title;

    DictionaryTbl(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
