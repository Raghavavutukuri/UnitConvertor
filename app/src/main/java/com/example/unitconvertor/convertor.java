package com.example.unitconvertor;

public class convertor {
    public float lengthconversion(String u1 , String u2 , float val)
    {
        float result1=0;
        if(u1.equals("Kilometer") && u2.equals("Meter")){
            result1=val*1000;
        }
        else if(u2.equals("Kilometer") && u1.equals("Meter"))
        {
            result1=val/1000;
        }
        else if(u1.equals("Kilometer") && u2.equals("Centimeter"))
        {
            result1=val*10000;
        }
        else if(u2.equals("Kilometer") && u1.equals("Centimeter"))
        {
            result1=val/10000;
        }
        else if(u1.equals("Kilometer") && u2.equals("Millimeter"))
        {
            result1=val*1000000;
        }
        else if(u2.equals("Kilometer") && u1.equals("Millimeter"))
        {
            result1=val/1000000;
        }
        else if(u1.equals("Kilometer") && u2.equals("Micrometer"))
        {
            result1= (float) (val*1e+9);
        }
        else if(u2.equals("Kilometer") && u1.equals("Micrometer"))
        {
            result1= (float) (val/1e+9);
        }
        else if(u1.equals("Kilometer") && u2.equals("Nanometer"))
        {
            result1= (float) (val*1e+12);
        }
        else if(u2.equals("Kilometer") && u1.equals("Nanometer"))
        {
            result1= (float) (val/1e+12);
        }
        else if(u1.equals("Kilometer") && u2.equals("Mile"))
        {
            result1=(float)(val/1.609);
        }
        else if(u2.equals("Kilometer") && u1.equals("Mile"))
        {
            result1=(float)(val*1.609);
        }//1094
        else if(u1.equals("Kilometer") && u2.equals("Yard"))
        {
            result1=(float)(val*1094);
        }
        else if(u2.equals("Kilometer") && u1.equals("Yard"))
        {
            result1=(float)(val/1094);
        }//3281
        else if(u1.equals("Kilometer") && u2.equals("Foot"))
        {
            result1=(float)(val*3281);
        }
        else if(u2.equals("Kilometer") && u1.equals("Foot"))
        {
            result1=(float)(val/3281);
        }//39370
        else if(u1.equals("Kilometer") && u2.equals("Inch"))
        {
            result1=(float)(val*39370);
        }
        else if(u2.equals("Kilometer") && u1.equals("Inch"))
        {
            result1=(float)(val/39370);
        }
        return result1;
    }
}
/*
<item>Meter</item>
        <item>Kilometer</item>
        <item>Centimeter<item>
        <item>Millimeter</item>
        <item>Micrometer</item>
        <item>Nanometer</item>
        <item>Mile</item>
        <item>Yard</item>
        <item>Foot</item>
        <item>Inch</item>
        <item>Light Year</item>
 */