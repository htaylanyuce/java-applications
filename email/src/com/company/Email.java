package com.company;

import java.util.Random;

public class Email {

    private String department;
    private String firstname;
    private String lastname;
    private int mailCapacity = 0;
    private String email;
    private String password="";
    private String alternateMail = null;

    public Email(String firstname, String lastname, String department)
    {
        this.department = department;
        this.firstname = firstname;
        this.lastname = lastname;
        createEmail();
        setPassword();
    }
    public Email(String firstname, String lastname)
    {
        this(firstname,lastname,null);
    }

    private void createEmail()
    {
        this.email = firstname+lastname+"@"+this.department+".com";
    }

    public void setPassword()
    {
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        int randomLen = 1+random.nextInt(9);
        for (int i = 0; i < randomLen; i++) {
            char c = alphabet.charAt(random.nextInt(26));
            this.password+=c;
        }
    }
    public void setMailBoxCapacity(int capacity)
    {
        this.mailCapacity = capacity;
    }
    public void setAlternateEmail()
    {
        this.alternateMail = alternateMail;
    }
    public String getPassword()
    {
        return this.password;
    }
    public int getMailBoxCapacity()
    {
        return this.mailCapacity;
    }
    public String getAlternateEmail(String alternateMail)
    {
        return this.alternateMail;
    }





}
