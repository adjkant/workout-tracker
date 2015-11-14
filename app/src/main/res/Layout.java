/**
 * Created by justineclarke on 11/14/15.
 */
public class Layout {
    private static Layout ourInstance = new Layout();

    public static Layout getInstance() {
        return ourInstance;
    }

    private Layout() {
    }
}
