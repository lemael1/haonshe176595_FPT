/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author 1112v
 */
public class Paper {
//    [paperid] [int] NOT NULL,
//	[title] [varchar](150) NOT NULL,
//	[publisheddate] [date] NOT NULL,
    int paperid;
    String title;
    Date publishedDate;

    public Paper() {
    }

    public Paper(int paperid, String title, Date publishedDate) {
        this.paperid = paperid;
        this.title = title;
        this.publishedDate = publishedDate;
    }

    public int getPaperid() {
        return paperid;
    }

    public void setPaperid(int paperid) {
        this.paperid = paperid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }


}
