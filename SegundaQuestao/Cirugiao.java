package SegundaQuestao;

public class Cirugiao extends Medico {

    public void tratarPaciente() {
        System.out.println("Medir pressao");
        super.tratarPaciente();
    }

    public void fazerIncisao() {
        System.out.println("passando o bisturir");
    }
}

