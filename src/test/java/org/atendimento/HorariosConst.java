package org.atendimento;

public class HorariosConst {

    public static final String ATENDIMENTO = "{\"nomeDoProfessor\": \"<nome_do_professor>\", " +
            "\"horarioDeAtendimento\": \"<horario_de_atendimento>\", \"periodo\": " +
            "\"<integral_ou_noturno>\", \"sala\": \"<sala_de_atendimento>\", \"predio\": " +
            "[\"1\", \"2\", \"3\", \"4\", \"6\"]}";

    public String getAtendimento(){
        return ATENDIMENTO;
    }

}
