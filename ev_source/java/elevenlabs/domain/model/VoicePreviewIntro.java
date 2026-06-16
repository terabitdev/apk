package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/domain/model/VoicePreviewIntro;", "", "previewUrl", "", "imageUrl", DiagnosticsEntry.NAME_KEY, "subtitle", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPreviewUrl", "()Ljava/lang/String;", "getImageUrl", "getName", "getSubtitle", "getMetadata", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class VoicePreviewIntro {
    private final String imageUrl;
    private final String metadata;
    private final String name;
    private final String previewUrl;
    private final String subtitle;

    public VoicePreviewIntro(String str, String str2, String str3, String str4, String str5) {
        c.v(str, str2, str3, str4, str5);
        this.previewUrl = str;
        this.imageUrl = str2;
        this.name = str3;
        this.subtitle = str4;
        this.metadata = str5;
    }

    public static /* synthetic */ VoicePreviewIntro copy$default(VoicePreviewIntro voicePreviewIntro, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = voicePreviewIntro.previewUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = voicePreviewIntro.imageUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = voicePreviewIntro.name;
        }
        if ((i10 & 8) != 0) {
            str4 = voicePreviewIntro.subtitle;
        }
        if ((i10 & 16) != 0) {
            str5 = voicePreviewIntro.metadata;
        }
        String str6 = str5;
        String str7 = str3;
        return voicePreviewIntro.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    public final VoicePreviewIntro copy(String previewUrl, String imageUrl, String name, String subtitle, String metadata) {
        previewUrl.getClass();
        imageUrl.getClass();
        name.getClass();
        subtitle.getClass();
        metadata.getClass();
        return new VoicePreviewIntro(previewUrl, imageUrl, name, subtitle, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoicePreviewIntro)) {
            return false;
        }
        VoicePreviewIntro voicePreviewIntro = (VoicePreviewIntro) other;
        if (m.c(this.previewUrl, voicePreviewIntro.previewUrl) && m.c(this.imageUrl, voicePreviewIntro.imageUrl) && m.c(this.name, voicePreviewIntro.name) && m.c(this.subtitle, voicePreviewIntro.subtitle) && m.c(this.metadata, voicePreviewIntro.metadata)) {
            return true;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return this.metadata.hashCode() + c.c(c.c(c.c(this.previewUrl.hashCode() * 31, 31, this.imageUrl), 31, this.name), 31, this.subtitle);
    }

    public String toString() {
        String str = this.previewUrl;
        String str2 = this.imageUrl;
        String str3 = this.name;
        String str4 = this.subtitle;
        String str5 = this.metadata;
        StringBuilder s10 = f.s("VoicePreviewIntro(previewUrl=", str, ", imageUrl=", str2, ", name=");
        f.x(s10, str3, ", subtitle=", str4, ", metadata=");
        return f.l(str5, Separators.RPAREN, s10);
    }
}
