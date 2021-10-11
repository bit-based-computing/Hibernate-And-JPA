package jpac4.entities.composed.pk;

import jpac4.entities.composed.pk.pk.DepartmentPk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class Building {

    @EmbeddedId
    DepartmentPk departmentPk;
    private String name;

    public DepartmentPk getDepartmentPk() {
        return departmentPk;
    }

    public void setDepartmentPk(DepartmentPk departmentPk) {
        this.departmentPk = departmentPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
