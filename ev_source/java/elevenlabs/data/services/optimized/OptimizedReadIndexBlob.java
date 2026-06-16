package io.elevenlabs.data.services.optimized;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import io.elevenlabs.data.model.response.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.a;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002()B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", "", "", "schemaVersion", "", "Lio/elevenlabs/data/services/optimized/ChapterSlotIndexBlob;", "chapters", "<init>", "(ILjava/util/List;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IILjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.I, "getSchemaVersion", "Ljava/util/List;", "getChapters", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class OptimizedReadIndexBlob {
    public static final int SCHEMA_VERSION = 1;
    private final List<ChapterSlotIndexBlob> chapters;
    private final int schemaVersion;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, a.d(i.f31597b, new d(22))};

    public /* synthetic */ OptimizedReadIndexBlob(int i10, int i11, List list, c1 c1Var) {
        if (2 == (i10 & 2)) {
            if ((i10 & 1) == 0) {
                this.schemaVersion = 1;
            } else {
                this.schemaVersion = i11;
            }
            this.chapters = list;
            return;
        }
        t0.j(i10, 2, OptimizedReadIndexBlob$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ur.d(ChapterSlotIndexBlob$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptimizedReadIndexBlob copy$default(OptimizedReadIndexBlob optimizedReadIndexBlob, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = optimizedReadIndexBlob.schemaVersion;
        }
        if ((i11 & 2) != 0) {
            list = optimizedReadIndexBlob.chapters;
        }
        return optimizedReadIndexBlob.copy(i10, list);
    }

    public static final /* synthetic */ void write$Self$data_release(OptimizedReadIndexBlob self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        if (output.C(serialDesc) || self.schemaVersion != 1) {
            output.P(0, self.schemaVersion, serialDesc);
        }
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.chapters);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final List<ChapterSlotIndexBlob> component2() {
        return this.chapters;
    }

    public final OptimizedReadIndexBlob copy(int schemaVersion, List<ChapterSlotIndexBlob> chapters) {
        chapters.getClass();
        return new OptimizedReadIndexBlob(schemaVersion, chapters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimizedReadIndexBlob)) {
            return false;
        }
        OptimizedReadIndexBlob optimizedReadIndexBlob = (OptimizedReadIndexBlob) other;
        if (this.schemaVersion == optimizedReadIndexBlob.schemaVersion && m.c(this.chapters, optimizedReadIndexBlob.chapters)) {
            return true;
        }
        return false;
    }

    public final List<ChapterSlotIndexBlob> getChapters() {
        return this.chapters;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        return this.chapters.hashCode() + (Integer.hashCode(this.schemaVersion) * 31);
    }

    public String toString() {
        return "OptimizedReadIndexBlob(schemaVersion=" + this.schemaVersion + ", chapters=" + this.chapters + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob$Companion;", "", "<init>", "()V", "SCHEMA_VERSION", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return OptimizedReadIndexBlob$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OptimizedReadIndexBlob(int i10, List<ChapterSlotIndexBlob> list) {
        list.getClass();
        this.schemaVersion = i10;
        this.chapters = list;
    }

    public /* synthetic */ OptimizedReadIndexBlob(int i10, List list, int i11, f fVar) {
        this((i11 & 1) != 0 ? 1 : i10, list);
    }
}
