import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}