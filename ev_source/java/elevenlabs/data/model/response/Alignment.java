package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.f0;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tBK\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J@\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0018¨\u0006+"}, d2 = {"Lio/elevenlabs/data/model/response/Alignment;", "", "", "", "charDurationsMs", "charStartTimesMs", "", "chars", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/Alignment;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lio/elevenlabs/data/model/response/Alignment;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCharDurationsMs", "getCharStartTimesMs", "getChars", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class Alignment {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Integer> charDurationsMs;
    private final List<Integer> charStartTimesMs;
    private final List<String> chars;

    static {
        io.elevenlabs.data.model.a aVar = new io.elevenlabs.data.model.a(3);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), sn.a.d(iVar, new io.elevenlabs.data.model.a(4)), sn.a.d(iVar, new io.elevenlabs.data.model.a(5))};
    }

    public /* synthetic */ Alignment(int i10, List list, List list2, List list3, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.charDurationsMs = list;
            this.charStartTimesMs = list2;
            this.chars = list3;
            return;
        }
        t0.j(i10, 7, Alignment$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(f0.f34579a, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ur.d(f0.f34579a, 0);
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new ur.d(g1.f34588a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Alignment copy$default(Alignment alignment, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = alignment.charDurationsMs;
        }
        if ((i10 & 2) != 0) {
            list2 = alignment.charStartTimesMs;
        }
        if ((i10 & 4) != 0) {
            list3 = alignment.chars;
        }
        return alignment.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$data_release(Alignment self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.charDurationsMs);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.charStartTimesMs);
        output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.chars);
    }

    public final List<Integer> component1() {
        return this.charDurationsMs;
    }

    public final List<Integer> component2() {
        return this.charStartTimesMs;
    }

    public final List<String> component3() {
        return this.chars;
    }

    public final Alignment copy(List<Integer> charDurationsMs, List<Integer> charStartTimesMs, List<String> chars) {
        charDurationsMs.getClass();
        charStartTimesMs.getClass();
        chars.getClass();
        return new Alignment(charDurationsMs, charStartTimesMs, chars);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alignment)) {
            return false;
        }
        Alignment alignment = (Alignment) other;
        if (m.c(this.charDurationsMs, alignment.charDurationsMs) && m.c(this.charStartTimesMs, alignment.charStartTimesMs) && m.c(this.chars, alignment.chars)) {
            return true;
        }
        return false;
    }

    public final List<Integer> getCharDurationsMs() {
        return this.charDurationsMs;
    }

    public final List<Integer> getCharStartTimesMs() {
        return this.charStartTimesMs;
    }

    public final List<String> getChars() {
        return this.chars;
    }

    public int hashCode() {
        return this.chars.hashCode() + n.d(this.charDurationsMs.hashCode() * 31, 31, this.charStartTimesMs);
    }

    public String toString() {
        List<Integer> list = this.charDurationsMs;
        List<Integer> list2 = this.charStartTimesMs;
        List<String> list3 = this.chars;
        StringBuilder sb = new StringBuilder("Alignment(charDurationsMs=");
        sb.append(list);
        sb.append(", charStartTimesMs=");
        sb.append(list2);
        sb.append(", chars=");
        return z.h.e(sb, list3, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/Alignment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/Alignment;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return Alignment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Alignment(List<Integer> list, List<Integer> list2, List<String> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.charDurationsMs = list;
        this.charStartTimesMs = list2;
        this.chars = list3;
    }
}
