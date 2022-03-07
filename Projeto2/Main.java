import java.time.LocalDate;
import dominio.*;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curse JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.incresverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosIncritos());
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.incresverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());
    }

}
