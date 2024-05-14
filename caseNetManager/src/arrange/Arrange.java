package arrange;



import pc.Pc;

import java.util.Comparator;

public class Arrange implements Comparator<Pc> {


    @Override
    public int compare(Pc o1, Pc o2) {
        return o1.getIntName().compareTo(o2.getIntName());
    }
}
