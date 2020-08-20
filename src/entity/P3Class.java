package entity;

public class P3Class {
    private String str;
    private Integer addr;
    //操作前 112无色 114绿色 116红色 118黄 120粉
    private Byte displaySet;

    public Integer getAddr() {
        return addr;
    }

    public void setAddr(Integer addr) {
        this.addr = addr;
    }

    public Byte getDisplaySet() {
        return displaySet;
    }

    public void setDisplaySet(Byte displaySet) {
        this.displaySet = displaySet;
    }

    public String getStr() {
        return str;
    }





    public void setStr(String str) {
        this.str = str;
    }

    public void setName(String itemname) {
    }

    public void setKcnum(Integer qty) {
    }

    //数据库拼接数据
    //= "一次性使用气管插管导丝,100g*6片/盒，铝盒,00A-00B-00E-A,320111,55,555,箱,";


    @Override
    public String toString() {
        return "P3Class{" +
                "str='" + str + '\'' +
                ", addr=" + addr +
                ", displaySet=" + displaySet +
                '}';
    }
}
