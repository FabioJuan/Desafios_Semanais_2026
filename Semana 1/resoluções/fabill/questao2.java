import java.util.Scanner;

public class questao2{
    int saldo;
    boolean bolsista;
    Scanner ler = new Scanner(System.in);

    boolean bolsa(){
        System.out.println("você é bolsista? [s/n]");
        char condicao = ler.next().charAt(0);
        boolean bolsas = (condicao == 's' || condicao == 'S') ? true : false;
        ler.close();
        return bolsas;
    }
    public void main(String[] args){
        System.out.println("digite o seu saldo");
        saldo = ler.nextInt();
        bolsista = bolsa();
        int aprovado = (saldo >= 1 || bolsista == true) ? 1 : 0 ;
        System.out.println("$"+aprovado+"$");
    }

}
