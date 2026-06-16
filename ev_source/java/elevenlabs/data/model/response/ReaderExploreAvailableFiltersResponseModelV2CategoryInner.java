package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0003342B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001d¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner;", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "value", "language", "Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;)Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "getValue", "getValue$annotations", "getLanguage", "getLanguage$annotations", "Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;", "getType", "getType$annotations", "Companion", "Type", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderExploreAvailableFiltersResponseModelV2CategoryInner {
    private final String key;
    private final String language;
    private final Type type;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new d(0))};

    public /* synthetic */ ReaderExploreAvailableFiltersResponseModelV2CategoryInner(int i10, String str, String str2, String str3, Type type, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.key = str;
            this.value = str2;
            this.language = str3;
            if ((i10 & 8) == 0) {
                this.type = Type.DEFAULT;
                return;
            } else {
                this.type = type;
                return;
            }
        }
        t0.j(i10, 7, ReaderExploreAvailableFiltersResponseModelV2CategoryInner$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Type.INSTANCE.serializer();
    }

    public static /* synthetic */ ReaderExploreAvailableFiltersResponseModelV2CategoryInner copy$default(ReaderExploreAvailableFiltersResponseModelV2CategoryInner readerExploreAvailableFiltersResponseModelV2CategoryInner, String str, String str2, String str3, Type type, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readerExploreAvailableFiltersResponseModelV2CategoryInner.key;
        }
        if ((i10 & 2) != 0) {
            str2 = readerExploreAvailableFiltersResponseModelV2CategoryInner.value;
        }
        if ((i10 & 4) != 0) {
            str3 = readerExploreAvailableFiltersResponseModelV2CategoryInner.language;
        }
        if ((i10 & 8) != 0) {
            type = readerExploreAvailableFiltersResponseModelV2CategoryInner.type;
        }
        return readerExploreAvailableFiltersResponseModelV2CategoryInner.copy(str, str2, str3, type);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderExploreAvailableFiltersResponseModelV2CategoryInner self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.key);
        output.V(serialDesc, 1, self.value);
        output.V(serialDesc, 2, self.language);
        if (output.C(serialDesc) || self.type != Type.DEFAULT) {
            output.o(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.type);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component4, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public final ReaderExploreAvailableFiltersResponseModelV2CategoryInner copy(String r22, String value, String language, Type type) {
        r22.getClass();
        value.getClass();
        language.getClass();
        return new ReaderExploreAvailableFiltersResponseModelV2CategoryInner(r22, value, language, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderExploreAvailableFiltersResponseModelV2CategoryInner)) {
            return false;
        }
        ReaderExploreAvailableFiltersResponseModelV2CategoryInner readerExploreAvailableFiltersResponseModelV2CategoryInner = (ReaderExploreAvailableFiltersResponseModelV2CategoryInner) other;
        if (m.c(this.key, readerExploreAvailableFiltersResponseModelV2CategoryInner.key) && m.c(this.value, readerExploreAvailableFiltersResponseModelV2CategoryInner.value) && m.c(this.language, readerExploreAvailableFiltersResponseModelV2CategoryInner.language) && this.type == readerExploreAvailableFiltersResponseModelV2CategoryInner.type) {
            return true;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(j0.c.c(this.key.hashCode() * 31, 31, this.value), 31, this.language);
        Type type = this.type;
        if (type == null) {
            hashCode = 0;
        } else {
            hashCode = type.hashCode();
        }
        return c5 + hashCode;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        String str3 = this.language;
        Type type = this.type;
        StringBuilder s10 = f.s("ReaderExploreAvailableFiltersResponseModelV2CategoryInner(key=", str, ", value=", str2, ", language=");
        s10.append(str3);
        s10.append(", type=");
        s10.append(type);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "ACCENT", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class Type extends Enum<Type> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final Type DEFAULT = new Type("DEFAULT", 0, "default");
        public static final Type ACCENT = new Type("ACCENT", 1, "accent");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT, ACCENT};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = sn.a.d(i.f31597b, new d(1));
        }

        private Type(String str, int i10, String str2) {
            super(str, i10);
            this.value = str2;
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.response.ReaderExploreAvailableFiltersResponseModelV2CategoryInner.Type", values(), new String[]{"default", "accent"}, new Annotation[][]{null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Type;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Type.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReaderExploreAvailableFiltersResponseModelV2CategoryInner;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderExploreAvailableFiltersResponseModelV2CategoryInner$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public ReaderExploreAvailableFiltersResponseModelV2CategoryInner(String str, String str2, String str3, Type type) {
        ib.i.s(str, str2, str3);
        this.key = str;
        this.value = str2;
        this.language = str3;
        this.type = type;
    }

    public /* synthetic */ ReaderExploreAvailableFiltersResponseModelV2CategoryInner(String str, String str2, String str3, Type type, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? Type.DEFAULT : type);
    }
}
