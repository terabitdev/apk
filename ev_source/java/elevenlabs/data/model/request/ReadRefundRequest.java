package io.elevenlabs.data.model.request;

import a2.m;
import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.a;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00060\u0002j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J4\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R$\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0018¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/request/ReadRefundRequest;", "", "", "readId", "Lio/elevenlabs/data/model/RefundReason;", "refundReason", "refundReasonOtherText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/request/ReadRefundRequest;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/request/ReadRefundRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReadId", "getReadId$annotations", "()V", "getRefundReason", "getRefundReason$annotations", "getRefundReasonOtherText", "getRefundReasonOtherText$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadRefundRequest {
    private final String readId;
    private final String refundReason;
    private final String refundReasonOtherText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, a.d(i.f31597b, new m(12)), null};

    public /* synthetic */ ReadRefundRequest(int i10, String str, String str2, String str3, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.readId = str;
            this.refundReason = str2;
            if ((i10 & 4) == 0) {
                this.refundReasonOtherText = null;
                return;
            } else {
                this.refundReasonOtherText = str3;
                return;
            }
        }
        t0.j(i10, 3, ReadRefundRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final KSerializer _childSerializers$_anonymous_() {
        return new qr.a(e0.f20562a.b(String.class), g1.f34588a, new KSerializer[0]);
    }

    public static /* synthetic */ ReadRefundRequest copy$default(ReadRefundRequest readRefundRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readRefundRequest.readId;
        }
        if ((i10 & 2) != 0) {
            str2 = readRefundRequest.refundReason;
        }
        if ((i10 & 4) != 0) {
            str3 = readRefundRequest.refundReasonOtherText;
        }
        return readRefundRequest.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadRefundRequest self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.readId);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.refundReason);
        if (output.C(serialDesc) || self.refundReasonOtherText != null) {
            output.o(serialDesc, 2, g1.f34588a, self.refundReasonOtherText);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefundReason() {
        return this.refundReason;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRefundReasonOtherText() {
        return this.refundReasonOtherText;
    }

    public final ReadRefundRequest copy(String readId, String refundReason, String refundReasonOtherText) {
        readId.getClass();
        refundReason.getClass();
        return new ReadRefundRequest(readId, refundReason, refundReasonOtherText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadRefundRequest)) {
            return false;
        }
        ReadRefundRequest readRefundRequest = (ReadRefundRequest) other;
        if (kotlin.jvm.internal.m.c(this.readId, readRefundRequest.readId) && kotlin.jvm.internal.m.c(this.refundReason, readRefundRequest.refundReason) && kotlin.jvm.internal.m.c(this.refundReasonOtherText, readRefundRequest.refundReasonOtherText)) {
            return true;
        }
        return false;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getRefundReason() {
        return this.refundReason;
    }

    public final String getRefundReasonOtherText() {
        return this.refundReasonOtherText;
    }

    public int hashCode() {
        int hashCode;
        int c5 = c.c(this.readId.hashCode() * 31, 31, this.refundReason);
        String str = this.refundReasonOtherText;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        return f.l(this.refundReasonOtherText, Separators.RPAREN, f.s("ReadRefundRequest(readId=", this.readId, ", refundReason=", this.refundReason, ", refundReasonOtherText="));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/ReadRefundRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/ReadRefundRequest;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadRefundRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getReadId$annotations() {
    }

    public static /* synthetic */ void getRefundReason$annotations() {
    }

    public static /* synthetic */ void getRefundReasonOtherText$annotations() {
    }

    public ReadRefundRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.readId = str;
        this.refundReason = str2;
        this.refundReasonOtherText = str3;
    }

    public /* synthetic */ ReadRefundRequest(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
