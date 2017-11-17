package com.sarapul.wise71.cosmetics.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class E1WPW02
{
    @Element(required = false)
    private String VERKNUEPFG;
    @Element(required = false)
    private String BEZEICH;
    @Element(required = false)
    private String HIERARCHIE;
    @Element(required = false)
    private String SEGMENT;

    public String getVERKNUEPFG ()
    {
        return VERKNUEPFG;
    }

    public void setVERKNUEPFG (String VERKNUEPFG)
    {
        this.VERKNUEPFG = VERKNUEPFG;
    }

    public String getBEZEICH ()
    {
        return BEZEICH;
    }

    public void setBEZEICH (String BEZEICH)
    {
        this.BEZEICH = BEZEICH;
    }

    public String getHIERARCHIE ()
    {
        return HIERARCHIE;
    }

    public void setHIERARCHIE (String HIERARCHIE)
    {
        this.HIERARCHIE = HIERARCHIE;
    }

    public String getSEGMENT ()
    {
        return SEGMENT;
    }

    public void setSEGMENT (String SEGMENT)
    {
        this.SEGMENT = SEGMENT;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [VERKNUEPFG = "+VERKNUEPFG+", BEZEICH = "+BEZEICH+", HIERARCHIE = "+HIERARCHIE+", SEGMENT = "+SEGMENT+"]";
    }
}
