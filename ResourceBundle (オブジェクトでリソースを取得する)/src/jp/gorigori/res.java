package jp.gorigori;

import java.util.ListResourceBundle;

public class res extends ListResourceBundle{
    private final static String obj[][] = {
            {"test.data", "VWXYZ in res class"}
    };

    @Override
    protected Object[][] getContents() {
        return  obj;
    }
}