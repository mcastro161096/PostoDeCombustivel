package Aplicacao;
import Dominio.*;

import java.util.Scanner;

public class Programa
    {
        public static void main(String [] args)
        {
            Scanner ler = new Scanner(System.in);


            Combustivel gasolina = new Combustivel("Gasolina", 4.26);
            Combustivel alcool = new Combustivel("Alcool", 2.78);
            Combustivel diesel = new Combustivel("Diesel", 3.37);

            CombustivelBomba combustivelGasolina = new CombustivelBomba(gasolina, 20.00);
            CombustivelBomba combustivelAlcool = new CombustivelBomba(alcool, 20.00);
            CombustivelBomba combustivelDiesel = new CombustivelBomba(diesel, 20.00);

            BombaDeCombustivel bomba1 = new BombaDeCombustivel(combustivelGasolina,combustivelAlcool,combustivelDiesel);
            BombaDeCombustivel bomba2 = new BombaDeCombustivel(combustivelGasolina,combustivelAlcool,combustivelDiesel);

            Posto posto = new Posto("Posto de mentirinha", bomba1, bomba2);

            var abastecerNovamente = true;
            do
            {
                System.out.println("Bem vindo ao posto : " + posto.getNome() + "\n" +
                        " Escolha a sua opção para abastecimento\n" +
                        "1 – Abastecimento por valor (R$)\n" +
                        "2 – Abastecimento por quantidade de litros\n" +
                        "3 - Sair");

                int opcaoAbastecimento = ler.nextInt();

                if (opcaoAbastecimento == 1)
                {
                    System.out.println("Informe o valor a ser abastecido");
                        double valorASerAbastecido = ler.nextDouble();
                    System.out.println("Escolha o combustível: \n" +
                                "1 – Gasolina\n" +
                                "2 – Alcool\n" +
                                "3 - Diesel");
                        int combustivelEscolhido = ler.nextInt();

                    BombaDeCombustivel bombaComMaisCombustivel = posto.EscolheBombaComMaisCombustivel(combustivelEscolhido);
                        String resultado = bombaComMaisCombustivel.AbastecerPorValor(valorASerAbastecido, combustivelEscolhido);
                                System.out.println(resultado);

                    System.out.println("Deseja abstecer novamente? 1-SIM ou 2-NÃO");
                        if(ler.nextInt() != 1)
                            abastecerNovamente = false;

                }

                if (opcaoAbastecimento == 2)
                {
                    System.out.println("Informe a quantidade de litros");
                        double quantidadeDelitros = ler.nextDouble();
                    System.out.println("Escolha o combustível: \n" +
                            "1 – Gasolina\n" +
                            "2 – Alcool\n" +
                            "3 - Diesel");
                        int combustivelEscolhido = ler.nextInt();

                    BombaDeCombustivel bombaComMaisCombustivel = posto.EscolheBombaComMaisCombustivel(combustivelEscolhido);
                    String valorAbastecido = bombaComMaisCombustivel.AbastecerPorLitro(quantidadeDelitros, combustivelEscolhido);

                    System.out.println("Você abasteceu " + valorAbastecido + "litros");
                    System.out.println("Deseja abstecer novamente? 1-SIM ou 2-NÃO");
                    if(ler.nextInt() != 1)
                        abastecerNovamente = false;
                }

                if(opcaoAbastecimento == 3)
                {
                    System.exit(-1);
                }
                if(opcaoAbastecimento != 1 && opcaoAbastecimento !=2 && opcaoAbastecimento !=3)
                    System.out.println("Opção inválida");

            }while (abastecerNovamente == true);

        }
    }
