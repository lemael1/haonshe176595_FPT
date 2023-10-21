/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author 1112v
 */
public class Author {
//    [authorid] [int] NOT NULL,
//	[authorname] [varchar](150) NOT NULL,
    int authorid;
    String authorname;

    public Author(int authorid, String authorname) {
        this.authorid = authorid;
        this.authorname = authorname;
    }

    public Author() {
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
}
