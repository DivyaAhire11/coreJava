//Sorting of Students 
import java.io.*;

class Stud{
    private int roll;
    private String name;
    private float per;
    static int cnt;

    public Stud(){ }
    public Stud(String name,float per){
        cnt++;
        this.roll = cnt;
        this.name = name;
        this.per = per;
    }
    void display(){
        System.out.println(this.roll +"\t\t"+this.name+"\t\t"+this.per+"%");
    }
    static void count(){
        System.out.println("Object "+cnt+" Created");
    }
    public static void sort(Stud s[], int n){
        int i,j;
         for(i = n-1;i>= 0;i--){
            for(j=0;j<1;j++){
                if(s[j].per > s[j+1].per){
                     Stud t = s[j];
                     s[j] = s[j+1];
                     s[j+1] = t;
                }
            }
         }
         System.out.println("\nSort Student By its Percentage as Follow");
         for( i = 0;i<n;i++)
            s[i].display();
    }
}
class SortStud{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,r,i;
        String nm;
        float m;
        System.out.print("Who many object You want to Create : ");
        n = Integer.parseInt(br.readLine());
        Stud s[] = new Stud[n];
        for(i=0;i<n;i++){
       
            System.out.print("Enter name :");
            nm= br.readLine();
            System.out.print("Enter marks :");
            m = Float.parseFloat(br.readLine());

            s[i] = new Stud(nm,m);
            Stud.count();
        }
        Stud.sort(s,Stud.cnt);
    }
}