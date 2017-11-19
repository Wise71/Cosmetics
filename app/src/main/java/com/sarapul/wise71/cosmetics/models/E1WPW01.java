package com.sarapul.wise71.cosmetics.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class E1WPW01
{

    @Element(required = false)
    private String SEGMENT;
    @Element(required = false)
    private E1WPW02 E1WPW02;
    @Element(required = false)
    private String FILIALE;
    @Element(required = false)
    private String WARENGR;
    @Element(required = false)
    private String AENDDATUM;
    @Element(required = false)
    private String AENDKENNZ;
    @Element(required = false)
    private String AKTIVDATUM;

    public E1WPW02 getE1WPW02 ()
    {
        return E1WPW02;
    }

    public void setE1WPW02 (E1WPW02 E1WPW02)
    {
        this.E1WPW02 = E1WPW02;
    }

    public String getFILIALE ()
    {
        return FILIALE;
    }

    public void setFILIALE (String FILIALE)
    {
        this.FILIALE = FILIALE;
    }

    public String getWARENGR ()
    {
        return WARENGR;
    }

    public void setWARENGR (String WARENGR)
    {
        this.WARENGR = WARENGR;
    }

    public String getSEGMENT ()
    {
        return SEGMENT;
    }

    public void setSEGMENT (String SEGMENT)
    {
        this.SEGMENT = SEGMENT;
    }

    public String getAENDDATUM ()
    {
        return AENDDATUM;
    }

    public void setAENDDATUM (String AENDDATUM)
    {
        this.AENDDATUM = AENDDATUM;
    }

    public String getAENDKENNZ ()
    {
        return AENDKENNZ;
    }

    public void setAENDKENNZ (String AENDKENNZ)
    {
        this.AENDKENNZ = AENDKENNZ;
    }

    public String getAKTIVDATUM ()
    {
        return AKTIVDATUM;
    }

    public void setAKTIVDATUM (String AKTIVDATUM)
    {
        this.AKTIVDATUM = AKTIVDATUM;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [E1WPW02 = "+E1WPW02+", FILIALE = "+FILIALE+", WARENGR = "+WARENGR+", SEGMENT = "+SEGMENT+", AENDDATUM = "+AENDDATUM+", AENDKENNZ = "+AENDKENNZ+", AKTIVDATUM = "+AKTIVDATUM+"]";
    }
}