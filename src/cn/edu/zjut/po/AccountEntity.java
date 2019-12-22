package cn.edu.zjut.po;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import java.util.Objects;

public class AccountEntity {
    private String userId;
    private String userPassword;
    private Integer userRight;

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
}
