package com.csc340HW2.HW2_api;

public class Jokes {
    public String joke;
    public String type;
    public String setup;
    public Integer id;

    public Jokes (){}

    public Jokes (String setup, String jk, String type, Integer id){
        this.joke = jk;
        this.setup = setup;
        this.type = type;
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String jk2) {
        this.joke = jk2;
    }
    public String getType() {
        return type;
    }

    public void setType(String ty) {
        this.type = ty;
    }
    public String getSetup() {
        return setup;
    }

    public void setSetup(String set) {
        this.setup = set;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }


}
