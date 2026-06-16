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
import p.n;
import qr.f;
import qr.g;
import sn.h;
import sn.i;
import tn.t;
import ur.c1;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0004/01.B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001aR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010\u001c¨\u00062"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response;", "", "", "welcome_message", "", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "sections", "Lio/elevenlabs/data/model/response/HomeV3Response$Subpage;", "subpages", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV3Response;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWelcome_message", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "getSubpages", "Companion", "Subpage", "Section", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class HomeV3Response {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Section> sections;
    private final List<Subpage> subpages;
    private final String welcome_message;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \f2\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "RecentReadsSection", "HomeActionList", "StatsCarousel", "CategoryReadsRow", "GenreTilesGridRowSection", "AnnouncementBannerCarouselSection", "MiniReadGridSection", "HighlightedCollectionsRowSection", "EmptyStateSection", "ReadFromFollowingSection", "Companion", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$CategoryReadsRow;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$EmptyStateSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$ReadFromFollowingSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$RecentReadsSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$StatsCarousel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Section {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.HomeV3Response.Section", f0Var.b(Section.class), new oo.d[]{f0Var.b(AnnouncementBannerCarouselSection.class), f0Var.b(CategoryReadsRow.class), f0Var.b(EmptyStateSection.class), f0Var.b(GenreTilesGridRowSection.class), f0Var.b(HighlightedCollectionsRowSection.class), f0Var.b(HomeActionList.class), f0Var.b(MiniReadGridSection.class), f0Var.b(ReadFromFollowingSection.class), f0Var.b(RecentReadsSection.class), f0Var.b(StatsCarousel.class)}, new KSerializer[]{HomeV3Response$Section$AnnouncementBannerCarouselSection$$serializer.INSTANCE, HomeV3Response$Section$CategoryReadsRow$$serializer.INSTANCE, HomeV3Response$Section$EmptyStateSection$$serializer.INSTANCE, HomeV3Response$Section$GenreTilesGridRowSection$$serializer.INSTANCE, HomeV3Response$Section$HighlightedCollectionsRowSection$$serializer.INSTANCE, HomeV3Response$Section$HomeActionList$$serializer.INSTANCE, HomeV3Response$Section$MiniReadGridSection$$serializer.INSTANCE, HomeV3Response$Section$ReadFromFollowingSection$$serializer.INSTANCE, HomeV3Response$Section$RecentReadsSection$$serializer.INSTANCE, HomeV3Response$Section$StatsCarousel$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*+)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class AnnouncementBannerCarouselSection implements Section {
            private final List<Item> items;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new b(15))};

            public /* synthetic */ AnnouncementBannerCarouselSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.items = list;
                } else {
                    t0.j(i10, 3, HomeV3Response$Section$AnnouncementBannerCarouselSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV3Response$Section$AnnouncementBannerCarouselSection$Item$$serializer.INSTANCE, 0);
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
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection$Item;", "", "", "image_url", "deeplink", "analytics_id", "eyebrow_text", "header_text", "button_text", "color_hex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage_url", "getDeeplink", "getAnalytics_id", "getEyebrow_text", "getHeader_text", "getButton_text", "getColor_hex", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                    if (127 == (i10 & 127)) {
                        this.image_url = str;
                        this.deeplink = str2;
                        this.analytics_id = str3;
                        this.eyebrow_text = str4;
                        this.header_text = str5;
                        this.button_text = str6;
                        this.color_hex = str7;
                        return;
                    }
                    t0.j(i10, 127, HomeV3Response$Section$AnnouncementBannerCarouselSection$Item$$serializer.INSTANCE.getDescriptor());
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
                    g1 g1Var = g1.f34588a;
                    output.o(serialDesc, 2, g1Var, self.analytics_id);
                    output.o(serialDesc, 3, g1Var, self.eyebrow_text);
                    output.o(serialDesc, 4, g1Var, self.header_text);
                    output.o(serialDesc, 5, g1Var, self.button_text);
                    output.o(serialDesc, 6, g1Var, self.color_hex);
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
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV3Response$Section$AnnouncementBannerCarouselSection$Item$$serializer.INSTANCE;
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
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$AnnouncementBannerCarouselSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$AnnouncementBannerCarouselSection$$serializer.INSTANCE;
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
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*+)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GenreTilesGridRowSection implements Section {
            private final List<Item> items;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new b(17))};

            public /* synthetic */ GenreTilesGridRowSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.items = list;
                } else {
                    t0.j(i10, 3, HomeV3Response$Section$GenreTilesGridRowSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV3Response$Section$GenreTilesGridRowSection$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GenreTilesGridRowSection copy$default(GenreTilesGridRowSection genreTilesGridRowSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = genreTilesGridRowSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = genreTilesGridRowSection.items;
                }
                return genreTilesGridRowSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(GenreTilesGridRowSection self, tr.b output, SerialDescriptor serialDesc) {
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

            public final GenreTilesGridRowSection copy(String title, List<Item> r32) {
                title.getClass();
                r32.getClass();
                return new GenreTilesGridRowSection(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenreTilesGridRowSection)) {
                    return false;
                }
                GenreTilesGridRowSection genreTilesGridRowSection = (GenreTilesGridRowSection) other;
                if (m.c(this.title, genreTilesGridRowSection.title) && m.c(this.items, genreTilesGridRowSection.items)) {
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
                return ib.i.j("GenreTilesGridRowSection(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection$Item;", "", "", "title", "icon_url", "deeplink", "analytics_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getIcon_url", "getDeeplink", "getAnalytics_id", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String analytics_id;
                private final String deeplink;
                private final String icon_url;
                private final String title;

                public /* synthetic */ Item(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
                    if (15 == (i10 & 15)) {
                        this.title = str;
                        this.icon_url = str2;
                        this.deeplink = str3;
                        this.analytics_id = str4;
                        return;
                    }
                    t0.j(i10, 15, HomeV3Response$Section$GenreTilesGridRowSection$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.icon_url;
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

                public final Item copy(String title, String icon_url, String deeplink, String analytics_id) {
                    title.getClass();
                    icon_url.getClass();
                    deeplink.getClass();
                    analytics_id.getClass();
                    return new Item(title, icon_url, deeplink, analytics_id);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.icon_url, item.icon_url) && m.c(this.deeplink, item.deeplink) && m.c(this.analytics_id, item.analytics_id)) {
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
                    return defpackage.f.n(defpackage.f.s("Item(title=", str, ", icon_url=", str2, ", deeplink="), this.deeplink, ", analytics_id=", this.analytics_id, Separators.RPAREN);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV3Response$Section$GenreTilesGridRowSection$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public Item(String str, String str2, String str3, String str4) {
                    j0.c.u(str, str2, str3, str4);
                    this.title = str;
                    this.icon_url = str2;
                    this.deeplink = str3;
                    this.analytics_id = str4;
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$GenreTilesGridRowSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$GenreTilesGridRowSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public GenreTilesGridRowSection(String str, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003*+)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HighlightedCollectionsRowSection implements Section {
            private final List<Item> items;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new b(18))};

            public /* synthetic */ HighlightedCollectionsRowSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.items = list;
                } else {
                    t0.j(i10, 3, HomeV3Response$Section$HighlightedCollectionsRowSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV3Response$Section$HighlightedCollectionsRowSection$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HighlightedCollectionsRowSection copy$default(HighlightedCollectionsRowSection highlightedCollectionsRowSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = highlightedCollectionsRowSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = highlightedCollectionsRowSection.items;
                }
                return highlightedCollectionsRowSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(HighlightedCollectionsRowSection self, tr.b output, SerialDescriptor serialDesc) {
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

            public final HighlightedCollectionsRowSection copy(String title, List<Item> r32) {
                title.getClass();
                r32.getClass();
                return new HighlightedCollectionsRowSection(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HighlightedCollectionsRowSection)) {
                    return false;
                }
                HighlightedCollectionsRowSection highlightedCollectionsRowSection = (HighlightedCollectionsRowSection) other;
                if (m.c(this.title, highlightedCollectionsRowSection.title) && m.c(this.items, highlightedCollectionsRowSection.items)) {
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
                return ib.i.j("HighlightedCollectionsRowSection(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection$Item;", "", "", "title", "subtitle", "deeplink", "image_url", "analytics_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "getImage_url", "getAnalytics_id", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String analytics_id;
                private final String deeplink;
                private final String image_url;
                private final String subtitle;
                private final String title;

                public /* synthetic */ Item(int i10, String str, String str2, String str3, String str4, String str5, c1 c1Var) {
                    if (31 == (i10 & 31)) {
                        this.title = str;
                        this.subtitle = str2;
                        this.deeplink = str3;
                        this.image_url = str4;
                        this.analytics_id = str5;
                        return;
                    }
                    t0.j(i10, 31, HomeV3Response$Section$HighlightedCollectionsRowSection$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.subtitle;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = item.deeplink;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = item.image_url;
                    }
                    if ((i10 & 16) != 0) {
                        str5 = item.analytics_id;
                    }
                    String str6 = str5;
                    String str7 = str3;
                    return item.copy(str, str2, str7, str4, str6);
                }

                public static final /* synthetic */ void write$Self$data_release(Item self, tr.b output, SerialDescriptor serialDesc) {
                    output.V(serialDesc, 0, self.title);
                    output.o(serialDesc, 1, g1.f34588a, self.subtitle);
                    output.V(serialDesc, 2, self.deeplink);
                    output.V(serialDesc, 3, self.image_url);
                    output.V(serialDesc, 4, self.analytics_id);
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
                public final String getImage_url() {
                    return this.image_url;
                }

                /* renamed from: component5, reason: from getter */
                public final String getAnalytics_id() {
                    return this.analytics_id;
                }

                public final Item copy(String title, String subtitle, String deeplink, String image_url, String analytics_id) {
                    title.getClass();
                    deeplink.getClass();
                    image_url.getClass();
                    analytics_id.getClass();
                    return new Item(title, subtitle, deeplink, image_url, analytics_id);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.subtitle, item.subtitle) && m.c(this.deeplink, item.deeplink) && m.c(this.image_url, item.image_url) && m.c(this.analytics_id, item.analytics_id)) {
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
                    return this.analytics_id.hashCode() + j0.c.c(j0.c.c((hashCode2 + hashCode) * 31, 31, this.deeplink), 31, this.image_url);
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.subtitle;
                    String str3 = this.deeplink;
                    String str4 = this.image_url;
                    String str5 = this.analytics_id;
                    StringBuilder s10 = defpackage.f.s("Item(title=", str, ", subtitle=", str2, ", deeplink=");
                    defpackage.f.x(s10, str3, ", image_url=", str4, ", analytics_id=");
                    return defpackage.f.l(str5, Separators.RPAREN, s10);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV3Response$Section$HighlightedCollectionsRowSection$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public Item(String str, String str2, String str3, String str4, String str5) {
                    j0.c.u(str, str3, str4, str5);
                    this.title = str;
                    this.subtitle = str2;
                    this.deeplink = str3;
                    this.image_url = str4;
                    this.analytics_id = str5;
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HighlightedCollectionsRowSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$HighlightedCollectionsRowSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public HighlightedCollectionsRowSection(String str, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.items = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-.,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b+\u0010\u0019¨\u0006/"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList$Item;", FirebaseAnalytics.Param.ITEMS, "type", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "getType", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeActionList implements Section {
            private final List<Item> items;
            private final String title;
            private final String type;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new b(19)), null};

            public /* synthetic */ HomeActionList(int i10, String str, List list, String str2, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.items = list;
                    this.type = str2;
                    return;
                }
                t0.j(i10, 7, HomeV3Response$Section$HomeActionList$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV3Response$Section$HomeActionList$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HomeActionList copy$default(HomeActionList homeActionList, String str, List list, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeActionList.title;
                }
                if ((i10 & 2) != 0) {
                    list = homeActionList.items;
                }
                if ((i10 & 4) != 0) {
                    str2 = homeActionList.type;
                }
                return homeActionList.copy(str, list, str2);
            }

            public static final /* synthetic */ void write$Self$data_release(HomeActionList self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.items);
                output.V(serialDesc, 2, self.type);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Item> component2() {
                return this.items;
            }

            /* renamed from: component3, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final HomeActionList copy(String title, List<Item> r32, String type) {
                title.getClass();
                r32.getClass();
                type.getClass();
                return new HomeActionList(title, r32, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeActionList)) {
                    return false;
                }
                HomeActionList homeActionList = (HomeActionList) other;
                if (m.c(this.title, homeActionList.title) && m.c(this.items, homeActionList.items) && m.c(this.type, homeActionList.type)) {
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

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode() + n.d(this.title.hashCode() * 31, 31, this.items);
            }

            public String toString() {
                String str = this.title;
                List<Item> list = this.items;
                String str2 = this.type;
                StringBuilder sb = new StringBuilder("HomeActionList(title=");
                sb.append(str);
                sb.append(", items=");
                sb.append(list);
                sb.append(", type=");
                return defpackage.f.l(str2, Separators.RPAREN, sb);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList$Item;", "", "", "title", "icon_url", "deeplink", "analytics_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getIcon_url", "getDeeplink", "getAnalytics_id", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String analytics_id;
                private final String deeplink;
                private final String icon_url;
                private final String title;

                public /* synthetic */ Item(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
                    if (15 == (i10 & 15)) {
                        this.title = str;
                        this.icon_url = str2;
                        this.deeplink = str3;
                        this.analytics_id = str4;
                        return;
                    }
                    t0.j(i10, 15, HomeV3Response$Section$HomeActionList$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.icon_url;
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

                public final Item copy(String title, String icon_url, String deeplink, String analytics_id) {
                    title.getClass();
                    icon_url.getClass();
                    deeplink.getClass();
                    analytics_id.getClass();
                    return new Item(title, icon_url, deeplink, analytics_id);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.icon_url, item.icon_url) && m.c(this.deeplink, item.deeplink) && m.c(this.analytics_id, item.analytics_id)) {
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
                    return defpackage.f.n(defpackage.f.s("Item(title=", str, ", icon_url=", str2, ", deeplink="), this.deeplink, ", analytics_id=", this.analytics_id, Separators.RPAREN);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV3Response$Section$HomeActionList$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public Item(String str, String str2, String str3, String str4) {
                    j0.c.u(str, str2, str3, str4);
                    this.title = str;
                    this.icon_url = str2;
                    this.deeplink = str3;
                    this.analytics_id = str4;
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$HomeActionList;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$HomeActionList$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public HomeActionList(String str, List<Item> list, String str2) {
                str.getClass();
                list.getClass();
                str2.getClass();
                this.title = str;
                this.items = list;
                this.type = str2;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class MiniReadGridSection implements Section {
            private final List<Item> items;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {sn.a.d(i.f31597b, new b(20))};

            public /* synthetic */ MiniReadGridSection(int i10, List list, c1 c1Var) {
                if (1 == (i10 & 1)) {
                    this.items = list;
                } else {
                    t0.j(i10, 1, HomeV3Response$Section$MiniReadGridSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(HomeV3Response$Section$MiniReadGridSection$Item$$serializer.INSTANCE, 0);
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
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection$Item;", "", "", "title", "image_url", "deeplink", "analytics_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection$Item;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getImage_url", "getDeeplink", "getAnalytics_id", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                    t0.j(i10, 7, HomeV3Response$Section$MiniReadGridSection$Item$$serializer.INSTANCE.getDescriptor());
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
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return HomeV3Response$Section$MiniReadGridSection$Item$$serializer.INSTANCE;
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
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$MiniReadGridSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$MiniReadGridSection$$serializer.INSTANCE;
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
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$CategoryReadsRow;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "title", "deeplink", "", "Lio/elevenlabs/data/model/response/BasicReadMeta;", "reads", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$CategoryReadsRow;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$CategoryReadsRow;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDeeplink", "Ljava/util/List;", "getReads", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class CategoryReadsRow implements Section {
            private final String deeplink;
            private final List<BasicReadMeta> reads;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new b(16))};

            public /* synthetic */ CategoryReadsRow(int i10, String str, String str2, List list, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.deeplink = str2;
                    this.reads = list;
                    return;
                }
                t0.j(i10, 7, HomeV3Response$Section$CategoryReadsRow$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(BasicReadMeta$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CategoryReadsRow copy$default(CategoryReadsRow categoryReadsRow, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = categoryReadsRow.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = categoryReadsRow.deeplink;
                }
                if ((i10 & 4) != 0) {
                    list = categoryReadsRow.reads;
                }
                return categoryReadsRow.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$data_release(CategoryReadsRow self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.V(serialDesc, 1, self.deeplink);
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.reads);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<BasicReadMeta> component3() {
                return this.reads;
            }

            public final CategoryReadsRow copy(String title, String deeplink, List<BasicReadMeta> reads) {
                title.getClass();
                deeplink.getClass();
                reads.getClass();
                return new CategoryReadsRow(title, deeplink, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CategoryReadsRow)) {
                    return false;
                }
                CategoryReadsRow categoryReadsRow = (CategoryReadsRow) other;
                if (m.c(this.title, categoryReadsRow.title) && m.c(this.deeplink, categoryReadsRow.deeplink) && m.c(this.reads, categoryReadsRow.reads)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<BasicReadMeta> getReads() {
                return this.reads;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.reads.hashCode() + j0.c.c(this.title.hashCode() * 31, 31, this.deeplink);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.deeplink;
                return z.h.e(defpackage.f.s("CategoryReadsRow(title=", str, ", deeplink=", str2, ", reads="), this.reads, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$CategoryReadsRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$CategoryReadsRow;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$CategoryReadsRow$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public CategoryReadsRow(String str, String str2, List<BasicReadMeta> list) {
                j0.c.w(str, str2, list);
                this.title = str;
                this.deeplink = str2;
                this.reads = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J<\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006-"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$EmptyStateSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "title", "subtitle", "button_text", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$EmptyStateSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$EmptyStateSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getButton_text", "getDeeplink", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class EmptyStateSection implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String button_text;
            private final String deeplink;
            private final String subtitle;
            private final String title;

            public /* synthetic */ EmptyStateSection(int i10, String str, String str2, String str3, String str4, c1 c1Var) {
                if (15 == (i10 & 15)) {
                    this.title = str;
                    this.subtitle = str2;
                    this.button_text = str3;
                    this.deeplink = str4;
                    return;
                }
                t0.j(i10, 15, HomeV3Response$Section$EmptyStateSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ EmptyStateSection copy$default(EmptyStateSection emptyStateSection, String str, String str2, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = emptyStateSection.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = emptyStateSection.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = emptyStateSection.button_text;
                }
                if ((i10 & 8) != 0) {
                    str4 = emptyStateSection.deeplink;
                }
                return emptyStateSection.copy(str, str2, str3, str4);
            }

            public static final /* synthetic */ void write$Self$data_release(EmptyStateSection self, tr.b output, SerialDescriptor serialDesc) {
                output.V(serialDesc, 0, self.title);
                output.V(serialDesc, 1, self.subtitle);
                g1 g1Var = g1.f34588a;
                output.o(serialDesc, 2, g1Var, self.button_text);
                output.o(serialDesc, 3, g1Var, self.deeplink);
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
            public final String getButton_text() {
                return this.button_text;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final EmptyStateSection copy(String title, String subtitle, String button_text, String deeplink) {
                title.getClass();
                subtitle.getClass();
                return new EmptyStateSection(title, subtitle, button_text, deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyStateSection)) {
                    return false;
                }
                EmptyStateSection emptyStateSection = (EmptyStateSection) other;
                if (m.c(this.title, emptyStateSection.title) && m.c(this.subtitle, emptyStateSection.subtitle) && m.c(this.button_text, emptyStateSection.button_text) && m.c(this.deeplink, emptyStateSection.deeplink)) {
                    return true;
                }
                return false;
            }

            public final String getButton_text() {
                return this.button_text;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int c5 = j0.c.c(this.title.hashCode() * 31, 31, this.subtitle);
                String str = this.button_text;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (c5 + hashCode) * 31;
                String str2 = this.deeplink;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i11 + i10;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                return defpackage.f.n(defpackage.f.s("EmptyStateSection(title=", str, ", subtitle=", str2, ", button_text="), this.button_text, ", deeplink=", this.deeplink, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$EmptyStateSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$EmptyStateSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$EmptyStateSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public EmptyStateSection(String str, String str2, String str3, String str4) {
                str.getClass();
                str2.getClass();
                this.title = str;
                this.subtitle = str2;
                this.button_text = str3;
                this.deeplink = str4;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$ReadFromFollowingSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "read", "", "followed_entity_type", "followed_entity_name", "", "released_on_unix", "<init>", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/response/ReadMetadataResponseModel;Ljava/lang/String;Ljava/lang/String;JLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$ReadFromFollowingSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "()J", "copy", "(Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;Ljava/lang/String;Ljava/lang/String;J)Lio/elevenlabs/data/model/response/HomeV3Response$Section$ReadFromFollowingSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "getRead", "Ljava/lang/String;", "getFollowed_entity_type", "getFollowed_entity_name", "J", "getReleased_on_unix", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadFromFollowingSection implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String followed_entity_name;
            private final String followed_entity_type;
            private final ReadMetadataResponseModel read;
            private final long released_on_unix;

            public /* synthetic */ ReadFromFollowingSection(int i10, ReadMetadataResponseModel readMetadataResponseModel, String str, String str2, long j4, c1 c1Var) {
                if (15 == (i10 & 15)) {
                    this.read = readMetadataResponseModel;
                    this.followed_entity_type = str;
                    this.followed_entity_name = str2;
                    this.released_on_unix = j4;
                    return;
                }
                t0.j(i10, 15, HomeV3Response$Section$ReadFromFollowingSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ ReadFromFollowingSection copy$default(ReadFromFollowingSection readFromFollowingSection, ReadMetadataResponseModel readMetadataResponseModel, String str, String str2, long j4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readMetadataResponseModel = readFromFollowingSection.read;
                }
                if ((i10 & 2) != 0) {
                    str = readFromFollowingSection.followed_entity_type;
                }
                if ((i10 & 4) != 0) {
                    str2 = readFromFollowingSection.followed_entity_name;
                }
                if ((i10 & 8) != 0) {
                    j4 = readFromFollowingSection.released_on_unix;
                }
                String str3 = str2;
                return readFromFollowingSection.copy(readMetadataResponseModel, str, str3, j4);
            }

            public static final /* synthetic */ void write$Self$data_release(ReadFromFollowingSection self, tr.b output, SerialDescriptor serialDesc) {
                output.g(serialDesc, 0, ReadMetadataResponseModel$$serializer.INSTANCE, self.read);
                output.o(serialDesc, 1, g1.f34588a, self.followed_entity_type);
                output.V(serialDesc, 2, self.followed_entity_name);
                output.h0(serialDesc, 3, self.released_on_unix);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadMetadataResponseModel getRead() {
                return this.read;
            }

            /* renamed from: component2, reason: from getter */
            public final String getFollowed_entity_type() {
                return this.followed_entity_type;
            }

            /* renamed from: component3, reason: from getter */
            public final String getFollowed_entity_name() {
                return this.followed_entity_name;
            }

            /* renamed from: component4, reason: from getter */
            public final long getReleased_on_unix() {
                return this.released_on_unix;
            }

            public final ReadFromFollowingSection copy(ReadMetadataResponseModel read, String followed_entity_type, String followed_entity_name, long released_on_unix) {
                read.getClass();
                followed_entity_name.getClass();
                return new ReadFromFollowingSection(read, followed_entity_type, followed_entity_name, released_on_unix);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadFromFollowingSection)) {
                    return false;
                }
                ReadFromFollowingSection readFromFollowingSection = (ReadFromFollowingSection) other;
                if (m.c(this.read, readFromFollowingSection.read) && m.c(this.followed_entity_type, readFromFollowingSection.followed_entity_type) && m.c(this.followed_entity_name, readFromFollowingSection.followed_entity_name) && this.released_on_unix == readFromFollowingSection.released_on_unix) {
                    return true;
                }
                return false;
            }

            public final String getFollowed_entity_name() {
                return this.followed_entity_name;
            }

            public final String getFollowed_entity_type() {
                return this.followed_entity_type;
            }

            public final ReadMetadataResponseModel getRead() {
                return this.read;
            }

            public final long getReleased_on_unix() {
                return this.released_on_unix;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.read.hashCode() * 31;
                String str = this.followed_entity_type;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return Long.hashCode(this.released_on_unix) + j0.c.c((hashCode2 + hashCode) * 31, 31, this.followed_entity_name);
            }

            public String toString() {
                return "ReadFromFollowingSection(read=" + this.read + ", followed_entity_type=" + this.followed_entity_type + ", followed_entity_name=" + this.followed_entity_name + ", released_on_unix=" + this.released_on_unix + Separators.RPAREN;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$ReadFromFollowingSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$ReadFromFollowingSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$ReadFromFollowingSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ReadFromFollowingSection(ReadMetadataResponseModel readMetadataResponseModel, String str, String str2, long j4) {
                readMetadataResponseModel.getClass();
                str2.getClass();
                this.read = readMetadataResponseModel;
                this.followed_entity_type = str;
                this.followed_entity_name = str2;
                this.released_on_unix = j4;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$RecentReadsSection;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$RecentReadsSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lio/elevenlabs/data/model/response/HomeV3Response$Section$RecentReadsSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
                    t0.j(i10, 1, HomeV3Response$Section$RecentReadsSection$$serializer.INSTANCE.getDescriptor());
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
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$RecentReadsSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$RecentReadsSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$RecentReadsSection$$serializer.INSTANCE;
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
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$StatsCarousel;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "", "days_in_streak", "minutes_listened_today", "<init>", "(II)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IIILur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Section$StatsCarousel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lio/elevenlabs/data/model/response/HomeV3Response$Section$StatsCarousel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", TokenNames.I, "getDays_in_streak", "getMinutes_listened_today", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class StatsCarousel implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int days_in_streak;
            private final int minutes_listened_today;

            public /* synthetic */ StatsCarousel(int i10, int i11, int i12, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.days_in_streak = i11;
                    this.minutes_listened_today = i12;
                } else {
                    t0.j(i10, 3, HomeV3Response$Section$StatsCarousel$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ StatsCarousel copy$default(StatsCarousel statsCarousel, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i10 = statsCarousel.days_in_streak;
                }
                if ((i12 & 2) != 0) {
                    i11 = statsCarousel.minutes_listened_today;
                }
                return statsCarousel.copy(i10, i11);
            }

            public static final /* synthetic */ void write$Self$data_release(StatsCarousel self, tr.b output, SerialDescriptor serialDesc) {
                output.P(0, self.days_in_streak, serialDesc);
                output.P(1, self.minutes_listened_today, serialDesc);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDays_in_streak() {
                return this.days_in_streak;
            }

            /* renamed from: component2, reason: from getter */
            public final int getMinutes_listened_today() {
                return this.minutes_listened_today;
            }

            public final StatsCarousel copy(int days_in_streak, int minutes_listened_today) {
                return new StatsCarousel(days_in_streak, minutes_listened_today);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatsCarousel)) {
                    return false;
                }
                StatsCarousel statsCarousel = (StatsCarousel) other;
                if (this.days_in_streak == statsCarousel.days_in_streak && this.minutes_listened_today == statsCarousel.minutes_listened_today) {
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

            public int hashCode() {
                return Integer.hashCode(this.minutes_listened_today) + (Integer.hashCode(this.days_in_streak) * 31);
            }

            public String toString() {
                return j0.c.l("StatsCarousel(days_in_streak=", this.days_in_streak, ", minutes_listened_today=", this.minutes_listened_today, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Section$StatsCarousel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section$StatsCarousel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return HomeV3Response$Section$StatsCarousel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public StatsCarousel(int i10, int i11) {
                this.days_in_streak = i10;
                this.minutes_listened_today = i11;
            }
        }
    }

    static {
        b bVar = new b(13);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, sn.a.d(iVar, bVar), sn.a.d(iVar, new b(14))};
    }

    public /* synthetic */ HomeV3Response(int i10, String str, List list, List list2, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.welcome_message = str;
            this.sections = list;
            if ((i10 & 4) == 0) {
                this.subpages = t.f33547a;
                return;
            } else {
                this.subpages = list2;
                return;
            }
        }
        t0.j(i10, 3, HomeV3Response$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleHomeV3SectionsSerializer();
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ur.d(HomeV3Response$Subpage$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeV3Response copy$default(HomeV3Response homeV3Response, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = homeV3Response.welcome_message;
        }
        if ((i10 & 2) != 0) {
            list = homeV3Response.sections;
        }
        if ((i10 & 4) != 0) {
            list2 = homeV3Response.subpages;
        }
        return homeV3Response.copy(str, list, list2);
    }

    public static final /* synthetic */ void write$Self$data_release(HomeV3Response self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.welcome_message);
        output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.sections);
        if (output.C(serialDesc) || !m.c(self.subpages, t.f33547a)) {
            output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.subpages);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getWelcome_message() {
        return this.welcome_message;
    }

    public final List<Section> component2() {
        return this.sections;
    }

    public final List<Subpage> component3() {
        return this.subpages;
    }

    public final HomeV3Response copy(String welcome_message, List<? extends Section> sections, List<Subpage> subpages) {
        welcome_message.getClass();
        sections.getClass();
        subpages.getClass();
        return new HomeV3Response(welcome_message, sections, subpages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeV3Response)) {
            return false;
        }
        HomeV3Response homeV3Response = (HomeV3Response) other;
        if (m.c(this.welcome_message, homeV3Response.welcome_message) && m.c(this.sections, homeV3Response.sections) && m.c(this.subpages, homeV3Response.subpages)) {
            return true;
        }
        return false;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public final List<Subpage> getSubpages() {
        return this.subpages;
    }

    public final String getWelcome_message() {
        return this.welcome_message;
    }

    public int hashCode() {
        return this.subpages.hashCode() + n.d(this.welcome_message.hashCode() * 31, 31, this.sections);
    }

    public String toString() {
        String str = this.welcome_message;
        List<Section> list = this.sections;
        List<Subpage> list2 = this.subpages;
        StringBuilder sb = new StringBuilder("HomeV3Response(welcome_message=");
        sb.append(str);
        sb.append(", sections=");
        sb.append(list);
        sb.append(", subpages=");
        return z.h.e(sb, list2, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0007\u0010\u001d¨\u0006-"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Subpage;", "", "", "id", "title", "icon_url", "", "is_local_only", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/HomeV3Response$Subpage;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/elevenlabs/data/model/response/HomeV3Response$Subpage;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getIcon_url", "Z", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final /* data */ class Subpage {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String icon_url;
        private final String id;
        private final boolean is_local_only;
        private final String title;

        public /* synthetic */ Subpage(int i10, String str, String str2, String str3, boolean z6, c1 c1Var) {
            if (15 == (i10 & 15)) {
                this.id = str;
                this.title = str2;
                this.icon_url = str3;
                this.is_local_only = z6;
                return;
            }
            t0.j(i10, 15, HomeV3Response$Subpage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }

        public static /* synthetic */ Subpage copy$default(Subpage subpage, String str, String str2, String str3, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subpage.id;
            }
            if ((i10 & 2) != 0) {
                str2 = subpage.title;
            }
            if ((i10 & 4) != 0) {
                str3 = subpage.icon_url;
            }
            if ((i10 & 8) != 0) {
                z6 = subpage.is_local_only;
            }
            return subpage.copy(str, str2, str3, z6);
        }

        public static final /* synthetic */ void write$Self$data_release(Subpage self, tr.b output, SerialDescriptor serialDesc) {
            output.V(serialDesc, 0, self.id);
            output.V(serialDesc, 1, self.title);
            output.V(serialDesc, 2, self.icon_url);
            output.T(serialDesc, 3, self.is_local_only);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIcon_url() {
            return this.icon_url;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIs_local_only() {
            return this.is_local_only;
        }

        public final Subpage copy(String id2, String title, String icon_url, boolean is_local_only) {
            id2.getClass();
            title.getClass();
            icon_url.getClass();
            return new Subpage(id2, title, icon_url, is_local_only);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subpage)) {
                return false;
            }
            Subpage subpage = (Subpage) other;
            if (m.c(this.id, subpage.id) && m.c(this.title, subpage.title) && m.c(this.icon_url, subpage.icon_url) && this.is_local_only == subpage.is_local_only) {
                return true;
            }
            return false;
        }

        public final String getIcon_url() {
            return this.icon_url;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.is_local_only) + j0.c.c(j0.c.c(this.id.hashCode() * 31, 31, this.title), 31, this.icon_url);
        }

        public final boolean is_local_only() {
            return this.is_local_only;
        }

        public String toString() {
            String str = this.id;
            String str2 = this.title;
            String str3 = this.icon_url;
            boolean z6 = this.is_local_only;
            StringBuilder s10 = defpackage.f.s("Subpage(id=", str, ", title=", str2, ", icon_url=");
            s10.append(str3);
            s10.append(", is_local_only=");
            s10.append(z6);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Subpage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response$Subpage;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return HomeV3Response$Subpage$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Subpage(String str, String str2, String str3, boolean z6) {
            ib.i.s(str, str2, str3);
            this.id = str;
            this.title = str2;
            this.icon_url = str3;
            this.is_local_only = z6;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/HomeV3Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/HomeV3Response;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return HomeV3Response$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(with = BackwardCompatibleHomeV3SectionsSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeV3Response(String str, List<? extends Section> list, List<Subpage> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.welcome_message = str;
        this.sections = list;
        this.subpages = list2;
    }

    public /* synthetic */ HomeV3Response(String str, List list, List list2, int i10, kotlin.jvm.internal.f fVar) {
        this(str, list, (i10 & 4) != 0 ? t.f33547a : list2);
    }
}
