package io.elevenlabs.data.model.request;

import android.gov.nist.core.Separators;
import defpackage.f;
import ib.i;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lio/elevenlabs/data/model/request/GooglePlayPurchaseReadTokenRequest;", "", "", "purchaseToken", "orderId", "signature", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/request/GooglePlayPurchaseReadTokenRequest;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/request/GooglePlayPurchaseReadTokenRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPurchaseToken", "getPurchaseToken$annotations", "()V", "getOrderId", "getOrderId$annotations", "getSignature", "getSignature$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GooglePlayPurchaseReadTokenRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String orderId;
    private final String purchaseToken;
    private final String signature;

    public /* synthetic */ GooglePlayPurchaseReadTokenRequest(int i10, String str, String str2, String str3, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.purchaseToken = str;
            this.orderId = str2;
            this.signature = str3;
            return;
        }
        t0.j(i10, 7, GooglePlayPurchaseReadTokenRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ GooglePlayPurchaseReadTokenRequest copy$default(GooglePlayPurchaseReadTokenRequest googlePlayPurchaseReadTokenRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = googlePlayPurchaseReadTokenRequest.purchaseToken;
        }
        if ((i10 & 2) != 0) {
            str2 = googlePlayPurchaseReadTokenRequest.orderId;
        }
        if ((i10 & 4) != 0) {
            str3 = googlePlayPurchaseReadTokenRequest.signature;
        }
        return googlePlayPurchaseReadTokenRequest.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(GooglePlayPurchaseReadTokenRequest self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.purchaseToken);
        output.V(serialDesc, 1, self.orderId);
        output.V(serialDesc, 2, self.signature);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final GooglePlayPurchaseReadTokenRequest copy(String purchaseToken, String orderId, String signature) {
        purchaseToken.getClass();
        orderId.getClass();
        signature.getClass();
        return new GooglePlayPurchaseReadTokenRequest(purchaseToken, orderId, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePlayPurchaseReadTokenRequest)) {
            return false;
        }
        GooglePlayPurchaseReadTokenRequest googlePlayPurchaseReadTokenRequest = (GooglePlayPurchaseReadTokenRequest) other;
        if (m.c(this.purchaseToken, googlePlayPurchaseReadTokenRequest.purchaseToken) && m.c(this.orderId, googlePlayPurchaseReadTokenRequest.orderId) && m.c(this.signature, googlePlayPurchaseReadTokenRequest.signature)) {
            return true;
        }
        return false;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode() + c.c(this.purchaseToken.hashCode() * 31, 31, this.orderId);
    }

    public String toString() {
        return f.l(this.signature, Separators.RPAREN, f.s("GooglePlayPurchaseReadTokenRequest(purchaseToken=", this.purchaseToken, ", orderId=", this.orderId, ", signature="));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/GooglePlayPurchaseReadTokenRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/GooglePlayPurchaseReadTokenRequest;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GooglePlayPurchaseReadTokenRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getOrderId$annotations() {
    }

    public static /* synthetic */ void getPurchaseToken$annotations() {
    }

    public static /* synthetic */ void getSignature$annotations() {
    }

    public GooglePlayPurchaseReadTokenRequest(String str, String str2, String str3) {
        i.s(str, str2, str3);
        this.purchaseToken = str;
        this.orderId = str2;
        this.signature = str3;
    }
}
