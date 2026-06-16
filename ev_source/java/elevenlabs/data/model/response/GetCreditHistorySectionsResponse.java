package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.messaging.Constants;
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
import tn.t;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0004'()&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006*"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse;", "", "", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section;", "sections", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "Companion", "Section", "ActiveCreditPack", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetCreditHistorySectionsResponse {
    private final List<Section> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new a(17))};

    public /* synthetic */ GetCreditHistorySectionsResponse(int i10, List list, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.sections = list;
        } else {
            t0.j(i10, 1, GetCreditHistorySectionsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleSectionListSerializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCreditHistorySectionsResponse copy$default(GetCreditHistorySectionsResponse getCreditHistorySectionsResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getCreditHistorySectionsResponse.sections;
        }
        return getCreditHistorySectionsResponse.copy(list);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final GetCreditHistorySectionsResponse copy(List<? extends Section> sections) {
        sections.getClass();
        return new GetCreditHistorySectionsResponse(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof GetCreditHistorySectionsResponse) && m.c(this.sections, ((GetCreditHistorySectionsResponse) other).sections)) {
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
        return ib.i.k("GetCreditHistorySectionsResponse(sections=", Separators.RPAREN, this.sections);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section;", "", "UsageProgress", "UsageExtraHours", "Companion", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageExtraHours;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageProgress;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Section {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.GetCreditHistorySectionsResponse.Section", f0Var.b(Section.class), new oo.d[]{f0Var.b(UsageExtraHours.class), f0Var.b(UsageProgress.class)}, new KSerializer[]{GetCreditHistorySectionsResponse$Section$UsageExtraHours$$serializer.INSTANCE, GetCreditHistorySectionsResponse$Section$UsageProgress$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jh\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010\u0016R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010\u0019R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010\u0019R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u00105\u001a\u0004\b>\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\bA\u00105\u001a\u0004\b@\u0010\u0016R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\bC\u00105\u001a\u0004\bB\u0010\u0016R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010D\u0012\u0004\bF\u00105\u001a\u0004\bE\u0010 ¨\u0006I"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageExtraHours;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section;", "", Constants.ScionAnalytics.PARAM_LABEL, "valueLabel", "", "progressCurrent", "progressTotal", "", "enabled", "infoTooltip", "packsSummaryLabel", "", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$ActiveCreditPack;", "packs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Z", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageExtraHours;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageExtraHours;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "getValueLabel", "getValueLabel$annotations", TokenNames.I, "getProgressCurrent", "getProgressCurrent$annotations", "getProgressTotal", "getProgressTotal$annotations", "Z", "getEnabled", "getEnabled$annotations", "getInfoTooltip", "getInfoTooltip$annotations", "getPacksSummaryLabel", "getPacksSummaryLabel$annotations", "Ljava/util/List;", "getPacks", "getPacks$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class UsageExtraHours implements Section {
            private final boolean enabled;
            private final String infoTooltip;
            private final String label;
            private final List<ActiveCreditPack> packs;
            private final String packsSummaryLabel;
            private final int progressCurrent;
            private final int progressTotal;
            private final String valueLabel;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, null, null, null, null, null, sn.a.d(i.f31597b, new a(18))};

            public /* synthetic */ UsageExtraHours(int i10, String str, String str2, int i11, int i12, boolean z6, String str3, String str4, List list, c1 c1Var) {
                if (95 == (i10 & 95)) {
                    this.label = str;
                    this.valueLabel = str2;
                    this.progressCurrent = i11;
                    this.progressTotal = i12;
                    this.enabled = z6;
                    if ((i10 & 32) == 0) {
                        this.infoTooltip = null;
                    } else {
                        this.infoTooltip = str3;
                    }
                    this.packsSummaryLabel = str4;
                    if ((i10 & 128) == 0) {
                        this.packs = t.f33547a;
                        return;
                    } else {
                        this.packs = list;
                        return;
                    }
                }
                t0.j(i10, 95, GetCreditHistorySectionsResponse$Section$UsageExtraHours$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(GetCreditHistorySectionsResponse$ActiveCreditPack$$serializer.INSTANCE, 0);
            }

            public static /* synthetic */ UsageExtraHours copy$default(UsageExtraHours usageExtraHours, String str, String str2, int i10, int i11, boolean z6, String str3, String str4, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = usageExtraHours.label;
                }
                if ((i12 & 2) != 0) {
                    str2 = usageExtraHours.valueLabel;
                }
                if ((i12 & 4) != 0) {
                    i10 = usageExtraHours.progressCurrent;
                }
                if ((i12 & 8) != 0) {
                    i11 = usageExtraHours.progressTotal;
                }
                if ((i12 & 16) != 0) {
                    z6 = usageExtraHours.enabled;
                }
                if ((i12 & 32) != 0) {
                    str3 = usageExtraHours.infoTooltip;
                }
                if ((i12 & 64) != 0) {
                    str4 = usageExtraHours.packsSummaryLabel;
                }
                if ((i12 & 128) != 0) {
                    list = usageExtraHours.packs;
                }
                String str5 = str4;
                List list2 = list;
                boolean z10 = z6;
                String str6 = str3;
                return usageExtraHours.copy(str, str2, i10, i11, z10, str6, str5, list2);
            }

            public static final /* synthetic */ void write$Self$data_release(UsageExtraHours self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.label);
                output.V(serialDesc, 1, self.valueLabel);
                output.P(2, self.progressCurrent, serialDesc);
                output.P(3, self.progressTotal, serialDesc);
                output.T(serialDesc, 4, self.enabled);
                if (output.C(serialDesc) || self.infoTooltip != null) {
                    output.o(serialDesc, 5, g1.f34588a, self.infoTooltip);
                }
                output.V(serialDesc, 6, self.packsSummaryLabel);
                if (output.C(serialDesc) || !m.c(self.packs, t.f33547a)) {
                    output.g(serialDesc, 7, (KSerializer) hVarArr[7].getValue(), self.packs);
                }
            }

            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValueLabel() {
                return this.valueLabel;
            }

            /* renamed from: component3, reason: from getter */
            public final int getProgressCurrent() {
                return this.progressCurrent;
            }

            /* renamed from: component4, reason: from getter */
            public final int getProgressTotal() {
                return this.progressTotal;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component6, reason: from getter */
            public final String getInfoTooltip() {
                return this.infoTooltip;
            }

            /* renamed from: component7, reason: from getter */
            public final String getPacksSummaryLabel() {
                return this.packsSummaryLabel;
            }

            public final List<ActiveCreditPack> component8() {
                return this.packs;
            }

            public final UsageExtraHours copy(String r10, String valueLabel, int progressCurrent, int progressTotal, boolean enabled, String infoTooltip, String packsSummaryLabel, List<ActiveCreditPack> packs) {
                r10.getClass();
                valueLabel.getClass();
                packsSummaryLabel.getClass();
                packs.getClass();
                return new UsageExtraHours(r10, valueLabel, progressCurrent, progressTotal, enabled, infoTooltip, packsSummaryLabel, packs);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UsageExtraHours)) {
                    return false;
                }
                UsageExtraHours usageExtraHours = (UsageExtraHours) other;
                if (m.c(this.label, usageExtraHours.label) && m.c(this.valueLabel, usageExtraHours.valueLabel) && this.progressCurrent == usageExtraHours.progressCurrent && this.progressTotal == usageExtraHours.progressTotal && this.enabled == usageExtraHours.enabled && m.c(this.infoTooltip, usageExtraHours.infoTooltip) && m.c(this.packsSummaryLabel, usageExtraHours.packsSummaryLabel) && m.c(this.packs, usageExtraHours.packs)) {
                    return true;
                }
                return false;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final String getInfoTooltip() {
                return this.infoTooltip;
            }

            public final String getLabel() {
                return this.label;
            }

            public final List<ActiveCreditPack> getPacks() {
                return this.packs;
            }

            public final String getPacksSummaryLabel() {
                return this.packsSummaryLabel;
            }

            public final int getProgressCurrent() {
                return this.progressCurrent;
            }

            public final int getProgressTotal() {
                return this.progressTotal;
            }

            public final String getValueLabel() {
                return this.valueLabel;
            }

            public int hashCode() {
                int hashCode;
                int f10 = com.google.android.gms.internal.play_billing.b.f(j0.c.b(this.progressTotal, j0.c.b(this.progressCurrent, j0.c.c(this.label.hashCode() * 31, 31, this.valueLabel), 31), 31), 31, this.enabled);
                String str = this.infoTooltip;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.packs.hashCode() + j0.c.c((f10 + hashCode) * 31, 31, this.packsSummaryLabel);
            }

            public String toString() {
                String str = this.label;
                String str2 = this.valueLabel;
                int i10 = this.progressCurrent;
                int i11 = this.progressTotal;
                boolean z6 = this.enabled;
                String str3 = this.infoTooltip;
                String str4 = this.packsSummaryLabel;
                List<ActiveCreditPack> list = this.packs;
                StringBuilder s10 = defpackage.f.s("UsageExtraHours(label=", str, ", valueLabel=", str2, ", progressCurrent=");
                android.gov.nist.javax.sip.header.a.t(s10, i10, ", progressTotal=", i11, ", enabled=");
                defpackage.f.z(s10, z6, ", infoTooltip=", str3, ", packsSummaryLabel=");
                s10.append(str4);
                s10.append(", packs=");
                s10.append(list);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageExtraHours$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageExtraHours;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetCreditHistorySectionsResponse$Section$UsageExtraHours$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getEnabled$annotations() {
            }

            public static /* synthetic */ void getInfoTooltip$annotations() {
            }

            public static /* synthetic */ void getLabel$annotations() {
            }

            public static /* synthetic */ void getPacks$annotations() {
            }

            public static /* synthetic */ void getPacksSummaryLabel$annotations() {
            }

            public static /* synthetic */ void getProgressCurrent$annotations() {
            }

            public static /* synthetic */ void getProgressTotal$annotations() {
            }

            public static /* synthetic */ void getValueLabel$annotations() {
            }

            public UsageExtraHours(String str, String str2, int i10, int i11, boolean z6, String str3, String str4, List<ActiveCreditPack> list) {
                str.getClass();
                str2.getClass();
                str4.getClass();
                list.getClass();
                this.label = str;
                this.valueLabel = str2;
                this.progressCurrent = i10;
                this.progressTotal = i11;
                this.enabled = z6;
                this.infoTooltip = str3;
                this.packsSummaryLabel = str4;
                this.packs = list;
            }

            public /* synthetic */ UsageExtraHours(String str, String str2, int i10, int i11, boolean z6, String str3, String str4, List list, int i12, kotlin.jvm.internal.f fVar) {
                this(str, str2, i10, i11, z6, (i12 & 32) != 0 ? null : str3, str4, (i12 & 128) != 0 ? t.f33547a : list);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJZ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u0014R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0017R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u0017R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010\u0014R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010?\u0012\u0004\bA\u00102\u001a\u0004\b@\u0010\u001d¨\u0006D"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageProgress;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section;", "", Constants.ScionAnalytics.PARAM_LABEL, "valueLabel", "", "progressCurrent", "progressTotal", "", "enabled", "infoTooltip", "", "resetsAtUnix", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/Long;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/Long;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()Z", "component6", "component7", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/Long;)Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageProgress;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageProgress;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "getValueLabel", "getValueLabel$annotations", TokenNames.I, "getProgressCurrent", "getProgressCurrent$annotations", "getProgressTotal", "getProgressTotal$annotations", "Z", "getEnabled", "getEnabled$annotations", "getInfoTooltip", "getInfoTooltip$annotations", "Ljava/lang/Long;", "getResetsAtUnix", "getResetsAtUnix$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class UsageProgress implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean enabled;
            private final String infoTooltip;
            private final String label;
            private final int progressCurrent;
            private final int progressTotal;
            private final Long resetsAtUnix;
            private final String valueLabel;

            public /* synthetic */ UsageProgress(int i10, String str, String str2, int i11, int i12, boolean z6, String str3, Long l4, c1 c1Var) {
                if (31 == (i10 & 31)) {
                    this.label = str;
                    this.valueLabel = str2;
                    this.progressCurrent = i11;
                    this.progressTotal = i12;
                    this.enabled = z6;
                    if ((i10 & 32) == 0) {
                        this.infoTooltip = null;
                    } else {
                        this.infoTooltip = str3;
                    }
                    if ((i10 & 64) == 0) {
                        this.resetsAtUnix = null;
                        return;
                    } else {
                        this.resetsAtUnix = l4;
                        return;
                    }
                }
                t0.j(i10, 31, GetCreditHistorySectionsResponse$Section$UsageProgress$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ UsageProgress copy$default(UsageProgress usageProgress, String str, String str2, int i10, int i11, boolean z6, String str3, Long l4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = usageProgress.label;
                }
                if ((i12 & 2) != 0) {
                    str2 = usageProgress.valueLabel;
                }
                if ((i12 & 4) != 0) {
                    i10 = usageProgress.progressCurrent;
                }
                if ((i12 & 8) != 0) {
                    i11 = usageProgress.progressTotal;
                }
                if ((i12 & 16) != 0) {
                    z6 = usageProgress.enabled;
                }
                if ((i12 & 32) != 0) {
                    str3 = usageProgress.infoTooltip;
                }
                if ((i12 & 64) != 0) {
                    l4 = usageProgress.resetsAtUnix;
                }
                String str4 = str3;
                Long l7 = l4;
                boolean z10 = z6;
                int i13 = i10;
                return usageProgress.copy(str, str2, i13, i11, z10, str4, l7);
            }

            public static final /* synthetic */ void write$Self$data_release(UsageProgress self, tr.b output, SerialDescriptor serialDesc) {
                output.V(serialDesc, 0, self.label);
                output.V(serialDesc, 1, self.valueLabel);
                output.P(2, self.progressCurrent, serialDesc);
                output.P(3, self.progressTotal, serialDesc);
                output.T(serialDesc, 4, self.enabled);
                if (output.C(serialDesc) || self.infoTooltip != null) {
                    output.o(serialDesc, 5, g1.f34588a, self.infoTooltip);
                }
                if (output.C(serialDesc) || self.resetsAtUnix != null) {
                    output.o(serialDesc, 6, l0.f34611a, self.resetsAtUnix);
                }
            }

            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValueLabel() {
                return this.valueLabel;
            }

            /* renamed from: component3, reason: from getter */
            public final int getProgressCurrent() {
                return this.progressCurrent;
            }

            /* renamed from: component4, reason: from getter */
            public final int getProgressTotal() {
                return this.progressTotal;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            /* renamed from: component6, reason: from getter */
            public final String getInfoTooltip() {
                return this.infoTooltip;
            }

            /* renamed from: component7, reason: from getter */
            public final Long getResetsAtUnix() {
                return this.resetsAtUnix;
            }

            public final UsageProgress copy(String r92, String valueLabel, int progressCurrent, int progressTotal, boolean enabled, String infoTooltip, Long resetsAtUnix) {
                r92.getClass();
                valueLabel.getClass();
                return new UsageProgress(r92, valueLabel, progressCurrent, progressTotal, enabled, infoTooltip, resetsAtUnix);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UsageProgress)) {
                    return false;
                }
                UsageProgress usageProgress = (UsageProgress) other;
                if (m.c(this.label, usageProgress.label) && m.c(this.valueLabel, usageProgress.valueLabel) && this.progressCurrent == usageProgress.progressCurrent && this.progressTotal == usageProgress.progressTotal && this.enabled == usageProgress.enabled && m.c(this.infoTooltip, usageProgress.infoTooltip) && m.c(this.resetsAtUnix, usageProgress.resetsAtUnix)) {
                    return true;
                }
                return false;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final String getInfoTooltip() {
                return this.infoTooltip;
            }

            public final String getLabel() {
                return this.label;
            }

            public final int getProgressCurrent() {
                return this.progressCurrent;
            }

            public final int getProgressTotal() {
                return this.progressTotal;
            }

            public final Long getResetsAtUnix() {
                return this.resetsAtUnix;
            }

            public final String getValueLabel() {
                return this.valueLabel;
            }

            public int hashCode() {
                int hashCode;
                int f10 = com.google.android.gms.internal.play_billing.b.f(j0.c.b(this.progressTotal, j0.c.b(this.progressCurrent, j0.c.c(this.label.hashCode() * 31, 31, this.valueLabel), 31), 31), 31, this.enabled);
                String str = this.infoTooltip;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (f10 + hashCode) * 31;
                Long l4 = this.resetsAtUnix;
                if (l4 != null) {
                    i10 = l4.hashCode();
                }
                return i11 + i10;
            }

            public String toString() {
                String str = this.label;
                String str2 = this.valueLabel;
                int i10 = this.progressCurrent;
                int i11 = this.progressTotal;
                boolean z6 = this.enabled;
                String str3 = this.infoTooltip;
                Long l4 = this.resetsAtUnix;
                StringBuilder s10 = defpackage.f.s("UsageProgress(label=", str, ", valueLabel=", str2, ", progressCurrent=");
                android.gov.nist.javax.sip.header.a.t(s10, i10, ", progressTotal=", i11, ", enabled=");
                defpackage.f.z(s10, z6, ", infoTooltip=", str3, ", resetsAtUnix=");
                s10.append(l4);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageProgress$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Section$UsageProgress;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetCreditHistorySectionsResponse$Section$UsageProgress$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getEnabled$annotations() {
            }

            public static /* synthetic */ void getInfoTooltip$annotations() {
            }

            public static /* synthetic */ void getLabel$annotations() {
            }

            public static /* synthetic */ void getProgressCurrent$annotations() {
            }

            public static /* synthetic */ void getProgressTotal$annotations() {
            }

            public static /* synthetic */ void getResetsAtUnix$annotations() {
            }

            public static /* synthetic */ void getValueLabel$annotations() {
            }

            public UsageProgress(String str, String str2, int i10, int i11, boolean z6, String str3, Long l4) {
                str.getClass();
                str2.getClass();
                this.label = str;
                this.valueLabel = str2;
                this.progressCurrent = i10;
                this.progressTotal = i11;
                this.enabled = z6;
                this.infoTooltip = str3;
                this.resetsAtUnix = l4;
            }

            public /* synthetic */ UsageProgress(String str, String str2, int i10, int i11, boolean z6, String str3, Long l4, int i12, kotlin.jvm.internal.f fVar) {
                this(str, str2, i10, i11, z6, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : l4);
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$ActiveCreditPack;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "", "expiresAtUnix", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;JLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$ActiveCreditPack;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$ActiveCreditPack;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "()V", "J", "getExpiresAtUnix", "getExpiresAtUnix$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final /* data */ class ActiveCreditPack {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long expiresAtUnix;
        private final String label;

        public /* synthetic */ ActiveCreditPack(int i10, String str, long j4, c1 c1Var) {
            if (3 == (i10 & 3)) {
                this.label = str;
                this.expiresAtUnix = j4;
            } else {
                t0.j(i10, 3, GetCreditHistorySectionsResponse$ActiveCreditPack$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ActiveCreditPack copy$default(ActiveCreditPack activeCreditPack, String str, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = activeCreditPack.label;
            }
            if ((i10 & 2) != 0) {
                j4 = activeCreditPack.expiresAtUnix;
            }
            return activeCreditPack.copy(str, j4);
        }

        public static final /* synthetic */ void write$Self$data_release(ActiveCreditPack self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.label);
            output.h0(serialDesc, 1, self.expiresAtUnix);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final long getExpiresAtUnix() {
            return this.expiresAtUnix;
        }

        public final ActiveCreditPack copy(String r22, long expiresAtUnix) {
            r22.getClass();
            return new ActiveCreditPack(r22, expiresAtUnix);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveCreditPack)) {
                return false;
            }
            ActiveCreditPack activeCreditPack = (ActiveCreditPack) other;
            if (m.c(this.label, activeCreditPack.label) && this.expiresAtUnix == activeCreditPack.expiresAtUnix) {
                return true;
            }
            return false;
        }

        public final long getExpiresAtUnix() {
            return this.expiresAtUnix;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return Long.hashCode(this.expiresAtUnix) + (this.label.hashCode() * 31);
        }

        public String toString() {
            StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("ActiveCreditPack(label=", this.label, this.expiresAtUnix, ", expiresAtUnix=");
            r10.append(Separators.RPAREN);
            return r10.toString();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$ActiveCreditPack$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$ActiveCreditPack;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return GetCreditHistorySectionsResponse$ActiveCreditPack$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static /* synthetic */ void getExpiresAtUnix$annotations() {
        }

        public static /* synthetic */ void getLabel$annotations() {
        }

        public ActiveCreditPack(String str, long j4) {
            str.getClass();
            this.label = str;
            this.expiresAtUnix = j4;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetCreditHistorySectionsResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetCreditHistorySectionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(with = BackwardCompatibleSectionListSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCreditHistorySectionsResponse(List<? extends Section> list) {
        list.getClass();
        this.sections = list;
    }
}
