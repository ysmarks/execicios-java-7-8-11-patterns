package br.com.javacore.zztdesignpattern.abstractfactory.testes;

import br.com.javacore.zztdesignpattern.abstractfactory.Cliente;
import br.com.javacore.zztdesignpattern.abstractfactory.FabricaAbstrata;
import br.com.javacore.zztdesignpattern.abstractfactory.FabricaConcreta1;
import br.com.javacore.zztdesignpattern.abstractfactory.FabricaConcreta2;

public class FabricaAbstrataTest {

    public static void main(String[] args) {
        FabricaAbstrata fabrica1 = new FabricaConcreta1();
        Cliente cliente1 = new Cliente(fabrica1);
        cliente1.executar();

        FabricaAbstrata fabrica2 = new FabricaConcreta2();
        Cliente cliente2 = new Cliente(fabrica2);
        cliente2.executar();
    }
}
