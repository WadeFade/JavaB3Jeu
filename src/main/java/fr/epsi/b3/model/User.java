package fr.epsi.b3.model;

import java.util.Comparator;

public class User {
    private Integer id;
    private String pseudo;
    private String email;
    private Integer gamePlayed;
    private Integer score;
    private String password;

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", gamePlayed=" + gamePlayed +
                ", score=" + score +
                ", password='" + password + '\'' +
                '}';
    }

    public User(Integer id, String pseudo, String email, Integer gamePlayed, Integer score, String password) {
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;
        this.gamePlayed = gamePlayed;
        this.score = score;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGamePlayed() {
        return gamePlayed;
    }

    public void setGamePlayed(Integer gamePlayed) {
        this.gamePlayed = gamePlayed;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}