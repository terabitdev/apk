package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/elements/echo/SliderData;", "", "progress", "", "currentChapterTime", "", "remainingChapterTime", "totalChapterTime", "isCurrentChapterLast", "", "remainingReadTime", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getProgress", "()F", "getCurrentChapterTime", "()Ljava/lang/String;", "getRemainingChapterTime", "getTotalChapterTime", "()Z", "getRemainingReadTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class SliderData {
    private final String currentChapterTime;
    private final boolean isCurrentChapterLast;
    private final float progress;
    private final String remainingChapterTime;
    private final String remainingReadTime;
    private final String totalChapterTime;

    public SliderData(float f10, String str, String str2, String str3, boolean z6, String str4) {
        j0.c.u(str, str2, str3, str4);
        this.progress = f10;
        this.currentChapterTime = str;
        this.remainingChapterTime = str2;
        this.totalChapterTime = str3;
        this.isCurrentChapterLast = z6;
        this.remainingReadTime = str4;
    }

    public static /* synthetic */ SliderData copy$default(SliderData sliderData, float f10, String str, String str2, String str3, boolean z6, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = sliderData.progress;
        }
        if ((i10 & 2) != 0) {
            str = sliderData.currentChapterTime;
        }
        if ((i10 & 4) != 0) {
            str2 = sliderData.remainingChapterTime;
        }
        if ((i10 & 8) != 0) {
            str3 = sliderData.totalChapterTime;
        }
        if ((i10 & 16) != 0) {
            z6 = sliderData.isCurrentChapterLast;
        }
        if ((i10 & 32) != 0) {
            str4 = sliderData.remainingReadTime;
        }
        boolean z10 = z6;
        String str5 = str4;
        return sliderData.copy(f10, str, str2, str3, z10, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentChapterTime() {
        return this.currentChapterTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemainingChapterTime() {
        return this.remainingChapterTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTotalChapterTime() {
        return this.totalChapterTime;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCurrentChapterLast() {
        return this.isCurrentChapterLast;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRemainingReadTime() {
        return this.remainingReadTime;
    }

    public final SliderData copy(float progress, String currentChapterTime, String remainingChapterTime, String totalChapterTime, boolean isCurrentChapterLast, String remainingReadTime) {
        currentChapterTime.getClass();
        remainingChapterTime.getClass();
        totalChapterTime.getClass();
        remainingReadTime.getClass();
        return new SliderData(progress, currentChapterTime, remainingChapterTime, totalChapterTime, isCurrentChapterLast, remainingReadTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderData)) {
            return false;
        }
        SliderData sliderData = (SliderData) other;
        if (Float.compare(this.progress, sliderData.progress) == 0 && m.c(this.currentChapterTime, sliderData.currentChapterTime) && m.c(this.remainingChapterTime, sliderData.remainingChapterTime) && m.c(this.totalChapterTime, sliderData.totalChapterTime) && this.isCurrentChapterLast == sliderData.isCurrentChapterLast && m.c(this.remainingReadTime, sliderData.remainingReadTime)) {
            return true;
        }
        return false;
    }

    public final String getCurrentChapterTime() {
        return this.currentChapterTime;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final String getRemainingChapterTime() {
        return this.remainingChapterTime;
    }

    public final String getRemainingReadTime() {
        return this.remainingReadTime;
    }

    public final String getTotalChapterTime() {
        return this.totalChapterTime;
    }

    public int hashCode() {
        return this.remainingReadTime.hashCode() + com.google.android.gms.internal.play_billing.b.f(j0.c.c(j0.c.c(j0.c.c(Float.hashCode(this.progress) * 31, 31, this.currentChapterTime), 31, this.remainingChapterTime), 31, this.totalChapterTime), 31, this.isCurrentChapterLast);
    }

    public final boolean isCurrentChapterLast() {
        return this.isCurrentChapterLast;
    }

    public String toString() {
        float f10 = this.progress;
        String str = this.currentChapterTime;
        String str2 = this.remainingChapterTime;
        String str3 = this.totalChapterTime;
        boolean z6 = this.isCurrentChapterLast;
        String str4 = this.remainingReadTime;
        StringBuilder sb = new StringBuilder("SliderData(progress=");
        sb.append(f10);
        sb.append(", currentChapterTime=");
        sb.append(str);
        sb.append(", remainingChapterTime=");
        f.x(sb, str2, ", totalChapterTime=", str3, ", isCurrentChapterLast=");
        sb.append(z6);
        sb.append(", remainingReadTime=");
        sb.append(str4);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
