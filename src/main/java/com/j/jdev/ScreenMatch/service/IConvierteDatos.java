package com.j.jdev.ScreenMatch.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
