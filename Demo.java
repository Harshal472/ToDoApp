class Demo
{
    public static void main(String arg[])
    {
        String cname = arg[0];
        int r = Integer.parseInt(arg[1]);
        float pi = Float.parseFloat(arg[2]);

        double area = pi * r * r;

        System.out.println("Circle name=" + cname);
        System.out.println("Area=" + area);
    }
}
