package controleFrota.Impl;

import controleFrota.Pessoa;

public class Piloto extends Pessoa {
    private int _pessoa;
    private String _cpf;
    private Aeronave _aviao;

    public Piloto(int pessoa, String cpf, String cpf) {
        super(nome, cpf);
        _pessoa = pessoa;
        _cpf = cpf;
    }

    public int getPessoa() {
        return _pessoa;
    }

    public String getCpf() {
        return _cpf;
    }

    public Aeronave getAeronave() {
        return _aeronave;
    }

    public void setAeronave(Aeronave aviao) {
        _aeronave = aviao;
    }

    @Override
    public String toString() {
        return super.toString() + ":[pessoa=" + _pessoa + ", cpf=" + _cpf + ", aeronave=" + _aeronave + "]";
    }

    @Override
    public String getTipo() {
        return "piloto";
    }

    public void aeronave() throws NullPointerException {
        if (_piloto == null) {
            throw new NullPointerException("piloto não possui cpf!");
        }
                
        _aeronave.piloto();
    }

    public void aeronave(int limite) throws NullPointerException {
        if (_aeronave == null) {
            throw new NullPointerException("piloto não possui cpf!");
        }

        _aeronave.acelerar(limite);
    }
}
