package com.meep.exercise.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResourceStatus {

    private List<Resource> resources;
    private List<Resource> available;
    private List<Resource> busy;

}
