package cn.edu.zjut.po;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DormEntity {
    private String dormId;
    private String dormName;
    private Integer dormPeopleNum;
    private Integer dormPeopleMax;
    private Set<AccountEntity> users = new HashSet<>();

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

    public Integer getDormPeopleMax() {
        return dormPeopleMax;
    }

    public void setDormPeopleMax(Integer dormPeopleMax) {
        this.dormPeopleMax = dormPeopleMax;
    }

    public Set<AccountEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<AccountEntity> users) {
        this.users = users;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DormEntity that = (DormEntity) o;
        return Objects.equals(dormId, that.dormId) &&
                Objects.equals(dormName, that.dormName) &&
                Objects.equals(dormPeopleNum, that.dormPeopleNum) &&
                Objects.equals(dormPeopleMax, that.dormPeopleMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dormId, dormName, dormPeopleNum, dormPeopleMax);
    }

}
