package cn.edu.zjut.po;

import java.util.Objects;
import java.util.Set;

public class BuildingEntity {
    private String buildingId;
    private String buildingName;
    private Set<AccountEntity> accounts;

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Set<AccountEntity> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<AccountEntity> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingEntity that = (BuildingEntity) o;
        return Objects.equals(buildingId, that.buildingId) &&
                Objects.equals(buildingName, that.buildingName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildingId, buildingName);
    }

}
