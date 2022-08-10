import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("descricao curso java scrpit");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devTainah = new Dev();
        devTainah.setNome("Tainah");
        devTainah.inscreverBootcamp(bootcamp);
        devTainah.progredir();

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();

        System.out.println("Conteúdos inscritos de Tainah: " + devTainah.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Tainah: " + devTainah.getConteudosConcluidos());

        System.out.println("Conteúdos inscritos de Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Maria: " + devMaria.getConteudosConcluidos());

        System.out.println("XP Tainah: " + devTainah.calcularTotalXp());

        System.out.println("XP Maria: " + devMaria.calcularTotalXp());
    }
}
