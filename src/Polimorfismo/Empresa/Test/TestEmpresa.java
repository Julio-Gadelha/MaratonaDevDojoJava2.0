package Polimorfismo.Empresa.Test;

import Polimorfismo.Empresa.Dominio.Cargo;
import Polimorfismo.Empresa.Dominio.Estagiario;
import Polimorfismo.Empresa.Dominio.Gerente;
import Polimorfismo.Empresa.Servico.CalculoEmpresa;

public class TestEmpresa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel",10000, Cargo.GERENTE);
        Estagiario estagiario = new Estagiario("Julio",1000,Cargo.ESTAGIARIO);
        CalculoEmpresa.calculaResultado(estagiario);
        System.out.println("--------------------");
        CalculoEmpresa.calculaResultado(gerente);
    }
}
