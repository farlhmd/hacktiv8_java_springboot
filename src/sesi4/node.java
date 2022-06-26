package sesi4;

public class node {
node left, right;
int value;
public void input(int a){
    value=a;
}
public static void main(String[] args) {
    tree tr = new tree();
    node root = new node();
    int menu = 1, r=1, a;

    while(menu!=3){
        
        System.out.print("1.input\n2.view\n3.exit\nMasukkan Pilihan: ");
        menu = tree.inputanUser.nextInt();
        
        if(menu==1){
            System.out.print("Masukkan Angka: ");
            a = tree.inputanUser.nextInt();
            if (r==1) {
                root.input(a);
                r--;
            }
            else tr.insert(root, a);
        }
        else if(menu ==2) tr.view(root);
        else if(menu==3) System.out.println("Keluar");
        else System.out.println("Salah");
        System.out.println(" ");
    }

}
}
