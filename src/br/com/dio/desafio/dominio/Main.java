package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Pedro");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();

        System.out.println("Conteúdos Concluídos Pedro: " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Pedro: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Arthur");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("Conteúdos Concluídos Arthur: " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Arthur: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}