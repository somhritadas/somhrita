class Cylinder{

    double pie = 3.14;
    double radius, height;

    public Cylinder(double r, double h){

        radius = r;
        height = h;
    }
    void SurfaceArea()
    {
        System.out.println("Surface area of a cylinder: "+2*pie*radius*(radius+height));
    }
    void Volume(){
       System.out.println("Volume of a cylinder: "+pie*radius*radius*height);
    }
}
   class Cube{
    double side;
   
    public Cube(double s){
        side =s;
    }
    void SurfaceArea2()
 {
     System.out.println("Surface area of cube: "+6*side*side);
 }    
 void Volume2()
 {
     System.out.println("Volume of cube: "+side*side*side);
 }
  public static void main( String [] args)
  {
      Cylinder c =new Cylinder(4,8);
      c.SurfaceArea();
      c.Volume();
 
      Cube d = new Cube(8);
      d.SurfaceArea2();
      d.Volume2();
  }
}
