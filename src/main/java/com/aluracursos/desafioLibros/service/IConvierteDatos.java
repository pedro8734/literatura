package com.aluracursos.desafioLibros.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
