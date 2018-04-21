/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mhcrnl
 */
public class NameHandler {
    @NotNull
    private String name;
    @NotNull @Min(2)
    private String IARBuc;
    private int IACBuc;
    private int IARBaie;
    private int IACBaie;
    private int gaze;

    public NameHandler() {
        name = null;
        IARBuc = null;
        IACBuc = 0;
        IARBaie = 0;
        IACBaie= 0;
        gaze = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the IARBuc
     */
    public String getIARBuc() {
        return IARBuc;
    }

    /**
     * @param IARBuc the IARBuc to set
     */
    public void setIARBuc(String IARBuc) {
        this.IARBuc = IARBuc;
    }

    /**
     * @return the IACBuc
     */
    public int getIACBuc() {
        return IACBuc;
    }

    /**
     * @param IACBuc the IACBuc to set
     */
    public void setIACBuc(int IACBuc) {
        this.IACBuc = IACBuc;
    }

    /**
     * @return the IARBaie
     */
    public int getIARBaie() {
        return IARBaie;
    }

    /**
     * @param IARBaie the IARBaie to set
     */
    public void setIARBaie(int IARBaie) {
        this.IARBaie = IARBaie;
    }

    /**
     * @return the IACBaie
     */
    public int getIACBaie() {
        return IACBaie;
    }

    /**
     * @param IACBaie the IACBaie to set
     */
    public void setIACBaie(int IACBaie) {
        this.IACBaie = IACBaie;
    }

    
    public int getGaze() {
        return gaze;
    }

    /**
     * @param gaze the gaze to set
     */
    public void setGaze(int gaze) {
        this.gaze = gaze;
    }

}
