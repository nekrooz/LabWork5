package collection;

import comps.HumanBeing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Predicate;

public class Collection {
    private ArrayList <HumanBeing> col;
    private Date creationDate;

    public Collection(HumanBeing[] arr_col){
        creationDate = new Date();
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

    public void removeById(int id){
        Predicate<HumanBeing> condition = hb -> hb.getId().equals(id);
        col.removeIf(condition);
        System.out.println(id);
    }

    public int getSize(){
        return col.size();
    }

    public String getType(){
        return col.getClass().getSimpleName();
    }

    public Date getCreationDate(){
        return creationDate;
    }

}