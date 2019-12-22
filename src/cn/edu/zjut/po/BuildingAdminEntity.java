package cn.edu.zjut.po;

import java.util.Objects;

public class BuildingAdminEntity {
    private String baId;
    private AccountEntity accountByUserId;
    private BuildingEntity buildingByBuildingId;

    public String getBaId() {
        return baId;
    }

    public void setBaId(String baId) {
        this.baId = baId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingAdminEntity that = (BuildingAdminEntity) o;
        return Objects.equals(baId, that.baId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baId);
    }

    public AccountEntity getAccountByUserId() {
        return accountByUserId;
    }

    public void setAccountByUserId(AccountEntity accountByUserId) {
        this.accountByUserId = accountByUserId;
    }

    public BuildingEntity getBuildingByBuildingId() {
        return buildingByBuildingId;
    }

    public void setBuildingByBuildingId(BuildingEntity buildingByBuildingId) {
        this.buildingByBuildingId = buildingByBuildingId;
    }
}
