package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
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

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response;", "", "", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "sections", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV4Response;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "Companion", "Section", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class HomeV4Response {
    private final List<Section> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new b(22))};

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u000b2\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "RecentReadsSection", "ActionListSection", "StatsCarouselSection", "AnnouncementBannerCarouselSection", "HeroCarouselSection", "HighlightedCarouselSection", "MediumCarouselSection", "MiniReadGridSection", "WarningSection", "Companion", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$HighlightedCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$MediumCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$RecentReadsSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$StatsCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$WarningSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Section {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.HomeV4Response.Section", f0Var.b(Section.class), new oo.d[]{f0Var.b(ActionListSection.class), f0Var.b(AnnouncementBannerCarouselSection.class), f0Var.b(HeroCarouselSection.class), f0Var.b(HighlightedCarouselSection.class), f0Var.b(MediumCarouselSection.class), f0Var.b(MiniReadGridSection.class), f0Var.b(RecentReadsSection.class), f0Var.b(StatsCarouselSection.class), f0Var.b(WarningSection.class)}, new KSerializer[]{HomeV4Response$Section$ActionListSection$$serializer.INSTANCE, HomeV4Response$Section$AnnouncementBannerCarouselSection$$serializer.INSTANCE, HomeV4Response$Section$HeroCarouselSection$$serializer.INSTANCE, HomeV4Response$Section$HighlightedCarouselSection$$serializer.INSTANCE, HomeV4Response$Section$MediumCarouselSection$$serializer.INSTANCE, HomeV4Response$Section$MiniReadGridSection$$serializer.INSTANCE, HomeV4Response$Section$RecentReadsSection$$serializer.INSTANCE, HomeV4Response$Section$StatsCarouselSection$$serializer.INSTANCE, HomeV4Response$Section$WarningSection$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*+)B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection$ActionItem;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Companion", "ActionItem", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class ActionListSection implements Section {
            private final List<ActionItem> items;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new b(23))};

            public /* synthetic */ ActionListSection(int i10, String str, List list, c1 c1Var) {
                if (2 == (i10 & 2)) {
                    if ((i10 & 1) == 0) {
                        this.title = null;
                    } else {
                        this.title = str;
                    }
                    this.items = list;
                    return;
                }
                t0.j(i10, 2, HomeV4Response$Section$ActionListSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV4Response$Section$ActionListSection$ActionItem$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ActionListSection copy$default(ActionListSection actionListSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = actionListSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = actionListSection.items;
                }
                return actionListSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(ActionListSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                if (output.C(serialDesc) || self.title != null) {
                    output.o(serialDesc, 0, g1.f34588a, self.title);
                }
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.items);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<ActionItem> component2() {
                return this.items;
            }

            public final ActionListSection copy(String title, List<ActionItem> r32) {
                r32.getClass();
                return new ActionListSection(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionListSection)) {
                    return false;
                }
                ActionListSection actionListSection = (ActionListSection) other;
                if (m.c(this.title, actionListSection.title) && m.c(this.items, actionListSection.items)) {
                    return true;
                }
                return false;
            }

            public final List<ActionItem> getItems() {
                return this.items;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                String str = this.title;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.items.hashCode() + (hashCode * 31);
            }

            public String toString() {
                return ib.i.j("ActionListSection(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection$ActionItem;", "", "", "title", "icon_url", "deeplink", "analytics_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection$ActionItem;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection$ActionItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getIcon_url", "getDeeplink", "getAnalytics_id", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class ActionItem {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String analytics_id;
                private final String deeplink;
                private final String icon_url;
                private final String title;

                public /* synthetic */ ActionItem(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
                    if (15 == (i10 & 15)) {
                        this.title = str;
                        this.icon_url = str2;
                        this.deeplink = str3;
                        this.analytics_id = str4;
                        return;
                    }
                    t0.j(i10, 15, HomeV4Response$Section$ActionListSection$ActionItem$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ ActionItem copy$default(ActionItem actionItem, String str, String str2, String str3, String str4, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = actionItem.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = actionItem.icon_url;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = actionItem.deeplink;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = actionItem.analytics_id;
                    }
                    return actionItem.copy(str, str2, str3, str4);
                }

                public static final /* synthetic */ void write$Self$data_release(ActionItem self, tr.b output, SerialDescriptor serialDesc) {
                    output.V(serialDesc, 0, self.title);
                    output.V(serialDesc, 1, self.icon_url);
                    output.V(serialDesc, 2, self.deeplink);
                    output.V(serialDesc, 3, self.analytics_id);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getIcon_url() {
                    return this.icon_url;
                }

                /* renamed from: component3, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* renamed from: component4, reason: from getter */
                public final String getAnalytics_id() {
                    return this.analytics_id;
                }

                public final ActionItem copy(String title, String icon_url, String deeplink, String analytics_id) {
                    title.getClass();
                    icon_url.getClass();
                    deeplink.getClass();
                    analytics_id.getClass();
                    return new ActionItem(title, icon_url, deeplink, analytics_id);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ActionItem)) {
                        return false;
                    }
                    ActionItem actionItem = (ActionItem) other;
                    if (m.c(this.title, actionItem.title) && m.c(this.icon_url, actionItem.icon_url) && m.c(this.deeplink, actionItem.deeplink) && m.c(this.analytics_id, actionItem.analytics_id)) {
                        return true;
                    }
                    return false;
                }

                public final String getAnalytics_id() {
                    return this.analytics_id;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getIcon_url() {
                    return this.icon_url;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.analytics_id.hashCode() + j0.c.c(j0.c.c(this.title.hashCode() * 31, 31, this.icon_url), 31, this.deeplink);
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.icon_url;
                    return defpackage.f.n(defpackage.f.s("ActionItem(title=", str, ", icon_url=", str2, ", deeplink="), this.deeplink, ", analytics_id=", this.analytics_id, Separators.RPAREN);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection$ActionItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection$ActionItem;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV4Response$Section$ActionListSection$ActionItem$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public ActionItem(String str, String str2, String str3, String str4) {
                    j0.c.u(str, str2, str3, str4);
                    this.title = str;
                    this.icon_url = str2;
                    this.deeplink = str3;
                    this.analytics_id = str4;
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$ActionListSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$ActionListSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ActionListSection(String str, List<ActionItem> list) {
                list.getClass();
                this.title = str;
                this.items = list;
            }

            public /* synthetic */ ActionListSection(String str, List list, int i10, kotlin.jvm.internal.f fVar) {
                this((i10 & 1) != 0 ? null : str, list);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*+)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class AnnouncementBannerCarouselSection implements Section {
            private final List<Item> items;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new b(24))};

            public /* synthetic */ AnnouncementBannerCarouselSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.items = list;
                } else {
                    t0.j(i10, 3, HomeV4Response$Section$AnnouncementBannerCarouselSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV4Response$Section$AnnouncementBannerCarouselSection$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AnnouncementBannerCarouselSection copy$default(AnnouncementBannerCarouselSection announcementBannerCarouselSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = announcementBannerCarouselSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = announcementBannerCarouselSection.items;
                }
                return announcementBannerCarouselSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(AnnouncementBannerCarouselSection self, tr.b output, SerialDescriptor serialDesc) {
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

            public final AnnouncementBannerCarouselSection copy(String title, List<Item> r32) {
                title.getClass();
                r32.getClass();
                return new AnnouncementBannerCarouselSection(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnnouncementBannerCarouselSection)) {
                    return false;
                }
                AnnouncementBannerCarouselSection announcementBannerCarouselSection = (AnnouncementBannerCarouselSection) other;
                if (m.c(this.title, announcementBannerCarouselSection.title) && m.c(this.items, announcementBannerCarouselSection.items)) {
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
                return ib.i.j("AnnouncementBannerCarouselSection(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection$Item;", "", "", "image_url", "deeplink", "analytics_id", "eyebrow_text", "header_text", "button_text", "color_hex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage_url", "getDeeplink", "getAnalytics_id", "getEyebrow_text", "getHeader_text", "getButton_text", "getColor_hex", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String analytics_id;
                private final String button_text;
                private final String color_hex;
                private final String deeplink;
                private final String eyebrow_text;
                private final String header_text;
                private final String image_url;

                public /* synthetic */ Item(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, c1 c1Var) {
                    if (3 == (i10 & 3)) {
                        this.image_url = str;
                        this.deeplink = str2;
                        if ((i10 & 4) == 0) {
                            this.analytics_id = null;
                        } else {
                            this.analytics_id = str3;
                        }
                        if ((i10 & 8) == 0) {
                            this.eyebrow_text = null;
                        } else {
                            this.eyebrow_text = str4;
                        }
                        if ((i10 & 16) == 0) {
                            this.header_text = null;
                        } else {
                            this.header_text = str5;
                        }
                        if ((i10 & 32) == 0) {
                            this.button_text = null;
                        } else {
                            this.button_text = str6;
                        }
                        if ((i10 & 64) == 0) {
                            this.color_hex = null;
                            return;
                        } else {
                            this.color_hex = str7;
                            return;
                        }
                    }
                    t0.j(i10, 3, HomeV4Response$Section$AnnouncementBannerCarouselSection$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.image_url;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.deeplink;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = item.analytics_id;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = item.eyebrow_text;
                    }
                    if ((i10 & 16) != 0) {
                        str5 = item.header_text;
                    }
                    if ((i10 & 32) != 0) {
                        str6 = item.button_text;
                    }
                    if ((i10 & 64) != 0) {
                        str7 = item.color_hex;
                    }
                    String str8 = str6;
                    String str9 = str7;
                    String str10 = str5;
                    String str11 = str3;
                    return item.copy(str, str2, str11, str4, str10, str8, str9);
                }

                public static final /* synthetic */ void write$Self$data_release(Item self, tr.b output, SerialDescriptor serialDesc) {
                    output.V(serialDesc, 0, self.image_url);
                    output.V(serialDesc, 1, self.deeplink);
                    if (output.C(serialDesc) || self.analytics_id != null) {
                        output.o(serialDesc, 2, g1.f34588a, self.analytics_id);
                    }
                    if (output.C(serialDesc) || self.eyebrow_text != null) {
                        output.o(serialDesc, 3, g1.f34588a, self.eyebrow_text);
                    }
                    if (output.C(serialDesc) || self.header_text != null) {
                        output.o(serialDesc, 4, g1.f34588a, self.header_text);
                    }
                    if (output.C(serialDesc) || self.button_text != null) {
                        output.o(serialDesc, 5, g1.f34588a, self.button_text);
                    }
                    if (output.C(serialDesc) || self.color_hex != null) {
                        output.o(serialDesc, 6, g1.f34588a, self.color_hex);
                    }
                }

                /* renamed from: component1, reason: from getter */
                public final String getImage_url() {
                    return this.image_url;
                }

                /* renamed from: component2, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* renamed from: component3, reason: from getter */
                public final String getAnalytics_id() {
                    return this.analytics_id;
                }

                /* renamed from: component4, reason: from getter */
                public final String getEyebrow_text() {
                    return this.eyebrow_text;
                }

                /* renamed from: component5, reason: from getter */
                public final String getHeader_text() {
                    return this.header_text;
                }

                /* renamed from: component6, reason: from getter */
                public final String getButton_text() {
                    return this.button_text;
                }

                /* renamed from: component7, reason: from getter */
                public final String getColor_hex() {
                    return this.color_hex;
                }

                public final Item copy(String image_url, String deeplink, String analytics_id, String eyebrow_text, String header_text, String button_text, String color_hex) {
                    image_url.getClass();
                    deeplink.getClass();
                    return new Item(image_url, deeplink, analytics_id, eyebrow_text, header_text, button_text, color_hex);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.image_url, item.image_url) && m.c(this.deeplink, item.deeplink) && m.c(this.analytics_id, item.analytics_id) && m.c(this.eyebrow_text, item.eyebrow_text) && m.c(this.header_text, item.header_text) && m.c(this.button_text, item.button_text) && m.c(this.color_hex, item.color_hex)) {
                        return true;
                    }
                    return false;
                }

                public final String getAnalytics_id() {
                    return this.analytics_id;
                }

                public final String getButton_text() {
                    return this.button_text;
                }

                public final String getColor_hex() {
                    return this.color_hex;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getEyebrow_text() {
                    return this.eyebrow_text;
                }

                public final String getHeader_text() {
                    return this.header_text;
                }

                public final String getImage_url() {
                    return this.image_url;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    int hashCode4;
                    int c5 = j0.c.c(this.image_url.hashCode() * 31, 31, this.deeplink);
                    String str = this.analytics_id;
                    int i10 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i11 = (c5 + hashCode) * 31;
                    String str2 = this.eyebrow_text;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i12 = (i11 + hashCode2) * 31;
                    String str3 = this.header_text;
                    if (str3 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = str3.hashCode();
                    }
                    int i13 = (i12 + hashCode3) * 31;
                    String str4 = this.button_text;
                    if (str4 == null) {
                        hashCode4 = 0;
                    } else {
                        hashCode4 = str4.hashCode();
                    }
                    int i14 = (i13 + hashCode4) * 31;
                    String str5 = this.color_hex;
                    if (str5 != null) {
                        i10 = str5.hashCode();
                    }
                    return i14 + i10;
                }

                public String toString() {
                    String str = this.image_url;
                    String str2 = this.deeplink;
                    String str3 = this.analytics_id;
                    String str4 = this.eyebrow_text;
                    String str5 = this.header_text;
                    String str6 = this.button_text;
                    String str7 = this.color_hex;
                    StringBuilder s10 = defpackage.f.s("Item(image_url=", str, ", deeplink=", str2, ", analytics_id=");
                    defpackage.f.x(s10, str3, ", eyebrow_text=", str4, ", header_text=");
                    defpackage.f.x(s10, str5, ", button_text=", str6, ", color_hex=");
                    return defpackage.f.l(str7, Separators.RPAREN, s10);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV4Response$Section$AnnouncementBannerCarouselSection$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                    str.getClass();
                    str2.getClass();
                    this.image_url = str;
                    this.deeplink = str2;
                    this.analytics_id = str3;
                    this.eyebrow_text = str4;
                    this.header_text = str5;
                    this.button_text = str6;
                    this.color_hex = str7;
                }

                public /* synthetic */ Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$AnnouncementBannerCarouselSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$AnnouncementBannerCarouselSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public AnnouncementBannerCarouselSection(String str, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-.,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "title", "subtitle", "", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection$HeroItem;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "Companion", "HeroItem", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HeroCarouselSection implements Section {
            private final List<HeroItem> items;
            private final String subtitle;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new b(25))};

            public /* synthetic */ HeroCarouselSection(int i10, String str, String str2, List list, c1 c1Var) {
                if (5 == (i10 & 5)) {
                    this.title = str;
                    if ((i10 & 2) == 0) {
                        this.subtitle = null;
                    } else {
                        this.subtitle = str2;
                    }
                    this.items = list;
                    return;
                }
                t0.j(i10, 5, HomeV4Response$Section$HeroCarouselSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV4Response$Section$HeroCarouselSection$HeroItem$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HeroCarouselSection copy$default(HeroCarouselSection heroCarouselSection, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = heroCarouselSection.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = heroCarouselSection.subtitle;
                }
                if ((i10 & 4) != 0) {
                    list = heroCarouselSection.items;
                }
                return heroCarouselSection.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$data_release(HeroCarouselSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                if (output.C(serialDesc) || self.subtitle != null) {
                    output.o(serialDesc, 1, g1.f34588a, self.subtitle);
                }
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.items);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final List<HeroItem> component3() {
                return this.items;
            }

            public final HeroCarouselSection copy(String title, String subtitle, List<HeroItem> r42) {
                title.getClass();
                r42.getClass();
                return new HeroCarouselSection(title, subtitle, r42);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeroCarouselSection)) {
                    return false;
                }
                HeroCarouselSection heroCarouselSection = (HeroCarouselSection) other;
                if (m.c(this.title, heroCarouselSection.title) && m.c(this.subtitle, heroCarouselSection.subtitle) && m.c(this.items, heroCarouselSection.items)) {
                    return true;
                }
                return false;
            }

            public final List<HeroItem> getItems() {
                return this.items;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.title.hashCode() * 31;
                String str = this.subtitle;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.items.hashCode() + ((hashCode2 + hashCode) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                return z.h.e(defpackage.f.s("HeroCarouselSection(title=", str, ", subtitle=", str2, ", items="), this.items, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001c¨\u00067"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection$HeroItem;", "", "", "title", "subtitle", "", "swap_title_subtitle", "background_image_url", "background_video_url", "deeplink", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection$HeroItem;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection$HeroItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Z", "getSwap_title_subtitle", "getBackground_image_url", "getBackground_video_url", "getDeeplink", "getUrl", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class HeroItem {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String background_image_url;
                private final String background_video_url;
                private final String deeplink;
                private final String subtitle;
                private final boolean swap_title_subtitle;
                private final String title;
                private final String url;

                public /* synthetic */ HeroItem(int i10, String str, String str2, boolean z6, String str3, String str4, String str5, String str6, c1 c1Var) {
                    if (33 == (i10 & 33)) {
                        this.title = str;
                        if ((i10 & 2) == 0) {
                            this.subtitle = null;
                        } else {
                            this.subtitle = str2;
                        }
                        if ((i10 & 4) == 0) {
                            this.swap_title_subtitle = false;
                        } else {
                            this.swap_title_subtitle = z6;
                        }
                        if ((i10 & 8) == 0) {
                            this.background_image_url = null;
                        } else {
                            this.background_image_url = str3;
                        }
                        if ((i10 & 16) == 0) {
                            this.background_video_url = null;
                        } else {
                            this.background_video_url = str4;
                        }
                        this.deeplink = str5;
                        if ((i10 & 64) == 0) {
                            this.url = null;
                            return;
                        } else {
                            this.url = str6;
                            return;
                        }
                    }
                    t0.j(i10, 33, HomeV4Response$Section$HeroCarouselSection$HeroItem$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ HeroItem copy$default(HeroItem heroItem, String str, String str2, boolean z6, String str3, String str4, String str5, String str6, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = heroItem.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = heroItem.subtitle;
                    }
                    if ((i10 & 4) != 0) {
                        z6 = heroItem.swap_title_subtitle;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = heroItem.background_image_url;
                    }
                    if ((i10 & 16) != 0) {
                        str4 = heroItem.background_video_url;
                    }
                    if ((i10 & 32) != 0) {
                        str5 = heroItem.deeplink;
                    }
                    if ((i10 & 64) != 0) {
                        str6 = heroItem.url;
                    }
                    String str7 = str5;
                    String str8 = str6;
                    String str9 = str4;
                    boolean z10 = z6;
                    return heroItem.copy(str, str2, z10, str3, str9, str7, str8);
                }

                public static final /* synthetic */ void write$Self$data_release(HeroItem self, tr.b output, SerialDescriptor serialDesc) {
                    output.V(serialDesc, 0, self.title);
                    if (output.C(serialDesc) || self.subtitle != null) {
                        output.o(serialDesc, 1, g1.f34588a, self.subtitle);
                    }
                    if (output.C(serialDesc) || self.swap_title_subtitle) {
                        output.T(serialDesc, 2, self.swap_title_subtitle);
                    }
                    if (output.C(serialDesc) || self.background_image_url != null) {
                        output.o(serialDesc, 3, g1.f34588a, self.background_image_url);
                    }
                    if (output.C(serialDesc) || self.background_video_url != null) {
                        output.o(serialDesc, 4, g1.f34588a, self.background_video_url);
                    }
                    output.V(serialDesc, 5, self.deeplink);
                    if (output.C(serialDesc) || self.url != null) {
                        output.o(serialDesc, 6, g1.f34588a, self.url);
                    }
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getSwap_title_subtitle() {
                    return this.swap_title_subtitle;
                }

                /* renamed from: component4, reason: from getter */
                public final String getBackground_image_url() {
                    return this.background_image_url;
                }

                /* renamed from: component5, reason: from getter */
                public final String getBackground_video_url() {
                    return this.background_video_url;
                }

                /* renamed from: component6, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* renamed from: component7, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public final HeroItem copy(String title, String subtitle, boolean swap_title_subtitle, String background_image_url, String background_video_url, String deeplink, String url) {
                    title.getClass();
                    deeplink.getClass();
                    return new HeroItem(title, subtitle, swap_title_subtitle, background_image_url, background_video_url, deeplink, url);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HeroItem)) {
                        return false;
                    }
                    HeroItem heroItem = (HeroItem) other;
                    if (m.c(this.title, heroItem.title) && m.c(this.subtitle, heroItem.subtitle) && this.swap_title_subtitle == heroItem.swap_title_subtitle && m.c(this.background_image_url, heroItem.background_image_url) && m.c(this.background_video_url, heroItem.background_video_url) && m.c(this.deeplink, heroItem.deeplink) && m.c(this.url, heroItem.url)) {
                        return true;
                    }
                    return false;
                }

                public final String getBackground_image_url() {
                    return this.background_image_url;
                }

                public final String getBackground_video_url() {
                    return this.background_video_url;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final boolean getSwap_title_subtitle() {
                    return this.swap_title_subtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    int hashCode4 = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    int i10 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int f10 = com.google.android.gms.internal.play_billing.b.f((hashCode4 + hashCode) * 31, 31, this.swap_title_subtitle);
                    String str2 = this.background_image_url;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i11 = (f10 + hashCode2) * 31;
                    String str3 = this.background_video_url;
                    if (str3 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = str3.hashCode();
                    }
                    int c5 = j0.c.c((i11 + hashCode3) * 31, 31, this.deeplink);
                    String str4 = this.url;
                    if (str4 != null) {
                        i10 = str4.hashCode();
                    }
                    return c5 + i10;
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.subtitle;
                    boolean z6 = this.swap_title_subtitle;
                    String str3 = this.background_image_url;
                    String str4 = this.background_video_url;
                    String str5 = this.deeplink;
                    String str6 = this.url;
                    StringBuilder s10 = defpackage.f.s("HeroItem(title=", str, ", subtitle=", str2, ", swap_title_subtitle=");
                    defpackage.f.z(s10, z6, ", background_image_url=", str3, ", background_video_url=");
                    defpackage.f.x(s10, str4, ", deeplink=", str5, ", url=");
                    return defpackage.f.l(str6, Separators.RPAREN, s10);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection$HeroItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection$HeroItem;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV4Response$Section$HeroCarouselSection$HeroItem$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public HeroItem(String str, String str2, boolean z6, String str3, String str4, String str5, String str6) {
                    str.getClass();
                    str5.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.swap_title_subtitle = z6;
                    this.background_image_url = str3;
                    this.background_video_url = str4;
                    this.deeplink = str5;
                    this.url = str6;
                }

                public /* synthetic */ HeroItem(String str, String str2, boolean z6, String str3, String str4, String str5, String str6, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, str5, (i10 & 64) != 0 ? null : str6);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$HeroCarouselSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$HeroCarouselSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public HeroCarouselSection(String str, String str2, List<HeroItem> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.items = list;
            }

            public /* synthetic */ HeroCarouselSection(String str, String str2, List list, int i10, kotlin.jvm.internal.f fVar) {
                this(str, (i10 & 2) != 0 ? null : str2, list);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class MiniReadGridSection implements Section {
            private final List<Item> items;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {sn.a.d(i.f31597b, new b(28))};

            public /* synthetic */ MiniReadGridSection(int i10, List list, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.items = list;
                } else {
                    t0.j(i10, 1, HomeV4Response$Section$MiniReadGridSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV4Response$Section$MiniReadGridSection$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MiniReadGridSection copy$default(MiniReadGridSection miniReadGridSection, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = miniReadGridSection.items;
                }
                return miniReadGridSection.copy(list);
            }

            public final List<Item> component1() {
                return this.items;
            }

            public final MiniReadGridSection copy(List<Item> r22) {
                r22.getClass();
                return new MiniReadGridSection(r22);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof MiniReadGridSection) && m.c(this.items, ((MiniReadGridSection) other).items)) {
                    return true;
                }
                return false;
            }

            public final List<Item> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            public String toString() {
                return ib.i.k("MiniReadGridSection(items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection$Item;", "", "", "title", "image_url", "deeplink", "analytics_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getImage_url", "getDeeplink", "getAnalytics_id", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String analytics_id;
                private final String deeplink;
                private final String image_url;
                private final String title;

                public /* synthetic */ Item(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
                    if (7 == (i10 & 7)) {
                        this.title = str;
                        this.image_url = str2;
                        this.deeplink = str3;
                        if ((i10 & 8) == 0) {
                            this.analytics_id = null;
                            return;
                        } else {
                            this.analytics_id = str4;
                            return;
                        }
                    }
                    t0.j(i10, 7, HomeV4Response$Section$MiniReadGridSection$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.image_url;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = item.deeplink;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = item.analytics_id;
                    }
                    return item.copy(str, str2, str3, str4);
                }

                public static final /* synthetic */ void write$Self$data_release(Item self, tr.b output, SerialDescriptor serialDesc) {
                    output.V(serialDesc, 0, self.title);
                    output.V(serialDesc, 1, self.image_url);
                    output.V(serialDesc, 2, self.deeplink);
                    if (output.C(serialDesc) || self.analytics_id != null) {
                        output.o(serialDesc, 3, g1.f34588a, self.analytics_id);
                    }
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getImage_url() {
                    return this.image_url;
                }

                /* renamed from: component3, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* renamed from: component4, reason: from getter */
                public final String getAnalytics_id() {
                    return this.analytics_id;
                }

                public final Item copy(String title, String image_url, String deeplink, String analytics_id) {
                    title.getClass();
                    image_url.getClass();
                    deeplink.getClass();
                    return new Item(title, image_url, deeplink, analytics_id);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.image_url, item.image_url) && m.c(this.deeplink, item.deeplink) && m.c(this.analytics_id, item.analytics_id)) {
                        return true;
                    }
                    return false;
                }

                public final String getAnalytics_id() {
                    return this.analytics_id;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getImage_url() {
                    return this.image_url;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode;
                    int c5 = j0.c.c(j0.c.c(this.title.hashCode() * 31, 31, this.image_url), 31, this.deeplink);
                    String str = this.analytics_id;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    return c5 + hashCode;
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.image_url;
                    return defpackage.f.n(defpackage.f.s("Item(title=", str, ", image_url=", str2, ", deeplink="), this.deeplink, ", analytics_id=", this.analytics_id, Separators.RPAREN);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV4Response$Section$MiniReadGridSection$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public Item(String str, String str2, String str3, String str4) {
                    ib.i.s(str, str2, str3);
                    this.title = str;
                    this.image_url = str2;
                    this.deeplink = str3;
                    this.analytics_id = str4;
                }

                public /* synthetic */ Item(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$MiniReadGridSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$MiniReadGridSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public MiniReadGridSection(List<Item> list) {
                list.getClass();
                this.items = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JP\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$HighlightedCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "title", "subtitle", "deeplink", "url", "", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "reads", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$HighlightedCarouselSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$HighlightedCarouselSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "getUrl", "Ljava/util/List;", "getReads", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HighlightedCarouselSection implements Section {
            private final String deeplink;
            private final List<ExploreReadResponseModel> reads;
            private final String subtitle;
            private final String title;
            private final String url;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, null, null, sn.a.d(i.f31597b, new b(26))};

            public /* synthetic */ HighlightedCarouselSection(int i10, String str, String str2, String str3, String str4, List list, c1 c1Var) {
                if (16 == (i10 & 16)) {
                    if ((i10 & 1) == 0) {
                        this.title = null;
                    } else {
                        this.title = str;
                    }
                    if ((i10 & 2) == 0) {
                        this.subtitle = null;
                    } else {
                        this.subtitle = str2;
                    }
                    if ((i10 & 4) == 0) {
                        this.deeplink = null;
                    } else {
                        this.deeplink = str3;
                    }
                    if ((i10 & 8) == 0) {
                        this.url = null;
                    } else {
                        this.url = str4;
                    }
                    this.reads = list;
                    return;
                }
                t0.j(i10, 16, HomeV4Response$Section$HighlightedCarouselSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
            }

            public static /* synthetic */ HighlightedCarouselSection copy$default(HighlightedCarouselSection highlightedCarouselSection, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = highlightedCarouselSection.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = highlightedCarouselSection.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = highlightedCarouselSection.deeplink;
                }
                if ((i10 & 8) != 0) {
                    str4 = highlightedCarouselSection.url;
                }
                if ((i10 & 16) != 0) {
                    list = highlightedCarouselSection.reads;
                }
                List list2 = list;
                String str5 = str3;
                return highlightedCarouselSection.copy(str, str2, str5, str4, list2);
            }

            public static final /* synthetic */ void write$Self$data_release(HighlightedCarouselSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                if (output.C(serialDesc) || self.title != null) {
                    output.o(serialDesc, 0, g1.f34588a, self.title);
                }
                if (output.C(serialDesc) || self.subtitle != null) {
                    output.o(serialDesc, 1, g1.f34588a, self.subtitle);
                }
                if (output.C(serialDesc) || self.deeplink != null) {
                    output.o(serialDesc, 2, g1.f34588a, self.deeplink);
                }
                if (output.C(serialDesc) || self.url != null) {
                    output.o(serialDesc, 3, g1.f34588a, self.url);
                }
                output.g(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.reads);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: component4, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final List<ExploreReadResponseModel> component5() {
                return this.reads;
            }

            public final HighlightedCarouselSection copy(String title, String subtitle, String deeplink, String url, List<ExploreReadResponseModel> reads) {
                reads.getClass();
                return new HighlightedCarouselSection(title, subtitle, deeplink, url, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HighlightedCarouselSection)) {
                    return false;
                }
                HighlightedCarouselSection highlightedCarouselSection = (HighlightedCarouselSection) other;
                if (m.c(this.title, highlightedCarouselSection.title) && m.c(this.subtitle, highlightedCarouselSection.subtitle) && m.c(this.deeplink, highlightedCarouselSection.deeplink) && m.c(this.url, highlightedCarouselSection.url) && m.c(this.reads, highlightedCarouselSection.reads)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreReadResponseModel> getReads() {
                return this.reads;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str3.hashCode();
                }
                int i13 = (i12 + hashCode3) * 31;
                String str4 = this.url;
                if (str4 != null) {
                    i10 = str4.hashCode();
                }
                return this.reads.hashCode() + ((i13 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                String str4 = this.url;
                List<ExploreReadResponseModel> list = this.reads;
                StringBuilder s10 = defpackage.f.s("HighlightedCarouselSection(title=", str, ", subtitle=", str2, ", deeplink=");
                defpackage.f.x(s10, str3, ", url=", str4, ", reads=");
                return z.h.e(s10, list, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$HighlightedCarouselSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$HighlightedCarouselSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$HighlightedCarouselSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public HighlightedCarouselSection(String str, String str2, String str3, String str4, List<ExploreReadResponseModel> list) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.url = str4;
                this.reads = list;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ HighlightedCarouselSection(String str, String str2, String str3, String str4, List list, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, r6, r7);
                List list2;
                String str5;
                str = (i10 & 1) != 0 ? null : str;
                str2 = (i10 & 2) != 0 ? null : str2;
                str3 = (i10 & 4) != 0 ? null : str3;
                if ((i10 & 8) != 0) {
                    list2 = list;
                    str5 = null;
                } else {
                    list2 = list;
                    str5 = str4;
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JP\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$MediumCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "title", "subtitle", "deeplink", "url", "", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "reads", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$MediumCarouselSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$MediumCarouselSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "getUrl", "Ljava/util/List;", "getReads", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class MediumCarouselSection implements Section {
            private final String deeplink;
            private final List<ExploreReadResponseModel> reads;
            private final String subtitle;
            private final String title;
            private final String url;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, null, null, sn.a.d(i.f31597b, new b(27))};

            public /* synthetic */ MediumCarouselSection(int i10, String str, String str2, String str3, String str4, List list, c1 c1Var) {
                if (16 == (i10 & 16)) {
                    if ((i10 & 1) == 0) {
                        this.title = null;
                    } else {
                        this.title = str;
                    }
                    if ((i10 & 2) == 0) {
                        this.subtitle = null;
                    } else {
                        this.subtitle = str2;
                    }
                    if ((i10 & 4) == 0) {
                        this.deeplink = null;
                    } else {
                        this.deeplink = str3;
                    }
                    if ((i10 & 8) == 0) {
                        this.url = null;
                    } else {
                        this.url = str4;
                    }
                    this.reads = list;
                    return;
                }
                t0.j(i10, 16, HomeV4Response$Section$MediumCarouselSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
            }

            public static /* synthetic */ MediumCarouselSection copy$default(MediumCarouselSection mediumCarouselSection, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = mediumCarouselSection.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = mediumCarouselSection.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = mediumCarouselSection.deeplink;
                }
                if ((i10 & 8) != 0) {
                    str4 = mediumCarouselSection.url;
                }
                if ((i10 & 16) != 0) {
                    list = mediumCarouselSection.reads;
                }
                List list2 = list;
                String str5 = str3;
                return mediumCarouselSection.copy(str, str2, str5, str4, list2);
            }

            public static final /* synthetic */ void write$Self$data_release(MediumCarouselSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                if (output.C(serialDesc) || self.title != null) {
                    output.o(serialDesc, 0, g1.f34588a, self.title);
                }
                if (output.C(serialDesc) || self.subtitle != null) {
                    output.o(serialDesc, 1, g1.f34588a, self.subtitle);
                }
                if (output.C(serialDesc) || self.deeplink != null) {
                    output.o(serialDesc, 2, g1.f34588a, self.deeplink);
                }
                if (output.C(serialDesc) || self.url != null) {
                    output.o(serialDesc, 3, g1.f34588a, self.url);
                }
                output.g(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.reads);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: component4, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final List<ExploreReadResponseModel> component5() {
                return this.reads;
            }

            public final MediumCarouselSection copy(String title, String subtitle, String deeplink, String url, List<ExploreReadResponseModel> reads) {
                reads.getClass();
                return new MediumCarouselSection(title, subtitle, deeplink, url, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MediumCarouselSection)) {
                    return false;
                }
                MediumCarouselSection mediumCarouselSection = (MediumCarouselSection) other;
                if (m.c(this.title, mediumCarouselSection.title) && m.c(this.subtitle, mediumCarouselSection.subtitle) && m.c(this.deeplink, mediumCarouselSection.deeplink) && m.c(this.url, mediumCarouselSection.url) && m.c(this.reads, mediumCarouselSection.reads)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreReadResponseModel> getReads() {
                return this.reads;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str3.hashCode();
                }
                int i13 = (i12 + hashCode3) * 31;
                String str4 = this.url;
                if (str4 != null) {
                    i10 = str4.hashCode();
                }
                return this.reads.hashCode() + ((i13 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                String str4 = this.url;
                List<ExploreReadResponseModel> list = this.reads;
                StringBuilder s10 = defpackage.f.s("MediumCarouselSection(title=", str, ", subtitle=", str2, ", deeplink=");
                defpackage.f.x(s10, str3, ", url=", str4, ", reads=");
                return z.h.e(s10, list, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$MediumCarouselSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$MediumCarouselSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$MediumCarouselSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public MediumCarouselSection(String str, String str2, String str3, String str4, List<ExploreReadResponseModel> list) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.url = str4;
                this.reads = list;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ MediumCarouselSection(String str, String str2, String str3, String str4, List list, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, r6, r7);
                List list2;
                String str5;
                str = (i10 & 1) != 0 ? null : str;
                str2 = (i10 & 2) != 0 ? null : str2;
                str3 = (i10 & 4) != 0 ? null : str3;
                if ((i10 & 8) != 0) {
                    list2 = list;
                    str5 = null;
                } else {
                    list2 = list;
                    str5 = str4;
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$RecentReadsSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$RecentReadsSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$RecentReadsSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class RecentReadsSection implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String title;

            public /* synthetic */ RecentReadsSection(int i10, String str, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.title = str;
                } else {
                    t0.j(i10, 1, HomeV4Response$Section$RecentReadsSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ RecentReadsSection copy$default(RecentReadsSection recentReadsSection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = recentReadsSection.title;
                }
                return recentReadsSection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final RecentReadsSection copy(String title) {
                title.getClass();
                return new RecentReadsSection(title);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof RecentReadsSection) && m.c(this.title, ((RecentReadsSection) other).title)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode();
            }

            public String toString() {
                return defpackage.f.C("RecentReadsSection(title=", this.title, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$RecentReadsSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$RecentReadsSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$RecentReadsSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public RecentReadsSection(String str) {
                str.getClass();
                this.title = str;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$StatsCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "title", "", "days_in_streak", "minutes_listened_today", "<init>", "(Ljava/lang/String;II)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;IILur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$StatsCarouselSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lio/elevenlabs/data/model/response/HomeV4Response$Section$StatsCarouselSection;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", TokenNames.I, "getDays_in_streak", "getMinutes_listened_today", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class StatsCarouselSection implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int days_in_streak;
            private final int minutes_listened_today;
            private final String title;

            public /* synthetic */ StatsCarouselSection(int i10, String str, int i11, int i12, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.days_in_streak = i11;
                    this.minutes_listened_today = i12;
                    return;
                }
                t0.j(i10, 7, HomeV4Response$Section$StatsCarouselSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ StatsCarouselSection copy$default(StatsCarouselSection statsCarouselSection, String str, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = statsCarouselSection.title;
                }
                if ((i12 & 2) != 0) {
                    i10 = statsCarouselSection.days_in_streak;
                }
                if ((i12 & 4) != 0) {
                    i11 = statsCarouselSection.minutes_listened_today;
                }
                return statsCarouselSection.copy(str, i10, i11);
            }

            public static final /* synthetic */ void write$Self$data_release(StatsCarouselSection self, tr.b output, SerialDescriptor serialDesc) {
                output.V(serialDesc, 0, self.title);
                output.P(1, self.days_in_streak, serialDesc);
                output.P(2, self.minutes_listened_today, serialDesc);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final int getDays_in_streak() {
                return this.days_in_streak;
            }

            /* renamed from: component3, reason: from getter */
            public final int getMinutes_listened_today() {
                return this.minutes_listened_today;
            }

            public final StatsCarouselSection copy(String title, int days_in_streak, int minutes_listened_today) {
                title.getClass();
                return new StatsCarouselSection(title, days_in_streak, minutes_listened_today);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatsCarouselSection)) {
                    return false;
                }
                StatsCarouselSection statsCarouselSection = (StatsCarouselSection) other;
                if (m.c(this.title, statsCarouselSection.title) && this.days_in_streak == statsCarouselSection.days_in_streak && this.minutes_listened_today == statsCarouselSection.minutes_listened_today) {
                    return true;
                }
                return false;
            }

            public final int getDays_in_streak() {
                return this.days_in_streak;
            }

            public final int getMinutes_listened_today() {
                return this.minutes_listened_today;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return Integer.hashCode(this.minutes_listened_today) + j0.c.b(this.days_in_streak, this.title.hashCode() * 31, 31);
            }

            public String toString() {
                String str = this.title;
                return defpackage.f.f(this.minutes_listened_today, Separators.RPAREN, android.gov.nist.javax.sip.header.a.o(this.days_in_streak, "StatsCarouselSection(title=", str, ", days_in_streak=", ", minutes_listened_today="));
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$StatsCarouselSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$StatsCarouselSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$StatsCarouselSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public StatsCarouselSection(String str, int i10, int i11) {
                str.getClass();
                this.title = str;
                this.days_in_streak = i10;
                this.minutes_listened_today = i11;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$WarningSection;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "", "markdown", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV4Response$Section$WarningSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV4Response$Section$WarningSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMarkdown", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class WarningSection implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String markdown;

            public /* synthetic */ WarningSection(int i10, String str, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.markdown = str;
                } else {
                    t0.j(i10, 1, HomeV4Response$Section$WarningSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ WarningSection copy$default(WarningSection warningSection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = warningSection.markdown;
                }
                return warningSection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMarkdown() {
                return this.markdown;
            }

            public final WarningSection copy(String markdown) {
                markdown.getClass();
                return new WarningSection(markdown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof WarningSection) && m.c(this.markdown, ((WarningSection) other).markdown)) {
                    return true;
                }
                return false;
            }

            public final String getMarkdown() {
                return this.markdown;
            }

            public int hashCode() {
                return this.markdown.hashCode();
            }

            public String toString() {
                return defpackage.f.C("WarningSection(markdown=", this.markdown, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Section$WarningSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section$WarningSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV4Response$Section$WarningSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public WarningSection(String str) {
                str.getClass();
                this.markdown = str;
            }
        }
    }

    public /* synthetic */ HomeV4Response(int i10, List list, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.sections = list;
        } else {
            t0.j(i10, 1, HomeV4Response$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleHomeV4SectionsSerializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeV4Response copy$default(HomeV4Response homeV4Response, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homeV4Response.sections;
        }
        return homeV4Response.copy(list);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final HomeV4Response copy(List<? extends Section> sections) {
        sections.getClass();
        return new HomeV4Response(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof HomeV4Response) && m.c(this.sections, ((HomeV4Response) other).sections)) {
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
        return ib.i.k("HomeV4Response(sections=", Separators.RPAREN, this.sections);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV4Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV4Response;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return HomeV4Response$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(with = BackwardCompatibleHomeV4SectionsSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeV4Response(List<? extends Section> list) {
        list.getClass();
        this.sections = list;
    }
}
