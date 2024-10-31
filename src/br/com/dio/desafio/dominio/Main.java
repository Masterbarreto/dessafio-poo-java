package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Aprenda os fundamentos da linguagem Java.");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Intermediário");
        curso2.setDescricao("Aprenda a programar em Java de forma avançada.");
        curso2.setCargaHoraria(16);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Carreira Java");
        mentoria.setDescricao("Aprenda a programar em Java.");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
