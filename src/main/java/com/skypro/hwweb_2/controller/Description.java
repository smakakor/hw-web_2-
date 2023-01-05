package com.skypro.hwweb_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class Description {

    @GetMapping
    public String start() {
        return "Привет!\n" +
                "Приложение запущенно.\n" +
                "Хочешь узнать немного больше о проекте?? Добавь в строку /info";
    }
    @GetMapping("/info")
    public String info() {
        return "Имя ученика: Амир.\n" +
                "Дата создание проекта: 05.01.2023.\n" +
                "\n" +
                "Описание проекта." +
                "Название проекта: hw-web_2-.\n" +
                "Функции проекта: тест в создание web проектов.\n" +
                "Технологии: Spring, Maven.\n" +
                "Язык программирования: java.";
    }
}
