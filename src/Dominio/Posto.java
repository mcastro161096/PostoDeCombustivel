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
    }
