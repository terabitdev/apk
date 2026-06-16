package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import defpackage.f;
import ib.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/domain/model/Pronunciation;", "", "id", "", "originalText", "spokenText", "createdAtUnix", "", "updatedAtUnix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getId", "()Ljava/lang/String;", "getOriginalText", "getSpokenText", "getCreatedAtUnix", "()J", "getUpdatedAtUnix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Pronunciation {
    private final long createdAtUnix;
    private final String id;
    private final String originalText;
    private final String spokenText;
    private final long updatedAtUnix;

    public Pronunciation(String str, String str2, String str3, long j4, long j10) {
        i.s(str, str2, str3);
        this.id = str;
        this.originalText = str2;
        this.spokenText = str3;
        this.createdAtUnix = j4;
        this.updatedAtUnix = j10;
    }

    public static /* synthetic */ Pronunciation copy$default(Pronunciation pronunciation, String str, String str2, String str3, long j4, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pronunciation.id;
        }
        if ((i10 & 2) != 0) {
            str2 = pronunciation.originalText;
        }
        if ((i10 & 4) != 0) {
            str3 = pronunciation.spokenText;
        }
        if ((i10 & 8) != 0) {
            j4 = pronunciation.createdAtUnix;
        }
        if ((i10 & 16) != 0) {
            j10 = pronunciation.updatedAtUnix;
        }
        long j11 = j10;
        String str4 = str3;
        return pronunciation.copy(str, str2, str4, j4, j11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalText() {
        return this.originalText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSpokenText() {
        return this.spokenText;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public final Pronunciation copy(String id2, String originalText, String spokenText, long createdAtUnix, long updatedAtUnix) {
        id2.getClass();
        originalText.getClass();
        spokenText.getClass();
        return new Pronunciation(id2, originalText, spokenText, createdAtUnix, updatedAtUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pronunciation)) {
            return false;
        }
        Pronunciation pronunciation = (Pronunciation) other;
        if (m.c(this.id, pronunciation.id) && m.c(this.originalText, pronunciation.originalText) && m.c(this.spokenText, pronunciation.spokenText) && this.createdAtUnix == pronunciation.createdAtUnix && this.updatedAtUnix == pronunciation.updatedAtUnix) {
            return true;
        }
        return false;
    }

    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOriginalText() {
        return this.originalText;
    }

    public final String getSpokenText() {
        return this.spokenText;
    }

    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public int hashCode() {
        return Long.hashCode(this.updatedAtUnix) + b.g(this.createdAtUnix, c.c(c.c(this.id.hashCode() * 31, 31, this.originalText), 31, this.spokenText), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.originalText;
        String str3 = this.spokenText;
        long j4 = this.createdAtUnix;
        long j10 = this.updatedAtUnix;
        StringBuilder s10 = f.s("Pronunciation(id=", str, ", originalText=", str2, ", spokenText=");
        s10.append(str3);
        s10.append(", createdAtUnix=");
        s10.append(j4);
        s10.append(", updatedAtUnix=");
        s10.append(j10);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
