package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.f;
import qr.g;
import sn.h;
import sn.i;
import ur.c1;
import ur.g1;
import ur.t0;
import ur.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse;", "", "", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "sections", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetAccountResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/elevenlabs/data/model/response/GetAccountResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "Companion", "Section", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetAccountResponse {
    private final List<Section> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new a(11))};

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00072\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "", "Credits", "HelpfulResourcesV2", "TermsAndConditions", "LocalSettings", "CreditsUnlimited", "Companion", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$Credits;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$CreditsUnlimited;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$LocalSettings;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Section {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.GetAccountResponse.Section", f0Var.b(Section.class), new oo.d[]{f0Var.b(Credits.class), f0Var.b(CreditsUnlimited.class), f0Var.b(HelpfulResourcesV2.class), f0Var.b(LocalSettings.class), f0Var.b(TermsAndConditions.class)}, new KSerializer[]{GetAccountResponse$Section$Credits$$serializer.INSTANCE, GetAccountResponse$Section$CreditsUnlimited$$serializer.INSTANCE, GetAccountResponse$Section$HelpfulResourcesV2$$serializer.INSTANCE, new w("local-settings_v1", LocalSettings.INSTANCE, new Annotation[0]), GetAccountResponse$Section$TermsAndConditions$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$LocalSettings;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class LocalSettings implements Section {
            public static final LocalSettings INSTANCE = new LocalSettings();
            private static final /* synthetic */ h $cachedSerializer$delegate = sn.a.d(i.f31597b, new a(13));

            private LocalSettings() {
            }

            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new w("local-settings_v1", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) $cachedSerializer$delegate.getValue();
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LocalSettings)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 317320690;
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public String toString() {
                return "LocalSettings";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-.,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006/"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getItems", "getItems$annotations", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HelpfulResourcesV2 implements Section {
            private final List<Item> items;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(12))};

            public /* synthetic */ HelpfulResourcesV2(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.items = list;
                } else {
                    t0.j(i10, 3, GetAccountResponse$Section$HelpfulResourcesV2$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(GetAccountResponse$Section$HelpfulResourcesV2$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HelpfulResourcesV2 copy$default(HelpfulResourcesV2 helpfulResourcesV2, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = helpfulResourcesV2.title;
                }
                if ((i10 & 2) != 0) {
                    list = helpfulResourcesV2.items;
                }
                return helpfulResourcesV2.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(HelpfulResourcesV2 self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.items);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Item> component2() {
                return this.items;
            }

            public final HelpfulResourcesV2 copy(String title, List<Item> r32) {
                title.getClass();
                r32.getClass();
                return new HelpfulResourcesV2(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HelpfulResourcesV2)) {
                    return false;
                }
                HelpfulResourcesV2 helpfulResourcesV2 = (HelpfulResourcesV2) other;
                if (m.c(this.title, helpfulResourcesV2.title) && m.c(this.items, helpfulResourcesV2.items)) {
                    return true;
                }
                return false;
            }

            public final List<Item> getItems() {
                return this.items;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("HelpfulResourcesV2(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2$Item;", "", "", "title", "url", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getUrl", "getUrl$annotations", "getIcon", "getIcon$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String icon;
                private final String title;
                private final String url;

                public /* synthetic */ Item(int i10, String str, String str2, String str3, c1 c1Var) {
                    if (3 == (i10 & 3)) {
                        this.title = str;
                        this.url = str2;
                        if ((i10 & 4) == 0) {
                            this.icon = null;
                            return;
                        } else {
                            this.icon = str3;
                            return;
                        }
                    }
                    t0.j(i10, 3, GetAccountResponse$Section$HelpfulResourcesV2$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.url;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = item.icon;
                    }
                    return item.copy(str, str2, str3);
                }

                public static final /* synthetic */ void write$Self$data_release(Item self, tr.b output, SerialDescriptor serialDesc) {
                    output.V(serialDesc, 0, self.title);
                    output.V(serialDesc, 1, self.url);
                    if (output.C(serialDesc) || self.icon != null) {
                        output.o(serialDesc, 2, g1.f34588a, self.icon);
                    }
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                /* renamed from: component3, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                public final Item copy(String title, String url, String r42) {
                    title.getClass();
                    url.getClass();
                    return new Item(title, url, r42);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.url, item.url) && m.c(this.icon, item.icon)) {
                        return true;
                    }
                    return false;
                }

                public final String getIcon() {
                    return this.icon;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int hashCode;
                    int c5 = j0.c.c(this.title.hashCode() * 31, 31, this.url);
                    String str = this.icon;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    return c5 + hashCode;
                }

                public String toString() {
                    return defpackage.f.l(this.icon, Separators.RPAREN, defpackage.f.s("Item(title=", this.title, ", url=", this.url, ", icon="));
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return GetAccountResponse$Section$HelpfulResourcesV2$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public static /* synthetic */ void getIcon$annotations() {
                }

                public static /* synthetic */ void getTitle$annotations() {
                }

                public static /* synthetic */ void getUrl$annotations() {
                }

                public Item(String str, String str2, String str3) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.url = str2;
                    this.icon = str3;
                }

                public /* synthetic */ Item(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$HelpfulResourcesV2;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetAccountResponse$Section$HelpfulResourcesV2$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getItems$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public HelpfulResourcesV2(String str, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-.,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006/"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getItems", "getItems$annotations", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class TermsAndConditions implements Section {
            private final List<Item> items;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(14))};

            public /* synthetic */ TermsAndConditions(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.items = list;
                } else {
                    t0.j(i10, 3, GetAccountResponse$Section$TermsAndConditions$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(GetAccountResponse$Section$TermsAndConditions$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TermsAndConditions copy$default(TermsAndConditions termsAndConditions, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = termsAndConditions.title;
                }
                if ((i10 & 2) != 0) {
                    list = termsAndConditions.items;
                }
                return termsAndConditions.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(TermsAndConditions self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.items);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Item> component2() {
                return this.items;
            }

            public final TermsAndConditions copy(String title, List<Item> r32) {
                title.getClass();
                r32.getClass();
                return new TermsAndConditions(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TermsAndConditions)) {
                    return false;
                }
                TermsAndConditions termsAndConditions = (TermsAndConditions) other;
                if (m.c(this.title, termsAndConditions.title) && m.c(this.items, termsAndConditions.items)) {
                    return true;
                }
                return false;
            }

            public final List<Item> getItems() {
                return this.items;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("TermsAndConditions(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions$Item;", "", "", "title", "url", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getUrl", "getUrl$annotations", "getIcon", "getIcon$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String icon;
                private final String title;
                private final String url;

                public /* synthetic */ Item(int i10, String str, String str2, String str3, c1 c1Var) {
                    if (3 == (i10 & 3)) {
                        this.title = str;
                        this.url = str2;
                        if ((i10 & 4) == 0) {
                            this.icon = null;
                            return;
                        } else {
                            this.icon = str3;
                            return;
                        }
                    }
                    t0.j(i10, 3, GetAccountResponse$Section$TermsAndConditions$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.url;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = item.icon;
                    }
                    return item.copy(str, str2, str3);
                }

                public static final /* synthetic */ void write$Self$data_release(Item self, tr.b output, SerialDescriptor serialDesc) {
                    output.V(serialDesc, 0, self.title);
                    output.V(serialDesc, 1, self.url);
                    if (output.C(serialDesc) || self.icon != null) {
                        output.o(serialDesc, 2, g1.f34588a, self.icon);
                    }
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                /* renamed from: component3, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                public final Item copy(String title, String url, String r42) {
                    title.getClass();
                    url.getClass();
                    return new Item(title, url, r42);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.url, item.url) && m.c(this.icon, item.icon)) {
                        return true;
                    }
                    return false;
                }

                public final String getIcon() {
                    return this.icon;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int hashCode;
                    int c5 = j0.c.c(this.title.hashCode() * 31, 31, this.url);
                    String str = this.icon;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    return c5 + hashCode;
                }

                public String toString() {
                    return defpackage.f.l(this.icon, Separators.RPAREN, defpackage.f.s("Item(title=", this.title, ", url=", this.url, ", icon="));
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return GetAccountResponse$Section$TermsAndConditions$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public static /* synthetic */ void getIcon$annotations() {
                }

                public static /* synthetic */ void getTitle$annotations() {
                }

                public static /* synthetic */ void getUrl$annotations() {
                }

                public Item(String str, String str2, String str3) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.url = str2;
                    this.icon = str3;
                }

                public /* synthetic */ Item(String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$TermsAndConditions;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetAccountResponse$Section$TermsAndConditions$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getItems$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public TermsAndConditions(String str, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JX\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010$J\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b4\u00100\u001a\u0004\b\u0006\u0010\u001eR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u001cR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u001cR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u00100\u001a\u0004\b<\u0010$¨\u0006@"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$Credits;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "", "currentPlan", "", "canUpgrade", "isPaidPlan", ParameterNames.TEXT, "timeText", "description", "", "counterNumber", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetAccountResponse$Section$Credits;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "()I", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lio/elevenlabs/data/model/response/GetAccountResponse$Section$Credits;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentPlan", "getCurrentPlan$annotations", "()V", "Z", "getCanUpgrade", "getCanUpgrade$annotations", "isPaidPlan$annotations", "getText", "getText$annotations", "getTimeText", "getTimeText$annotations", "getDescription", "getDescription$annotations", TokenNames.I, "getCounterNumber", "getCounterNumber$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class Credits implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean canUpgrade;
            private final int counterNumber;
            private final String currentPlan;
            private final String description;
            private final boolean isPaidPlan;
            private final String text;
            private final String timeText;

            public /* synthetic */ Credits(int i10, String str, boolean z6, boolean z10, String str2, String str3, String str4, int i11, c1 c1Var) {
                if (127 == (i10 & 127)) {
                    this.currentPlan = str;
                    this.canUpgrade = z6;
                    this.isPaidPlan = z10;
                    this.text = str2;
                    this.timeText = str3;
                    this.description = str4;
                    this.counterNumber = i11;
                    return;
                }
                t0.j(i10, 127, GetAccountResponse$Section$Credits$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ Credits copy$default(Credits credits, String str, boolean z6, boolean z10, String str2, String str3, String str4, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = credits.currentPlan;
                }
                if ((i11 & 2) != 0) {
                    z6 = credits.canUpgrade;
                }
                if ((i11 & 4) != 0) {
                    z10 = credits.isPaidPlan;
                }
                if ((i11 & 8) != 0) {
                    str2 = credits.text;
                }
                if ((i11 & 16) != 0) {
                    str3 = credits.timeText;
                }
                if ((i11 & 32) != 0) {
                    str4 = credits.description;
                }
                if ((i11 & 64) != 0) {
                    i10 = credits.counterNumber;
                }
                String str5 = str4;
                int i12 = i10;
                String str6 = str3;
                boolean z11 = z10;
                return credits.copy(str, z6, z11, str2, str6, str5, i12);
            }

            public static final /* synthetic */ void write$Self$data_release(Credits self, tr.b output, SerialDescriptor serialDesc) {
                output.V(serialDesc, 0, self.currentPlan);
                output.T(serialDesc, 1, self.canUpgrade);
                output.T(serialDesc, 2, self.isPaidPlan);
                output.V(serialDesc, 3, self.text);
                output.V(serialDesc, 4, self.timeText);
                output.o(serialDesc, 5, g1.f34588a, self.description);
                output.P(6, self.counterNumber, serialDesc);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getCanUpgrade() {
                return this.canUpgrade;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsPaidPlan() {
                return this.isPaidPlan;
            }

            /* renamed from: component4, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component5, reason: from getter */
            public final String getTimeText() {
                return this.timeText;
            }

            /* renamed from: component6, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component7, reason: from getter */
            public final int getCounterNumber() {
                return this.counterNumber;
            }

            public final Credits copy(String currentPlan, boolean canUpgrade, boolean isPaidPlan, String r12, String timeText, String description, int counterNumber) {
                currentPlan.getClass();
                r12.getClass();
                timeText.getClass();
                return new Credits(currentPlan, canUpgrade, isPaidPlan, r12, timeText, description, counterNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Credits)) {
                    return false;
                }
                Credits credits = (Credits) other;
                if (m.c(this.currentPlan, credits.currentPlan) && this.canUpgrade == credits.canUpgrade && this.isPaidPlan == credits.isPaidPlan && m.c(this.text, credits.text) && m.c(this.timeText, credits.timeText) && m.c(this.description, credits.description) && this.counterNumber == credits.counterNumber) {
                    return true;
                }
                return false;
            }

            public final boolean getCanUpgrade() {
                return this.canUpgrade;
            }

            public final int getCounterNumber() {
                return this.counterNumber;
            }

            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getText() {
                return this.text;
            }

            public final String getTimeText() {
                return this.timeText;
            }

            public int hashCode() {
                int hashCode;
                int c5 = j0.c.c(j0.c.c(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(this.currentPlan.hashCode() * 31, 31, this.canUpgrade), 31, this.isPaidPlan), 31, this.text), 31, this.timeText);
                String str = this.description;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return Integer.hashCode(this.counterNumber) + ((c5 + hashCode) * 31);
            }

            public final boolean isPaidPlan() {
                return this.isPaidPlan;
            }

            public String toString() {
                String str = this.currentPlan;
                boolean z6 = this.canUpgrade;
                boolean z10 = this.isPaidPlan;
                String str2 = this.text;
                String str3 = this.timeText;
                String str4 = this.description;
                int i10 = this.counterNumber;
                StringBuilder sb = new StringBuilder("Credits(currentPlan=");
                sb.append(str);
                sb.append(", canUpgrade=");
                sb.append(z6);
                sb.append(", isPaidPlan=");
                defpackage.f.z(sb, z10, ", text=", str2, ", timeText=");
                defpackage.f.x(sb, str3, ", description=", str4, ", counterNumber=");
                return defpackage.f.f(i10, Separators.RPAREN, sb);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$Credits$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$Credits;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetAccountResponse$Section$Credits$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getCanUpgrade$annotations() {
            }

            public static /* synthetic */ void getCounterNumber$annotations() {
            }

            public static /* synthetic */ void getCurrentPlan$annotations() {
            }

            public static /* synthetic */ void getDescription$annotations() {
            }

            public static /* synthetic */ void getText$annotations() {
            }

            public static /* synthetic */ void getTimeText$annotations() {
            }

            public static /* synthetic */ void isPaidPlan$annotations() {
            }

            public Credits(String str, boolean z6, boolean z10, String str2, String str3, String str4, int i10) {
                ib.i.s(str, str2, str3);
                this.currentPlan = str;
                this.canUpgrade = z6;
                this.isPaidPlan = z10;
                this.text = str2;
                this.timeText = str3;
                this.description = str4;
                this.counterNumber = i10;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$CreditsUnlimited;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section;", "", "currentPlan", "timeText", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetAccountResponse$Section$CreditsUnlimited;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetAccountResponse$Section$CreditsUnlimited;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentPlan", "getCurrentPlan$annotations", "()V", "getTimeText", "getTimeText$annotations", "getDescription", "getDescription$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class CreditsUnlimited implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String currentPlan;
            private final String description;
            private final String timeText;

            public /* synthetic */ CreditsUnlimited(int i10, String str, String str2, String str3, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.currentPlan = str;
                    this.timeText = str2;
                    this.description = str3;
                    return;
                }
                t0.j(i10, 7, GetAccountResponse$Section$CreditsUnlimited$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ CreditsUnlimited copy$default(CreditsUnlimited creditsUnlimited, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = creditsUnlimited.currentPlan;
                }
                if ((i10 & 2) != 0) {
                    str2 = creditsUnlimited.timeText;
                }
                if ((i10 & 4) != 0) {
                    str3 = creditsUnlimited.description;
                }
                return creditsUnlimited.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$data_release(CreditsUnlimited self, tr.b output, SerialDescriptor serialDesc) {
                output.V(serialDesc, 0, self.currentPlan);
                output.V(serialDesc, 1, self.timeText);
                output.V(serialDesc, 2, self.description);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTimeText() {
                return this.timeText;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final CreditsUnlimited copy(String currentPlan, String timeText, String description) {
                currentPlan.getClass();
                timeText.getClass();
                description.getClass();
                return new CreditsUnlimited(currentPlan, timeText, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CreditsUnlimited)) {
                    return false;
                }
                CreditsUnlimited creditsUnlimited = (CreditsUnlimited) other;
                if (m.c(this.currentPlan, creditsUnlimited.currentPlan) && m.c(this.timeText, creditsUnlimited.timeText) && m.c(this.description, creditsUnlimited.description)) {
                    return true;
                }
                return false;
            }

            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getTimeText() {
                return this.timeText;
            }

            public int hashCode() {
                return this.description.hashCode() + j0.c.c(this.currentPlan.hashCode() * 31, 31, this.timeText);
            }

            public String toString() {
                return defpackage.f.l(this.description, Separators.RPAREN, defpackage.f.s("CreditsUnlimited(currentPlan=", this.currentPlan, ", timeText=", this.timeText, ", description="));
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Section$CreditsUnlimited$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse$Section$CreditsUnlimited;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetAccountResponse$Section$CreditsUnlimited$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getCurrentPlan$annotations() {
            }

            public static /* synthetic */ void getDescription$annotations() {
            }

            public static /* synthetic */ void getTimeText$annotations() {
            }

            public CreditsUnlimited(String str, String str2, String str3) {
                ib.i.s(str, str2, str3);
                this.currentPlan = str;
                this.timeText = str2;
                this.description = str3;
            }
        }
    }

    public /* synthetic */ GetAccountResponse(int i10, List list, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.sections = list;
        } else {
            t0.j(i10, 1, GetAccountResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleAccountSectionsSerializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAccountResponse copy$default(GetAccountResponse getAccountResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getAccountResponse.sections;
        }
        return getAccountResponse.copy(list);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final GetAccountResponse copy(List<? extends Section> sections) {
        sections.getClass();
        return new GetAccountResponse(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof GetAccountResponse) && m.c(this.sections, ((GetAccountResponse) other).sections)) {
            return true;
        }
        return false;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return ib.i.k("GetAccountResponse(sections=", Separators.RPAREN, this.sections);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetAccountResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetAccountResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetAccountResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(with = BackwardCompatibleAccountSectionsSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetAccountResponse(List<? extends Section> list) {
        list.getClass();
        this.sections = list;
    }
}
