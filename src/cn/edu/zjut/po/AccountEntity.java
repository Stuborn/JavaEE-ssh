package cn.edu.zjut.po;

import java.util.Objects;
import java.util.Set;

public class AccountEntity {
    private String userId;
    private String userPassword;
    private Integer userRight;
    private DormEntity dormByDormId;
    private Set<BuildingEntity> buildings;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserRight() {
        return userRight;
    }

    public void setUserRight(Integer userRight) {
        this.userRight = userRight;
    }

    public Set<BuildingEntity> getBuildings() {
        return buildings;
    }

    public void setBuildings(Set<BuildingEntity> buildings) {
        this.buildings = buildings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEntity that = (AccountEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(userRight, that.userRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userPassword, userRight);
    }

    public DormEntity getDormByDormId() {
        return dormByDormId;
    }

    public void setDormByDormId(DormEntity dormByDormId) {
        this.dormByDormId = dormByDormId;
    }

}
