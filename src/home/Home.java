
package home;
public class Home {

    public static void main(String[] args) {
    People p1 = new People(38, "male");
    People p2 = new People(25, "male");
    People p3 = new People(15, "famale");
    People p4 = new People(65, "famale");
    People p5 = new People(7, "male");
    People p[] = new People[5];

    p[0]=p1;
    p[1]=p2;
    p[2]=p3;
    p[3]=p4;
    p[4]=p5;

    int arage[] = new int[5];
    for (int i=0;i<5;i++){
    if (p[i].getgend()=="male"){
        arage[i]=p[i].getage();

    }
    }
        int c = People.armax(arage);
        System.out.println(c);
    }
    }

        
    

