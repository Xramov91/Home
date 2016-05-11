
package home;

public class People {
private int age;
private String gender;
    public People(int age1, String gender1) {
        age = age1;
        gender = gender1;
    }
    
public int getage (){
return age;
}
public String getgend (){
return gender;
}

public static int armax(int ar[]){
    int b = ar[0];
    for (int i=0;i<5;i++){
        if (ar[i]>b){
        b = ar[i];
    }
    }    
    return b;    
    }
}
