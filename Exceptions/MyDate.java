import java.util.Scanner;

class InvalidDateException extends Exception{
    InvalidDateException(){

    }
    public String toString(){
        return "Invalid date";
    }
}

class Mydate{
    private int dd;
    private int mm;
    private int yy;

    public void accept(){
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day : ");
        dd = sc.nextInt();
        System.out.print("Enter Month : ");
        mm = sc.nextInt();
        System.out.print("Enter Year : ");
        yy = sc.nextInt();

    }


    void isValid(){
    //check which month has 31 days
            try{
                    if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){
            if(dd >= 1 && dd <= 31){
                System.out.print(this);
            }else{
                throw new InvalidDateException();
            }
        }else if(mm == 4 || mm == 6 || mm == 9 || mm == 11){
            if(dd >= 1 && dd <= 30){
                System.out.print(this);
            }else{
                throw new InvalidDateException();
            }
        }else if(mm == 2){
            //check leap year
            if((dd % 4 == 0 || dd % 100 != 0) && (dd % 400 == 0) ){
                if(dd >= 1 && dd <= 29){
                System.out.print(this);
                }else{
                throw new InvalidDateException();
                }
            }
        }
         
           }catch(InvalidDateException ide){
             System.out.println(ide);
          }
      
   }
   public String toString(){
       return dd + " / "+  mm + " / " + yy;
   }
}
class TestDate{
    public static void main(String args[]){
        Mydate md = new Mydate();
        md.accept();
        md.isValid();
    }
}