package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.model.ReaderSoundscape;
import io.elevenlabs.data.model.ReaderSoundscape$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lio/elevenlabs/data/model/response/GetSoundscapesResponse;", "", "", "Lio/elevenlabs/data/model/ReaderSoundscape;", "soundscapes", "", "hasMore", "", "lastSortId", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetSoundscapesResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;ZLjava/lang/String;)Lio/elevenlabs/data/model/response/GetSoundscapesResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSoundscapes", "getSoundscapes$annotations", "()V", "Z", "getHasMore", "getHasMore$annotations", "Ljava/lang/String;", "getLastSortId", "getLastSortId$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetSoundscapesResponse {
    private final boolean hasMore;
    private final String lastSortId;
    private final List<ReaderSoundscape> soundscapes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new b(8)), null, null};

    public /* synthetic */ GetSoundscapesResponse(int i10, List list, boolean z6, String str, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.soundscapes = list;
            this.hasMore = z6;
            if ((i10 & 4) == 0) {
                this.lastSortId = null;
                return;
            } else {
                this.lastSortId = str;
                return;
            }
        }
        t0.j(i10, 3, GetSoundscapesResponse$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(ReaderSoundscape$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSoundscapesResponse copy$default(GetSoundscapesResponse getSoundscapesResponse, List list, boolean z6, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getSoundscapesResponse.soundscapes;
        }
        if ((i10 & 2) != 0) {
            z6 = getSoundscapesResponse.hasMore;
        }
        if ((i10 & 4) != 0) {
            str = getSoundscapesResponse.lastSortId;
        }
        return getSoundscapesResponse.copy(list, z6, str);
    }

    public static final /* synthetic */ void write$Self$data_release(GetSoundscapesResponse self, tr.b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.soundscapes);
        output.T(serialDesc, 1, self.hasMore);
        if (output.C(serialDesc) || self.lastSortId != null) {
            output.o(serialDesc, 2, g1.f34588a, self.lastSortId);
        }
    }

    public final List<ReaderSoundscape> component1() {
        return this.soundscapes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastSortId() {
        return this.lastSortId;
    }

    public final GetSoundscapesResponse copy(List<ReaderSoundscape> soundscapes, boolean hasMore, String lastSortId) {
        soundscapes.getClass();
        return new GetSoundscapesResponse(soundscapes, hasMore, lastSortId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSoundscapesResponse)) {
            return false;
        }
        GetSoundscapesResponse getSoundscapesResponse = (GetSoundscapesResponse) other;
        if (m.c(this.soundscapes, getSoundscapesResponse.soundscapes) && this.hasMore == getSoundscapesResponse.hasMore && m.c(this.lastSortId, getSoundscapesResponse.lastSortId)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLastSortId() {
        return this.lastSortId;
    }

    public final List<ReaderSoundscape> getSoundscapes() {
        return this.soundscapes;
    }

    public int hashCode() {
        int hashCode;
        int f10 = com.google.android.gms.internal.play_billing.b.f(this.soundscapes.hashCode() * 31, 31, this.hasMore);
        String str = this.lastSortId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        List<ReaderSoundscape> list = this.soundscapes;
        boolean z6 = this.hasMore;
        String str = this.lastSortId;
        StringBuilder sb = new StringBuilder("GetSoundscapesResponse(soundscapes=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z6);
        sb.append(", lastSortId=");
        return f.l(str, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetSoundscapesResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetSoundscapesResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetSoundscapesResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getLastSortId$annotations() {
    }

    public static /* synthetic */ void getSoundscapes$annotations() {
    }

    public GetSoundscapesResponse(List<ReaderSoundscape> list, boolean z6, String str) {
        list.getClass();
        this.soundscapes = list;
        this.hasMore = z6;
        this.lastSortId = str;
    }

    public /* synthetic */ GetSoundscapesResponse(List list, boolean z6, String str, int i10, kotlin.jvm.internal.f fVar) {
        this(list, z6, (i10 & 4) != 0 ? null : str);
    }
}
