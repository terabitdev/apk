package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int i) {
        setInternalState(i);
    }

    public static Hct from(double d10, double d11, double d12) {
        return new Hct(HctSolver.solveToInt(d10, d11, d12));
    }

    public static Hct fromInt(int i) {
        return new Hct(i);
    }

    private void setInternalState(int i) {
        this.argb = i;
        Cam16 fromInt = Cam16.fromInt(i);
        this.hue = fromInt.getHue();
        this.chroma = fromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 fromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(fromXyzInViewingConditions.getHue(), fromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(xyzInViewingConditions[1]));
    }

    public void setChroma(double d10) {
        setInternalState(HctSolver.solveToInt(this.hue, d10, this.tone));
    }

    public void setHue(double d10) {
        setInternalState(HctSolver.solveToInt(d10, this.chroma, this.tone));
    }

    public void setTone(double d10) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d10));
    }

    public int toInt() {
        return this.argb;
    }
}
