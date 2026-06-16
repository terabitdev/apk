package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/domain/model/ReadDetailsReadActions;", "", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadDetailsReadActions {
    private final String readId;

    public ReadDetailsReadActions(String str) {
        str.getClass();
        this.readId = str;
    }

    public static /* synthetic */ ReadDetailsReadActions copy$default(ReadDetailsReadActions readDetailsReadActions, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readDetailsReadActions.readId;
        }
        return readDetailsReadActions.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    public final ReadDetailsReadActions copy(String readId) {
        readId.getClass();
        return new ReadDetailsReadActions(readId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ReadDetailsReadActions) && m.c(this.readId, ((ReadDetailsReadActions) other).readId)) {
            return true;
        }
        return false;
    }

    public final String getReadId() {
        return this.readId;
    }

    public int hashCode() {
        return this.readId.hashCode();
    }

    public String toString() {
        return f.C("ReadDetailsReadActions(readId=", this.readId, Separators.RPAREN);
    }
}
