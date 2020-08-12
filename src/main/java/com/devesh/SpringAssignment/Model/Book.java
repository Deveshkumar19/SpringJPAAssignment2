package com.devesh.SpringAssignment.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Book Entity Class
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    private String authorName;

    private int cost;

    //Converts the date and time values from Java Object to compatible database type
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;

    /**
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     * @return
     */
    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     * @return
     */
    public Book setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * @param authorName
     * @return
     */
    public Book setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * @return
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost
     * @return
     */
    public Book setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public Book setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", authorName='").append(authorName).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", timeStamp=").append(timeStamp);
        sb.append('}');
        return sb.toString();
    }
}
