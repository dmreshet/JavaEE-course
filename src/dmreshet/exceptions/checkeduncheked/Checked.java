package dmreshet.exceptions.checkeduncheked;

public class Checked {
    public void storeDataFromUrl(String url) {
        try {
            String data = readDataFromUrl(url);
        } catch (CheckedBadUrlException e) {
            e.printStackTrace();
        }
    }

    public String readDataFromUrl(String url) throws CheckedBadUrlException {
        if (isUrlBad(url)) {
            throw new CheckedBadUrlException("Bad URL: " + url);
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
