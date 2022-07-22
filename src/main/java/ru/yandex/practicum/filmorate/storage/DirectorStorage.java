package ru.yandex.practicum.filmorate.storage;

import ru.yandex.practicum.filmorate.model.Director;
import ru.yandex.practicum.filmorate.model.Film;

import java.util.Set;

public interface DirectorStorage extends CommonStorage<Director> {
    void deleteDirector(Long directorId);

    Set<Director> getDirectorsByFilm(Film film);
}