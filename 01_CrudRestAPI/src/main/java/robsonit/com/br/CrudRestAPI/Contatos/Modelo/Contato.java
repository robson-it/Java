package robsonit.com.br.CrudRestAPI.Contatos.Modelo;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contato {
    

    @Id
    @Column(name="Id_Contato")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String email;

    private String urlAvatar;

    public void setId (long id){
        this.id = id;
    }

    public long getId (){
        return this.id;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public void setTelefone (String telefone){
        this.telefone = telefone;
    }

    public String getTelefone (){
        return this.telefone;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getEmail (){
        return this.email;
    }

    public void setUrlAvatar (String urlAvatar){
        this.urlAvatar = urlAvatar;
    }

    public String getUrlAvatar (){
        return this.urlAvatar;
    }

    @Override
    public int hashCode(){
        return getClass().hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        Contato other = (Contato) obj;
        return id == other.id;
    }

    @Override
    public String toString (){
        return "Contato [id = " + id + "nome = " + nome + " telefone = " + telefone + " email = " + email + " urlAvatar = " + urlAvatar +"]";
    }

}
