package DesafioUm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioUm {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        List<String> posicao = new ArrayList<>();



        System.out.print("Digite a quantidade de vezes: ");
        int numPosicao = x.nextInt();



        for (int i = 0; i < numPosicao; i++) {
        posicao.add(" ".repeat(numPosicao - i) + "*".repeat(i + 1));
        }



        for (String d : posicao ) {
        System.out.println(d);
        }
	}

}
