package dmreshet.exceptions.checkeduncheked;

public class Unchecked {
    public void storeDataFromUrl(String url) throws UnCheckedBadUrlException {
        String data = readDataFromUrl(url);
    }

    public String readDataFromUrl(String url) throws UnCheckedBadUrlException {
        if (isUrlBad(url)) {
            throw new UnCheckedBadUrlException("Bad URL: " + url);
        }

        String data = null;
        //read lots of data over HTTP and return
        //it as a String instance.

        return data;
    }

    private boolean isUrlBad(String url) {
        return false;
    }
}
