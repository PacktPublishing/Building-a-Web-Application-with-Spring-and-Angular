package com.example.validationservice;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by magemello on 14/06/2017.
 */
@Data
public class User {

    @Size(max = 10)
    private String username;

    @NotNull
    @Email
    private String email;

    @Size(min = 5)
    @PasswordSecurity
    private String password;

    @Valid
    private List<@Valid Friend> friends;

    @Size(max = 3)
    @Valid
    private List<@Pattern(regexp="^[a-z]*$")  @Size(max = 4)String> address;


    public User(){

    }

    public User(String username, String email, String password, List<Friend> friends, List<String> address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.friends = friends;
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public List<String> getAddress() {
        return address;
    }
}

@Data
class Friend {

    @Size(max = 10)
    private String name;

    public Friend() {
    }

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}