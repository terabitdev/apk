package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lio/elevenlabs/data/model/response/LimitedBasedReadApiErrorData;", "", "", "limit", "", "canUpgrade", "<init>", "(IZ)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IIZLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/LimitedBasedReadApiErrorData;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lio/elevenlabs/data/model/response/LimitedBasedReadApiErrorData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", TokenNames.I, "getLimit", "getLimit$annotations", "()V", "Z", "getCanUpgrade", "getCanUpgrade$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class LimitedBasedReadApiErrorData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean canUpgrade;
    private final int limit;

    public /* synthetic */ LimitedBasedReadApiErrorData(int i10, int i11, boolean z6, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.limit = i11;
            this.canUpgrade = z6;
        } else {
            t0.j(i10, 3, LimitedBasedReadApiErrorData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ LimitedBasedReadApiErrorData copy$default(LimitedBasedReadApiErrorData limitedBasedReadApiErrorData, int i10, boolean z6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = limitedBasedReadApiErrorData.limit;
        }
        if ((i11 & 2) != 0) {
            z6 = limitedBasedReadApiErrorData.canUpgrade;
        }
        return limitedBasedReadApiErrorData.copy(i10, z6);
    }

    public static final /* synthetic */ void write$Self$data_release(LimitedBasedReadApiErrorData self, tr.b output, SerialDescriptor serialDesc) {
        output.P(0, self.limit, serialDesc);
        output.T(serialDesc, 1, self.canUpgrade);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final LimitedBasedReadApiErrorData copy(int limit, boolean canUpgrade) {
        return new LimitedBasedReadApiErrorData(limit, canUpgrade);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitedBasedReadApiErrorData)) {
            return false;
        }
        LimitedBasedReadApiErrorData limitedBasedReadApiErrorData = (LimitedBasedReadApiErrorData) other;
        if (this.limit == limitedBasedReadApiErrorData.limit && this.canUpgrade == limitedBasedReadApiErrorData.canUpgrade) {
            return true;
        }
        return false;
    }

    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canUpgrade) + (Integer.hashCode(this.limit) * 31);
    }

    public String toString() {
        return "LimitedBasedReadApiErrorData(limit=" + this.limit + ", canUpgrade=" + this.canUpgrade + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/LimitedBasedReadApiErrorData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/LimitedBasedReadApiErrorData;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return LimitedBasedReadApiErrorData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCanUpgrade$annotations() {
    }

    public static /* synthetic */ void getLimit$annotations() {
    }

    public LimitedBasedReadApiErrorData(int i10, boolean z6) {
        this.limit = i10;
        this.canUpgrade = z6;
    }
}
