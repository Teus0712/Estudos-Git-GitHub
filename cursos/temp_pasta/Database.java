package cursos.temp_pasta;

public class Database {

    public void conectar() {
        int tentativas = 1;
        boolean conectado = false;

        while (tentativas <= 3 && !conectado) {
            System.out.println("Tentando conectar ao banco... Tentativa: " + tentativas);
            
            if (tentativas < 3) {
                tentativas++;
            } else {
                // REGRA DE SEGURANÇA: Mensagem genérica para o usuário final
                System.out.println("ERRO: Sistema indisponível no momento. Tente novamente mais tarde.");
                break; 
            }
        }
    }
}