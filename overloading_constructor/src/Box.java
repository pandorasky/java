class Box{
    double width;
    double height;
    double depth;

Box(double w,double h,double d){
    width = w;
    height =h;
    depth = d;
}

Box(){
    width=-1;
    height=-1;
    depth=-1;
}

 Box (double len ){
     width=height=depth=len;
}
double volume(){
    return width*height*depth;
}
}

class overloadcons{
    public static void main(String args[]){
        Box mybox1 = new Box(10,15,20);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
        vol =mybox1.volume();
        System.out.println("volume of my box1 is " + vol);
        vol =mybox2.volume();
        System.out.println("volume of my box2 is " + vol);
        vol =mycube.volume();
        System.out.println("volume of my box3 is" +vol);
    }
}

