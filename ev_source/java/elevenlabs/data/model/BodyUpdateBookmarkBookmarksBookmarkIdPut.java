package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/BodyUpdateBookmarkBookmarksBookmarkIdPut;", "", "", "updatedAtUnix", "", "note", "<init>", "(JLjava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IJLjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BodyUpdateBookmarkBookmarksBookmarkIdPut;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lio/elevenlabs/data/model/BodyUpdateBookmarkBookmarksBookmarkIdPut;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getUpdatedAtUnix", "getUpdatedAtUnix$annotations", "()V", "Ljava/lang/String;", "getNote", "getNote$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BodyUpdateBookmarkBookmarksBookmarkIdPut {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String note;
    private final long updatedAtUnix;

    public /* synthetic */ BodyUpdateBookmarkBookmarksBookmarkIdPut(int i10, long j4, String str, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.updatedAtUnix = j4;
            if ((i10 & 2) == 0) {
                this.note = null;
                return;
            } else {
                this.note = str;
                return;
            }
        }
        t0.j(i10, 1, BodyUpdateBookmarkBookmarksBookmarkIdPut$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ BodyUpdateBookmarkBookmarksBookmarkIdPut copy$default(BodyUpdateBookmarkBookmarksBookmarkIdPut bodyUpdateBookmarkBookmarksBookmarkIdPut, long j4, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = bodyUpdateBookmarkBookmarksBookmarkIdPut.updatedAtUnix;
        }
        if ((i10 & 2) != 0) {
            str = bodyUpdateBookmarkBookmarksBookmarkIdPut.note;
        }
        return bodyUpdateBookmarkBookmarksBookmarkIdPut.copy(j4, str);
    }

    public static final /* synthetic */ void write$Self$data_release(BodyUpdateBookmarkBookmarksBookmarkIdPut self, b output, SerialDescriptor serialDesc) {
        output.h0(serialDesc, 0, self.updatedAtUnix);
        if (output.C(serialDesc) || self.note != null) {
            output.o(serialDesc, 1, g1.f34588a, self.note);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    public final BodyUpdateBookmarkBookmarksBookmarkIdPut copy(long updatedAtUnix, String note) {
        return new BodyUpdateBookmarkBookmarksBookmarkIdPut(updatedAtUnix, note);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyUpdateBookmarkBookmarksBookmarkIdPut)) {
            return false;
        }
        BodyUpdateBookmarkBookmarksBookmarkIdPut bodyUpdateBookmarkBookmarksBookmarkIdPut = (BodyUpdateBookmarkBookmarksBookmarkIdPut) other;
        if (this.updatedAtUnix == bodyUpdateBookmarkBookmarksBookmarkIdPut.updatedAtUnix && m.c(this.note, bodyUpdateBookmarkBookmarksBookmarkIdPut.note)) {
            return true;
        }
        return false;
    }

    public final String getNote() {
        return this.note;
    }

    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.updatedAtUnix) * 31;
        String str = this.note;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "BodyUpdateBookmarkBookmarksBookmarkIdPut(updatedAtUnix=" + this.updatedAtUnix + ", note=" + this.note + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BodyUpdateBookmarkBookmarksBookmarkIdPut$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BodyUpdateBookmarkBookmarksBookmarkIdPut;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BodyUpdateBookmarkBookmarksBookmarkIdPut$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getNote$annotations() {
    }

    public static /* synthetic */ void getUpdatedAtUnix$annotations() {
    }

    public BodyUpdateBookmarkBookmarksBookmarkIdPut(long j4, String str) {
        this.updatedAtUnix = j4;
        this.note = str;
    }

    public /* synthetic */ BodyUpdateBookmarkBookmarksBookmarkIdPut(long j4, String str, int i10, f fVar) {
        this(j4, (i10 & 2) != 0 ? null : str);
    }
}
