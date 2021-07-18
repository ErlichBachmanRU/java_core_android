package lesson8;

public class Cat implements SportsSkills{
    String name;
    int maxDist;
    int maxHeight;

    public Cat(String name, int maxDist, int maxHeight) {
        this.name = name;
        this.maxDist = maxDist;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.printf("%s %s %s\n",this.getClass().getSimpleName(), name,"умеет бегать");
    }

    @Override
    public void jump() {
        System.out.printf("%s %s %s\n",this.getClass().getSimpleName(), name,"умеет прыгать");
    }

    @Override
    public void runDist(int maxInt) {
        String a = " ";
        if (maxInt == 1 ){
            a = "метр";
        }
        else if (maxInt == 2 || maxInt == 3 || maxInt == 4 ){
            a = "метра";
        } else if(maxInt == 5 || maxInt > 5) {
            a = "метров";
        }
        if (maxInt <= this.maxDist){
            System.out.printf("%s %s %s %d %s\n",this.getClass().getSimpleName(), name,"пробежал",maxInt, a);
        } else {
            System.out.printf("%s %s %s %s\n","Этому",this.getClass().getSimpleName(), name+'у',"столько не пробежать!");
        }
    }

    @Override
    public void maxHeight(int maxInt) {
        String a = " ";
        if (maxInt == 1 ){
            a = "метр";
        }
        else if (maxInt == 2 || maxInt == 3 || maxInt == 4 ){
            a = "метра";
        } else if(maxInt == 5 || maxInt > 5) {
            a = "метров";
        }
        if (maxInt <= this.maxHeight){
            System.out.printf("%s %s %s %d %s\n",this.getClass().getSimpleName(), name,"прыгнул через барьер",maxInt,a);
        } else {
            System.out.printf("%s %s %s %s %d %s\n","Этот",this.getClass().getSimpleName(), name,"не может перепрыгнуть через",maxInt,a);
        }

    }

    public int getMaxDist() {
        return maxDist;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
