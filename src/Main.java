import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =  new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso java");
        curso1.setCargaHorario(8);

        Curso curso2 =  new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso python");
        curso2.setCargaHorario(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Jefferson");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos de " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + dev1.getNome() + " " + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("Je");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos de " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + dev2.getNome() + " " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

    }
}