package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ib.i;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.f;
import qr.g;
import ur.c1;
import ur.t0;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/FilterOptionResponseModel;", "", "Default", "Accent", "Companion", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Accent;", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Default;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public interface FilterOptionResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer serializer() {
            f0 f0Var = e0.f20562a;
            return new f("io.elevenlabs.data.model.response.FilterOptionResponseModel", f0Var.b(FilterOptionResponseModel.class), new oo.d[]{f0Var.b(Accent.class), f0Var.b(Default.class)}, new KSerializer[]{FilterOptionResponseModel$Accent$$serializer.INSTANCE, FilterOptionResponseModel$Default$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Accent;", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel;", "", SubscriberAttributeKt.JSON_NAME_KEY, "value", "language", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Accent;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Accent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "getValue", "getValue$annotations", "getLanguage", "getLanguage$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final /* data */ class Accent implements FilterOptionResponseModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String key;
        private final String language;
        private final String value;

        public /* synthetic */ Accent(int i10, String str, String str2, String str3, c1 c1Var) {
            if (7 == (i10 & 7)) {
                this.key = str;
                this.value = str2;
                this.language = str3;
                return;
            }
            t0.j(i10, 7, FilterOptionResponseModel$Accent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static /* synthetic */ Accent copy$default(Accent accent, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = accent.key;
            }
            if ((i10 & 2) != 0) {
                str2 = accent.value;
            }
            if ((i10 & 4) != 0) {
                str3 = accent.language;
            }
            return accent.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$data_release(Accent self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.key);
            output.V(serialDesc, 1, self.value);
            output.V(serialDesc, 2, self.language);
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

        public final Accent copy(String key, String value, String language) {
            key.getClass();
            value.getClass();
            language.getClass();
            return new Accent(key, value, language);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Accent)) {
                return false;
            }
            Accent accent = (Accent) other;
            if (m.c(this.key, accent.key) && m.c(this.value, accent.value) && m.c(this.language, accent.language)) {
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

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.language.hashCode() + j0.c.c(this.key.hashCode() * 31, 31, this.value);
        }

        public String toString() {
            return defpackage.f.l(this.language, Separators.RPAREN, defpackage.f.s("Accent(key=", this.key, ", value=", this.value, ", language="));
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Accent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Accent;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return FilterOptionResponseModel$Accent$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static /* synthetic */ void getKey$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getValue$annotations() {
        }

        public Accent(String str, String str2, String str3) {
            i.s(str, str2, str3);
            this.key = str;
            this.value = str2;
            this.language = str3;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006*"}, d2 = {"Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Default;", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel;", "", SubscriberAttributeKt.JSON_NAME_KEY, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Default;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Default;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "getValue", "getValue$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final /* data */ class Default implements FilterOptionResponseModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String key;
        private final String value;

        public /* synthetic */ Default(int i10, String str, String str2, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.key = str;
                this.value = str2;
            } else {
                t0.j(i10, 3, FilterOptionResponseModel$Default$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Default copy$default(Default r02, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = r02.key;
            }
            if ((i10 & 2) != 0) {
                str2 = r02.value;
            }
            return r02.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$data_release(Default self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.key);
            output.V(serialDesc, 1, self.value);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Default copy(String key, String value) {
            key.getClass();
            value.getClass();
            return new Default(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r52 = (Default) other;
            if (m.c(this.key, r52.key) && m.c(this.value, r52.value)) {
                return true;
            }
            return false;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return h.c("Default(key=", this.key, ", value=", this.value, Separators.RPAREN);
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Default$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/FilterOptionResponseModel$Default;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return FilterOptionResponseModel$Default$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static /* synthetic */ void getKey$annotations() {
        }

        public static /* synthetic */ void getValue$annotations() {
        }

        public Default(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.value = str2;
        }
    }
}
