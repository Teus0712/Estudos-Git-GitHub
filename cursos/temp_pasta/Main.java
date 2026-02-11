package cursos.temp_pasta;

public class Main {
    public static void main(String[] args) {
        // Criamos uma "instância" da sua classe Database
        Database db = new Database();
        
        System.out.println("--- INICIANDO SISTEMA DE LOGIN SEGURO ---");
        
        // Chamamos o método que contém o seu loop 'while'
        db.conectar();
        
        System.out.println("--- PROCESSO FINALIZADO ---");
    }
}