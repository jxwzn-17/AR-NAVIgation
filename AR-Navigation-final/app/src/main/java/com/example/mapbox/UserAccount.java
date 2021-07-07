package com.example.mapbox;

public class UserAccount
{

    private String emailId;
    private String password;
    private String idToken; //고유 토큰 파베에서 주는것(key값)

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public UserAccount(){

    } //파베 쓸땐는 빈생성자 만들어야함

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
