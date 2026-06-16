package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/ui/components/StatItem;", "", ParameterNames.ICON, "", ParameterNames.TEXT, "", "sortOrder", "<init>", "(ILjava/lang/String;I)V", "getIcon", "()I", "getText", "()Ljava/lang/String;", "getSortOrder", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class StatItem {
    private final int icon;
    private final int sortOrder;
    private final String text;

    public StatItem(int i10, String str, int i11) {
        str.getClass();
        this.icon = i10;
        this.text = str;
        this.sortOrder = i11;
    }

    public static /* synthetic */ StatItem copy$default(StatItem statItem, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = statItem.icon;
        }
        if ((i12 & 2) != 0) {
            str = statItem.text;
        }
        if ((i12 & 4) != 0) {
            i11 = statItem.sortOrder;
        }
        return statItem.copy(i10, str, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final StatItem copy(int icon, String text, int sortOrder) {
        text.getClass();
        return new StatItem(icon, text, sortOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatItem)) {
            return false;
        }
        StatItem statItem = (StatItem) other;
        if (this.icon == statItem.icon && kotlin.jvm.internal.m.c(this.text, statItem.text) && this.sortOrder == statItem.sortOrder) {
            return true;
        }
        return false;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Integer.hashCode(this.sortOrder) + j0.c.c(Integer.hashCode(this.icon) * 31, 31, this.text);
    }

    public String toString() {
        int i10 = this.icon;
        String str = this.text;
        int i11 = this.sortOrder;
        StringBuilder sb = new StringBuilder("StatItem(icon=");
        sb.append(i10);
        sb.append(", text=");
        sb.append(str);
        sb.append(", sortOrder=");
        return defpackage.f.f(i11, Separators.RPAREN, sb);
    }
}
