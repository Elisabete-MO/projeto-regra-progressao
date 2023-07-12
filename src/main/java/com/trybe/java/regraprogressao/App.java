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

    double data = 0.0;
    for (int i = 0; i < activityNumber; i++) {
      data += (activitiesGrades[i] * activitiesWeights[i]);
    }
    double finalGrade = data / 100.0;

    if (finalGrade >= 85.0) {
      System.out.println("Parabéns! Você alcançou" + finalGrade
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, com base na sua pontuação "
          + "alcançada neste período, " + finalGrade
          + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}