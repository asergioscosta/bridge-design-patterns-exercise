package org.relatorios;

public class Financeiro extends Relatorio{

    public Financeiro(String relatorioSetor) {
        super(relatorioSetor);
    }

    public String relatorioInfo() {
        return this.linguas.relatorioLinguas();
    }
}
