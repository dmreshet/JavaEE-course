package dmreshet.exceptions.enrichment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrichableException extends Exception {
    List<String> infoList = new ArrayList<>();
    Map<ErrorCode, String> errorCodeMap = new HashMap<>();

    public EnrichableException(String s) {
        infoList.add(s);
    }

    public EnrichableException(String error1, String s) {
        errorCodeMap.put(ErrorCode.valueOf(error1), s);
    }

    public void addInfo(String s) {
        infoList.add(s);
    }
}
