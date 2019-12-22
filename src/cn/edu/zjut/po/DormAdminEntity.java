package cn.edu.zjut.po;

import java.util.Objects;

public class DormAdminEntity {
    private String daId;
    private AccountEntity accountByUserId;
    private DormEntity dormByDormId;

    public String getDaId() {
        return daId;
    }

    public void setDaId(String daId) {
        this.daId = daId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DormAdminEntity that = (DormAdminEntity) o;
        return Objects.equals(daId, that.daId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(daId);
    }

    public AccountEntity getAccountByUserId() {
        return accountByUserId;
    }

    public void setAccountByUserId(AccountEntity accountByUserId) {
        this.accountByUserId = accountByUserId;
    }

    public DormEntity getDormByDormId() {
        return dormByDormId;
    }

    public void setDormByDormId(DormEntity dormByDormId) {
        this.dormByDormId = dormByDormId;
    }
}
