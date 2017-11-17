package com.sarapul.wise71.cosmetics.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict=false)
public class IDOC
{
    @ElementList(entry = "E1WPW01", inline = true, required = false)
    private List<E1WPW01> E1WPW01;
    @Element(required=false)
    private String BEGIN;
    @Element(required=false)
    private EDI_DC40 EDI_DC40;

    public List<E1WPW01> getE1WPW01 ()
    {
        return E1WPW01;
    }

    public void setE1WPW01 (List<E1WPW01> E1WPW01)
    {
        this.E1WPW01 = E1WPW01;
    }

    public String getBEGIN ()
    {
        return BEGIN;
    }

    public void setBEGIN (String BEGIN)
    {
        this.BEGIN = BEGIN;
    }

    public EDI_DC40 getEDI_DC40 ()
    {
        return EDI_DC40;
    }

    public void setEDI_DC40 (EDI_DC40 EDI_DC40)
    {
        this.EDI_DC40 = EDI_DC40;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [E1WPW01 = "+E1WPW01+", BEGIN = "+BEGIN+", EDI_DC40 = "+EDI_DC40+"]";
    }
}