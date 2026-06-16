package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/services/VoiceDesignPreviewsResult;", "", "previews", "", "Lio/elevenlabs/domain/services/VoiceDesignPreview;", ParameterNames.TEXT, "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPreviews", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class VoiceDesignPreviewsResult {
    private final List<VoiceDesignPreview> previews;
    private final String text;

    public VoiceDesignPreviewsResult(List<VoiceDesignPreview> list, String str) {
        list.getClass();
        str.getClass();
        this.previews = list;
        this.text = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceDesignPreviewsResult copy$default(VoiceDesignPreviewsResult voiceDesignPreviewsResult, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = voiceDesignPreviewsResult.previews;
        }
        if ((i10 & 2) != 0) {
            str = voiceDesignPreviewsResult.text;
        }
        return voiceDesignPreviewsResult.copy(list, str);
    }

    public final List<VoiceDesignPreview> component1() {
        return this.previews;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final VoiceDesignPreviewsResult copy(List<VoiceDesignPreview> previews, String text) {
        previews.getClass();
        text.getClass();
        return new VoiceDesignPreviewsResult(previews, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceDesignPreviewsResult)) {
            return false;
        }
        VoiceDesignPreviewsResult voiceDesignPreviewsResult = (VoiceDesignPreviewsResult) other;
        if (m.c(this.previews, voiceDesignPreviewsResult.previews) && m.c(this.text, voiceDesignPreviewsResult.text)) {
            return true;
        }
        return false;
    }

    public final List<VoiceDesignPreview> getPreviews() {
        return this.previews;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.previews.hashCode() * 31);
    }

    public String toString() {
        return "VoiceDesignPreviewsResult(previews=" + this.previews + ", text=" + this.text + Separators.RPAREN;
    }
}
