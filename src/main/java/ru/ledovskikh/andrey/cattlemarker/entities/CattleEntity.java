package ru.ledovskikh.andrey.cattlemarker.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author Andrey Ledovskikh
 */
@Entity
@Table(name = "CattleStorage")
public class CattleEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "currentPrice")
    private Double currentPrice;

    @Column(name = "lastUpdate")
    private Date lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
