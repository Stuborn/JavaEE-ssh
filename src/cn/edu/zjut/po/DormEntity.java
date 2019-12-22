package cn.edu.zjut.po;

import java.util.Objects;

public class DormEntity {
    private String dormId;
    private String dormName;
    private Integer dormPeopleNum;
    private String dormType;

    public String getDormId() {
        return dormId;
    }

    public void setDormId(String dormId) {
        this.dormId = dormId;
    }

    public String getDormName() {
        return dormName;
    }

    public void setDormName(String dormName) {
        this.dormName = dormName;
    }

    public Integer getDormPeopleNum() {
        return dormPeopleNum;
    }

    public void setDormPeopleNum(Integer dormPeopleNum) {
        this.dormPeopleNum = dormPeopleNum;
    }

    public String getDormType() {
        return dormType;
    }

    public void setDormType(String dormType) {
        this.dormType = dormType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DormEntity that = (DormEntity) o;
        return Objects.equals(dormId, that.dormId) &&
                Objects.equals(dormName, that.dormName) &&
                Objects.equals(dormPeopleNum, that.dormPeopleNum) &&
                Objects.equals(dormType, that.dormType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dormId, dormName, dormPeopleNum, dormType);
    }
}
