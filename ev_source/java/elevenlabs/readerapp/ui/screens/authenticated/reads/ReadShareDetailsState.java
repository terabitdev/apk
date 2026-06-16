package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareDetailsState;", "", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "showShareSheet", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;", "<init>", "(Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;)V", "getRead", "()Lio/elevenlabs/domain/model/ReadMeta;", "getShowShareSheet", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReadShareDetailsState {
    public static final int $stable = 8;
    private final ReadMeta read;
    private final ReadLinkShareOption showShareSheet;

    public /* synthetic */ ReadShareDetailsState(ReadMeta readMeta, ReadLinkShareOption readLinkShareOption, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : readMeta, (i10 & 2) != 0 ? null : readLinkShareOption);
    }

    public static /* synthetic */ ReadShareDetailsState copy$default(ReadShareDetailsState readShareDetailsState, ReadMeta readMeta, ReadLinkShareOption readLinkShareOption, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            readMeta = readShareDetailsState.read;
        }
        if ((i10 & 2) != 0) {
            readLinkShareOption = readShareDetailsState.showShareSheet;
        }
        return readShareDetailsState.copy(readMeta, readLinkShareOption);
    }

    /* renamed from: component1, reason: from getter */
    public final ReadMeta getRead() {
        return this.read;
    }

    /* renamed from: component2, reason: from getter */
    public final ReadLinkShareOption getShowShareSheet() {
        return this.showShareSheet;
    }

    public final ReadShareDetailsState copy(ReadMeta read, ReadLinkShareOption showShareSheet) {
        return new ReadShareDetailsState(read, showShareSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadShareDetailsState)) {
            return false;
        }
        ReadShareDetailsState readShareDetailsState = (ReadShareDetailsState) other;
        if (kotlin.jvm.internal.m.c(this.read, readShareDetailsState.read) && this.showShareSheet == readShareDetailsState.showShareSheet) {
            return true;
        }
        return false;
    }

    public final ReadMeta getRead() {
        return this.read;
    }

    public final ReadLinkShareOption getShowShareSheet() {
        return this.showShareSheet;
    }

    public int hashCode() {
        int hashCode;
        ReadMeta readMeta = this.read;
        int i10 = 0;
        if (readMeta == null) {
            hashCode = 0;
        } else {
            hashCode = readMeta.hashCode();
        }
        int i11 = hashCode * 31;
        ReadLinkShareOption readLinkShareOption = this.showShareSheet;
        if (readLinkShareOption != null) {
            i10 = readLinkShareOption.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "ReadShareDetailsState(read=" + this.read + ", showShareSheet=" + this.showShareSheet + Separators.RPAREN;
    }

    public ReadShareDetailsState(ReadMeta readMeta, ReadLinkShareOption readLinkShareOption) {
        this.read = readMeta;
        this.showShareSheet = readLinkShareOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadShareDetailsState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
