package com.example;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

import javax.validation.constraints.NotBlank;

@Introspected
@Serdeable
public class Book {

    @NonNull
    @NotBlank
    private String name;

    public Book() {
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
