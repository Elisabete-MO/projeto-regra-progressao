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
    int activityNumber = scanner.nextInt();
    scanner.nextLine();

    String[] activitiesNames = new String[activityNumber];
    int[] activitiesWeights = new int[activityNumber];
    int[] activitiesGrades = new int[activityNumber];

    for (int i = 0; i < activityNumber; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      String activityName = scanner.nextLine();
      activitiesNames[i] = activityName;

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      String activityWeight = scanner.nextLine();
      activitiesWeights[i] = Short.parseShort(activityWeight);

      System.out.println("Digite a nota obtida para " + activityName + ":");
      String activityGrade = scanner.nextLine();
      activitiesGrades[i] = Short.parseShort(activityGrade);
    }
    scanner.close();
  }
}