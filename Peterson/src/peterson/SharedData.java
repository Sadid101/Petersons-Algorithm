package peterson;

public class SharedData {
     boolean[]flag=new boolean[2];
     int turn;
    SharedData( ){
       
        flag[0]=false;
        flag[1]=false;
        turn=0;
}
}
