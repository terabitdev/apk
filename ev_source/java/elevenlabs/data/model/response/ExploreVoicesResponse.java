package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
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
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse;", "", "", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "sections", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "getSections$annotations", "()V", "Companion", "Section", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ExploreVoicesResponse {
    private final List<Section> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {sn.a.d(i.f31597b, new io.elevenlabs.data.model.a(29))};

    public /* synthetic */ ExploreVoicesResponse(int i10, List list, c1 c1Var) {
        if (1 == (i10 & 1)) {
            this.sections = list;
        } else {
            t0.j(i10, 1, ExploreVoicesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new BackwardCompatibleExploreVoicesSerializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExploreVoicesResponse copy$default(ExploreVoicesResponse exploreVoicesResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = exploreVoicesResponse.sections;
        }
        return exploreVoicesResponse.copy(list);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final ExploreVoicesResponse copy(List<? extends Section> sections) {
        sections.getClass();
        return new ExploreVoicesResponse(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ExploreVoicesResponse) && m.c(this.sections, ((ExploreVoicesResponse) other).sections)) {
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
        return ib.i.k("ExploreVoicesResponse(sections=", Separators.RPAREN, this.sections);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u000b2\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "VoicePickerListSection", "HomeListSection", "VoicePickerGridSection", "HomeGridSection", "VoicePickerFeaturedSection", "HomeFeaturedSection", "VoicePickerVoiceCollectionSection", "HomeVoiceCollectionSection", "HomeVoiceDesignSection", "Companion", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeFeaturedSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeGridSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeListSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceCollectionSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceDesignSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerFeaturedSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerGridSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerListSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public interface Section {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final KSerializer serializer() {
                f0 f0Var = e0.f20562a;
                return new f("io.elevenlabs.data.model.response.ExploreVoicesResponse.Section", f0Var.b(Section.class), new oo.d[]{f0Var.b(HomeFeaturedSection.class), f0Var.b(HomeGridSection.class), f0Var.b(HomeListSection.class), f0Var.b(HomeVoiceCollectionSection.class), f0Var.b(HomeVoiceDesignSection.class), f0Var.b(VoicePickerFeaturedSection.class), f0Var.b(VoicePickerGridSection.class), f0Var.b(VoicePickerListSection.class), f0Var.b(VoicePickerVoiceCollectionSection.class)}, new KSerializer[]{ExploreVoicesResponse$Section$HomeFeaturedSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$HomeGridSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$HomeListSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$HomeVoiceCollectionSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$HomeVoiceDesignSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$VoicePickerFeaturedSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$VoicePickerGridSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$VoicePickerListSection$$serializer.INSTANCE, ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001b¨\u00062"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeFeaturedSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "voices", "featuredVoices", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeFeaturedSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeFeaturedSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getVoices", "getVoices$annotations", "getFeaturedVoices", "getFeaturedVoices$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeFeaturedSection implements Section {
            private static final h[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final List<VoiceItemResponseModel> featuredVoices;
            private final String title;
            private final List<VoiceItemResponseModel> voices;

            static {
                a aVar = new a(0);
                i iVar = i.f31597b;
                $childSerializers = new h[]{null, sn.a.d(iVar, aVar), sn.a.d(iVar, new a(1))};
            }

            public /* synthetic */ HomeFeaturedSection(int i10, String str, List list, List list2, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.voices = list;
                    this.featuredVoices = list2;
                    return;
                }
                t0.j(i10, 7, ExploreVoicesResponse$Section$HomeFeaturedSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HomeFeaturedSection copy$default(HomeFeaturedSection homeFeaturedSection, String str, List list, List list2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeFeaturedSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = homeFeaturedSection.voices;
                }
                if ((i10 & 4) != 0) {
                    list2 = homeFeaturedSection.featuredVoices;
                }
                return homeFeaturedSection.copy(str, list, list2);
            }

            public static final /* synthetic */ void write$Self$data_release(HomeFeaturedSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.voices);
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.featuredVoices);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> component2() {
                return this.voices;
            }

            public final List<VoiceItemResponseModel> component3() {
                return this.featuredVoices;
            }

            public final HomeFeaturedSection copy(String title, List<VoiceItemResponseModel> voices, List<VoiceItemResponseModel> featuredVoices) {
                title.getClass();
                voices.getClass();
                featuredVoices.getClass();
                return new HomeFeaturedSection(title, voices, featuredVoices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeFeaturedSection)) {
                    return false;
                }
                HomeFeaturedSection homeFeaturedSection = (HomeFeaturedSection) other;
                if (m.c(this.title, homeFeaturedSection.title) && m.c(this.voices, homeFeaturedSection.voices) && m.c(this.featuredVoices, homeFeaturedSection.featuredVoices)) {
                    return true;
                }
                return false;
            }

            public final List<VoiceItemResponseModel> getFeaturedVoices() {
                return this.featuredVoices;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.featuredVoices.hashCode() + n.d(this.title.hashCode() * 31, 31, this.voices);
            }

            public String toString() {
                String str = this.title;
                List<VoiceItemResponseModel> list = this.voices;
                List<VoiceItemResponseModel> list2 = this.featuredVoices;
                StringBuilder sb = new StringBuilder("HomeFeaturedSection(title=");
                sb.append(str);
                sb.append(", voices=");
                sb.append(list);
                sb.append(", featuredVoices=");
                return z.h.e(sb, list2, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeFeaturedSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeFeaturedSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$HomeFeaturedSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getFeaturedVoices$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public static /* synthetic */ void getVoices$annotations() {
            }

            public HomeFeaturedSection(String str, List<VoiceItemResponseModel> list, List<VoiceItemResponseModel> list2) {
                str.getClass();
                list.getClass();
                list2.getClass();
                this.title = str;
                this.voices = list;
                this.featuredVoices = list2;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeGridSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "voices", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeGridSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeGridSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getVoices", "getVoices$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeGridSection implements Section {
            private final String title;
            private final List<VoiceItemResponseModel> voices;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(2))};

            public /* synthetic */ HomeGridSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.voices = list;
                } else {
                    t0.j(i10, 3, ExploreVoicesResponse$Section$HomeGridSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HomeGridSection copy$default(HomeGridSection homeGridSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeGridSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = homeGridSection.voices;
                }
                return homeGridSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(HomeGridSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.voices);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> component2() {
                return this.voices;
            }

            public final HomeGridSection copy(String title, List<VoiceItemResponseModel> voices) {
                title.getClass();
                voices.getClass();
                return new HomeGridSection(title, voices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeGridSection)) {
                    return false;
                }
                HomeGridSection homeGridSection = (HomeGridSection) other;
                if (m.c(this.title, homeGridSection.title) && m.c(this.voices, homeGridSection.voices)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.voices.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("HomeGridSection(title=", this.title, ", voices=", Separators.RPAREN, this.voices);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeGridSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeGridSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$HomeGridSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public static /* synthetic */ void getVoices$annotations() {
            }

            public HomeGridSection(String str, List<VoiceItemResponseModel> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.voices = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeListSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "voices", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeListSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeListSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getVoices", "getVoices$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeListSection implements Section {
            private final String title;
            private final List<VoiceItemResponseModel> voices;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(3))};

            public /* synthetic */ HomeListSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.voices = list;
                } else {
                    t0.j(i10, 3, ExploreVoicesResponse$Section$HomeListSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HomeListSection copy$default(HomeListSection homeListSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeListSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = homeListSection.voices;
                }
                return homeListSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(HomeListSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.voices);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> component2() {
                return this.voices;
            }

            public final HomeListSection copy(String title, List<VoiceItemResponseModel> voices) {
                title.getClass();
                voices.getClass();
                return new HomeListSection(title, voices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeListSection)) {
                    return false;
                }
                HomeListSection homeListSection = (HomeListSection) other;
                if (m.c(this.title, homeListSection.title) && m.c(this.voices, homeListSection.voices)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.voices.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("HomeListSection(title=", this.title, ", voices=", Separators.RPAREN, this.voices);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeListSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeListSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$HomeListSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public static /* synthetic */ void getVoices$annotations() {
            }

            public HomeListSection(String str, List<VoiceItemResponseModel> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.voices = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceCollectionSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceCollectionResponseModel;", "collections", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceCollectionSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceCollectionSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getCollections", "getCollections$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeVoiceCollectionSection implements Section {
            private final List<VoiceCollectionResponseModel> collections;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(4))};

            public /* synthetic */ HomeVoiceCollectionSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.collections = list;
                } else {
                    t0.j(i10, 3, ExploreVoicesResponse$Section$HomeVoiceCollectionSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceCollectionResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HomeVoiceCollectionSection copy$default(HomeVoiceCollectionSection homeVoiceCollectionSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeVoiceCollectionSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = homeVoiceCollectionSection.collections;
                }
                return homeVoiceCollectionSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(HomeVoiceCollectionSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.collections);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceCollectionResponseModel> component2() {
                return this.collections;
            }

            public final HomeVoiceCollectionSection copy(String title, List<VoiceCollectionResponseModel> collections) {
                title.getClass();
                collections.getClass();
                return new HomeVoiceCollectionSection(title, collections);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeVoiceCollectionSection)) {
                    return false;
                }
                HomeVoiceCollectionSection homeVoiceCollectionSection = (HomeVoiceCollectionSection) other;
                if (m.c(this.title, homeVoiceCollectionSection.title) && m.c(this.collections, homeVoiceCollectionSection.collections)) {
                    return true;
                }
                return false;
            }

            public final List<VoiceCollectionResponseModel> getCollections() {
                return this.collections;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.collections.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("HomeVoiceCollectionSection(title=", this.title, ", collections=", Separators.RPAREN, this.collections);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceCollectionSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceCollectionSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$HomeVoiceCollectionSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getCollections$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public HomeVoiceCollectionSection(String str, List<VoiceCollectionResponseModel> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.collections = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\u0017¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceDesignSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "subtitle", "actionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceDesignSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceDesignSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getActionTitle", "getActionTitle$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeVoiceDesignSection implements Section {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String actionTitle;
            private final String subtitle;
            private final String title;

            public /* synthetic */ HomeVoiceDesignSection(int i10, String str, String str2, String str3, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.subtitle = str2;
                    this.actionTitle = str3;
                    return;
                }
                t0.j(i10, 7, ExploreVoicesResponse$Section$HomeVoiceDesignSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static /* synthetic */ HomeVoiceDesignSection copy$default(HomeVoiceDesignSection homeVoiceDesignSection, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeVoiceDesignSection.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = homeVoiceDesignSection.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = homeVoiceDesignSection.actionTitle;
                }
                return homeVoiceDesignSection.copy(str, str2, str3);
            }

            public static final /* synthetic */ void write$Self$data_release(HomeVoiceDesignSection self, tr.b output, SerialDescriptor serialDesc) {
                output.V(serialDesc, 0, self.title);
                output.V(serialDesc, 1, self.subtitle);
                output.V(serialDesc, 2, self.actionTitle);
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
            public final String getActionTitle() {
                return this.actionTitle;
            }

            public final HomeVoiceDesignSection copy(String title, String subtitle, String actionTitle) {
                title.getClass();
                subtitle.getClass();
                actionTitle.getClass();
                return new HomeVoiceDesignSection(title, subtitle, actionTitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeVoiceDesignSection)) {
                    return false;
                }
                HomeVoiceDesignSection homeVoiceDesignSection = (HomeVoiceDesignSection) other;
                if (m.c(this.title, homeVoiceDesignSection.title) && m.c(this.subtitle, homeVoiceDesignSection.subtitle) && m.c(this.actionTitle, homeVoiceDesignSection.actionTitle)) {
                    return true;
                }
                return false;
            }

            public final String getActionTitle() {
                return this.actionTitle;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.actionTitle.hashCode() + j0.c.c(this.title.hashCode() * 31, 31, this.subtitle);
            }

            public String toString() {
                return defpackage.f.l(this.actionTitle, Separators.RPAREN, defpackage.f.s("HomeVoiceDesignSection(title=", this.title, ", subtitle=", this.subtitle, ", actionTitle="));
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceDesignSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$HomeVoiceDesignSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$HomeVoiceDesignSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getActionTitle$annotations() {
            }

            public static /* synthetic */ void getSubtitle$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public HomeVoiceDesignSection(String str, String str2, String str3) {
                ib.i.s(str, str2, str3);
                this.title = str;
                this.subtitle = str2;
                this.actionTitle = str3;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001bR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001b¨\u00062"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerFeaturedSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "voices", "featuredVoices", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerFeaturedSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerFeaturedSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getVoices", "getVoices$annotations", "getFeaturedVoices", "getFeaturedVoices$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class VoicePickerFeaturedSection implements Section {
            private static final h[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final List<VoiceItemResponseModel> featuredVoices;
            private final String title;
            private final List<VoiceItemResponseModel> voices;

            static {
                a aVar = new a(5);
                i iVar = i.f31597b;
                $childSerializers = new h[]{null, sn.a.d(iVar, aVar), sn.a.d(iVar, new a(6))};
            }

            public /* synthetic */ VoicePickerFeaturedSection(int i10, String str, List list, List list2, c1 c1Var) {
                if (7 == (i10 & 7)) {
                    this.title = str;
                    this.voices = list;
                    this.featuredVoices = list2;
                    return;
                }
                t0.j(i10, 7, ExploreVoicesResponse$Section$VoicePickerFeaturedSection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoicePickerFeaturedSection copy$default(VoicePickerFeaturedSection voicePickerFeaturedSection, String str, List list, List list2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voicePickerFeaturedSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = voicePickerFeaturedSection.voices;
                }
                if ((i10 & 4) != 0) {
                    list2 = voicePickerFeaturedSection.featuredVoices;
                }
                return voicePickerFeaturedSection.copy(str, list, list2);
            }

            public static final /* synthetic */ void write$Self$data_release(VoicePickerFeaturedSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.voices);
                output.g(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.featuredVoices);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> component2() {
                return this.voices;
            }

            public final List<VoiceItemResponseModel> component3() {
                return this.featuredVoices;
            }

            public final VoicePickerFeaturedSection copy(String title, List<VoiceItemResponseModel> voices, List<VoiceItemResponseModel> featuredVoices) {
                title.getClass();
                voices.getClass();
                featuredVoices.getClass();
                return new VoicePickerFeaturedSection(title, voices, featuredVoices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoicePickerFeaturedSection)) {
                    return false;
                }
                VoicePickerFeaturedSection voicePickerFeaturedSection = (VoicePickerFeaturedSection) other;
                if (m.c(this.title, voicePickerFeaturedSection.title) && m.c(this.voices, voicePickerFeaturedSection.voices) && m.c(this.featuredVoices, voicePickerFeaturedSection.featuredVoices)) {
                    return true;
                }
                return false;
            }

            public final List<VoiceItemResponseModel> getFeaturedVoices() {
                return this.featuredVoices;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.featuredVoices.hashCode() + n.d(this.title.hashCode() * 31, 31, this.voices);
            }

            public String toString() {
                String str = this.title;
                List<VoiceItemResponseModel> list = this.voices;
                List<VoiceItemResponseModel> list2 = this.featuredVoices;
                StringBuilder sb = new StringBuilder("VoicePickerFeaturedSection(title=");
                sb.append(str);
                sb.append(", voices=");
                sb.append(list);
                sb.append(", featuredVoices=");
                return z.h.e(sb, list2, Separators.RPAREN);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerFeaturedSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerFeaturedSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$VoicePickerFeaturedSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getFeaturedVoices$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public static /* synthetic */ void getVoices$annotations() {
            }

            public VoicePickerFeaturedSection(String str, List<VoiceItemResponseModel> list, List<VoiceItemResponseModel> list2) {
                str.getClass();
                list.getClass();
                list2.getClass();
                this.title = str;
                this.voices = list;
                this.featuredVoices = list2;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerGridSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "voices", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerGridSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerGridSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getVoices", "getVoices$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class VoicePickerGridSection implements Section {
            private final String title;
            private final List<VoiceItemResponseModel> voices;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(7))};

            public /* synthetic */ VoicePickerGridSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.voices = list;
                } else {
                    t0.j(i10, 3, ExploreVoicesResponse$Section$VoicePickerGridSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoicePickerGridSection copy$default(VoicePickerGridSection voicePickerGridSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voicePickerGridSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = voicePickerGridSection.voices;
                }
                return voicePickerGridSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(VoicePickerGridSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.voices);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> component2() {
                return this.voices;
            }

            public final VoicePickerGridSection copy(String title, List<VoiceItemResponseModel> voices) {
                title.getClass();
                voices.getClass();
                return new VoicePickerGridSection(title, voices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoicePickerGridSection)) {
                    return false;
                }
                VoicePickerGridSection voicePickerGridSection = (VoicePickerGridSection) other;
                if (m.c(this.title, voicePickerGridSection.title) && m.c(this.voices, voicePickerGridSection.voices)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.voices.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("VoicePickerGridSection(title=", this.title, ", voices=", Separators.RPAREN, this.voices);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerGridSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerGridSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$VoicePickerGridSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public static /* synthetic */ void getVoices$annotations() {
            }

            public VoicePickerGridSection(String str, List<VoiceItemResponseModel> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.voices = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerListSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "voices", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerListSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerListSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getVoices", "getVoices$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class VoicePickerListSection implements Section {
            private final String title;
            private final List<VoiceItemResponseModel> voices;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(8))};

            public /* synthetic */ VoicePickerListSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.voices = list;
                } else {
                    t0.j(i10, 3, ExploreVoicesResponse$Section$VoicePickerListSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceItemResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoicePickerListSection copy$default(VoicePickerListSection voicePickerListSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voicePickerListSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = voicePickerListSection.voices;
                }
                return voicePickerListSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(VoicePickerListSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.voices);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> component2() {
                return this.voices;
            }

            public final VoicePickerListSection copy(String title, List<VoiceItemResponseModel> voices) {
                title.getClass();
                voices.getClass();
                return new VoicePickerListSection(title, voices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoicePickerListSection)) {
                    return false;
                }
                VoicePickerListSection voicePickerListSection = (VoicePickerListSection) other;
                if (m.c(this.title, voicePickerListSection.title) && m.c(this.voices, voicePickerListSection.voices)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceItemResponseModel> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.voices.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("VoicePickerListSection(title=", this.title, ", voices=", Separators.RPAREN, this.voices);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerListSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerListSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$VoicePickerListSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public static /* synthetic */ void getVoices$annotations() {
            }

            public VoicePickerListSection(String str, List<VoiceItemResponseModel> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.voices = list;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section;", "", "title", "", "Lio/elevenlabs/data/model/response/VoiceCollectionResponseModel;", "collections", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getCollections", "getCollections$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        @g
        /* loaded from: classes3.dex */
        public static final /* data */ class VoicePickerVoiceCollectionSection implements Section {
            private final List<VoiceCollectionResponseModel> collections;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final h[] $childSerializers = {null, sn.a.d(i.f31597b, new a(9))};

            public /* synthetic */ VoicePickerVoiceCollectionSection(int i10, String str, List list, c1 c1Var) {
                if (3 == (i10 & 3)) {
                    this.title = str;
                    this.collections = list;
                } else {
                    t0.j(i10, 3, ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ur.d(VoiceCollectionResponseModel$$serializer.INSTANCE, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoicePickerVoiceCollectionSection copy$default(VoicePickerVoiceCollectionSection voicePickerVoiceCollectionSection, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voicePickerVoiceCollectionSection.title;
                }
                if ((i10 & 2) != 0) {
                    list = voicePickerVoiceCollectionSection.collections;
                }
                return voicePickerVoiceCollectionSection.copy(str, list);
            }

            public static final /* synthetic */ void write$Self$data_release(VoicePickerVoiceCollectionSection self, tr.b output, SerialDescriptor serialDesc) {
                h[] hVarArr = $childSerializers;
                output.V(serialDesc, 0, self.title);
                output.g(serialDesc, 1, (KSerializer) hVarArr[1].getValue(), self.collections);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceCollectionResponseModel> component2() {
                return this.collections;
            }

            public final VoicePickerVoiceCollectionSection copy(String title, List<VoiceCollectionResponseModel> collections) {
                title.getClass();
                collections.getClass();
                return new VoicePickerVoiceCollectionSection(title, collections);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoicePickerVoiceCollectionSection)) {
                    return false;
                }
                VoicePickerVoiceCollectionSection voicePickerVoiceCollectionSection = (VoicePickerVoiceCollectionSection) other;
                if (m.c(this.title, voicePickerVoiceCollectionSection.title) && m.c(this.collections, voicePickerVoiceCollectionSection.collections)) {
                    return true;
                }
                return false;
            }

            public final List<VoiceCollectionResponseModel> getCollections() {
                return this.collections;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.collections.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return ib.i.j("VoicePickerVoiceCollectionSection(title=", this.title, ", collections=", Separators.RPAREN, this.collections);
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return ExploreVoicesResponse$Section$VoicePickerVoiceCollectionSection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static /* synthetic */ void getCollections$annotations() {
            }

            public static /* synthetic */ void getTitle$annotations() {
            }

            public VoicePickerVoiceCollectionSection(String str, List<VoiceCollectionResponseModel> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.collections = list;
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ExploreVoicesResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ExploreVoicesResponse;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ExploreVoicesResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g(with = BackwardCompatibleExploreVoicesSerializer.class)
    public static /* synthetic */ void getSections$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreVoicesResponse(List<? extends Section> list) {
        list.getClass();
        this.sections = list;
    }
}
