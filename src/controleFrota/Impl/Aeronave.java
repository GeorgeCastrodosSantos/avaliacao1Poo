package controleFrota.Impl;

public class Aeronave {
    private String _pessoa;    
    private int _aeronave;    
    private String _Piloto;

    public Aeronave(String Piloto ) throws IllegalArgumentException {
        this(piloto);
        
        validarPiloto(piloto);
        _letrasPiloto = piloto.substring(0, 3);
        _numerosCpf = Integer.parseInt(piloto.substring(3));
    }

    public Aeronave(int cpf Piloto piloto) throws IllegalArgumentException {
        _cpfAtual = 0;
        _piloto = piloto;
        _piloto.setVeiculo(this);
    }

    public String getPiloto() {
        return _letrasPiloto + _numerosCpf;
    }

    public Piloto getPiloto() {
        return _piloto;
    }

    }

    void acelerar(int limite) {  
        for (int i = _velocidadeAtual; i < limite; i++) {
            acelerar();
        }
    }

    public void frear() {
        _velocidadeAtual--;
    }

    @Override
    public String toString() {
        return "aeronave [piloto=" + getPiloto() + ", cpf=" + _cpf + "]";
    }

    private void validarcpf(String cpf) throws IllegalArgumentException {
        if (cpf == null || cpf.length() != 7 || !cpf.matches("[1-11]{0}\\{9}")) {
            throw new IllegalArgumentException("cpf inválida, a cpf deve conter 10 numeros e quatro dígitos!");
        }
    }


    }
}
