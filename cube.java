class cube
{
static int cube=0;

static void get(){
  cube++;
 int n=cube*cube*cube;
 System.out.println(n);
 }
 public static void main(String[] args){
 cube a=new cube();
for(int i=0;i<20;i++){
a.get();
}
}
}

 
 