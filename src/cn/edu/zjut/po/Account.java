package cn.edu.zjut.po;

import java.util.Objects;

public class Account {
    private String id;
    private String password;
    private Integer user_right;

    public Integer getUser_right() {
        return user_right;
    }

    public void setUser_right(Integer user_right) {
        this.user_right = user_right;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password);
    }
}
