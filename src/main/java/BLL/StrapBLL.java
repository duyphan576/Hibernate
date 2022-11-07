package BLL;

import DAL.StrapDAL;
import java.util.List;
import Entity.Strap;
import com.sun.org.apache.bcel.internal.generic.AALOAD;

/**
 *
 * @author jukut
 */
public class StrapBLL {

    private static StrapDAL strdal;

    public StrapBLL() {
        strdal = new StrapDAL();
    }

    public List loadStrap() {
        List list;
        list = strdal.getlistStrap();
        return list;
    }

    public void addstrap(String name) {
        Strap st = new Strap();
        strdal.addStrap(st);
    }

    public Strap[] converstrap(List<Strap> list) {
        int rows = list.size();
        Strap[] newList = new Strap[rows];
        for (int i = 0; i < rows; i++) {
            newList[i] = list.get(i);

        }
        return newList;
    }

    public Object[][] convertList(List<Strap> list) {
        int rows = list.size();
        int cols = 2;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getStrapID();
            obj[i][1] = list.get(i).getStrapName();
        }
        return obj;
    }
}