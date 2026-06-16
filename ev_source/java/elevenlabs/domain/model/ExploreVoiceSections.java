package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import ib.i;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/ExploreVoiceSections;", "", "sections", "", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Section", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ExploreVoiceSections {
    private final List<Section> sections;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "", "VoiceList", "VoiceGrid", "FeaturedVoices", "VoiceCollections", "VoiceDesign", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$FeaturedVoices;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceCollections;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceDesign;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceGrid;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceList;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Section {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$FeaturedVoices;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "title", "", "featuredVoices", "", "Lio/elevenlabs/domain/model/Voice;", "voices", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getFeaturedVoices", "()Ljava/util/List;", "getVoices", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class FeaturedVoices implements Section {
            private final List<Voice> featuredVoices;
            private final String title;
            private final List<Voice> voices;

            public FeaturedVoices(String str, List<Voice> list, List<Voice> list2) {
                str.getClass();
                list.getClass();
                list2.getClass();
                this.title = str;
                this.featuredVoices = list;
                this.voices = list2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FeaturedVoices copy$default(FeaturedVoices featuredVoices, String str, List list, List list2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = featuredVoices.title;
                }
                if ((i10 & 2) != 0) {
                    list = featuredVoices.featuredVoices;
                }
                if ((i10 & 4) != 0) {
                    list2 = featuredVoices.voices;
                }
                return featuredVoices.copy(str, list, list2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Voice> component2() {
                return this.featuredVoices;
            }

            public final List<Voice> component3() {
                return this.voices;
            }

            public final FeaturedVoices copy(String title, List<Voice> featuredVoices, List<Voice> voices) {
                title.getClass();
                featuredVoices.getClass();
                voices.getClass();
                return new FeaturedVoices(title, featuredVoices, voices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FeaturedVoices)) {
                    return false;
                }
                FeaturedVoices featuredVoices = (FeaturedVoices) other;
                if (m.c(this.title, featuredVoices.title) && m.c(this.featuredVoices, featuredVoices.featuredVoices) && m.c(this.voices, featuredVoices.voices)) {
                    return true;
                }
                return false;
            }

            public final List<Voice> getFeaturedVoices() {
                return this.featuredVoices;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<Voice> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.voices.hashCode() + n.d(this.title.hashCode() * 31, 31, this.featuredVoices);
            }

            public String toString() {
                String str = this.title;
                List<Voice> list = this.featuredVoices;
                List<Voice> list2 = this.voices;
                StringBuilder sb = new StringBuilder("FeaturedVoices(title=");
                sb.append(str);
                sb.append(", featuredVoices=");
                sb.append(list);
                sb.append(", voices=");
                return h.e(sb, list2, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceCollections;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "title", "", "collections", "", "Lio/elevenlabs/domain/model/VoiceCollection;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getCollections", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceCollections implements Section {
            private final List<VoiceCollection> collections;
            private final String title;

            public VoiceCollections(String str, List<VoiceCollection> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.collections = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoiceCollections copy$default(VoiceCollections voiceCollections, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceCollections.title;
                }
                if ((i10 & 2) != 0) {
                    list = voiceCollections.collections;
                }
                return voiceCollections.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<VoiceCollection> component2() {
                return this.collections;
            }

            public final VoiceCollections copy(String title, List<VoiceCollection> collections) {
                title.getClass();
                collections.getClass();
                return new VoiceCollections(title, collections);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceCollections)) {
                    return false;
                }
                VoiceCollections voiceCollections = (VoiceCollections) other;
                if (m.c(this.title, voiceCollections.title) && m.c(this.collections, voiceCollections.collections)) {
                    return true;
                }
                return false;
            }

            public final List<VoiceCollection> getCollections() {
                return this.collections;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.collections.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return i.j("VoiceCollections(title=", this.title, ", collections=", Separators.RPAREN, this.collections);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceDesign;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "title", "", "subtitle", "actionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getActionTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesign implements Section {
            private final String actionTitle;
            private final String subtitle;
            private final String title;

            public VoiceDesign(String str, String str2, String str3) {
                i.s(str, str2, str3);
                this.title = str;
                this.subtitle = str2;
                this.actionTitle = str3;
            }

            public static /* synthetic */ VoiceDesign copy$default(VoiceDesign voiceDesign, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceDesign.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = voiceDesign.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = voiceDesign.actionTitle;
                }
                return voiceDesign.copy(str, str2, str3);
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

            public final VoiceDesign copy(String title, String subtitle, String actionTitle) {
                title.getClass();
                subtitle.getClass();
                actionTitle.getClass();
                return new VoiceDesign(title, subtitle, actionTitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceDesign)) {
                    return false;
                }
                VoiceDesign voiceDesign = (VoiceDesign) other;
                if (m.c(this.title, voiceDesign.title) && m.c(this.subtitle, voiceDesign.subtitle) && m.c(this.actionTitle, voiceDesign.actionTitle)) {
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
                return this.actionTitle.hashCode() + c.c(this.title.hashCode() * 31, 31, this.subtitle);
            }

            public String toString() {
                return f.l(this.actionTitle, Separators.RPAREN, f.s("VoiceDesign(title=", this.title, ", subtitle=", this.subtitle, ", actionTitle="));
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceGrid;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "title", "", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getVoices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceGrid implements Section {
            private final String title;
            private final List<Voice> voices;

            public VoiceGrid(String str, List<Voice> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.voices = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoiceGrid copy$default(VoiceGrid voiceGrid, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceGrid.title;
                }
                if ((i10 & 2) != 0) {
                    list = voiceGrid.voices;
                }
                return voiceGrid.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Voice> component2() {
                return this.voices;
            }

            public final VoiceGrid copy(String title, List<Voice> voices) {
                title.getClass();
                voices.getClass();
                return new VoiceGrid(title, voices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceGrid)) {
                    return false;
                }
                VoiceGrid voiceGrid = (VoiceGrid) other;
                if (m.c(this.title, voiceGrid.title) && m.c(this.voices, voiceGrid.voices)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<Voice> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.voices.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return i.j("VoiceGrid(title=", this.title, ", voices=", Separators.RPAREN, this.voices);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/ExploreVoiceSections$Section$VoiceList;", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "title", "", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getVoices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceList implements Section {
            private final String title;
            private final List<Voice> voices;

            public VoiceList(String str, List<Voice> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.voices = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VoiceList copy$default(VoiceList voiceList, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceList.title;
                }
                if ((i10 & 2) != 0) {
                    list = voiceList.voices;
                }
                return voiceList.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<Voice> component2() {
                return this.voices;
            }

            public final VoiceList copy(String title, List<Voice> voices) {
                title.getClass();
                voices.getClass();
                return new VoiceList(title, voices);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceList)) {
                    return false;
                }
                VoiceList voiceList = (VoiceList) other;
                if (m.c(this.title, voiceList.title) && m.c(this.voices, voiceList.voices)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<Voice> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return this.voices.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return i.j("VoiceList(title=", this.title, ", voices=", Separators.RPAREN, this.voices);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreVoiceSections(List<? extends Section> list) {
        list.getClass();
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExploreVoiceSections copy$default(ExploreVoiceSections exploreVoiceSections, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = exploreVoiceSections.sections;
        }
        return exploreVoiceSections.copy(list);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final ExploreVoiceSections copy(List<? extends Section> sections) {
        sections.getClass();
        return new ExploreVoiceSections(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ExploreVoiceSections) && m.c(this.sections, ((ExploreVoiceSections) other).sections)) {
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
        return i.k("ExploreVoiceSections(sections=", Separators.RPAREN, this.sections);
    }
}
