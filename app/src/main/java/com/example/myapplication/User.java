package com.example.myapplication;

public class User {
        private String login;
        private String password;
        private int photo;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public int getPhoto()
    {
        return photo;
    }
    public void setPhoto(int photo)
    {
        this.photo = photo;
    }
    public User(String login,String password,int photo) {
        this.login = login;
        this.password=password;
        this.photo=photo;
    }

}

