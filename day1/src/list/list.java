package list;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author shiyutao
 * @create 2021-11-08 20:51
 */
public class list {
    public List<String> list;
    public Map<String,String> map;
    public Set<String> set;
    public List<stu> stus;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<stu> getStus() {
        return stus;
    }

    public void setStus(List<stu> stus) {
        this.stus = stus;
    }
}
