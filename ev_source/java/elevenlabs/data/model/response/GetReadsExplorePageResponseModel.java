package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
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
import ur.c1;
import ur.g1;
import ur.h0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0004;<=:BY\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ$\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJf\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001dR4\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\u001f¨\u0006>"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "", "", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "sections", "", "language", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter;", "pageFilters", "", "filterOptions", "nextCursor", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "Ljava/lang/String;", "getLanguage", "getPageFilters", "getPageFilters$annotations", "Ljava/util/Map;", "getFilterOptions", "getFilterOptions$annotations", "getNextCursor", "getNextCursor$annotations", "Companion", "Section", "PageFilter", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class GetReadsExplorePageResponseModel {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, List<String>> filterOptions;
    private final String language;
    private final String nextCursor;
    private final List<PageFilter> pageFilters;
    private final List<Section> sections;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \t2\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "GetReadsExploreHighlightedCarouselResponseModel", "GetReadsExploreSmallGridResponseModel", "GetReadsExploreLargeGridResponseModel", "GetReadsExploreCardCollectionResponseModel", "GetReadsExploreHeroCarouselResponseModel", "GetReadsExploreVoiceCollectionResponseModel", "GetReadsExploreTitleSubtitleResponseModel", "Companion", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Section {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel.Section", f0Var.b(Section.class), new oo.d[]{f0Var.b(GetReadsExploreCardCollectionResponseModel.class), f0Var.b(GetReadsExploreHeroCarouselResponseModel.class), f0Var.b(GetReadsExploreHighlightedCarouselResponseModel.class), f0Var.b(GetReadsExploreLargeGridResponseModel.class), f0Var.b(GetReadsExploreSmallGridResponseModel.class), f0Var.b(GetReadsExploreTitleSubtitleResponseModel.class), f0Var.b(GetReadsExploreVoiceCollectionResponseModel.class)}, new KSerializer[]{GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel$$serializer.INSTANCE, GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$$serializer.INSTANCE, GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel$$serializer.INSTANCE, GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel$$serializer.INSTANCE, GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel$$serializer.INSTANCE, GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel$$serializer.INSTANCE, GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-.,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "title", "subtitle", "", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "Companion", "Item", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreHeroCarouselResponseModel implements Section {
            private final List<Item> items;
            private final String subtitle;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new b(1))};

            public /* synthetic */ GetReadsExploreHeroCarouselResponseModel(int i10, String str, String str2, List list, c1 c1Var) {
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
                t0.j(i10, 5, GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreHeroCarouselResponseModel copy$default(GetReadsExploreHeroCarouselResponseModel getReadsExploreHeroCarouselResponseModel, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreHeroCarouselResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreHeroCarouselResponseModel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    list = getReadsExploreHeroCarouselResponseModel.items;
                }
                return getReadsExploreHeroCarouselResponseModel.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$data_release(GetReadsExploreHeroCarouselResponseModel self, tr.b output, SerialDescriptor serialDesc) {
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

            public final List<Item> component3() {
                return this.items;
            }

            public final GetReadsExploreHeroCarouselResponseModel copy(String title, String subtitle, List<Item> r42) {
                title.getClass();
                r42.getClass();
                return new GetReadsExploreHeroCarouselResponseModel(title, subtitle, r42);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreHeroCarouselResponseModel)) {
                    return false;
                }
                GetReadsExploreHeroCarouselResponseModel getReadsExploreHeroCarouselResponseModel = (GetReadsExploreHeroCarouselResponseModel) other;
                if (m.c(this.title, getReadsExploreHeroCarouselResponseModel.title) && m.c(this.subtitle, getReadsExploreHeroCarouselResponseModel.subtitle) && m.c(this.items, getReadsExploreHeroCarouselResponseModel.items)) {
                    return true;
                }
                return false;
            }

            public final List<Item> getItems() {
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
                return z.h.e(defpackage.f.s("GetReadsExploreHeroCarouselResponseModel(title=", str, ", subtitle=", str2, ", items="), this.items, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001b¨\u00064"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item;", "", "", "title", "subtitle", "", "swap_title_subtitle", "background_image_url", "background_video_url", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Z", "getSwap_title_subtitle", "getBackground_image_url", "getBackground_video_url", "getDeeplink", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class Item {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String background_image_url;
                private final String background_video_url;
                private final String deeplink;
                private final String subtitle;
                private final boolean swap_title_subtitle;
                private final String title;

                public /* synthetic */ Item(int i10, String str, String str2, boolean z6, String str3, String str4, String str5, c1 c1Var) {
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
                        return;
                    }
                    t0.j(i10, 33, GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, String str2, boolean z6, String str3, String str4, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = item.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = item.subtitle;
                    }
                    if ((i10 & 4) != 0) {
                        z6 = item.swap_title_subtitle;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = item.background_image_url;
                    }
                    if ((i10 & 16) != 0) {
                        str4 = item.background_video_url;
                    }
                    if ((i10 & 32) != 0) {
                        str5 = item.deeplink;
                    }
                    String str6 = str4;
                    String str7 = str5;
                    return item.copy(str, str2, z6, str3, str6, str7);
                }

                public static final /* synthetic */ void write$Self$data_release(Item self, tr.b output, SerialDescriptor serialDesc) {
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

                public final Item copy(String title, String subtitle, boolean swap_title_subtitle, String background_image_url, String background_video_url, String deeplink) {
                    title.getClass();
                    deeplink.getClass();
                    return new Item(title, subtitle, swap_title_subtitle, background_image_url, background_video_url, deeplink);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    if (m.c(this.title, item.title) && m.c(this.subtitle, item.subtitle) && this.swap_title_subtitle == item.swap_title_subtitle && m.c(this.background_image_url, item.background_image_url) && m.c(this.background_video_url, item.background_video_url) && m.c(this.deeplink, item.deeplink)) {
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

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3 = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    int i10 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int f10 = com.google.android.gms.internal.play_billing.b.f((hashCode3 + hashCode) * 31, 31, this.swap_title_subtitle);
                    String str2 = this.background_image_url;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i11 = (f10 + hashCode2) * 31;
                    String str3 = this.background_video_url;
                    if (str3 != null) {
                        i10 = str3.hashCode();
                    }
                    return this.deeplink.hashCode() + ((i11 + i10) * 31);
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.subtitle;
                    boolean z6 = this.swap_title_subtitle;
                    String str3 = this.background_image_url;
                    String str4 = this.background_video_url;
                    String str5 = this.deeplink;
                    StringBuilder s10 = defpackage.f.s("Item(title=", str, ", subtitle=", str2, ", swap_title_subtitle=");
                    defpackage.f.z(s10, z6, ", background_image_url=", str3, ", background_video_url=");
                    return defpackage.f.n(s10, str4, ", deeplink=", str5, Separators.RPAREN);
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Item$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public Item(String str, String str2, boolean z6, String str3, String str4, String str5) {
                    str.getClass();
                    str5.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.swap_title_subtitle = z6;
                    this.background_image_url = str3;
                    this.background_video_url = str4;
                    this.deeplink = str5;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public /* synthetic */ Item(String str, String str2, boolean z6, String str3, String str4, String str5, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, z6, str3, r7, r8);
                    String str6;
                    String str7;
                    str2 = (i10 & 2) != 0 ? null : str2;
                    z6 = (i10 & 4) != 0 ? false : z6;
                    str3 = (i10 & 8) != 0 ? null : str3;
                    if ((i10 & 16) != 0) {
                        str6 = str5;
                        str7 = null;
                    } else {
                        str6 = str5;
                        str7 = str4;
                    }
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$Section$GetReadsExploreHeroCarouselResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public GetReadsExploreHeroCarouselResponseModel(String str, String str2, List<Item> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.items = list;
            }

            public /* synthetic */ GetReadsExploreHeroCarouselResponseModel(String str, String str2, List list, int i10, kotlin.jvm.internal.f fVar) {
                this(str, (i10 & 2) != 0 ? null : str2, list);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003-.,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "title", "subtitle", "", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "Companion", "VoiceItem", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreVoiceCollectionResponseModel implements Section {
            private final List<VoiceItem> items;
            private final String subtitle;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new b(5))};

            public /* synthetic */ GetReadsExploreVoiceCollectionResponseModel(int i10, String str, String str2, List list, c1 c1Var) {
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
                t0.j(i10, 5, GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreVoiceCollectionResponseModel copy$default(GetReadsExploreVoiceCollectionResponseModel getReadsExploreVoiceCollectionResponseModel, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreVoiceCollectionResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreVoiceCollectionResponseModel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    list = getReadsExploreVoiceCollectionResponseModel.items;
                }
                return getReadsExploreVoiceCollectionResponseModel.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$data_release(GetReadsExploreVoiceCollectionResponseModel self, tr.b output, SerialDescriptor serialDesc) {
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

            public final List<VoiceItem> component3() {
                return this.items;
            }

            public final GetReadsExploreVoiceCollectionResponseModel copy(String title, String subtitle, List<VoiceItem> r42) {
                title.getClass();
                r42.getClass();
                return new GetReadsExploreVoiceCollectionResponseModel(title, subtitle, r42);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreVoiceCollectionResponseModel)) {
                    return false;
                }
                GetReadsExploreVoiceCollectionResponseModel getReadsExploreVoiceCollectionResponseModel = (GetReadsExploreVoiceCollectionResponseModel) other;
                if (m.c(this.title, getReadsExploreVoiceCollectionResponseModel.title) && m.c(this.subtitle, getReadsExploreVoiceCollectionResponseModel.subtitle) && m.c(this.items, getReadsExploreVoiceCollectionResponseModel.items)) {
                    return true;
                }
                return false;
            }

            public final List<VoiceItem> getItems() {
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
                return z.h.e(defpackage.f.s("GetReadsExploreVoiceCollectionResponseModel(title=", str, ", subtitle=", str2, ", items="), this.items, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u001c¨\u00066"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem;", "", "", "voice_id", "voice_name", "voice_subtitle", "avatar_url", "", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "reads", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoice_id", "getVoice_name", "getVoice_subtitle", "getAvatar_url", "Ljava/util/List;", "getReads", "getDeeplink", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            @g
            /* loaded from: classes3.dex */
            public static final /* data */ class VoiceItem {
                private final String avatar_url;
                private final String deeplink;
                private final List<ExploreReadResponseModel> reads;
                private final String voice_id;
                private final String voice_name;
                private final String voice_subtitle;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final h[] $childSerializers = {null, null, null, null, sn.a.d(i.f31597b, new b(6)), null};

                public /* synthetic */ VoiceItem(int i10, String str, String str2, String str3, String str4, List list, String str5, c1 c1Var) {
                    if (19 == (i10 & 19)) {
                        this.voice_id = str;
                        this.voice_name = str2;
                        if ((i10 & 4) == 0) {
                            this.voice_subtitle = null;
                        } else {
                            this.voice_subtitle = str3;
                        }
                        if ((i10 & 8) == 0) {
                            this.avatar_url = null;
                        } else {
                            this.avatar_url = str4;
                        }
                        this.reads = list;
                        if ((i10 & 32) == 0) {
                            this.deeplink = null;
                            return;
                        } else {
                            this.deeplink = str5;
                            return;
                        }
                    }
                    t0.j(i10, 19, GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }

                public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                    return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
                }

                public static /* synthetic */ VoiceItem copy$default(VoiceItem voiceItem, String str, String str2, String str3, String str4, List list, String str5, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = voiceItem.voice_id;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = voiceItem.voice_name;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = voiceItem.voice_subtitle;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = voiceItem.avatar_url;
                    }
                    if ((i10 & 16) != 0) {
                        list = voiceItem.reads;
                    }
                    if ((i10 & 32) != 0) {
                        str5 = voiceItem.deeplink;
                    }
                    List list2 = list;
                    String str6 = str5;
                    return voiceItem.copy(str, str2, str3, str4, list2, str6);
                }

                public static final /* synthetic */ void write$Self$data_release(VoiceItem self, tr.b output, SerialDescriptor serialDesc) {
                    h[] hVarArr = $childSerializers;
                    output.V(serialDesc, 0, self.voice_id);
                    output.V(serialDesc, 1, self.voice_name);
                    if (output.C(serialDesc) || self.voice_subtitle != null) {
                        output.o(serialDesc, 2, g1.f34588a, self.voice_subtitle);
                    }
                    if (output.C(serialDesc) || self.avatar_url != null) {
                        output.o(serialDesc, 3, g1.f34588a, self.avatar_url);
                    }
                    output.g(serialDesc, 4, (KSerializer) hVarArr[4].getValue(), self.reads);
                    if (output.C(serialDesc) || self.deeplink != null) {
                        output.o(serialDesc, 5, g1.f34588a, self.deeplink);
                    }
                }

                /* renamed from: component1, reason: from getter */
                public final String getVoice_id() {
                    return this.voice_id;
                }

                /* renamed from: component2, reason: from getter */
                public final String getVoice_name() {
                    return this.voice_name;
                }

                /* renamed from: component3, reason: from getter */
                public final String getVoice_subtitle() {
                    return this.voice_subtitle;
                }

                /* renamed from: component4, reason: from getter */
                public final String getAvatar_url() {
                    return this.avatar_url;
                }

                public final List<ExploreReadResponseModel> component5() {
                    return this.reads;
                }

                /* renamed from: component6, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final VoiceItem copy(String voice_id, String voice_name, String voice_subtitle, String avatar_url, List<ExploreReadResponseModel> reads, String deeplink) {
                    voice_id.getClass();
                    voice_name.getClass();
                    reads.getClass();
                    return new VoiceItem(voice_id, voice_name, voice_subtitle, avatar_url, reads, deeplink);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof VoiceItem)) {
                        return false;
                    }
                    VoiceItem voiceItem = (VoiceItem) other;
                    if (m.c(this.voice_id, voiceItem.voice_id) && m.c(this.voice_name, voiceItem.voice_name) && m.c(this.voice_subtitle, voiceItem.voice_subtitle) && m.c(this.avatar_url, voiceItem.avatar_url) && m.c(this.reads, voiceItem.reads) && m.c(this.deeplink, voiceItem.deeplink)) {
                        return true;
                    }
                    return false;
                }

                public final String getAvatar_url() {
                    return this.avatar_url;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final List<ExploreReadResponseModel> getReads() {
                    return this.reads;
                }

                public final String getVoice_id() {
                    return this.voice_id;
                }

                public final String getVoice_name() {
                    return this.voice_name;
                }

                public final String getVoice_subtitle() {
                    return this.voice_subtitle;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int c5 = j0.c.c(this.voice_id.hashCode() * 31, 31, this.voice_name);
                    String str = this.voice_subtitle;
                    int i10 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i11 = (c5 + hashCode) * 31;
                    String str2 = this.avatar_url;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int d10 = n.d((i11 + hashCode2) * 31, 31, this.reads);
                    String str3 = this.deeplink;
                    if (str3 != null) {
                        i10 = str3.hashCode();
                    }
                    return d10 + i10;
                }

                public String toString() {
                    String str = this.voice_id;
                    String str2 = this.voice_name;
                    String str3 = this.voice_subtitle;
                    String str4 = this.avatar_url;
                    List<ExploreReadResponseModel> list = this.reads;
                    String str5 = this.deeplink;
                    StringBuilder s10 = defpackage.f.s("VoiceItem(voice_id=", str, ", voice_name=", str2, ", voice_subtitle=");
                    defpackage.f.x(s10, str3, ", avatar_url=", str4, ", reads=");
                    s10.append(list);
                    s10.append(", deeplink=");
                    s10.append(str5);
                    s10.append(Separators.RPAREN);
                    return s10.toString();
                }

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* loaded from: classes3.dex */
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                        this();
                    }

                    public final KSerializer serializer() {
                        return GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$VoiceItem$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public VoiceItem(String str, String str2, String str3, String str4, List<ExploreReadResponseModel> list, String str5) {
                    j0.c.w(str, str2, list);
                    this.voice_id = str;
                    this.voice_name = str2;
                    this.voice_subtitle = str3;
                    this.avatar_url = str4;
                    this.reads = list;
                    this.deeplink = str5;
                }

                public /* synthetic */ VoiceItem(String str, String str2, String str3, String str4, List list, String str5, int i10, kotlin.jvm.internal.f fVar) {
                    this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, list, (i10 & 32) != 0 ? null : str5);
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$Section$GetReadsExploreVoiceCollectionResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public GetReadsExploreVoiceCollectionResponseModel(String str, String str2, List<VoiceItem> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.items = list;
            }

            public /* synthetic */ GetReadsExploreVoiceCollectionResponseModel(String str, String str2, List list, int i10, kotlin.jvm.internal.f fVar) {
                this(str, (i10 & 2) != 0 ? null : str2, list);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "title", "subtitle", "deeplink", "", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "reads", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "Ljava/util/List;", "getReads", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreCardCollectionResponseModel implements Section {
            private final String deeplink;
            private final List<ExploreReadResponseModel> reads;
            private final String subtitle;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new b(0))};

            public /* synthetic */ GetReadsExploreCardCollectionResponseModel(int i10, String str, String str2, String str3, List list, c1 c1Var) {
                if (8 == (i10 & 8)) {
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
                    this.reads = list;
                    return;
                }
                t0.j(i10, 8, GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreCardCollectionResponseModel copy$default(GetReadsExploreCardCollectionResponseModel getReadsExploreCardCollectionResponseModel, String str, String str2, String str3, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreCardCollectionResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreCardCollectionResponseModel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreCardCollectionResponseModel.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreCardCollectionResponseModel.reads;
                }
                return getReadsExploreCardCollectionResponseModel.copy(str, str2, str3, list);
            }

            public static final /* synthetic */ void write$Self$data_release(GetReadsExploreCardCollectionResponseModel self, tr.b output, SerialDescriptor serialDesc) {
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
                output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.reads);
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

            public final List<ExploreReadResponseModel> component4() {
                return this.reads;
            }

            public final GetReadsExploreCardCollectionResponseModel copy(String title, String subtitle, String deeplink, List<ExploreReadResponseModel> reads) {
                reads.getClass();
                return new GetReadsExploreCardCollectionResponseModel(title, subtitle, deeplink, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreCardCollectionResponseModel)) {
                    return false;
                }
                GetReadsExploreCardCollectionResponseModel getReadsExploreCardCollectionResponseModel = (GetReadsExploreCardCollectionResponseModel) other;
                if (m.c(this.title, getReadsExploreCardCollectionResponseModel.title) && m.c(this.subtitle, getReadsExploreCardCollectionResponseModel.subtitle) && m.c(this.deeplink, getReadsExploreCardCollectionResponseModel.deeplink) && m.c(this.reads, getReadsExploreCardCollectionResponseModel.reads)) {
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

            public int hashCode() {
                int hashCode;
                int hashCode2;
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
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return this.reads.hashCode() + ((i12 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreReadResponseModel> list = this.reads;
                StringBuilder s10 = defpackage.f.s("GetReadsExploreCardCollectionResponseModel(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$Section$GetReadsExploreCardCollectionResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public GetReadsExploreCardCollectionResponseModel(String str, String str2, String str3, List<ExploreReadResponseModel> list) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
            }

            public /* synthetic */ GetReadsExploreCardCollectionResponseModel(String str, String str2, String str3, List list, int i10, kotlin.jvm.internal.f fVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, list);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "title", "subtitle", "deeplink", "", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "reads", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "Ljava/util/List;", "getReads", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreHighlightedCarouselResponseModel implements Section {
            private final String deeplink;
            private final List<ExploreReadResponseModel> reads;
            private final String subtitle;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new b(2))};

            public /* synthetic */ GetReadsExploreHighlightedCarouselResponseModel(int i10, String str, String str2, String str3, List list, c1 c1Var) {
                if (8 == (i10 & 8)) {
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
                    this.reads = list;
                    return;
                }
                t0.j(i10, 8, GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GetReadsExploreHighlightedCarouselResponseModel copy$default(GetReadsExploreHighlightedCarouselResponseModel getReadsExploreHighlightedCarouselResponseModel, String str, String str2, String str3, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreHighlightedCarouselResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreHighlightedCarouselResponseModel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreHighlightedCarouselResponseModel.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreHighlightedCarouselResponseModel.reads;
                }
                return getReadsExploreHighlightedCarouselResponseModel.copy(str, str2, str3, list);
            }

            public static final /* synthetic */ void write$Self$data_release(GetReadsExploreHighlightedCarouselResponseModel self, tr.b output, SerialDescriptor serialDesc) {
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
                output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.reads);
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

            public final List<ExploreReadResponseModel> component4() {
                return this.reads;
            }

            public final GetReadsExploreHighlightedCarouselResponseModel copy(String title, String subtitle, String deeplink, List<ExploreReadResponseModel> reads) {
                reads.getClass();
                return new GetReadsExploreHighlightedCarouselResponseModel(title, subtitle, deeplink, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreHighlightedCarouselResponseModel)) {
                    return false;
                }
                GetReadsExploreHighlightedCarouselResponseModel getReadsExploreHighlightedCarouselResponseModel = (GetReadsExploreHighlightedCarouselResponseModel) other;
                if (m.c(this.title, getReadsExploreHighlightedCarouselResponseModel.title) && m.c(this.subtitle, getReadsExploreHighlightedCarouselResponseModel.subtitle) && m.c(this.deeplink, getReadsExploreHighlightedCarouselResponseModel.deeplink) && m.c(this.reads, getReadsExploreHighlightedCarouselResponseModel.reads)) {
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

            public int hashCode() {
                int hashCode;
                int hashCode2;
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
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return this.reads.hashCode() + ((i12 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreReadResponseModel> list = this.reads;
                StringBuilder s10 = defpackage.f.s("GetReadsExploreHighlightedCarouselResponseModel(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$Section$GetReadsExploreHighlightedCarouselResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public GetReadsExploreHighlightedCarouselResponseModel(String str, String str2, String str3, List<ExploreReadResponseModel> list) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
            }

            public /* synthetic */ GetReadsExploreHighlightedCarouselResponseModel(String str, String str2, String str3, List list, int i10, kotlin.jvm.internal.f fVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, list);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JP\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010!¨\u00066"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "title", "subtitle", "deeplink", "", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "reads", "", "rows", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "Ljava/util/List;", "getReads", "Ljava/lang/Integer;", "getRows", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreLargeGridResponseModel implements Section {
            private final String deeplink;
            private final List<ExploreReadResponseModel> reads;
            private final Integer rows;
            private final String subtitle;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new b(3)), null};

            public /* synthetic */ GetReadsExploreLargeGridResponseModel(int i10, String str, String str2, String str3, List list, Integer num, c1 c1Var) {
                if (8 == (i10 & 8)) {
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
                    this.reads = list;
                    if ((i10 & 16) == 0) {
                        this.rows = null;
                        return;
                    } else {
                        this.rows = num;
                        return;
                    }
                }
                t0.j(i10, 8, GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
            }

            public static /* synthetic */ GetReadsExploreLargeGridResponseModel copy$default(GetReadsExploreLargeGridResponseModel getReadsExploreLargeGridResponseModel, String str, String str2, String str3, List list, Integer num, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreLargeGridResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreLargeGridResponseModel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreLargeGridResponseModel.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreLargeGridResponseModel.reads;
                }
                if ((i10 & 16) != 0) {
                    num = getReadsExploreLargeGridResponseModel.rows;
                }
                Integer num2 = num;
                String str4 = str3;
                return getReadsExploreLargeGridResponseModel.copy(str, str2, str4, list, num2);
            }

            public static final /* synthetic */ void write$Self$data_release(GetReadsExploreLargeGridResponseModel self, tr.b output, SerialDescriptor serialDesc) {
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
                output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.reads);
                if (output.C(serialDesc) || self.rows != null) {
                    output.o(serialDesc, 4, ur.f0.f34579a, self.rows);
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
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreReadResponseModel> component4() {
                return this.reads;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getRows() {
                return this.rows;
            }

            public final GetReadsExploreLargeGridResponseModel copy(String title, String subtitle, String deeplink, List<ExploreReadResponseModel> reads, Integer rows) {
                reads.getClass();
                return new GetReadsExploreLargeGridResponseModel(title, subtitle, deeplink, reads, rows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreLargeGridResponseModel)) {
                    return false;
                }
                GetReadsExploreLargeGridResponseModel getReadsExploreLargeGridResponseModel = (GetReadsExploreLargeGridResponseModel) other;
                if (m.c(this.title, getReadsExploreLargeGridResponseModel.title) && m.c(this.subtitle, getReadsExploreLargeGridResponseModel.subtitle) && m.c(this.deeplink, getReadsExploreLargeGridResponseModel.deeplink) && m.c(this.reads, getReadsExploreLargeGridResponseModel.reads) && m.c(this.rows, getReadsExploreLargeGridResponseModel.rows)) {
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

            public final Integer getRows() {
                return this.rows;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
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
                int d10 = n.d((i12 + hashCode3) * 31, 31, this.reads);
                Integer num = this.rows;
                if (num != null) {
                    i10 = num.hashCode();
                }
                return d10 + i10;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreReadResponseModel> list = this.reads;
                Integer num = this.rows;
                StringBuilder s10 = defpackage.f.s("GetReadsExploreLargeGridResponseModel(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(", rows=");
                s10.append(num);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$Section$GetReadsExploreLargeGridResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public GetReadsExploreLargeGridResponseModel(String str, String str2, String str3, List<ExploreReadResponseModel> list, Integer num) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
                this.rows = num;
            }

            public /* synthetic */ GetReadsExploreLargeGridResponseModel(String str, String str2, String str3, List list, Integer num, int i10, kotlin.jvm.internal.f fVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, list, (i10 & 16) != 0 ? null : num);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u001c¨\u0006;"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "title", "subtitle", "deeplink", "", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "reads", "", "rows", "deeplinkPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Integer;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDeeplink", "Ljava/util/List;", "getReads", "Ljava/lang/Integer;", "getRows", "getDeeplinkPosition", "getDeeplinkPosition$annotations", "()V", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreSmallGridResponseModel implements Section {
            private final String deeplink;
            private final String deeplinkPosition;
            private final List<ExploreReadResponseModel> reads;
            private final Integer rows;
            private final String subtitle;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new b(4)), null, null};

            public /* synthetic */ GetReadsExploreSmallGridResponseModel(int i10, String str, String str2, String str3, List list, Integer num, String str4, c1 c1Var) {
                if (8 == (i10 & 8)) {
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
                    this.reads = list;
                    if ((i10 & 16) == 0) {
                        this.rows = null;
                    } else {
                        this.rows = num;
                    }
                    if ((i10 & 32) == 0) {
                        this.deeplinkPosition = null;
                        return;
                    } else {
                        this.deeplinkPosition = str4;
                        return;
                    }
                }
                t0.j(i10, 8, GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(ExploreReadResponseModel$$serializer.INSTANCE, 0);
            }

            public static /* synthetic */ GetReadsExploreSmallGridResponseModel copy$default(GetReadsExploreSmallGridResponseModel getReadsExploreSmallGridResponseModel, String str, String str2, String str3, List list, Integer num, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreSmallGridResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreSmallGridResponseModel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = getReadsExploreSmallGridResponseModel.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = getReadsExploreSmallGridResponseModel.reads;
                }
                if ((i10 & 16) != 0) {
                    num = getReadsExploreSmallGridResponseModel.rows;
                }
                if ((i10 & 32) != 0) {
                    str4 = getReadsExploreSmallGridResponseModel.deeplinkPosition;
                }
                Integer num2 = num;
                String str5 = str4;
                return getReadsExploreSmallGridResponseModel.copy(str, str2, str3, list, num2, str5);
            }

            public static final /* synthetic */ void write$Self$data_release(GetReadsExploreSmallGridResponseModel self, tr.b output, SerialDescriptor serialDesc) {
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
                output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.reads);
                if (output.C(serialDesc) || self.rows != null) {
                    output.o(serialDesc, 4, ur.f0.f34579a, self.rows);
                }
                if (output.C(serialDesc) || self.deeplinkPosition != null) {
                    output.o(serialDesc, 5, g1.f34588a, self.deeplinkPosition);
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
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreReadResponseModel> component4() {
                return this.reads;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getRows() {
                return this.rows;
            }

            /* renamed from: component6, reason: from getter */
            public final String getDeeplinkPosition() {
                return this.deeplinkPosition;
            }

            public final GetReadsExploreSmallGridResponseModel copy(String title, String subtitle, String deeplink, List<ExploreReadResponseModel> reads, Integer rows, String deeplinkPosition) {
                reads.getClass();
                return new GetReadsExploreSmallGridResponseModel(title, subtitle, deeplink, reads, rows, deeplinkPosition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreSmallGridResponseModel)) {
                    return false;
                }
                GetReadsExploreSmallGridResponseModel getReadsExploreSmallGridResponseModel = (GetReadsExploreSmallGridResponseModel) other;
                if (m.c(this.title, getReadsExploreSmallGridResponseModel.title) && m.c(this.subtitle, getReadsExploreSmallGridResponseModel.subtitle) && m.c(this.deeplink, getReadsExploreSmallGridResponseModel.deeplink) && m.c(this.reads, getReadsExploreSmallGridResponseModel.reads) && m.c(this.rows, getReadsExploreSmallGridResponseModel.rows) && m.c(this.deeplinkPosition, getReadsExploreSmallGridResponseModel.deeplinkPosition)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final String getDeeplinkPosition() {
                return this.deeplinkPosition;
            }

            public final List<ExploreReadResponseModel> getReads() {
                return this.reads;
            }

            public final Integer getRows() {
                return this.rows;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
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
                int d10 = n.d((i12 + hashCode3) * 31, 31, this.reads);
                Integer num = this.rows;
                if (num == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num.hashCode();
                }
                int i13 = (d10 + hashCode4) * 31;
                String str4 = this.deeplinkPosition;
                if (str4 != null) {
                    i10 = str4.hashCode();
                }
                return i13 + i10;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreReadResponseModel> list = this.reads;
                Integer num = this.rows;
                String str4 = this.deeplinkPosition;
                StringBuilder s10 = defpackage.f.s("GetReadsExploreSmallGridResponseModel(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(", rows=");
                s10.append(num);
                s10.append(", deeplinkPosition=");
                s10.append(str4);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$Section$GetReadsExploreSmallGridResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getDeeplinkPosition$annotations() {
            }

            public GetReadsExploreSmallGridResponseModel(String str, String str2, String str3, List<ExploreReadResponseModel> list, Integer num, String str4) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
                this.rows = num;
                this.deeplinkPosition = str4;
            }

            public /* synthetic */ GetReadsExploreSmallGridResponseModel(String str, String str2, String str3, List list, Integer num, String str4, int i10, kotlin.jvm.internal.f fVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, list, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str4);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class GetReadsExploreTitleSubtitleResponseModel implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String subtitle;
            private final String title;

            public /* synthetic */ GetReadsExploreTitleSubtitleResponseModel(int i10, String str, String str2, c1 c1Var) {
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
            }

            public static /* synthetic */ GetReadsExploreTitleSubtitleResponseModel copy$default(GetReadsExploreTitleSubtitleResponseModel getReadsExploreTitleSubtitleResponseModel, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = getReadsExploreTitleSubtitleResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = getReadsExploreTitleSubtitleResponseModel.subtitle;
                }
                return getReadsExploreTitleSubtitleResponseModel.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$data_release(GetReadsExploreTitleSubtitleResponseModel self, tr.b output, SerialDescriptor serialDesc) {
                if (output.C(serialDesc) || self.title != null) {
                    output.o(serialDesc, 0, g1.f34588a, self.title);
                }
                if (output.C(serialDesc) || self.subtitle != null) {
                    output.o(serialDesc, 1, g1.f34588a, self.subtitle);
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

            public final GetReadsExploreTitleSubtitleResponseModel copy(String title, String subtitle) {
                return new GetReadsExploreTitleSubtitleResponseModel(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetReadsExploreTitleSubtitleResponseModel)) {
                    return false;
                }
                GetReadsExploreTitleSubtitleResponseModel getReadsExploreTitleSubtitleResponseModel = (GetReadsExploreTitleSubtitleResponseModel) other;
                if (m.c(this.title, getReadsExploreTitleSubtitleResponseModel.title) && m.c(this.subtitle, getReadsExploreTitleSubtitleResponseModel.subtitle)) {
                    return true;
                }
                return false;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i11 + i10;
            }

            public String toString() {
                return z.h.c("GetReadsExploreTitleSubtitleResponseModel(title=", this.title, ", subtitle=", this.subtitle, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$Section$GetReadsExploreTitleSubtitleResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public GetReadsExploreTitleSubtitleResponseModel() {
                this((String) null, (String) null, 3, (kotlin.jvm.internal.f) null);
            }

            public GetReadsExploreTitleSubtitleResponseModel(String str, String str2) {
                this.title = str;
                this.subtitle = str2;
            }

            public /* synthetic */ GetReadsExploreTitleSubtitleResponseModel(String str, String str2, int i10, kotlin.jvm.internal.f fVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
            }
        }
    }

    static {
        a aVar = new a(25);
        i iVar = i.f31597b;
        $childSerializers = new h[]{sn.a.d(iVar, aVar), null, sn.a.d(iVar, new a(26)), sn.a.d(iVar, new a(27)), null};
    }

    public /* synthetic */ GetReadsExplorePageResponseModel(int i10, List list, String str, List list2, Map map, String str2, c1 c1Var) {
        if (3 == (i10 & 3)) {
            this.sections = list;
            this.language = str;
            if ((i10 & 4) == 0) {
                this.pageFilters = null;
            } else {
                this.pageFilters = list2;
            }
            if ((i10 & 8) == 0) {
                this.filterOptions = null;
            } else {
                this.filterOptions = map;
            }
            if ((i10 & 16) == 0) {
                this.nextCursor = null;
                return;
            } else {
                this.nextCursor = str2;
                return;
            }
        }
        t0.j(i10, 3, GetReadsExplorePageResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleExploreSectionsSerializer();
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new BackwardCompatibleExplorePageFiltersSerializer();
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        g1 g1Var = g1.f34588a;
        return new h0(g1Var, new ur.d(g1Var, 0));
    }

    public static /* synthetic */ GetReadsExplorePageResponseModel copy$default(GetReadsExplorePageResponseModel getReadsExplorePageResponseModel, List list, String str, List list2, Map map, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getReadsExplorePageResponseModel.sections;
        }
        if ((i10 & 2) != 0) {
            str = getReadsExplorePageResponseModel.language;
        }
        if ((i10 & 4) != 0) {
            list2 = getReadsExplorePageResponseModel.pageFilters;
        }
        if ((i10 & 8) != 0) {
            map = getReadsExplorePageResponseModel.filterOptions;
        }
        if ((i10 & 16) != 0) {
            str2 = getReadsExplorePageResponseModel.nextCursor;
        }
        String str3 = str2;
        List list3 = list2;
        return getReadsExplorePageResponseModel.copy(list, str, list3, map, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(GetReadsExplorePageResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) hVarArr[0].getValue(), self.sections);
        output.V(serialDesc, 1, self.language);
        if (output.C(serialDesc) || self.pageFilters != null) {
            output.o(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.pageFilters);
        }
        if (output.C(serialDesc) || self.filterOptions != null) {
            output.o(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.filterOptions);
        }
        if (output.C(serialDesc) || self.nextCursor != null) {
            output.o(serialDesc, 4, g1.f34588a, self.nextCursor);
        }
    }

    public final List<Section> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final List<PageFilter> component3() {
        return this.pageFilters;
    }

    public final Map<String, List<String>> component4() {
        return this.filterOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final GetReadsExplorePageResponseModel copy(List<? extends Section> sections, String language, List<? extends PageFilter> pageFilters, Map<String, ? extends List<String>> filterOptions, String nextCursor) {
        sections.getClass();
        language.getClass();
        return new GetReadsExplorePageResponseModel(sections, language, pageFilters, filterOptions, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetReadsExplorePageResponseModel)) {
            return false;
        }
        GetReadsExplorePageResponseModel getReadsExplorePageResponseModel = (GetReadsExplorePageResponseModel) other;
        if (m.c(this.sections, getReadsExplorePageResponseModel.sections) && m.c(this.language, getReadsExplorePageResponseModel.language) && m.c(this.pageFilters, getReadsExplorePageResponseModel.pageFilters) && m.c(this.filterOptions, getReadsExplorePageResponseModel.filterOptions) && m.c(this.nextCursor, getReadsExplorePageResponseModel.nextCursor)) {
            return true;
        }
        return false;
    }

    public final Map<String, List<String>> getFilterOptions() {
        return this.filterOptions;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<PageFilter> getPageFilters() {
        return this.pageFilters;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c5 = j0.c.c(this.sections.hashCode() * 31, 31, this.language);
        List<PageFilter> list = this.pageFilters;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        Map<String, List<String>> map = this.filterOptions;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.nextCursor;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        List<Section> list = this.sections;
        String str = this.language;
        List<PageFilter> list2 = this.pageFilters;
        Map<String, List<String>> map = this.filterOptions;
        String str2 = this.nextCursor;
        StringBuilder sb = new StringBuilder("GetReadsExplorePageResponseModel(sections=");
        sb.append(list);
        sb.append(", language=");
        sb.append(str);
        sb.append(", pageFilters=");
        sb.append(list2);
        sb.append(", filterOptions=");
        sb.append(map);
        sb.append(", nextCursor=");
        return defpackage.f.l(str2, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter;", "", "ExplorePageOneOptionFilterResponseModel", "ExplorePageMultiOptionFilterResponseModel", "Companion", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface PageFilter {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel.PageFilter", f0Var.b(PageFilter.class), new oo.d[]{f0Var.b(ExplorePageMultiOptionFilterResponseModel.class), f0Var.b(ExplorePageOneOptionFilterResponseModel.class)}, new KSerializer[]{GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel$$serializer.INSTANCE, GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter;", "", "title", SubscriberAttributeKt.JSON_NAME_KEY, "", "Lio/elevenlabs/data/model/response/KeyLabelResponseModel;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getKey", "Ljava/util/List;", "getOptions", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class ExplorePageMultiOptionFilterResponseModel implements PageFilter {
            private final String key;
            private final List<KeyLabelResponseModel> options;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new a(28))};

            public /* synthetic */ ExplorePageMultiOptionFilterResponseModel(int i10, String str, String str2, List list, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.key = str2;
                    this.options = list;
                    return;
                }
                t0.j(i10, 7, GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(KeyLabelResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ExplorePageMultiOptionFilterResponseModel copy$default(ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = explorePageMultiOptionFilterResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = explorePageMultiOptionFilterResponseModel.key;
                }
                if ((i10 & 4) != 0) {
                    list = explorePageMultiOptionFilterResponseModel.options;
                }
                return explorePageMultiOptionFilterResponseModel.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$data_release(ExplorePageMultiOptionFilterResponseModel self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.V(serialDesc, 1, self.key);
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.options);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final List<KeyLabelResponseModel> component3() {
                return this.options;
            }

            public final ExplorePageMultiOptionFilterResponseModel copy(String title, String r32, List<KeyLabelResponseModel> options) {
                title.getClass();
                r32.getClass();
                options.getClass();
                return new ExplorePageMultiOptionFilterResponseModel(title, r32, options);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExplorePageMultiOptionFilterResponseModel)) {
                    return false;
                }
                ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel = (ExplorePageMultiOptionFilterResponseModel) other;
                if (m.c(this.title, explorePageMultiOptionFilterResponseModel.title) && m.c(this.key, explorePageMultiOptionFilterResponseModel.key) && m.c(this.options, explorePageMultiOptionFilterResponseModel.options)) {
                    return true;
                }
                return false;
            }

            public final String getKey() {
                return this.key;
            }

            public final List<KeyLabelResponseModel> getOptions() {
                return this.options;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.options.hashCode() + j0.c.c(this.title.hashCode() * 31, 31, this.key);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.key;
                return z.h.e(defpackage.f.s("ExplorePageMultiOptionFilterResponseModel(title=", str, ", key=", str2, ", options="), this.options, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$PageFilter$ExplorePageMultiOptionFilterResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ExplorePageMultiOptionFilterResponseModel(String str, String str2, List<KeyLabelResponseModel> list) {
                j0.c.w(str, str2, list);
                this.title = str;
                this.key = str2;
                this.options = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter;", "", "title", SubscriberAttributeKt.JSON_NAME_KEY, "", "Lio/elevenlabs/data/model/response/KeyLabelResponseModel;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getKey", "Ljava/util/List;", "getOptions", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class ExplorePageOneOptionFilterResponseModel implements PageFilter {
            private final String key;
            private final List<KeyLabelResponseModel> options;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new a(29))};

            public /* synthetic */ ExplorePageOneOptionFilterResponseModel(int i10, String str, String str2, List list, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.key = str2;
                    this.options = list;
                    return;
                }
                t0.j(i10, 7, GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(KeyLabelResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ExplorePageOneOptionFilterResponseModel copy$default(ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = explorePageOneOptionFilterResponseModel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = explorePageOneOptionFilterResponseModel.key;
                }
                if ((i10 & 4) != 0) {
                    list = explorePageOneOptionFilterResponseModel.options;
                }
                return explorePageOneOptionFilterResponseModel.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$data_release(ExplorePageOneOptionFilterResponseModel self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.V(serialDesc, 1, self.key);
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.options);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            public final List<KeyLabelResponseModel> component3() {
                return this.options;
            }

            public final ExplorePageOneOptionFilterResponseModel copy(String title, String r32, List<KeyLabelResponseModel> options) {
                title.getClass();
                r32.getClass();
                options.getClass();
                return new ExplorePageOneOptionFilterResponseModel(title, r32, options);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExplorePageOneOptionFilterResponseModel)) {
                    return false;
                }
                ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel = (ExplorePageOneOptionFilterResponseModel) other;
                if (m.c(this.title, explorePageOneOptionFilterResponseModel.title) && m.c(this.key, explorePageOneOptionFilterResponseModel.key) && m.c(this.options, explorePageOneOptionFilterResponseModel.options)) {
                    return true;
                }
                return false;
            }

            public final String getKey() {
                return this.key;
            }

            public final List<KeyLabelResponseModel> getOptions() {
                return this.options;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.options.hashCode() + j0.c.c(this.title.hashCode() * 31, 31, this.key);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.key;
                return z.h.e(defpackage.f.s("ExplorePageOneOptionFilterResponseModel(title=", str, ", key=", str2, ", options="), this.options, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return GetReadsExplorePageResponseModel$PageFilter$ExplorePageOneOptionFilterResponseModel$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ExplorePageOneOptionFilterResponseModel(String str, String str2, List<KeyLabelResponseModel> list) {
                j0.c.w(str, str2, list);
                this.title = str;
                this.key = str2;
                this.options = list;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return GetReadsExplorePageResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getFilterOptions$annotations() {
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    @g(with = BackwardCompatibleExplorePageFiltersSerializer.class)
    public static /* synthetic */ void getPageFilters$annotations() {
    }

    @g(with = BackwardCompatibleExploreSectionsSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetReadsExplorePageResponseModel(List<? extends Section> list, String str, List<? extends PageFilter> list2, Map<String, ? extends List<String>> map, String str2) {
        list.getClass();
        str.getClass();
        this.sections = list;
        this.language = str;
        this.pageFilters = list2;
        this.filterOptions = map;
        this.nextCursor = str2;
    }

    public /* synthetic */ GetReadsExplorePageResponseModel(List list, String str, List list2, Map map, String str2, int i10, kotlin.jvm.internal.f fVar) {
        this(list, str, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : str2);
    }
}
