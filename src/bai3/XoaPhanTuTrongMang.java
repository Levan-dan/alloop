package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        String[] name = {"Minh", "Tam", "Chanh", "Dam", "Sam"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap vi tri can xoa");


            int indexName = scanner.nextInt();
            if (indexName < 0 || indexName >= name.length) {
                System.out.println("Vi tri khong hop le, vui long nhap vi tri khac");
                return;
            } else {
                for (int i = indexName; i < name.length -1; i++) {
                    name[i] = name[i + 1];
                }
            }
            name = Arrays.copyOf(name, name.length - 1);
            System.out.println("Mang sau do la: ");
            for(String arr: name){
                System.out.print(arr + " ");
            }

        }


    }

