package io.explains.myonlymood.repository;

import io.explains.myonlymood.model.Model;

import java.util.List;

public interface Repository <T extends Model>{
    List<T> buscarTodos();
    T salvar(T t);
    T atualizar(T t);
    boolean remover(T t);
    boolean remover(int i);
}