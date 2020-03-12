package exercicios;

public class Correntista {
    private Double codigo;
    private String nome;
    private String email;
    private String telefone;

    public Correntista(Double codigo, String nome, String email){
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
    }
    public Correntista(Double codigo, String nome, String email, String telefone){
        setCodigo(codigo);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }
    public void setCodigo(Double codigo){
        if (codigo <= 0.0){
            throw new IllegalArgumentException("codigo deve ser maior que zero");
        }
        this.codigo = codigo;
    }

    public Double getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        if (nome.trim().length() < 2){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEmail(String email){
        if (email.trim().length() < 10){
            throw new IllegalArgumentException("email invalido");
        }
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefone(String telefone){
        if (telefone.trim().length() < 8){
            throw new IllegalArgumentException("telefone invalido");
        }
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

}
