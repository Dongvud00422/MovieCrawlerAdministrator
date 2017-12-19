/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.project.entity;

/**
 *
 * @author Nam Nguyen
 */
public class Account {
    private long id;
    private String account;
    private String password;
     private long createdTimeMLS;
    private long updatedTimeMLS;
    private String status; // 0: không hoạt động , 1: có hoạt động
    private long AdminInforId;

    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCreatedTimeMLS() {
        return createdTimeMLS;
    }

    public void setCreatedTimeMLS(long createdTimeMLS) {
        this.createdTimeMLS = createdTimeMLS;
    }

    public long getUpdatedTimeMLS() {
        return updatedTimeMLS;
    }

    public void setUpdatedTimeMLS(long updatedTimeMLS) {
        this.updatedTimeMLS = updatedTimeMLS;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getAdminInforId() {
        return AdminInforId;
    }

    public void setAdminInforId(long AdminInforId) {
        this.AdminInforId = AdminInforId;
    }
    
}
