package jpac4.entities.composed.pk.pk;

import javax.persistence.Embeddable;
import java.io.Serializable;
/*
   Compos primary key
 */
@Embeddable
public class DepartmentPk implements Serializable {
    private String code;
    private int number;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
