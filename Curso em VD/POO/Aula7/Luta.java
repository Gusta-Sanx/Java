package Aula7;


import java.util.Random;

public class Luta{

    private Lutador desafiado;
    private int forca;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;

    public Luta() {
    }
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarluta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        aprovada = true;
        desafiado = l1;
        desafiante  =  l2;
        }else{
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }


    public void lutar() {
        if(isAprovada()){
            desafiado.apresentar();
            desafiante.apresentar();
            Random rnd = new Random();
                desafiado.setVelocidade(rnd.nextInt(1,5));
                desafiado.setForca(rnd.nextInt(1,4));//define o multiplicador de dano baseado na altura
                desafiante.setVelocidade(rnd.nextInt(1,5));//define o multiplicador de velocidade (sorte)
                desafiante.setForca(rnd.nextInt(1,4));

                int prioridade;

                int dano1 = 5 *desafiado.getForca();
                int dano2 = 5 *desafiante.getForca();

                if(desafiado.getVelocidade() > desafiante.getVelocidade()){
                    prioridade = 1;
                }else{
                    prioridade = 0;
                }
            if (prioridade == 1) {
                while(desafiado.getVida() > 0 && desafiante.getVida() > 0) {
                    System.out.println(desafiado.getNome() + " foi mais rápido!");
                    System.out.println(desafiado.getNome() + " atacou primeiro!");
                    desafiante.setVida(desafiante.getVida() - dano1);


                    if(desafiante.getVida() > 0) {
                        System.out.println(desafiante.getNome() + " revidou!");
                        desafiado.setVida(desafiado.getVida() - dano2);

                    }
                }System.out.println("O vencedor é: " +
                        (desafiado.getVida() > 0 ? desafiado.getNome() : desafiante.getNome()));
                if (desafiado.getVida() > 0) {
                    desafiado.setVitorias(desafiado.getVitorias() + 1);
                    desafiante.setDerrotas(desafiante.getDerrotas() + 1);
                } else {
                    desafiante.setVitorias(desafiante.getVitorias() + 1);
                    desafiado.setDerrotas(desafiado.getDerrotas() + 1);
                }

            } else {
                while(desafiante.getVida() > 0 && desafiado.getVida() > 0) {
                    System.out.println(desafiante.getNome() + " foi mais rápido!");
                    System.out.println(desafiante.getNome() + " atacou primeiro!");
                    desafiado.setVida(desafiado.getVida() - dano2);


                    if(desafiado.getVida() > 0) {
                        System.out.println(desafiado.getNome() + " revidou!");
                        desafiante.setVida(desafiante.getVida() - dano1);

                    }
                }System.out.println("O vencedor é: " +
                        (desafiado.getVida() > 0 ? desafiado.getNome() : desafiante.getNome()));
                if (desafiante.getVida() > 0) {
                    desafiante.setVitorias(desafiante.getVitorias() + 1);
                    desafiado.setDerrotas(desafiado.getDerrotas() + 1);
                } else {
                    desafiado.setVitorias(desafiado.getVitorias() + 1);
                    desafiante.setDerrotas(desafiante.getDerrotas() + 1);
                }
                }
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }
}
