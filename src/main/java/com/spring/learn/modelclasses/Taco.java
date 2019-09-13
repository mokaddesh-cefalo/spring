package com.spring.learn.modelclasses;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Component
public class Taco {

    @NotNull
    @Size(min=5, message = "Name must have atleast 5 charater")
    private String name;

    @Size(min=1, message = "must choose atleast 1 ingredient")
    private List<String> ingredients;
}
