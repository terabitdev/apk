package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, d2 = {"Lio/elevenlabs/data/model/response/GetMessageResponseModel;", "", "Lio/elevenlabs/data/model/response/MessageResponseModel;", "message", "<init>", "(Lio/elevenlabs/data/model/response/MessageResponseModel;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/MessageResponseModel;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetMessageResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/MessageResponseModel;", "copy", "(Lio/elevenlabs/data/model/response/MessageResponseModel;)Lio/elevenlabs/data/model/response/GetMessageResponseModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/MessageResponseModel;", "getMessage", "getMessage$annotations", "()V", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetMessageResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MessageResponseModel message;

    public /* synthetic */ GetMessageResponseModel(int i10, MessageResponseModel messageResponseModel, c1 c1Var) {
        if ((i10 & 1) == 0) {
            this.message = null;
        } else {
            this.message = messageResponseModel;
        }
    }

    public static /* synthetic */ GetMessageResponseModel copy$default(GetMessageResponseModel getMessageResponseModel, MessageResponseModel messageResponseModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            messageResponseModel = getMessageResponseModel.message;
        }
        return getMessageResponseModel.copy(messageResponseModel);
    }

    public static final /* synthetic */ void write$Self$data_release(GetMessageResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.message != null) {
            output.o(serialDesc, 0, MessageResponseModel$$serializer.INSTANCE, self.message);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final MessageResponseModel getMessage() {
        return this.message;
    }

    public final GetMessageResponseModel copy(MessageResponseModel message) {
        return new GetMessageResponseModel(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof GetMessageResponseModel) && m.c(this.message, ((GetMessageResponseModel) other).message)) {
            return true;
        }
        return false;
    }

    public final MessageResponseModel getMessage() {
        return this.message;
    }

    public int hashCode() {
        MessageResponseModel messageResponseModel = this.message;
        if (messageResponseModel == null) {
            return 0;
        }
        return messageResponseModel.hashCode();
    }

    public String toString() {
        return "GetMessageResponseModel(message=" + this.message + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetMessageResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetMessageResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetMessageResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetMessageResponseModel() {
        this((MessageResponseModel) null, 1, (f) (0 == true ? 1 : 0));
    }

    public GetMessageResponseModel(MessageResponseModel messageResponseModel) {
        this.message = messageResponseModel;
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public /* synthetic */ GetMessageResponseModel(MessageResponseModel messageResponseModel, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : messageResponseModel);
    }
}
