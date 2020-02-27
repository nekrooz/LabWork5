package collection;

import comps.HumanBeing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    private ArrayList <HumanBeing> col;

    public Collection(){
        col = new ArrayList<>();
    }

    public Collection(HumanBeing[] arr_col){
        col = new ArrayList<>(Arrays.asList(arr_col));
    }

    public Object[] asArray(){
        return col.toArray();
    }

    public void clear(){
        col.clear();
    }

    public void add(HumanBeing h){
        col.add(h);
    }
}
