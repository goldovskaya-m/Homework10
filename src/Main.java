import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

import static java.util.stream.Stream.concat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homewok10");
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника - %s.%n", fullName);
        //
        String fullName2 = lastName
                .concat( " ")
                .concat(firstName)
                .concat( " ")
                .concat(middleName);
        System.out.printf("Ф. И. О. сотрудника - %s.%n", fullName2);
        //
        String fullName3 = String.format("%s %s %s. ", lastName, firstName, middleName);
        System.out.printf("Ф. И. О. сотрудника - %s%n" ,fullName3);
        //
        String fullName4 = String.join(  " ", lastName, firstName, middleName);
        System.out.printf("Ф. И. О. сотрудника - %s.%n" ,fullName4);
        //
        String [] fullName5 = {lastName, firstName, middleName};
        System.out.println("Ф. И. О. сотрудника - " + Arrays.toString(fullName5));
        System.out.println("Задача 2");
        System.out.println(fullName.toUpperCase());
        System.out.printf("Данные Ф.И.О.тдля заполненения отчёта - %s.%n",fullName);
        System.out.printf("Данные Ф.И.О.тдля заполненения отчёта - %s.%n",fullName.toUpperCase());
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.printf("Данные Ф.И.О.тдля заполненения отчёта - %s.%n",fullName);

    }
}