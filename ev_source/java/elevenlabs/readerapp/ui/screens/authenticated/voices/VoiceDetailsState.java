package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.Voice;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0014\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsState;", "", "isLoading", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "voiceId", "voice", "Lio/elevenlabs/domain/model/Voice;", "isPlaying", "isActionLoading", "isRecommendedReadsLoading", "sampleReads", "", "Lio/elevenlabs/domain/model/ReadMeta;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/Voice;ZZZLjava/util/List;)V", "()Z", "getError", "()Ljava/lang/String;", "getVoiceId", "getVoice", "()Lio/elevenlabs/domain/model/Voice;", "getSampleReads", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class VoiceDetailsState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isActionLoading;
    private final boolean isLoading;
    private final boolean isPlaying;
    private final boolean isRecommendedReadsLoading;
    private final List<ReadMeta> sampleReads;
    private final Voice voice;
    private final String voiceId;

    public /* synthetic */ VoiceDetailsState(boolean z6, String str, String str2, Voice voice, boolean z10, boolean z11, boolean z12, List list, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? false : z6, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : voice, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? false : z12, (i10 & 128) != 0 ? tn.t.f33547a : list);
    }

    public static /* synthetic */ VoiceDetailsState copy$default(VoiceDetailsState voiceDetailsState, boolean z6, String str, String str2, Voice voice, boolean z10, boolean z11, boolean z12, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = voiceDetailsState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = voiceDetailsState.error;
        }
        if ((i10 & 4) != 0) {
            str2 = voiceDetailsState.voiceId;
        }
        if ((i10 & 8) != 0) {
            voice = voiceDetailsState.voice;
        }
        if ((i10 & 16) != 0) {
            z10 = voiceDetailsState.isPlaying;
        }
        if ((i10 & 32) != 0) {
            z11 = voiceDetailsState.isActionLoading;
        }
        if ((i10 & 64) != 0) {
            z12 = voiceDetailsState.isRecommendedReadsLoading;
        }
        if ((i10 & 128) != 0) {
            list = voiceDetailsState.sampleReads;
        }
        boolean z13 = z12;
        List list2 = list;
        boolean z14 = z10;
        boolean z15 = z11;
        return voiceDetailsState.copy(z6, str, str2, voice, z14, z15, z13, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component4, reason: from getter */
    public final Voice getVoice() {
        return this.voice;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsActionLoading() {
        return this.isActionLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsRecommendedReadsLoading() {
        return this.isRecommendedReadsLoading;
    }

    public final List<ReadMeta> component8() {
        return this.sampleReads;
    }

    public final VoiceDetailsState copy(boolean isLoading, String error, String voiceId, Voice voice, boolean isPlaying, boolean isActionLoading, boolean isRecommendedReadsLoading, List<ReadMeta> sampleReads) {
        error.getClass();
        sampleReads.getClass();
        return new VoiceDetailsState(isLoading, error, voiceId, voice, isPlaying, isActionLoading, isRecommendedReadsLoading, sampleReads);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceDetailsState)) {
            return false;
        }
        VoiceDetailsState voiceDetailsState = (VoiceDetailsState) other;
        if (this.isLoading == voiceDetailsState.isLoading && kotlin.jvm.internal.m.c(this.error, voiceDetailsState.error) && kotlin.jvm.internal.m.c(this.voiceId, voiceDetailsState.voiceId) && kotlin.jvm.internal.m.c(this.voice, voiceDetailsState.voice) && this.isPlaying == voiceDetailsState.isPlaying && this.isActionLoading == voiceDetailsState.isActionLoading && this.isRecommendedReadsLoading == voiceDetailsState.isRecommendedReadsLoading && kotlin.jvm.internal.m.c(this.sampleReads, voiceDetailsState.sampleReads)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final List<ReadMeta> getSampleReads() {
        return this.sampleReads;
    }

    public final Voice getVoice() {
        return this.voice;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int c5 = j0.c.c(Boolean.hashCode(this.isLoading) * 31, 31, this.error);
        String str = this.voiceId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        Voice voice = this.voice;
        if (voice != null) {
            i10 = voice.hashCode();
        }
        return this.sampleReads.hashCode() + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((i11 + i10) * 31, 31, this.isPlaying), 31, this.isActionLoading), 31, this.isRecommendedReadsLoading);
    }

    public final boolean isActionLoading() {
        return this.isActionLoading;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isRecommendedReadsLoading() {
        return this.isRecommendedReadsLoading;
    }

    public String toString() {
        boolean z6 = this.isLoading;
        String str = this.error;
        String str2 = this.voiceId;
        Voice voice = this.voice;
        boolean z10 = this.isPlaying;
        boolean z11 = this.isActionLoading;
        boolean z12 = this.isRecommendedReadsLoading;
        List<ReadMeta> list = this.sampleReads;
        StringBuilder sb = new StringBuilder("VoiceDetailsState(isLoading=");
        sb.append(z6);
        sb.append(", error=");
        sb.append(str);
        sb.append(", voiceId=");
        sb.append(str2);
        sb.append(", voice=");
        sb.append(voice);
        sb.append(", isPlaying=");
        ib.i.t(sb, z10, ", isActionLoading=", z11, ", isRecommendedReadsLoading=");
        sb.append(z12);
        sb.append(", sampleReads=");
        sb.append(list);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public VoiceDetailsState(boolean z6, String str, String str2, Voice voice, boolean z10, boolean z11, boolean z12, List<ReadMeta> list) {
        str.getClass();
        list.getClass();
        this.isLoading = z6;
        this.error = str;
        this.voiceId = str2;
        this.voice = voice;
        this.isPlaying = z10;
        this.isActionLoading = z11;
        this.isRecommendedReadsLoading = z12;
        this.sampleReads = list;
    }

    public VoiceDetailsState() {
        this(false, null, null, null, false, false, false, null, 255, null);
    }
}
