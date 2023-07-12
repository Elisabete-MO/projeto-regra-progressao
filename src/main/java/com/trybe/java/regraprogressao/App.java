package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main. Here we go
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int activity_number = scanner.nextInt();

    String[] activity_names = new String[activity_number];
    int[] activity_weights = new int[activity_number];

    for (int i = 0; i < activity_number; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String activity_name = scanner.nextLine();
      activity_names[i] = activity_name;

      System.out.println("Digite o peso da atividade " + i + ":");
      int activity_weight = scanner.nextInt();
      activity_weights[i] = activity_weight;
    }
    scanner.close();
  }
}