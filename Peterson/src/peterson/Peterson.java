package peterson;
public class Peterson implements Runnable{
    SharedData data;
    int mine, other;
    Peterson(SharedData d1, int id){
        data = d1;
        mine = id;
        
        
    }
    @Override
    public void run() {
        
        
        if(mine==0){
            other=1;
        }
        else{
            other=0;
        }
       for(;;){
            data.flag[mine]=true;
            data.turn=other;
            while(data.flag[other]==true && data.turn==other){
                
            }
            System.out.println("This is "+data.turn);
            System.out.println("This is "+data.turn);
            data.flag[mine]=false;
        
    }
       
    }
       
    }
