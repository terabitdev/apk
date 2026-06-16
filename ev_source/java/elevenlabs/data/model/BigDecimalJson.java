package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import qr.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/data/model/BigDecimalJson;", "", "value", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "str", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g(with = BigDecimalSerializer.class)
/* loaded from: classes3.dex */
public final /* data */ class BigDecimalJson {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BigDecimal value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BigDecimalJson(String str) {
        this(new BigDecimal(str));
        str.getClass();
    }

    public static /* synthetic */ BigDecimalJson copy$default(BigDecimalJson bigDecimalJson, BigDecimal bigDecimal, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bigDecimal = bigDecimalJson.value;
        }
        return bigDecimalJson.copy(bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    public final BigDecimalJson copy(BigDecimal value) {
        value.getClass();
        return new BigDecimalJson(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof BigDecimalJson) && m.c(this.value, ((BigDecimalJson) other).value)) {
            return true;
        }
        return false;
    }

    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "BigDecimalJson(value=" + this.value + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BigDecimalJson$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BigDecimalJson;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BigDecimalSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BigDecimalJson(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.value = bigDecimal;
    }
}
