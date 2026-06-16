package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lio/elevenlabs/data/model/response/ConvertReadResponseModel;", "", "Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;", "status", "<init>", "(Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ConvertReadResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;", "copy", "(Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;)Lio/elevenlabs/data/model/response/ConvertReadResponseModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;", "getStatus", "Companion", "Status", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ConvertReadResponseModel {
    private final Status status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new io.elevenlabs.data.model.a(20))};

    public /* synthetic */ ConvertReadResponseModel(int i10, Status status, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.status = status;
        } else {
            t0.j(i10, 1, ConvertReadResponseModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Status.INSTANCE.serializer();
    }

    public static /* synthetic */ ConvertReadResponseModel copy$default(ConvertReadResponseModel convertReadResponseModel, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = convertReadResponseModel.status;
        }
        return convertReadResponseModel.copy(status);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final ConvertReadResponseModel copy(Status status) {
        status.getClass();
        return new ConvertReadResponseModel(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ConvertReadResponseModel) && this.status == ((ConvertReadResponseModel) other).status) {
            return true;
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "ConvertReadResponseModel(status=" + this.status + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ConversionStarted", "ConversionSkipped", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class Status extends Enum<Status> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Status ConversionStarted = new Status("ConversionStarted", 0, "conversion_started");
        public static final Status ConversionSkipped = new Status("ConversionSkipped", 1, "conversion_skipped");

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{ConversionStarted, ConversionSkipped};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new io.elevenlabs.data.model.a(21));
        }

        private Status(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.response.ConvertReadResponseModel.Status", values(), new String[]{"conversion_started", "conversion_skipped"}, new Annotation[][]{null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Status;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Status.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ConvertReadResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ConvertReadResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ConvertReadResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ConvertReadResponseModel(Status status) {
        status.getClass();
        this.status = status;
    }
}
