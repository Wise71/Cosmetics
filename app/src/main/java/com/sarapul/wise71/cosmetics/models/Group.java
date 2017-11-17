package com.sarapul.wise71.cosmetics.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "WPDWGR01")
public class Group
{
    @Element
    private IDOC IDOC;

    public IDOC getIDOC ()
    {
        return IDOC;
    }

    public void setIDOC (IDOC IDOC)
    {
        this.IDOC = IDOC;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [IDOC = "+IDOC+"]";
    }
}