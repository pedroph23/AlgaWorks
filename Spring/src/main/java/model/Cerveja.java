package model;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by pedro-ramalho on 03/05/18.
 */
@Validated
public class Cerveja {

    @NotBlank(message = "SKU inválido")
    private String sku;
    @NotBlank(message = "Nome inválido")
    private String nome;
    @NotBlank(message = "Descrição inválido")
    @Size(max = 180, message = "Tamanho de 1 a 180 palavras")
    private String descricao;








    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
