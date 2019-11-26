package com.anderson.springapi.domain;

import com.anderson.springapi.domain.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id;
    private Role role;
    private String name;
    private String email;
    private String password;
    private List <Request> requests = new ArrayList<Request>();
    private List <RequestStage> stages = new ArrayList<RequestStage>();
}
