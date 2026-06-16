package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareOptionsState;", "", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;)V", "getRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReadShareOptionsState {
    public static final int $stable = 8;
    private final ReadMeta read;

    public /* synthetic */ ReadShareOptionsState(ReadMeta readMeta, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : readMeta);
    }

    public static /* synthetic */ ReadShareOptionsState copy$default(ReadShareOptionsState readShareOptionsState, ReadMeta readMeta, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            readMeta = readShareOptionsState.read;
        }
        return readShareOptionsState.copy(readMeta);
    }

    /* renamed from: component1, reason: from getter */
    public final ReadMeta getRead() {
        return this.read;
    }

    public final ReadShareOptionsState copy(ReadMeta read) {
        return new ReadShareOptionsState(read);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ReadShareOptionsState) && kotlin.jvm.internal.m.c(this.read, ((ReadShareOptionsState) other).read)) {
            return true;
        }
        return false;
    }

    public final ReadMeta getRead() {
        return this.read;
    }

    public int hashCode() {
        ReadMeta readMeta = this.read;
        if (readMeta == null) {
            return 0;
        }
        return readMeta.hashCode();
    }

    public String toString() {
        return "ReadShareOptionsState(read=" + this.read + Separators.RPAREN;
    }

    public ReadShareOptionsState(ReadMeta readMeta) {
        this.read = readMeta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadShareOptionsState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
