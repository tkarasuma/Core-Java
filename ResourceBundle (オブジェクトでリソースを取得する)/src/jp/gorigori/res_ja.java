package jp.gorigori;

import java.util.ListResourceBundle;

public class res_ja extends ListResourceBundle {
    private final static String obj[][] = {
            {"test.data", "わゐうゑを in res_ja クラス"}
    };

    @Override
    protected Object[][] getContents() {
        return  obj;
    }
}