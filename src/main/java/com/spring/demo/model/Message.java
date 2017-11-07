package com.spring.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MESSAGES")
public class Message
{
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "message_time")
    private Date messageTime;
    @Column(name = "message_text")
    private String messageText;

    public long getId()
    {
        return id;
    }

    public long getUserId()
    {
        return userId;
    }

    public Date getMessageTime()
    {
        return messageTime;
    }

    public String getMessageText()
    {
        return messageText;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setUserId(long userId)
    {
        this.userId = userId;
    }

    public void setMessageTime(Date messageTime)
    {
        this.messageTime = messageTime;
    }

    public void setMessageText(String messageText)
    {
        this.messageText = messageText;
    }


}
