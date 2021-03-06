package Dominio;

    public class Posto
    {
        private String nome;

        private BombaDeCombustivel bomba1;

        private BombaDeCombustivel bomba2;

        public Posto(String nome, BombaDeCombustivel bomba1, BombaDeCombustivel bomba2)
        {
            this.nome = nome;
            this.bomba1 = bomba1;
            this.bomba2 = bomba2;
        }

        public String getNome()
        {
            return nome;
        }

        public void setNome(String nome)
        {
            this.nome = nome;
        }

        public BombaDeCombustivel getBomba1()
        {
            return bomba1;
        }

        public void setBomba1(BombaDeCombustivel bomba1)
        {
            this.bomba1 = bomba1;
        }

        public BombaDeCombustivel getBomba2()
        {
            return bomba2;
        }

        public void setBomba2(BombaDeCombustivel bomba2)
        {
            this.bomba2 = bomba2;
        }

        @Override
        public String toString()
        {
            return "Posto{" +
                    "nome='" + nome + '\'' +
                    ", bomba1=" + bomba1 +
                    ", bomba2=" + bomba2 +
                    '}';
        }

        public BombaDeCombustivel EscolheBombaComMaisCombustivel(int combustivelEscolhido)
        {
            BombaDeCombustivel bombaComMaisCombustivel = null;
            if(combustivelEscolhido == 1)
            {
                bombaComMaisCombustivel = VerificaComMaisGasolina();
            }

            if(combustivelEscolhido == 2)
            {
                bombaComMaisCombustivel = VerificaComMaisAlcool();
            }

            if(combustivelEscolhido == 3)
            {
                bombaComMaisCombustivel = VerificaComMaisDiesel();
            }

            return bombaComMaisCombustivel;
        }

        public BombaDeCombustivel VerificaComMaisGasolina()
        {
            BombaDeCombustivel bombaComMaisCombustivel = null;

            if(bomba1.getCombustivelGasolina().getQuantidade() == bomba2.getCombustivelGasolina().getQuantidade())
            {
                bombaComMaisCombustivel = bomba1;
            }

            if(bomba1.getCombustivelGasolina().getQuantidade() > bomba2.getCombustivelGasolina().getQuantidade())
            {
                bombaComMaisCombustivel = bomba1;
            }
            else
                bombaComMaisCombustivel = bomba2;

            return bombaComMaisCombustivel;
        }

        public BombaDeCombustivel VerificaComMaisAlcool()
        {
            BombaDeCombustivel bombaComMaisCombustivel = null;
            if(bomba1.getCombustivelAlcool().getQuantidade() == bomba2.getCombustivelAlcool().getQuantidade())
            {
                bombaComMaisCombustivel = bomba1;
            }

            if(bomba1.getCombustivelAlcool().getQuantidade() > bomba2.getCombustivelAlcool().getQuantidade())
            {
                bombaComMaisCombustivel = bomba1;
            }
            else
                bombaComMaisCombustivel = bomba2;

            return bombaComMaisCombustivel;
        }

        public BombaDeCombustivel VerificaComMaisDiesel()
        {
            BombaDeCombustivel bombaComMaisCombustivel = null;
            if(bomba1.getCombustivelDiesel().getQuantidade() == bomba2.getCombustivelDiesel().getQuantidade())
            {
                bombaComMaisCombustivel = bomba1;
            }

            if(bomba1.getCombustivelDiesel().getQuantidade() > bomba2.getCombustivelDiesel().getQuantidade())
            {
                bombaComMaisCombustivel = bomba1;
            }
            else
                bombaComMaisCombustivel = bomba2;

            return bombaComMaisCombustivel;
        }

    }
