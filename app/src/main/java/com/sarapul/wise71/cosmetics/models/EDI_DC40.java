package com.sarapul.wise71.cosmetics.models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false)
public class EDI_DC40
{
    @Element
    private String CREDAT;
    @Element
    private String MANDT;
    @Element
    private String DIRECT;
    @Element
    private String OUTMOD;
    @Element
    private String STATUS;
    @Element
    private String DOCNUM;
    @Element
    private String IDOCTYP;
    @Element
    private String SNDPOR;
    @Element
    private String SNDPRN;
    @Element
    private String DOCREL;
    @Element
    private String MESTYP;
    @Element
    private String RCVPRN;
    @Element
    private String TABNAM;
    @Element
    private String CRETIM;
    @Element(required=false)
    private String SEGMENT;
    @Element
    private String SERIAL;
    @Element
    private String RCVPRT;
    @Element
    private String SNDPRT;
    @Element
    private String RCVPOR;

    public String getCREDAT ()
    {
        return CREDAT;
    }

    public void setCREDAT (String CREDAT)
    {
        this.CREDAT = CREDAT;
    }

    public String getMANDT ()
    {
        return MANDT;
    }

    public void setMANDT (String MANDT)
    {
        this.MANDT = MANDT;
    }

    public String getDIRECT ()
    {
        return DIRECT;
    }

    public void setDIRECT (String DIRECT)
    {
        this.DIRECT = DIRECT;
    }

    public String getOUTMOD ()
    {
        return OUTMOD;
    }

    public void setOUTMOD (String OUTMOD)
    {
        this.OUTMOD = OUTMOD;
    }

    public String getSTATUS ()
    {
        return STATUS;
    }

    public void setSTATUS (String STATUS)
    {
        this.STATUS = STATUS;
    }

    public String getDOCNUM ()
    {
        return DOCNUM;
    }

    public void setDOCNUM (String DOCNUM)
    {
        this.DOCNUM = DOCNUM;
    }

    public String getIDOCTYP ()
    {
        return IDOCTYP;
    }

    public void setIDOCTYP (String IDOCTYP)
    {
        this.IDOCTYP = IDOCTYP;
    }

    public String getSNDPOR ()
    {
        return SNDPOR;
    }

    public void setSNDPOR (String SNDPOR)
    {
        this.SNDPOR = SNDPOR;
    }

    public String getSNDPRN ()
    {
        return SNDPRN;
    }

    public void setSNDPRN (String SNDPRN)
    {
        this.SNDPRN = SNDPRN;
    }

    public String getDOCREL ()
    {
        return DOCREL;
    }

    public void setDOCREL (String DOCREL)
    {
        this.DOCREL = DOCREL;
    }

    public String getMESTYP ()
    {
        return MESTYP;
    }

    public void setMESTYP (String MESTYP)
    {
        this.MESTYP = MESTYP;
    }

    public String getRCVPRN ()
    {
        return RCVPRN;
    }

    public void setRCVPRN (String RCVPRN)
    {
        this.RCVPRN = RCVPRN;
    }

    public String getTABNAM ()
    {
        return TABNAM;
    }

    public void setTABNAM (String TABNAM)
    {
        this.TABNAM = TABNAM;
    }

    public String getCRETIM ()
    {
        return CRETIM;
    }

    public void setCRETIM (String CRETIM)
    {
        this.CRETIM = CRETIM;
    }

    public String getSEGMENT ()
    {
        return SEGMENT;
    }

    public void setSEGMENT (String SEGMENT)
    {
        this.SEGMENT = SEGMENT;
    }

    public String getSERIAL ()
    {
        return SERIAL;
    }

    public void setSERIAL (String SERIAL)
    {
        this.SERIAL = SERIAL;
    }

    public String getRCVPRT ()
    {
        return RCVPRT;
    }

    public void setRCVPRT (String RCVPRT)
    {
        this.RCVPRT = RCVPRT;
    }

    public String getSNDPRT ()
    {
        return SNDPRT;
    }

    public void setSNDPRT (String SNDPRT)
    {
        this.SNDPRT = SNDPRT;
    }

    public String getRCVPOR ()
    {
        return RCVPOR;
    }

    public void setRCVPOR (String RCVPOR)
    {
        this.RCVPOR = RCVPOR;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CREDAT = "+CREDAT+", MANDT = "+MANDT+", DIRECT = "+DIRECT+", OUTMOD = "+OUTMOD+", STATUS = "+STATUS+", DOCNUM = "+DOCNUM+", IDOCTYP = "+IDOCTYP+", SNDPOR = "+SNDPOR+", SNDPRN = "+SNDPRN+", DOCREL = "+DOCREL+", MESTYP = "+MESTYP+", RCVPRN = "+RCVPRN+", TABNAM = "+TABNAM+", CRETIM = "+CRETIM+", SEGMENT = "+SEGMENT+", SERIAL = "+SERIAL+", RCVPRT = "+RCVPRT+", SNDPRT = "+SNDPRT+", RCVPOR = "+RCVPOR+"]";
    }
}
