package io.explains.myonlymood.model;

import jakarta.persistence.Id;


public abstract class Model {
    @Id
    private Long id;
}
