package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/VoiceSection;", "", "VoiceCarouselSection", "VoiceGridSection", "Lio/elevenlabs/domain/model/VoiceSection$VoiceCarouselSection;", "Lio/elevenlabs/domain/model/VoiceSection$VoiceGridSection;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface VoiceSection {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/VoiceSection$VoiceCarouselSection;", "Lio/elevenlabs/domain/model/VoiceSection;", "title", "", "subtitle", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getVoices", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class VoiceCarouselSection implements VoiceSection {
        private final String subtitle;
        private final String title;
        private final List<Voice> voices;

        public VoiceCarouselSection(String str, String str2, List<Voice> list) {
            c.w(str, str2, list);
            this.title = str;
            this.subtitle = str2;
            this.voices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VoiceCarouselSection copy$default(VoiceCarouselSection voiceCarouselSection, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = voiceCarouselSection.title;
            }
            if ((i10 & 2) != 0) {
                str2 = voiceCarouselSection.subtitle;
            }
            if ((i10 & 4) != 0) {
                list = voiceCarouselSection.voices;
            }
            return voiceCarouselSection.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<Voice> component3() {
            return this.voices;
        }

        public final VoiceCarouselSection copy(String title, String subtitle, List<Voice> voices) {
            title.getClass();
            subtitle.getClass();
            voices.getClass();
            return new VoiceCarouselSection(title, subtitle, voices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VoiceCarouselSection)) {
                return false;
            }
            VoiceCarouselSection voiceCarouselSection = (VoiceCarouselSection) other;
            if (m.c(this.title, voiceCarouselSection.title) && m.c(this.subtitle, voiceCarouselSection.subtitle) && m.c(this.voices, voiceCarouselSection.voices)) {
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

        public final List<Voice> getVoices() {
            return this.voices;
        }

        public int hashCode() {
            return this.voices.hashCode() + c.c(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return h.e(f.s("VoiceCarouselSection(title=", str, ", subtitle=", str2, ", voices="), this.voices, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/VoiceSection$VoiceGridSection;", "Lio/elevenlabs/domain/model/VoiceSection;", "title", "", "subtitle", "voices", "", "Lio/elevenlabs/domain/model/Voice;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getVoices", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class VoiceGridSection implements VoiceSection {
        private final String subtitle;
        private final String title;
        private final List<Voice> voices;

        public VoiceGridSection(String str, String str2, List<Voice> list) {
            c.w(str, str2, list);
            this.title = str;
            this.subtitle = str2;
            this.voices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VoiceGridSection copy$default(VoiceGridSection voiceGridSection, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = voiceGridSection.title;
            }
            if ((i10 & 2) != 0) {
                str2 = voiceGridSection.subtitle;
            }
            if ((i10 & 4) != 0) {
                list = voiceGridSection.voices;
            }
            return voiceGridSection.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final List<Voice> component3() {
            return this.voices;
        }

        public final VoiceGridSection copy(String title, String subtitle, List<Voice> voices) {
            title.getClass();
            subtitle.getClass();
            voices.getClass();
            return new VoiceGridSection(title, subtitle, voices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VoiceGridSection)) {
                return false;
            }
            VoiceGridSection voiceGridSection = (VoiceGridSection) other;
            if (m.c(this.title, voiceGridSection.title) && m.c(this.subtitle, voiceGridSection.subtitle) && m.c(this.voices, voiceGridSection.voices)) {
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

        public final List<Voice> getVoices() {
            return this.voices;
        }

        public int hashCode() {
            return this.voices.hashCode() + c.c(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return h.e(f.s("VoiceGridSection(title=", str, ", subtitle=", str2, ", voices="), this.voices, Separators.RPAREN);
        }
    }
}
