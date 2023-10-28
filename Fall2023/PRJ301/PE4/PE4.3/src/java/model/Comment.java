/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 1112v
 */
public class Comment {
//    [cid] [int] IDENTITY(1,1) NOT NULL,
//	[ctitle] [varchar](150) NOT NULL,
//	[userid] [varchar](150) NOT NULL,
//	[tid] [int] NOT NULL,
    int cid;
    String ctitle;
    Account account;
    Thread thread;

    public Comment() {
    }

    public Comment(int cid, String ctitle, Account account, Thread thread) {
        this.cid = cid;
        this.ctitle = ctitle;
        this.account = account;
        this.thread = thread;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCtitle() {
        return ctitle;
    }

    public void setCtitle(String ctitle) {
        this.ctitle = ctitle;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
    
}
