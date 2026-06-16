package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/model/ReadSection;", "", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "orderLabel", "", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;Ljava/lang/String;)V", "getRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getOrderLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadSection {
    private final String orderLabel;
    private final ReadMeta read;

    public ReadSection(ReadMeta readMeta, String str) {
        readMeta.getClass();
        this.read = readMeta;
        this.orderLabel = str;
    }

    public static /* synthetic */ ReadSection copy$default(ReadSection readSection, ReadMeta readMeta, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            readMeta = readSection.read;
        }
        if ((i10 & 2) != 0) {
            str = readSection.orderLabel;
        }
        return readSection.copy(readMeta, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ReadMeta getRead() {
        return this.read;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderLabel() {
        return this.orderLabel;
    }

    public final ReadSection copy(ReadMeta read, String orderLabel) {
        read.getClass();
        return new ReadSection(read, orderLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadSection)) {
            return false;
        }
        ReadSection readSection = (ReadSection) other;
        if (m.c(this.read, readSection.read) && m.c(this.orderLabel, readSection.orderLabel)) {
            return true;
        }
        return false;
    }

    public final String getOrderLabel() {
        return this.orderLabel;
    }

    public final ReadMeta getRead() {
        return this.read;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.read.hashCode() * 31;
        String str = this.orderLabel;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ReadSection(read=" + this.read + ", orderLabel=" + this.orderLabel + Separators.RPAREN;
    }
}
