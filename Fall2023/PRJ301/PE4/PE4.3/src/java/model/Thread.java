/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 1112v
 */
public class Thread {
//    [tid] [int] NOT NULL,
//	[tcontent] [varchar](150) NOT NULL,

    int tid;
    String tcontent;

    public Thread() {
    }

    public Thread(int tid, String tcontent) {
        this.tid = tid;
        this.tcontent = tcontent;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontent(String tcontent) {
        this.tcontent = tcontent;
    }

}
