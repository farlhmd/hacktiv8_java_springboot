package sesi4;

import java.util.Scanner;

public class tree {
    static Scanner inputanUser = new Scanner(System.in);
    public void insert(node a, int b){
        if (b<a.value) {
            if(a.left!=null) insert(a.left,b);
            else{
                a.left = new node();
                a.left.input(b);
                System.out.println(b + " di kiri " + a.value);
            }
        }
        else if(b>a.value){
            if(a.right!=null) insert(a.right,b);
            else{
                a.right = new node();
                a.right.input(b);
                System.out.println(b + " di kanan " + a.value);
            }
        }
    }
    public void view(node a){
        System.out.print("\npreOrder  : ");
        preOrder(a);
        System.out.println(" ");

        System.out.print("inOrder   : ");
        inOrder(a);
        System.out.println(" ");

        System.out.print("postOrder : ");
        postOrder(a);
        System.out.println(" ");
    }
    public void preOrder(node a){
        if(a!=null){
            System.out.print(a.value + " ");
            preOrder(a.left);
            preOrder(a.right);
        }
    }
    public void inOrder(node a){
        if (a != null) {
            inOrder(a.left);
            System.out.print(a.value + " ");
            inOrder(a.right);
        }
    }
    public void postOrder(node a){
        if(a!=null){
            postOrder(a.left);
            postOrder(a.right);
            System.out.print(a.value + " ");
        }
    }
}
