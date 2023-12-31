/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.AllDAO;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author admin
 */
public class Post {
    private int id;
    private String content;
    private Date date;
    private boolean isEnabled;
    private String created_by;

    public Post() {
    }

    public Post(int id, String content, Date date, boolean isEnabled, String created_by) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.isEnabled = isEnabled;
        this.created_by = created_by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
    
    public List<Comment> getComments(){
        return new AllDAO().getCommentsByPID(id);
    }
}
