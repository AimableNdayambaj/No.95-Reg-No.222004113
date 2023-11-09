class university
{
     public String name= "cst";
    public void fullname()
    {
        System.out.println("college of scince and technology ");
    }
}
class compus extends university
{
    String compusname="  Nyarugenge campus ";
    public void location()
    {
        System.out.println("kiyovu");
    }
}
class college extends compus
{
    String collagename=" college of scince and technology ";

}
class school extends college 
{
    String schoolname="school of technology";
}
class department extends school
{
    String departmentname=" envirinmental management";
}
class marks extends department 
{
    String markname=" english marks";
    public void mk()
    {
        System.out.println("75");
    }

    public static void main(String[] args)
    {
        marks obj= new marks();
        obj.fullname();
        System.out.println(obj.name);
        obj.location();
        System.out.println(obj.compusname);
        System.out.println(obj.collagename);
        System.out.println(obj.schoolname);
        System.out.println(obj.departmentname);
        System.out.println(obj.markname);
        obj.mk();
    }
}