package com.example.webserviceuppgift1;

import lombok.Getter;

@Getter
public class GroupDTO {
    String id;
    String groupName;
    String members; //List<PersonDTO> members;

    public GroupDTO(String id, String groupName, String members) {
        this.id = id;
        this.groupName = groupName;
        this.members = members; //ArrayList
    }
}
