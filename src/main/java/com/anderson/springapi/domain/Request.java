package com.anderson.springapi.domain;

import com.anderson.springapi.domain.enums.RequestState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    private long id;
    private String subject;
    private String description;
    private Date creationDate;
    private RequestState state;
    private User user;
    private List<RequestStage> stages = new ArrayList<RequestStage>();
}
