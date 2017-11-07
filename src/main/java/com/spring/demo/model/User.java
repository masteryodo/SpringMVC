package com.spring.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USERS")
public class User
{
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "last_entrance")
    private Date lastEntrance;
    @Column(name = "confirmed")
    private boolean confirmed = false;

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public Date getLastEntrance()
    {
        return lastEntrance;
    }

    public boolean isConfirmed()
    {
        return confirmed;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }

    public void setLastEntrance(Date lastEntrance)
    {
        this.lastEntrance = lastEntrance;
    }

    public void setConfirmed(boolean confirmed)
    {
        this.confirmed = confirmed;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
                ", lastEntrance=" + lastEntrance +
                ", confirmed=" + confirmed +
                '}';
    }

}
