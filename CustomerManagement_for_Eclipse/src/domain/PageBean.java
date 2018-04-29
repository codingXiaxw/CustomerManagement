package domain;

import java.util.List;

/**
 * Created by codingBoy on 16/10/29.
 */
public class PageBean<Object>
{
    private int pc;//当前页码page code
    //private int tp;//总页数total pages
    private int tr;//总纪录数tatal records
    private int pr;//每页纪录数page records
    private List<Object> beanList;//当前页的纪录
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getTp()
    {
        int tp=tr/pr;
        return tr % pr == 0 ? tp : tp + 1 ;
    }



    public int getTr() {
        return tr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public List<Object> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<Object> beanList) {
        this.beanList = beanList;
    }
}
