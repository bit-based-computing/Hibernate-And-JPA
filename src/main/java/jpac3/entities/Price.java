package jpac3.entities;

import jpac3.entities.enums.Currency;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int in;

    private double amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
