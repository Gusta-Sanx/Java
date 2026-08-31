package POO.Aula13;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membroo;

        public double getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getMembroo() {
            return membroo;
        }

        public void setMembroo(int membroo) {
            this.membroo = membroo;
        }

        void emitirSom(){}
}
