package collection;
import comps.HumanBeing;
import java.io.IOException;
import java.util.ArrayList;

public interface StoreService {
    String info();

    boolean addIfMin(HumanBeing humanBeing);

    void clear();

    boolean removeById(long id);

    String show();

    boolean update(long id, HumanBeing humanBeing);

    void save(String path) throws IOException;
}
